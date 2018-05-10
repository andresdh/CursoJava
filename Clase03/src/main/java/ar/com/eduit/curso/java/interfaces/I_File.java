package ar.com.eduit.curso.java.interfaces;

public interface I_File {
    /**
     * Este metodo devuelve el texto del archivo
     * @return 
     */
    String getText();
    void setText(String text);
    void appendText(String text);
    
    //a partir de JDK 8
    //los metodos default pueden tener codigo
    default void info(){
        System.out.println("Interface A.");
    }
}
