package ar.com.eduit.curso.java.util.validaciones;

import javafx.scene.control.Label;
import javax.swing.JLabel;

public class Validator {
    private JLabel swLbl = null; //creo un atributo que representa el label en swing
    private Label fxLbl = null;//atributo de FX
    private String text;
    private String nombre;//nombre del control
    
    public Validator(JLabel swLbl, String text, String nombre) {
        this.swLbl = swLbl;
        this.text = text;
        this.nombre = nombre;
    }
    public Validator(Label fxlabel, String text, String nombre) {
        this.fxLbl = fxlabel;
        this.text = text;
        this.nombre = nombre;
    }
    private void setText(String text){
        if(swLbl!=null) swLbl.setText(text);
        if(fxLbl!=null) fxLbl.setText(text);
    }
    public boolean length (int length){
        if(text.length()==length) return true;
        setText(nombre+" debe tener "+length+" caracteres.");
        return false;
    }
    public boolean length(int min, int max){
        if(text.length()>=min && text.length()<=max) return true;
        setText(nombre+" debe tener entre "+min+" y "+max+" caracteres.");
        return false;
    }
    public boolean isInteger(){
        try {
            Integer.parseInt(text);
            return true;
        } catch (Exception e) {
            setText(nombre+" debe ser un número entero.");
            return false;
        }
    }
    public boolean isInteger(int min, int max){
        if(!isInteger()) return false;
        int nro=Integer.parseInt(text);
        if(nro>min && nro<=max) return true;
        setText(nombre+" debe ser un número entre "+min+" y "+max+".");
        return false;
    }
    
}
