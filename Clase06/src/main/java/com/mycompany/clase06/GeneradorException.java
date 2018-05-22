package com.mycompany.clase06;

public class GeneradorException {
    public static void generar(){
        int[] vector=new int[10];
        vector[20]=40;
    }
    
    public static void generar(boolean x){
        if(x) System.out.println(10/0);        
    }
    
    public static void generar(String nro){
        int numero=Integer.parseInt(nro);
    }
    
    public static void generar(String texto,int indice){
        //if(texto==null || texto.length()<= indice) return;
        System.out.println(texto.charAt(indice));
    }
    
    
    
}
