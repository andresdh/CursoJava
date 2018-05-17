
package ar.com.eduit.curso.java.clase05;

public class Clase05 {
    public static void main(String[] args) {
        //Clase 05 Object - String - System
        
        /*
        Object: Es la clase padre de todas las clases en Java
        En su interior se define un comportamiento que es heredado a todas las 
        clases y puede ser sobreescrito.      
        */
        
        class Ex1 {
        }
        class Ex2 extends Ex1 {
            public int lenght(String texto){
                if(texto==null) return -1; // Para prevenir la null pointer exception
                return texto.length();
            }
        }
        
        //Genero un objeto de la Clase 2
        Ex2 ex2=new Ex2();
        
        System.out.println(ex2.getClass());
        System.out.println(ex2.getClass().getName());
        System.out.println(ex2.getClass().getSimpleName());
        System.out.println(ex2.getClass().getSuperclass().getSimpleName());
        System.out.println(ex2.getClass().getSuperclass().getSuperclass().getName());
        System.out.println(ex2.getClass().getSuperclass().getSuperclass().getSuperclass());
        //Null Pointer exception
        //System.out.println(ex2.getClass().getSuperclass().getSuperclass().getSuperclass().getName());
        
        System.out.println(ex2.lenght("hola"));
        System.out.println(ex2.lenght(null)); 
        
        String texto = "Hola";
        System.out.println(texto.getClass().getName());
        System.out.println(texto.getClass().getSuperclass().getName());
        
        //Object puede funcionar como contenedor
        Object obj1=ex2;
        Object obj2=texto;
    
        String texto2=(String)obj2;
        Ex2 ex=(Ex2)obj1;
        
        class Ex{
            int dato;
            public Ex(int dato){
                this.dato=dato;
            }
            //Redefino un objecto de la clase padro Object.
            //Si 2 atributos de 2 objetos son iguales va a dar true
            @Override
            public boolean equals(Object obj){
                if(!(obj instanceof Ex)) return false;
                return this.dato==((Ex)obj).dato;
            }
        }
        
        Ex e1=new Ex(2); // Se crea un espacio en memoria con ese estado
        Ex e2=e1; // Se crea una referencia (puntero) al objecto e1
        Ex e3=new Ex(2); // "mew" crea un nuevo objeto (un nuevo espacio en memoria)
        Ex e4=new Ex(3); // idem
        String e5="2"; // idem
                      
        int n1=2; // Se crea un entero con un espacio en memoria
        int n2=n1; // Como se trata de un valor primitivo, tambien se crea un espacio en memoria y no una referencia
        
        System.out.println("e1.hashCode()="+e1.hashCode());//es un id que una Java para encontrar mas rapido los objetos
        System.out.println("e2.hashCode()="+e2.hashCode());
        System.out.println("e3.hashCode()="+e3.hashCode());
        System.out.println("e4.hashCode()="+e4.hashCode());
        System.out.println("e5.hashCode()="+e5.hashCode());
        
        //el metodo equals trabajac omparanto el hashCode
        System.out.println("e1.equals(e1)="+e1.equals(e1));
        System.out.println("e1.equals(e1)="+e1.equals(e2));
        System.out.println("e1.equals(e1)="+e1.equals(e3));
        System.out.println("e1.equals(e1)="+e1.equals(e4));
        System.out.println("e1.equals(e1)="+e1.equals(e5));
        
        //Clase String: representa un vector de caracteres inmutable.
        
        String cadena="Hola soy una cadena de caracteres"; //literal que asignacion directa
        String cadena2=new String("Hola");
        char[] vector={'h','o','l','a'};
        String cadena3=new String(vector);
        
        //Por cada valor que le asigno a String Java me genera 1 objeto, por eso es inmutable
        String t="";
        System.out.println(t+"\t"+t.hashCode());
        t+="h";
        System.out.println(t+"\t"+t.hashCode());
        t+="o";
        System.out.println(t+"\t"+t.hashCode());
        t+="l";
        System.out.println(t+"\t"+t.hashCode());
        t+="a";
        System.out.println(t+"\t"+t.hashCode());
        
        //StringBuilder y StringBuffer
        //Puede contener un string que es mutable
        //StringBuffer desde JDK1 30% + de velocidad que StringBuffer
        //StringBuilder desde JDK5 y es safe Thread
        
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("h");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("o");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("l");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("a");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        
        //Algunos metodos de la clase String()
        
        // .startsWith()    .endsWith()
        System.out.println(cadena.startsWith("hola"));
        System.out.println(cadena.startsWith("Hola"));
        System.out.println(cadena.endsWith("chau"));
        
        // .contains()
        System.out.println(cadena.contains("una"));
        System.out.println(cadena.contains("chau"));
        
        // .equals()    .equalsIgnoreCase()
        System.out.println(cadena2.equals("HOLA"));
        System.out.println(cadena2.equalsIgnoreCase("HOLA"));
        
        // .subString()
        System.out.println(cadena.substring(5));
        System.out.println(cadena.substring(5,15));
        
        // Clase System
        // Representa el runtime, se encarga de negociar parametros con el entorno de ejecucion
        
        // out: Representa un stream de salida a consola sincronizado
        // err: Representa un stream de salida a consola no sincronizado
        // in: Representa un stream de entrada sincronizado
        
        System.out.println("Hola");
        System.out.println("Hola");
        System.out.println("Hola");
        System.out.println("Hola");
        System.out.println("Hola");
        System.out.println("Hola");
        System.out.println("Hola");
        System.out.println("Hola");
        System.out.println("Hola");
        System.out.println("Hola");
        System.err.println("Ocurrio un error.");
        
    }   
    
    
    
}
