package ar.com.eduit.curso.java.archivos;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface I_Archivo {
    void print();
    String getText();
    void setText(String text);
    void appendText(String text);
    void addLine(String line);
    void addLines(Collection<String>lineas);
    /**
     * Devuelve un List de lineas con duplicados 
     */
    List<String>getLines(); //devuelve una coleccion con lineas
    /**
     * Devuelve una coleccion de lineas sin duplicados
     */
    Set<String>getLinkedHashLies();
    /**
     * Devuelve un set de lineas sin duplicados y ordenado alfabeticamente
    */
    Set<String>getTreeLines();
    /**
     *  Borra una linea 
     */
    void removeLine(String line);
    
    
}
