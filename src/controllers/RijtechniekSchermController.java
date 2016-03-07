
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;



public class RijtechniekSchermController implements Initializable {
    
    @FXML
    private Node rijtechniekScherm ;
    
    @FXML
    private Button opm1 ; 
    
    @FXML
    private Button opm2 ; 
    
    @FXML
    private Button opm3 ; 
    
    @FXML
    private Button opm4 ; 
    
    @FXML 
    private Button terugknop ; 
    @FXML
    public void handleButtonTerugknop(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image uitRoepTeken = new Image(getClass().getResourceAsStream("/image/Uitroepteken.jpg"));
        opm1.setGraphic(new ImageView(uitRoepTeken));
        opm2.setGraphic(new ImageView(uitRoepTeken));
        opm3.setGraphic(new ImageView(uitRoepTeken));
        opm4.setGraphic(new ImageView(uitRoepTeken));
        
        Image imgTerugknop = new Image(getClass().getResourceAsStream("/image/Terugknop.png"));
        terugknop.setGraphic(new ImageView(imgTerugknop));
       
        
    }
     
    
    public void keerTerug() throws IOException{
        Stage currentStage = (Stage) rijtechniekScherm.getScene().getWindow();
        currentStage.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/HoofdScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Hoofdscherm");
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
