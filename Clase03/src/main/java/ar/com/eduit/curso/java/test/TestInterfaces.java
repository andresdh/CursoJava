package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.interfaces.I_File;
import ar.com.eduit.curso.java.utils.ArchivoBinario;
import ar.com.eduit.curso.java.utils.ArchivoCaracter;

public class TestInterfaces {
    public static void main(String[] args) {
        I_File file=null;
        
        //Tengo que elegir una sola implementacion
        file=new ArchivoCaracter();
        //file=new ArchivoBinario();
        
        file.setText("Hola");
        file.appendText("Chau");
        
        System.out.println(file.getText());
        file.info();
        
    }
 
    
    
}
