package gui;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;


public class Controller {

    private double x = 0;
    private double y = 0;
    @FXML
    private HBox bC;
    @FXML
    private TextField archF;
    @FXML
    private TextField uField;
    @FXML
    private PasswordField pField;
    @FXML
    private TextField prField;
    @FXML
    private TextField notificacionField;
    @FXML
    private CheckBox checkP;
    @FXML
    void seleccionar(MouseEvent event) {
        FileChooser fc = new FileChooser();
        File archivo = fc.showOpenDialog(null);
        if(archivo != null){
            archF.setText(archivo.getAbsolutePath());
            notificacionField.setText(null);
        }
    }
    @FXML
    void evaluar(MouseEvent event) {
        notificacionField.setText("");
        if(Model.validarDriver(archF.getText())){
            Model.setPath(archF.getText());
            Model.setBand(checkP.isSelected());
            notificacionField.setText(Model.abrirNav(uField.getText(),pField.getText(),prField.getText()) + Model.matarProceso());
        }else{
            notificacionField.setText("Seleccionar el driver");
        }
    }
    @FXML
    void cerrar(MouseEvent event) {
        System.exit(0);
    }
    @FXML
    void dragged(MouseEvent event) {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setX(event.getScreenX()-x);
        stage.setY(event.getScreenY()-y);
    }
    @FXML
    void pressed(MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();

    }
}
