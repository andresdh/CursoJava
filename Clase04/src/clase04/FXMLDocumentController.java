package clase04;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {
    
    private List<CheckBox>listaCheck;
    @FXML //con esta anotacion decimos que este elemento existe en la vista, si no lo ponemos va a dar un error
    private TextField txtNombre;
    @FXML
    private CheckBox chkBici;
    @FXML
    private CheckBox chkMoto;
    @FXML
    private CheckBox chkAuto;
    @FXML
    private TextArea txaTexto;
    
    @FXML
    private void aceptar(ActionEvent event){
        //Cuadro de dialog del tipo Swing
        //JOptionPane.showMessageDialog(null, "Hola "+ txtNombre.getText());
        //Cuadro de dialogo FX
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Hola "+ txtNombre.getText());
        alert.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // aca puedo escribir las opciones de inicializaciòn. se ejecuta al arrancar el formulario
        
        System.out.println("Formulario inicializado");
        armarListaCheck();
    }    

    //Alt+shift+m crea el metodo
    private void armarListaCheck() {
        //arma la listaCheck
        listaCheck=new ArrayList();
        listaCheck.add(chkBici);
        listaCheck.add(chkAuto);
        listaCheck.add(chkMoto);
    }    

    @FXML
    private void agregar(ActionEvent event) {
        String nombre=txtNombre.getText();
        if(nombre.length()<2) return;
        String texto="Nombre "+nombre+".\n";
        //if(chkBici.isSelected()) texto+="Tiene Bici.\n";
        //if(chkMoto.isSelected()) texto+="Tiene Moto.\n";
        //if(chkAuto.isSelected()) texto+="Tiene Auto.\n";
        for(CheckBox ch:listaCheck){
            if(ch.isSelected()) texto+="Tiene "+ch.getText()+".\n";
        }
        
        limpiar();
        txaTexto.setText(texto);
    }
    
    private void limpiar(){
        txtNombre.setText("");
        //chkBici.setSelected(false);
        //chkMoto.setSelected(false);
        //chkAuto.setSelected(false);
        for(CheckBox ch:listaCheck) ch.setSelected(false);
        txtNombre.requestFocus();
    }
    
}
