
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class HoofdEvaSchermController implements Initializable {
    @FXML
    private Circle circleRotonde ;
    @FXML
    private Circle circleRijbaanMetRijStroken;
    @FXML
    private Circle circleStad;
    @FXML
    private Circle circleAutosnelweg;
    
    @FXML
    private Circle circleBanden;
    @FXML
    private Circle circleSchakelaar;
    @FXML
    private Circle circleVloeistof;
    
    @FXML
    private Circle circleTanken;
    @FXML
    private Circle circleGps;
    @FXML
    private Circle circleStop;
    
    // top _____________________________________________________________________
    @FXML 
    private Button rotonde; 
    
    @FXML
    private void handleButtonRotonde(ActionEvent event) {
        if (circleRotonde.getFill() == Color.RED) {
            circleRotonde.setFill(Color.GREEN);
        } 
        else {
            circleRotonde.setFill(Color.RED);
        }
    }
       
    
    @FXML 
    private Button rijBaanMetRijstroken; 
    
    @FXML
    private void handleButtonRijBaanMetRijstroken(ActionEvent event) {
        System.out.println("You clicked me!");
        
    }
    
    @FXML 
    private Button stad; 
    
    @FXML
    private void handleButtonStad (ActionEvent event) {
        System.out.println("You clicked me!");
        
    }
    
    @FXML 
    private Button autoSnelweg; 
    
    @FXML
    private void handleButtonAutoSnelweg(ActionEvent event) {
        System.out.println("You clicked me!");
        
    }
    
    // Left ____________________________________________________________________
    
    // Right ___________________________________________________________________
    
    // Center __________________________________________________________________
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // faggot
    }
    
}
