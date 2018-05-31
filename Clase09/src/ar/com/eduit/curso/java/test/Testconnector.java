package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.connector.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testconnector {
    public static void main(String[] args) throws Exception{
        Connection conn=Connector.getConnection();
        Statement statement=conn.createStatement();
        String query="insert into cursos (titulo,profesor, dia, turno) values "
                + "('Java','Rios','martes','mañana')";
        statement.execute(query);
    
        Connector.getConnection().createStatement().execute(
                "insert into cursos (titulo, profesor,dia,turno) values "
                + "('PHP','Gomez','Viernes','Tarde')"
        );
        
        /*
        metodo execute(query) ejecuta sentencias insert delete update y devuelve true
            si la sentencia no es insert delete o update, por ejemplo select devuelve false.
        
        metodo executeUpdate(update) ejecuta tambien insert delete update y devuelve un entero
            con la cantidad de registros modificados
        
        metodo executeQuery(query) ejecuta sentencias select y devuelve un resultset
        */
        
        ResultSet rs=Connector.getConnection().createStatement().executeQuery(
            "select * from cursos"
        );
        while(rs.next()){
            System.out.println(
            rs.getInt("idCurso")+"\t"+
            rs.getString("titulo")+"\t"+
            rs.getString("profesor")+"\t"+
            rs.getString("dia")+"\t"+
            rs.getString("turno")
            );        
        }
        
        
                
        
    
    }
    
    
}
