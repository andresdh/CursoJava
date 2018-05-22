package com.mycompany.clase06;

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
    }
}
