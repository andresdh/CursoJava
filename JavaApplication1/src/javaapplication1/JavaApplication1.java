/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author EducaciónIT
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          /* operadores del lenguaje= nos permiten realizar operciones
    OPERADORES ARITMÉTICOS
    + , - , * , / , %
    Son operadores binarios, les tengo que pasar dos datos para que operen. El 
    tipo de dato de los operandos debe ser numérico
    sintaxis: op1-op2
    Primero debo declarar la variable
    */
        byte res;
        res = 7+2;
        System.out.println(res);
        
        /* DECLARACIÓN DE VARIABLES (conviene hacer comentarios que den cuenta
        cual es la estructura del proyecto)
        si tengo varias variables iguales, como varias float puedo hacerlo
        separado con una coma, como se ve debajo
        Fian es una constante
        */
        float radio = 15.27f,sup;
        
        final float PI = 3.14f;
        
       
        
        /* CALCULO DE SUPERFICIE */
        
         sup = PI * radio ;
         sup = PI * radio;
        
        /* IMPRESION EN PANTALLA - el operador de suma es especial, sta sobre
         cargado y podemos agregar un strng, si son varios se agreagan con + */
        
        System.out.println("Superficie:"+sup+"cm2");
        
        
        /* OPERADORES DE ASIGNACIÓN += , -= , *=, /=  Sirven para realizar
        operaciones aritméticas sobre variables*/
        int a = 10;
        a += 5; /* a = a + 5; a = 10 + 5 = 15 */
        System.out.println("a"+a);
        
        a /= 3;  /* a = a/3; a = 15/3 = 5*/
        System.out.println("a:"+a);
        
        /* OPERADORES INCREMENTO ++ Y DECREMENTO -- no son binarios, sino
        unarios*/
        
        a++; /* a = a + 1; a = 5+1*/
        System.out.println("a:"+a);
        
        a--; /* a = a-1; a= 6-1 = 5 */
        System.out.println("a:"+a);
        
        /* OPERADORES RELACIOALES O DE COMPARACIÓN 
        < , > , <=, >=, ==, != son binarios - comparar los números que le paso
        Analiza relaciones de cantidad, son numéricos. El resultado es un bolean
        me dice si es verdadero o falso. Siempre debo declarar una variable
       `para que tome el resultado
        */
        
        boolean resLog;
        resLog = 18<30;
        System.out.println(resLog);
        resLog = a >= 52;
        System.out.println(resLog);
        
        resLog = a == 5; /* un = es operador por igualdad en cambio 2 == compara*/ 
        System.out.println(resLog);
        
        resLog = a != 5; /* este operar responde si los valores son diferentes != */
        System.out.println(resLog);
        
        /* operaciones lógicas. En lógica todo es verdadero o falso
        
        and= da verdadero si las dos variables son verdaderos
        or= da verdadero si alguna de las dos variables es verdadero
        xor= da verdadero si y solo si una de las dos variables es verdaderas
        no ambas
        not= es verdadero si la vaiable es falsa y es falsa si la variable
        es verdadera
        */
        
        /* Sintaxis de los operadores lógicos
        and & , or |(altgr + 1) , xor ^ , not !
        
        */
        
        boolean log1 = true, log2 = false;
        resLog = log1 & log2;
        System.out.println("log1 & log2: " + resLog);
        
        resLog = log1 | log2;
        System.out.println("log1 | log2: " + resLog);
        
        resLog = (!log2) ^ log1; /* la prioridad de los operadores, la tiene el not
        Ahora si quiero cambiar la priridad, aplico parentesis () Los parentesis 
        son los que tienen m+as prioridad antes que todo
        */
        System.out.println("(!log2) ^ log1: " + resLog);
        
        /* ESTRUCTURA DE CONTROL DE FLUJO
        para que la estructura no sea líneal 
        
         estructura if = se hace si cumple una condición que es un boolean
        if(condición)
        
            sentencia;
        
        también puedo hacerlo con dos sentencias, si se cumple la condición
        se ejecuta una cosa pero si es falso otra
        
        if(condicion)
            sentencia1;
        else
            sentencia2; 
        
        también puedo hacerlo con 3 sentencias, si es falso hace esto pero si es
        verdadero hace estas dos cosas. Para eso tenes que agruparlo en llaves 
        if(condicion)
        {   sentencia1;
            sentencia3;
        }
        else
        {   sentencia2;
            sentencia4;
        }
        
        
        */
        byte num = 25;
        if(num < 20)
        {    
            num++;
            num*= 2; 
        }
        else
            num--;
        System.out.println("num:" + num);
        
       /* EJERCIO DE LABORATORIO CLASE 2
        
        
        */
      int nro1 = 100 , nro2 = 500, nro3 = 250;
      if(nro1>nro2)
      {
          if(nro1>nro3)
              System.out.println("nro1>:" + nro1);
          else
              System.out.println("nro3>:" + nro3);
      }
        
      else
      {
          if(nro2>nro3)
              System.out.println("nro2>:" + nro2);
          else
             System.out.println("nro3>:" + nro3); 
      }
      
      /* nuevo ejercicio  - plantea que hay dos positivos y uno negativo*/
      int A = 10 , B = -2 , C = 5; 
      int R;
      
      if(A>0)
      {
          if(B>0)
              R = A * B;
          else
              R = A * C;
      }
      else
          R = B * C;
      System.out.println("Resultado:" + R);
     
      
    }
    
    
    
}
