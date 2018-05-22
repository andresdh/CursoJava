package com.mycompany.clase06;

public class Vuelo {
    private String nombre;
    private int cantidadPasajes;

    public Vuelo(String nombre, int cantidadPasajes) {
        this.nombre = nombre;
        this.cantidadPasajes = cantidadPasajes;
    }
    
    //sybchrinized bloquea el objeto hasta que este sea liberado por la transaccion en curso
    public synchronized void venderPasajes(int cantidad)throws NoHayMasPasajesException{ //con el throws me obliga a controlar la exception
        if(cantidad>cantidadPasajes) throw new NoHayMasPasajesException(nombre,cantidad); // si se cumple lanzo una nueva exception (throw)
        cantidadPasajes-=cantidad;
    }
    
    @Override
    public String toString() {
        return "Vuelo{" + "nombre=" + nombre + ", cantidadPasajes=" + cantidadPasajes + '}';
    }
    
    
    
    
}
