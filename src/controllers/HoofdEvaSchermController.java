
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private Button rotonde ; 
    
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
    private Button rijBaanMetRijStroken; 
    
    @FXML
    private void handleButtonRijBaanMetRijStroken(ActionEvent event) {
         if (circleRijbaanMetRijStroken.getFill() == Color.RED) {
            circleRijbaanMetRijStroken.setFill(Color.GREEN);
        } else {
            circleRijbaanMetRijStroken.setFill(Color.RED);
        } 
    }
    
    @FXML 
    private Button stad; 
    
    @FXML
    private void handleButtonStad (ActionEvent event) {
         if (circleStad.getFill() == Color.RED) {
            circleStad.setFill(Color.GREEN);
        } else {
            circleStad.setFill(Color.RED);
        }
    }
    
    @FXML 
    private Button autoSnelweg; 
    
    @FXML
    private void handleButtonAutoSnelweg(ActionEvent event) {
        if (circleAutosnelweg.getFill() == Color.RED) {
            circleAutosnelweg.setFill(Color.GREEN);
        } else {
            circleAutosnelweg.setFill(Color.RED);
        }       
    }
    
    // Left ____________________________________________________________________
    @FXML 
    private Button schakelaar ; 
      
    @FXML
    private void handleButtonSchakelaar(ActionEvent event) {
        if (circleSchakelaar.getFill() == Color.RED) {
            circleSchakelaar.setFill(Color.GREEN);
        } else {
            circleSchakelaar.setFill(Color.RED);
        }
    }
         
    @FXML 
    private Button vloeistof; 
    
    @FXML
    private void handleButtonVloeiStof(ActionEvent event) {
        if (circleVloeistof.getFill() == Color.RED) {
            circleVloeistof.setFill(Color.GREEN);
        } else {
            circleVloeistof.setFill(Color.RED);
        }
    }
    
    @FXML 
    private Button banden; 
    
    @FXML
    private void handleButtonBanden (ActionEvent event) {
        if (circleBanden.getFill() == Color.RED) {
            circleBanden.setFill(Color.GREEN);
        } else {
            circleBanden.setFill(Color.RED);
        }
    }
    
    // Right ___________________________________________________________________
    @FXML 
    private Button tanken ; 
        
    @FXML
    private void handleButtonTanken(ActionEvent event) {
        if (circleTanken.getFill() == Color.RED) {
            circleTanken.setFill(Color.GREEN);
        } else {
            circleTanken.setFill(Color.RED);
        }
    }
       
    
    @FXML 
    private Button gps; 
    
    @FXML
    private void handleButtonGps(ActionEvent event) {
        if (circleGps.getFill() == Color.RED) {
            circleGps.setFill(Color.GREEN);
        } else {
            circleGps.setFill(Color.RED);
        }
    }
    
    @FXML 
    private Button stop; 
    
    @FXML
    private void handleButtonStop (ActionEvent event) {
        if (circleStop.getFill() == Color.RED) {
            circleStop.setFill(Color.GREEN);
        } else {
            circleStop.setFill(Color.RED);
        }
    }
    // Center __________________________________________________________________
    @FXML
    private Button stuur;
    
    @FXML
    private Button rijtechniek;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // top _____________________________________________________________________________________________________
        Image imgRotonde = new Image(getClass().getResourceAsStream("/image/Rotonde.png"));
        rotonde.setGraphic(new ImageView(imgRotonde));
        
        Image imgStad = new Image(getClass().getResourceAsStream("/image/Stad.png"));
        stad.setGraphic(new ImageView(imgStad));
        
        Image imgAutoSnelweg = new Image(getClass().getResourceAsStream("/image/Autosnelweg.png"));
        autoSnelweg.setGraphic(new ImageView(imgAutoSnelweg));
        
        Image imgRijBaanMetRijStroken = new Image(getClass().getResourceAsStream("/image/RijbaanMetRijStroken.png"));
        rijBaanMetRijStroken.setGraphic(new ImageView(imgRijBaanMetRijStroken));
        
        
        // Left ____________________________________________________________________
        Image imgSchakelaar = new Image(getClass().getResourceAsStream("/image/Schakelaar.png"));
        schakelaar.setGraphic(new ImageView(imgSchakelaar));
        
        Image imgVloeistof = new Image(getClass().getResourceAsStream("/image/Vloeistof.png"));
        vloeistof.setGraphic(new ImageView(imgVloeistof));
        
        Image imgBanden = new Image(getClass().getResourceAsStream("/image/Banden.png"));
        banden.setGraphic(new ImageView(imgBanden));
        
        
        // Right ___________________________________________________________________
        Image imgTanken = new Image(getClass().getResourceAsStream("/image/Tanken.png"));
        tanken.setGraphic(new ImageView(imgTanken));
        
        Image imgGps = new Image(getClass().getResourceAsStream("/image/Gps.png"));
        gps.setGraphic(new ImageView(imgGps));
        
        Image imgStop = new Image(getClass().getResourceAsStream("/image/Stop.png"));
        stop.setGraphic(new ImageView(imgStop));
        
        
        // Center __________________________________________________________________
        Image imgStuur = new Image(getClass().getResourceAsStream("/image/StuurRRR.png"));
        stuur.setGraphic(new ImageView(imgStuur));
        
        Image imgRijtechniek = new Image(getClass().getResourceAsStream("/image/RijtechniekRRR.png"));
        rijtechniek.setGraphic(new ImageView(imgRijtechniek));
        
        
    }
    
}
