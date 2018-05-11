/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.java.curso.clase01;

/**
 * Clase principal del proyecto. 
 * Curso de Java, Mayo 2018.
 * @author EducaciónIT
 */
public class Clase01 {
    
    // psvm + TAB arma el mètodo main
    /**
     * Punto de entrada del proyecto.
     * @param args Argumentos que ingresan desde consola.
     */
    public static void main(String[] args) {
        /*
        Curso: Java Standard Programming 8.X   40 hs
        Dìas: Martes y Jueves   09:00 a 13:00 hs
        Profesor: Carlos Rìos   carlos.rios@educacionit.com
        Software:   JDK 8.X     www.oracle.com
                    
                    Netbeans IDE 8.2    netbeans.org
                    Integrated Development Enviroment
        
        JDK Alternativo:    OpenJDK (Solo Linux)
        IDEs Alternativos:  Eclipse, IntelliJ, JDeveloper
        
        Materiales: alumni.educacionit.com
        User: email
        Pass: dni
        
        Instalar Plugin easyUml
        
        */
        
        /* Bloque de Comentarios */
        // Comentario de una linea
        
        /**
         * Java Doc
         * Debe colocarse antes de la declaraciòn de clase o mètodo
         * Queda definido en la interface de la clase.
         */
        
        // sout TAB atajo de teclado para System.out.println
        System.out.println("Hola Mundo!!");
        
        //Tipo de datos primitivos de JAVA
        //Tipos Enteros
        
        //Tipo de datos boolean     1 byte
        boolean bo=true;
        System.out.println(bo);
        
        bo=false;
        System.out.println(bo);
        
        //Tipo de datos byte    1 byte signed
        byte by=100;
        System.out.println(by);
        
        
        /*
            byte by;    (signed)
        
            |-----|-----|
          -128    0    127
            
            byteU  by   (unsigned)  ---> En Java no existe
        
            |-----------|
            0          255 
        */
        
        //Tipo de datos short   2 bytes
        short sh=500;
        System.out.println(sh);
        
        //Tipo de datos int     4 bytes
        int in=2000;
        System.out.println(in);
        
        //Tipo de datos long    8 bytes
        // se define con la L mayuscula al final para indicar que es un 
        long lo=50000000000L; 
        System.out.println(lo);
        
        //Tipo de datos char    2 bytes
        char ch=65;
        System.out.println(ch);
        
        ch+=32; //le suma 32 a la variable
        System.out.println(ch);
        
        //Tipos de punto flotante
        
        //Tipo float    32 bits
        //Para identificar que es un float terminar con "F"
        float fl=5.45F;
        System.out.println(fl);
        
        //Tipo double    64 bits
        double dl=5.45;
        System.out.println(dl);
        
        fl=10;
        dl=10;
        
        System.out.println(fl/3);
        System.out.println(dl/3);
        
        fl=100;
        dl=100;
        
        System.out.println(fl/3);
        System.out.println(dl/3);
        
        // Clase String
        String st="Esto es una cadena de texto!!";
        System.out.println(st);
        
        //Recorrido del String st como un vector
        for(int a=0;a<st.length();a++){
            System.out.print(st.charAt(a));
        }
        System.out.println();
        
        //Imprimir en mayusculas el string st
        for(int a=0;a<st.length();a++){
            char car=st.charAt(a);
            if(car>=97 && car<=122) car-=32;
            System.out.print(car);
        }
        System.out.println();
        
        //Operador Ternario, se tienen que definir las 2 (verdadero y falso)
        for(int a=0;a<st.length();a++){
            char car=st.charAt(a);
            System.out.print((car>=97 && car<=122)?car-=32:car); // despues de ? verdadero, despues del : (else)
          
        }
        System.out.println();
        
        function2("hola",2);
        function2(null,2);
        
        //Imprimir el string en minusculas
        for(int a=0;a<st.length();a++){
            char car=st.charAt(a);
            System.out.print((car>=65 && car<=90)?car+=32:car); // despues de ? verdadero, despues del : (else)
        }
        System.out.println();
        
        //Metodos de la clase String que hacen lo mismo!!
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        System.out.println(st.substring(0,9));
        
    }//end main
    
    public static boolean function(boolean x){
        if(x){
            return true;
        }
        return false;
    }
    
    public static void function2(String texto, int index){
        if(texto==null || index>=texto.length()) return;
        System.out.println(texto.charAt(index));
    }
    
}//end Clase01
