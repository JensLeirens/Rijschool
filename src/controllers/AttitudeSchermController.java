package controllers;

import domain.Leerling;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class AttitudeSchermController implements Initializable {
    
    @FXML
    private Node attitudeScherm ;
    
    //nr1
    @FXML
    private Button terugknop;
    
    @FXML
    private ListView listViewVoorbeeldwaarden;
    
    @FXML
    private ListView listViewEigenschappen;
    
    @FXML
    private void handleButtonTerugknop(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        Image imgTerugknop = new Image(getClass().getResourceAsStream("/image/Terugknop.png"));
        terugknop.setGraphic(new ImageView(imgTerugknop));
        
        List<String> listVoorbeelden = new ArrayList<>();
        listVoorbeelden = new ArrayList<String>() ;  
        listVoorbeelden.add("Rustig");
        listVoorbeelden.add("Nonchalant");
        listVoorbeelden.add("Aggresief");
        ObservableList<String> olVoorbeelden = FXCollections.observableArrayList(listVoorbeelden);
        listViewVoorbeeldwaarden.setItems(olVoorbeelden);
        
        
    }

    private void keerTerug() throws IOException{
        Stage currentStage = (Stage) attitudeScherm.getScene().getWindow();
        currentStage.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/HoofdEvaScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Hoofdscherm");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    
    
}
