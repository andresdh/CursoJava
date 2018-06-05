package ar.com.eduit.curso.java.gui;

import ar.com.eduit.curso.java.connector.Connector;
import ar.com.eduit.curso.java.dao.repositorios.AlumnoR;
import ar.com.eduit.curso.java.dao.repositorios.CursoR;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.util.validaciones.Validator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    private AlumnoR ar;
    private CursoR cr;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtCurso;
    @FXML
    private Label lblInfoAlumno;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ar= new AlumnoR(Connector.getConnection());
        cr= new CursoR(Connector.getConnection());
    }    
    @FXML
    private void agregarAlumno(ActionEvent event) {
        if(validarAlumno()){
            Alumno alumno=new Alumno(
                txtNombre.getText(),
                txtApellido.getText(),
                Integer.parseInt(txtEdad.getText()),
                Integer.parseInt(txtCurso.getText())
            );
            ar.save(alumno);
            lblInfoAlumno.setText("Se dio de alta un alumno id: "+alumno.getId());
            limpiarAlumno();
        }
    }
    private boolean validarAlumno(){
        //Validar nombre entre 2 y 20 caracteres
        if(!new Validator(lblInfoAlumno,txtNombre.getText(),"nombre").length(2, 20)) return false;
        //Validar apellido entre 2 y 20 caracteres
        if(!new Validator(lblInfoAlumno,txtApellido.getText(),"apellido").length(2, 20)) return false;
        //Validar edad entre 18 y 120 años
        if(!new Validator(lblInfoAlumno,txtEdad.getText(),"edad").isInteger(18, 120)) return false;
        return true;
    }
    private void limpiarAlumno(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNombre.requestFocus();
    }
}
