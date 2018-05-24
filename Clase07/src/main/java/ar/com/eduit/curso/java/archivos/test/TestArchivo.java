package ar.com.eduit.curso.java.archivos.test;

import ar.com.eduit.curso.java.archivos.Archivo;
import ar.com.eduit.curso.java.archivos.I_Archivo;


public class TestArchivo {
    public static void main(String[] args) {
        //String file="c:/texto.txt";
        String file="res/texto.txt";
        
        I_Archivo archivo=new Archivo(file);
        //archivo.print();
        
        archivo.setText("Curso de Java.\n");
        archivo.appendText("Primavera.\n");
        archivo.appendText("Verano.\n");
        archivo.appendText("Otoño.\n");
        archivo.appendText("Invierno.\n");
        archivo.addLine("Lunes");
        archivo.addLine("Martes");
        archivo.addLine("Miercoles");
        archivo.addLine("Jueves");
        archivo.addLine("Viernes");
        archivo.addLine("Sabado");
        archivo.addLine("Domingo");
        
        
        System.out.println(archivo.getText());
        
    }
}
