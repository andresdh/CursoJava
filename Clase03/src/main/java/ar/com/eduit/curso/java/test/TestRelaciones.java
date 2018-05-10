package ar.com.eduit.curso.java.test;
import ar.com.eduit.curso.java.entities.ClientePersona;
import ar.com.eduit.curso.java.entities.Cuenta;

public class TestRelaciones {
    public static void main(String[] args) {
        Cuenta cuenta1=new Cuenta(1,"arg$");
        cuenta1.depositar(45000);
        cuenta1.depositar(12000);
        cuenta1.debitar(18000);
        System.out.println(cuenta1);
        
        Cuenta cuenta2=new Cuenta(2,"Reales");
        cuenta2.depositar(20000);
        System.out.println(cuenta2);
        
        System.out.println("--- Clientes Personas ----");
        ClientePersona cp1=new ClientePersona(1,"Juan","Perez",3);
        Cuenta cuentaCli1=cp1.getCuenta();
        cuentaCli1.depositar(30000);
        cp1.getCuenta().depositar(20000);
        
        System.out.println(cp1);
        System.out.println(cp1.getCuenta());
    }
}
