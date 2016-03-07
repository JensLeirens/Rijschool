
package controllers;

import java.io.IOException;
import java.net.URL;
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


public class HoofdSchermController implements Initializable {
    
    @FXML
    private  Node hoofdEvaScherm ;
    @FXML
    private Circle circleRotonde ;
    @FXML
    private Circle circleRijbaanMetRijStroken;
    @FXML
    private Circle circleStad;
    @FXML
    private Circle circleAutosnelweg;
    @FXML
    ListView<String> listViewOpmerkingen = new ListView<String>();
    
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
        if (circleRotonde.getFill() == Color.GREEN) {
            circleRotonde.setFill(Color.RED);
        } 
        else {
            circleRotonde.setFill(Color.GREEN);
        }
    }
    
    @FXML 
    private Button rijBaanMetRijStroken; 
    
    @FXML
    private void handleButtonRijBaanMetRijStroken(ActionEvent event) {
         if (circleRijbaanMetRijStroken.getFill() == Color.GREEN) {
            circleRijbaanMetRijStroken.setFill(Color.RED);
        } else {
            circleRijbaanMetRijStroken.setFill(Color.GREEN);
        } 
    }
    
    @FXML 
    private Button stad; 
    
    @FXML
    private void handleButtonStad (ActionEvent event) {
         if (circleStad.getFill() == Color.GREEN) {
            circleStad.setFill(Color.RED);
        } else {
            circleStad.setFill(Color.GREEN);
        }
    }
    
    @FXML 
    private Button autoSnelweg; 
    
    @FXML
    private void handleButtonAutoSnelweg(ActionEvent event) {
        if (circleAutosnelweg.getFill() == Color.GREEN) {
            circleAutosnelweg.setFill(Color.RED);
        } else {
            circleAutosnelweg.setFill(Color.GREEN);
        }       
    }
    
    // Left ____________________________________________________________________
    @FXML 
    private Button schakelaar ; 
      
    @FXML
    private void handleButtonSchakelaar(ActionEvent event) {
        if (circleSchakelaar.getFill() == Color.GREEN) {
            circleSchakelaar.setFill(Color.RED);
        } else {
            circleSchakelaar.setFill(Color.GREEN);
        }
    }
         
    @FXML 
    private Button vloeistof; 
    
    @FXML
    private void handleButtonVloeiStof(ActionEvent event) {
        if (circleVloeistof.getFill() == Color.GREEN) {
            circleVloeistof.setFill(Color.RED);
        } else {
            circleVloeistof.setFill(Color.GREEN);
        }
    }
    
    @FXML 
    private Button banden; 
    
    @FXML
    private void handleButtonBanden (ActionEvent event) {
        if (circleBanden.getFill() == Color.GREEN) {
            circleBanden.setFill(Color.RED);
        } else {
            circleBanden.setFill(Color.GREEN);
        }
    }
    
    // Right ___________________________________________________________________
    @FXML 
    private Button tanken ; 
        
    @FXML
    private void handleButtonTanken(ActionEvent event) {
        if (circleTanken.getFill() == Color.GREEN) {
            circleTanken.setFill(Color.RED);
        } else {
            circleTanken.setFill(Color.GREEN);
        }
    }
       
    
    @FXML 
    private Button gps; 
    
    @FXML
    private void handleButtonGps(ActionEvent event) {
        if (circleGps.getFill() == Color.GREEN) {
            circleGps.setFill(Color.RED);
        } else {
            circleGps.setFill(Color.GREEN);
        }
    }
    
    @FXML 
    private Button stop; 
    
    @FXML
    private void handleButtonStop (ActionEvent event) {
        if (circleStop.getFill() == Color.GREEN) {
            circleStop.setFill(Color.RED);
        } else {
            circleStop.setFill(Color.GREEN);
        }
    }
    // Center __________________________________________________________________
    @FXML
    private Button btnRijtechniek;
    
    @FXML
    private Button btnVerkeerstechniek;
    
    @FXML
    private Button btnAttitude;
    
    @FXML
    private void handleButtonAttitude(ActionEvent event) throws IOException {
        openAttitude();        
    }
    
    @FXML
    private void handleButtonVerkeerstechniek(ActionEvent event) throws IOException {
        openVerkeerstechniek();        
    }
    
    // bottom __________________________________________________________________
    @FXML
    private Button terugknop;
    
    @FXML
    private void handleButtonTerugknop(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    
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
        
        //Image imgStuur = new Image(getClass().getResourceAsStream("/image/StuurRRR.png"));
        //btnRijtechniek.setGraphic(new ImageView(imgStuur));
        
        Image imgRijtechniek = new Image(getClass().getResourceAsStream("/image/Rijtechniek.png"));
        btnVerkeerstechniek.setGraphic(new ImageView(imgRijtechniek));
        
        Image imgAttitude = new Image(getClass().getResourceAsStream("/image/Attitude.png"));
        btnAttitude.setGraphic(new ImageView(imgAttitude));
        
        ObservableList<String> listOpmerkingen = FXCollections.observableArrayList(
          "Hier komen later alle opmerkingen", "die gemaakt zijn in de vorige les.");
        listViewOpmerkingen.setItems(listOpmerkingen);
        
        // Bottom ______________________________________________________________
        Image imgTerugknop = new Image(getClass().getResourceAsStream("/image/Terugknop.png"));
        terugknop.setGraphic(new ImageView(imgTerugknop));
        
        
    }

    public void keerTerug() throws IOException{
        
        Stage currentStage = (Stage) hoofdEvaScherm.getScene().getWindow();
        currentStage.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/StartScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Start scherm");
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
    public void openAttitude() throws IOException{
        
        Stage currentStage = (Stage) hoofdEvaScherm.getScene().getWindow();
        currentStage.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/AttitudeScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Attitude scherm");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public void openVerkeerstechniek() throws IOException{
        Stage currentStage = (Stage) hoofdEvaScherm.getScene().getWindow();
        currentStage.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/VerkeerstechniekScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Attitude scherm");
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
}
