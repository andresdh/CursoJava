package clase04;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {
    
    private List<CheckBox>listaCheck;
        private ToggleGroup grupoEstado;
    
    @FXML
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
    private RadioButton radSoltero;
    @FXML
    private RadioButton radCasado;
    @FXML
    private RadioButton radViudo;
    @FXML
    private RadioButton radDivorciado;
    @FXML
    private ComboBox<String> cmbColores;
    
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
        armarGrupoEstado();
        cargarCmbColores();
    }    

    private void cargarCmbColores(){
        //cmbColores.getItems().addAll("Rojo","Verde","Azul","Blanco","Negro","Amarillo","Gris");
        //recorro el mapa
        MapaColores.getMap().forEach((k,v)->cmbColores.getItems().add(k));
        
        cmbColores.getSelectionModel().selectFirst();
    }
    
    private void armarGrupoEstado() {
        //armar grupoEstado
        grupoEstado= new ToggleGroup();
        grupoEstado.getToggles().addAll(radSoltero,radCasado,radViudo, radDivorciado);
        radSoltero.setSelected(true);
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
        //if(radSoltero.isSelected()) texto+="Estado civil: Soltero.\n";
        //Casteo "RadioButton" para tener el metodo getText
        texto+="Estado civil: "+
                ((RadioButton)grupoEstado.getSelectedToggle()).getText()+".\n";
                texto+="Color: "+ cmbColores.getValue()+".\n";
        txaTexto.setStyle("-fx-control-inner-background:"
                +MapaColores.getMap().get(cmbColores.getValue())+";");
        
        /* forma vieja
        String color=cmbColores.getValue();
        Map<String,String>mapa=MapaColores.getMap();
        String colorIngles= mapa.get(color);
        txaTexto.setStyle("-fx-control-inner-background:"+colorIngles+";");
        */
        
        limpiar();
        txaTexto.setText(texto);
    }
    
    private void limpiar(){
        txtNombre.setText("");
        //chkBici.setSelected(false);
        //chkMoto.setSelected(false);
        //chkAuto.setSelected(false);
        for(CheckBox ch:listaCheck) ch.setSelected(false);
        radSoltero.setSelected(true);
        cmbColores.getSelectionModel().selectFirst();
        txtNombre.requestFocus();
    }
    
}
