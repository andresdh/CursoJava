package com.mycompany.clase06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clase06 {
    public static void main(String[] args) {
        //COLECCIONES
        // en los vectores la longitud es estàtica.
        Auto[] autos=new Auto[4];
        
        autos[0]=new Auto("Fiat","Punto","Azul");
        autos[1]=new Auto("Renault","Kangoo","Bordo");
        autos[2]=new Auto("Ford","Fiesta","Verde");
        autos[3]=new Auto("VW","Up","Blanco");
               
        // recorrido por indices, los objetos se inicializan con null los numeros en 0
        //for(int a=0;a<autos.length;a++) System.out.println(autos[a]);
        
        // recorrido forEach
        for(Auto a:autos) System.out.println(a);
        
        //Interface List
        //Lista Objeto
        List lista=new ArrayList();
        lista.add(new Auto("Peugeot","207","Negro"));
        lista.add(new Auto("Renault","Fluence","Gris"));
        lista.add("hola");
        lista.add(23);
        
        //copiar los autos de autos a lista
        for(Auto a:autos) lista.add(a);
        
        System.out.println("Longitud de lista: "+lista.size());
        
        //Recorrido por indices
        for(int a=0;a<lista.size();a++) System.out.println(lista.get(a));
        
        //Recorrido forEach
        //for(Object o:lista) System.out.println(o);
        
        //Método default jdk8
        //lista.forEach(item->System.out.println(item));
        lista.forEach(System.out::println); //operador 4 puntos
        
        //Uso de Generics <> JDK5
        List<Auto>lista2= new ArrayList();
        lista2.add(new Auto("Fiat","Idea","Rojo"));
        lista2.add(new Auto("VW","Gol","Blanco"));
        
        Auto auto1=(Auto)lista.get(0);
        Auto auto2=lista2.get(0);
        
        //Copiar los autos de lista a lista2
        lista.forEach(item->{
            if(item instanceof Auto) lista2.add((Auto)item);
        });
        
        System.out.println("-------------------------------");
        lista2.forEach(System.out::println);
        
        //Interface Set no permite duplicados
        Set<Auto> setAutos;
        //Implementación Hashset: es la más veloz pero no garantiza el orden de los elementos.
        setAutos=new HashSet();
        setAutos.add(new Auto("Citroen","C4","Rojo"));
        setAutos.addAll(lista2);
        System.out.println("------------------------------------");
        setAutos.forEach(System.out::println);
                
        //Implementación TreeSet: Almacena en un árbol por orden natural. Compara objetos para poder ordenarlos
        setAutos=new TreeSet();
        setAutos.add(new Auto("Citroen","C4","Rojo"));
        setAutos.addAll(lista2);
        System.out.println("------------------------------------");
        setAutos.forEach(item->{
            System.out.println(item+ "\t \t "+item.toString().hashCode());
            });
        
        // Implementación LinkedHashSet: Almacena los elementos por orden de ingreso
        setAutos=new LinkedHashSet();
        setAutos.add(new Auto("Citroen","C4","Rojo"));
        setAutos.addAll(lista2);
        System.out.println("------------------------------------");
        setAutos.forEach(System.out::println);
        
        
        //Clase Stack representa una PILA        LIFO
        Stack<Auto>pilaAutos=new Stack();
        pilaAutos.push(new Auto("Mercedes","Clase E","Negro"));
        pilaAutos.addAll(lista2);
        System.out.println("--------------------------------");
        pilaAutos.forEach(System.out::println);
        System.out.println("--------------------------------");
        System.out.println("Longitud de la Pila: "+pilaAutos.size());
        while(!pilaAutos.isEmpty()){
            System.out.println(pilaAutos.pop());
        }
        System.out.println("Longitud de la Pila: "+pilaAutos.size());
        
        //Interface Queue representa una COLA    FIFO
        Queue<Auto> colaAutos=new LinkedList();
        colaAutos.offer(new Auto("BMW","327","Azul"));
        colaAutos.addAll(lista2);
        System.out.println("---------------------------------");
        colaAutos.forEach(System.out::println);
        System.out.println("---------------------------------");
        System.out.println(colaAutos.size());
        while(!colaAutos.isEmpty()){
            System.out.println(colaAutos.poll());
        }
        System.out.println(colaAutos.size());
        
        //uso de Exception
        // Estructura try/catch/finally
        /* try{
            System.out.println(10/0);
            System.out.println("Esta linea no se ejecuta");
        }catch(Exception e){
            System.out.println("Ocurrio un error!");
            System.out.println(e);
        }finally{//opcional y se ejecuta SIEMPRE
            System.out.println("El programa termina normalmente");
        }
        */
        // continua ejecucion normal.
        
        
        try{
            GeneradorException.generar("hola",20);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango");
        }catch (ArithmeticException e) {
            System.out.println("Divisiòn /0");
        }catch (NumberFormatException e){
            System.out.println("Formato de numero incorrecto.");
        }catch (NullPointerException e){
            System.out.println("Valor nulo");
        }catch(Exception e){
            System.out.println("Ocurrio un error no esperado.");
        }
        
        //Manejo de excepciones para validar reglas de negocio
        Vuelo v1=new Vuelo("aer1234",100);
        Vuelo v2=new Vuelo("lat111",100);
        System.out.println("------------------------------------");
        try {
            v1.venderPasajes(30);
            v2.venderPasajes(20);
            v1.venderPasajes(50);
            v2.venderPasajes(10);
            v1.venderPasajes(40); //lanza una exception
            v2.venderPasajes(10); //esta venta no se hace
        } catch (NoHayMasPasajesException ex) {
            System.out.println(ex);
        }

        
    }
}
