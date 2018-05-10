package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.entities.Cliente;
import ar.com.eduit.curso.java.entities.Cuenta;
import ar.com.eduit.curso.java.entities.Empleado;
import ar.com.eduit.curso.java.entities.Direccion;
import ar.com.eduit.curso.java.entities.Persona;

public class TestHerencia {
    public static void main(String[] args) {
        System.out.println("--- Direccion ---");
        Direccion dir1=new Direccion("Lima", "222", "2", "a");
        System.out.println(dir1);
        
        Direccion dir2=new Direccion("Viel", "350", "3", "b");
        System.out.println(dir2);
        
        /*
        System.out.println("--- Persona ---");
        Persona p1=new Persona("Juan", "Perez", dir1);
        System.out.println(p1);
        Persona p2=new Persona("Laura", "Salas", dir2);
        System.out.println(p2);
        */
        
        System.out.println("--- Empleado ---");
        Empleado e1=new Empleado(1, 13000, "Juan", "Perez", dir2);
        e1.saludar();
        System.out.println(e1);
        
        System.out.println("--- Cliente ---");
        Cliente c1=new Cliente(1, new Cuenta(20,"arg$"), "Jose", "Palma", dir2);
        c1.saludar();
        c1.getCuenta().depositar(2000);
        System.out.println(c1);
        
        //Polimorfismo
        Persona p1=new Empleado(2, 50000, "Ana", "Garcia", dir2);
        Persona p2=new Cliente(2, new Cuenta(21,"arg$"), "Javier", "Larrosa", dir2);
        
        //cada uno va a saludar de manera diferente
        p1.saludar();
        p2.saludar();
        
        //Casteo (Empleado)
        Empleado emp1=(Empleado)p1;
        Cliente cli1=(p2 instanceof Cliente)?(Cliente)p2:null; // pregunto si P2 es una instancia de Cliente, si es asi castea p2 sino devuelve null
        
        /*
        Interfaces en Java
        - Una interface no tiene codigo en sus metodos, las clases que implementan la interface
        deben implementar el còdigo.
        - Una interface no tiene atributos ni contructores.
        - Todos los miembros de la interface son publicos.
        - Una clase puede implementar muchas interfaces.
        
        - A partir de Java 8 existen metodos default (Pueden tener codigo)
        
        
        */
        
    }
}
