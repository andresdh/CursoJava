package com.mycompany.clase06;

public class Auto implements Comparable{
    private String marca;
    private String modelo;
    private String color;

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    @Override
    public int compareTo(Object o) {
        int resultado = 0;
        /*if(!(o instanceof Auto)) return 1;
        if (this.toString().hashCode()< o.toString().hashCode()){
            resultado = -1;
            
        }else if (this.toString().hashCode()>o.toString().hashCode()){
            resultado = 1;
        }
        */
        /* if(this.marca.hashCode()<((Auto)o).marca.hashCode()) resultado =-1;
        else if(this.marca.hashCode() > ((Auto)o)).marca.hashCode()) resultado=1;
                return resultado;
        */
        return this.toString().compareTo(o.toString());
        

               
    }
    
}
