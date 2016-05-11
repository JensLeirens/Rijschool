
package controllers;

import domain.DomainController;
import domain.Evaluatie;
import domain.Kleur;
import domain.KnopUitgebreid;
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
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class HoofdSchermController implements Initializable {
    private DomainController dc = new DomainController(); 
    boolean toonEvaluatie;
    int evaluatie;
    
    @FXML
    private  Node hoofdEvaScherm ;
    
    @FXML
    private ImageView dashboard ; 
    
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
    private Label lblEvaluatie;
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
    private Label naam ; 
    
    @FXML 
    private Button verwijder ;
    
    @FXML
    private void handleButtonVerwijder(ActionEvent event) {
        dc.getHuidigeLeerling().getOpmerkingen().removeAll(listViewOpmerkingen.getSelectionModel().getSelectedItems());
        refreshList();
    }
   
    @FXML 
    private Button rotonde ; 
    
    @FXML
    private void handleButtonRotonde(ActionEvent event) {
        if(toonEvaluatie == false){
            switch(dc.getHuidigeLeerling().getHoofdscherm().getRotonde().getKleur().toString()){
                case "WHITE":
                    circleRotonde.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getRotonde().setKleur(Kleur.RED);
                    break;
                case "ORANGE":
                    circleRotonde.setFill(Color.GREEN);
                    dc.getHuidigeLeerling().getHoofdscherm().getRotonde().setKleur(Kleur.GREEN);
                    break;
                case "GREEN":
                    circleRotonde.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getRotonde().setKleur(Kleur.RED);
                    break;  
                case "RED":
                    circleRotonde.setFill(Color.ORANGE);
                    dc.getHuidigeLeerling().getHoofdscherm().getRotonde().setKleur(Kleur.ORANGE);
                    break;
            }
        }
    }
    
    @FXML 
    private Button rijBaanMetRijStroken; 
    
    @FXML
    private void handleButtonRijBaanMetRijStroken(ActionEvent event) {
        if(toonEvaluatie == false){
            switch(dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().getKleur().toString()){
                case "WHITE":
                    circleRijbaanMetRijStroken.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().setKleur(Kleur.RED);
                    break;
                case "ORANGE":
                    circleRijbaanMetRijStroken.setFill(Color.GREEN);
                    dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().setKleur(Kleur.GREEN);
                    break;
                case "GREEN":
                    circleRijbaanMetRijStroken.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().setKleur(Kleur.RED);
                    break;  
                case "RED":
                    circleRijbaanMetRijStroken.setFill(Color.ORANGE);
                    dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().setKleur(Kleur.ORANGE);
                    break;
            }
        }
    }
    
    @FXML 
    private Button stad; 
    
    @FXML
    private void handleButtonStad (ActionEvent event) {
        if(toonEvaluatie == false){
            switch(dc.getHuidigeLeerling().getHoofdscherm().getStad().getKleur().toString()){
                case "WHITE":
                    circleStad.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getStad().setKleur(Kleur.RED);
                    break;
                case "ORANGE":
                    circleStad.setFill(Color.GREEN);
                    dc.getHuidigeLeerling().getHoofdscherm().getStad().setKleur(Kleur.GREEN);
                    break;
                case "GREEN":
                    circleStad.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getStad().setKleur(Kleur.RED);
                    break;  
                case "RED":
                    circleStad.setFill(Color.ORANGE);
                    dc.getHuidigeLeerling().getHoofdscherm().getStad().setKleur(Kleur.ORANGE);
                    break;
            }
        }
    }
    
    @FXML 
    private Button autoSnelweg; 
    
    @FXML
    private void handleButtonAutoSnelweg(ActionEvent event) {
        if(toonEvaluatie == false){
            switch(dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().getKleur().toString()){
                case "WHITE":
                    circleAutosnelweg.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().setKleur(Kleur.RED);
                    break;
                case "ORANGE":
                    circleAutosnelweg.setFill(Color.GREEN);
                    dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().setKleur(Kleur.GREEN);
                    break;
                case "GREEN":
                    circleAutosnelweg.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().setKleur(Kleur.RED);
                    break;  
                case "RED":
                    circleAutosnelweg.setFill(Color.ORANGE);
                    dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().setKleur(Kleur.ORANGE);
                    break;
            }
        }
    }
    
    // Left ____________________________________________________________________
    @FXML 
    private Button schakelaar ; 
      
    @FXML
    private void handleButtonSchakelaar(ActionEvent event) {
        if(toonEvaluatie == false){
            switch(dc.getHuidigeLeerling().getHoofdscherm().getSchakelaar().getKleur().toString()){
                case "WHITE":
                    circleSchakelaar.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getSchakelaar().setKleur(Kleur.RED);
                    break;
                case "ORANGE":
                    circleSchakelaar.setFill(Color.GREEN);
                    dc.getHuidigeLeerling().getHoofdscherm().getSchakelaar().setKleur(Kleur.GREEN);
                    break;
                case "GREEN":
                    circleSchakelaar.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getSchakelaar().setKleur(Kleur.RED);
                    break;  
                case "RED":
                    circleSchakelaar.setFill(Color.ORANGE);
                    dc.getHuidigeLeerling().getHoofdscherm().getSchakelaar().setKleur(Kleur.ORANGE);
                    break;
            }
        }
    }
         
    @FXML 
    private Button vloeistof; 
    
    @FXML
    private void handleButtonVloeiStof(ActionEvent event) {
        if(toonEvaluatie == false){
            switch(dc.getHuidigeLeerling().getHoofdscherm().getVloeistof().getKleur().toString()){
                case "WHITE":
                    circleVloeistof.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getVloeistof().setKleur(Kleur.RED);
                    break;
                case "ORANGE":
                    circleVloeistof.setFill(Color.GREEN);
                    dc.getHuidigeLeerling().getHoofdscherm().getVloeistof().setKleur(Kleur.GREEN);
                    break;
                case "GREEN":
                    circleVloeistof.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getVloeistof().setKleur(Kleur.RED);
                    break;  
                case "RED":
                    circleVloeistof.setFill(Color.ORANGE);
                    dc.getHuidigeLeerling().getHoofdscherm().getVloeistof().setKleur(Kleur.ORANGE);
                    break;
            }
        }
    }
    
    @FXML 
    private Button banden; 
    
    @FXML
    private void handleButtonBanden (ActionEvent event) {
        if(toonEvaluatie == false){
            switch(dc.getHuidigeLeerling().getHoofdscherm().getBanden().getKleur().toString()){
                case "WHITE":
                    circleBanden.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getBanden().setKleur(Kleur.RED);
                    break;
                case "ORANGE":
                    circleBanden.setFill(Color.GREEN);
                    dc.getHuidigeLeerling().getHoofdscherm().getBanden().setKleur(Kleur.GREEN);
                    break;
                case "GREEN":
                    circleBanden.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getBanden().setKleur(Kleur.RED);
                    break;  
                case "RED":
                    circleBanden.setFill(Color.ORANGE);
                    dc.getHuidigeLeerling().getHoofdscherm().getBanden().setKleur(Kleur.ORANGE);
                    break;
            }
        }
    }
    
    // Right ___________________________________________________________________
    @FXML 
    private Button tanken ; 
        
    @FXML
    private void handleButtonTanken(ActionEvent event) {
        if(toonEvaluatie == false){
            switch(dc.getHuidigeLeerling().getHoofdscherm().getTanken().getKleur().toString()){
                case "WHITE":
                    circleTanken.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getTanken().setKleur(Kleur.RED);
                    break;
                case "ORANGE":
                    circleTanken.setFill(Color.GREEN);
                    dc.getHuidigeLeerling().getHoofdscherm().getTanken().setKleur(Kleur.GREEN);
                    break;
                case "GREEN":
                    circleTanken.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getTanken().setKleur(Kleur.RED);
                    break;  
                case "RED":
                    circleTanken.setFill(Color.ORANGE);
                    dc.getHuidigeLeerling().getHoofdscherm().getTanken().setKleur(Kleur.ORANGE);
                    break;
            }
        }
    }
       
    
    @FXML 
    private Button gps; 
    
    @FXML
    private void handleButtonGps(ActionEvent event) {
        if(toonEvaluatie == false){
            switch(dc.getHuidigeLeerling().getHoofdscherm().getGps().getKleur().toString()){
                case "WHITE":
                    circleGps.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getGps().setKleur(Kleur.RED);
                    break;
                case "ORANGE":
                    circleGps.setFill(Color.GREEN);
                    dc.getHuidigeLeerling().getHoofdscherm().getGps().setKleur(Kleur.GREEN);
                    break;
                case "GREEN":
                    circleGps.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getGps().setKleur(Kleur.RED);
                    break;  
                case "RED":
                    circleGps.setFill(Color.ORANGE);
                    dc.getHuidigeLeerling().getHoofdscherm().getGps().setKleur(Kleur.ORANGE);
                    break;
            }
        }
    }
    
    @FXML 
    private Button stop; 
    
    @FXML
    private void handleButtonStop (ActionEvent event) {
        if(toonEvaluatie == false){
            switch(dc.getHuidigeLeerling().getHoofdscherm().getStop().getKleur().toString()){
                case "WHITE":
                    circleStop.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getStop().setKleur(Kleur.RED);
                    break;
                case "ORANGE":
                    circleStop.setFill(Color.GREEN);
                    dc.getHuidigeLeerling().getHoofdscherm().getStop().setKleur(Kleur.GREEN);
                    break;
                case "GREEN":
                    circleStop.setFill(Color.RED);
                    dc.getHuidigeLeerling().getHoofdscherm().getStop().setKleur(Kleur.RED);
                    break;  
                case "RED":
                    circleStop.setFill(Color.ORANGE);
                    dc.getHuidigeLeerling().getHoofdscherm().getStop().setKleur(Kleur.ORANGE);
                    break;
            }
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
    private void handleButtonRijtechniek(ActionEvent event) throws IOException {
        openRijtechniek() ;        
    }
    
    @FXML
    private void handleButtonVerkeerstechniek(ActionEvent event) throws IOException {
        openVerkeerstechniek();        
    }
    
    // bottom __________________________________________________________________
    
    @FXML 
    private Button min ;
    
    @FXML 
    private Button plus; 
    
    @FXML
    private Button terugknop;
    
    @FXML
    private ProgressBar evolutie ; 
    
    @FXML
    private void handleButtonMin(ActionEvent event) throws IOException {
        if(toonEvaluatie == false){
            dc.getHuidigeLeerling().getHoofdscherm().setEvolutie(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie() - 0.05);
            evolutie.setProgress(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie());
        }
    }
    
    @FXML
    private void handleButtonPlus(ActionEvent event) throws IOException {
        if(toonEvaluatie == false){
            dc.getHuidigeLeerling().getHoofdscherm().setEvolutie(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie() + 0.05);
            evolutie.setProgress(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie());  
        }
    }
    
    @FXML
    private void handleButtonTerugknop(ActionEvent event) throws IOException {
        toonEvaluatie = false;
        keerTerug();        
    }
    
    @FXML
    private CheckBox evaluatie1;
    
    @FXML
    private void handleCheckButtonEvaluatie1(ActionEvent event) throws IOException {
        switch(dc.getHuidigeLeerling().getEvaluaties().size()){
            case 0:
                dc.getHuidigeLeerling().getEvaluaties().add(new Evaluatie(dc.getHuidigeLeerling().getVT(), dc.getHuidigeLeerling().getRT(), dc.getHuidigeLeerling().getHoofdscherm(), dc.getHuidigeLeerling().getAttitude(),1));
                evaluatie1.setSelected(true);
                break;
            case 1:
            case 2:
            case 3:
                if(toonEvaluatie == false){
                    evaluatie1.setSelected(true);
                    evaluatie1.setStyle("-fx-border-style: solid" );
                    evaluatie1.setStyle("-fx-border-color: lightblue");
                    toonEvaluatie = true;
                    lblEvaluatie.setVisible(true);
                    evaluatie = 0;
                    toonEvaluatie(evaluatie);
                } 
                else {
                    if(evaluatie == 0) {
                        toonEvaluatie = false;
                        lblEvaluatie.setVisible(false);
                        evaluatie1.setStyle("");
                        initData(dc, toonEvaluatie, evaluatie);
                    } 
                    else {
                        evaluatie1.setSelected(true);
                    }
                }
                break;
            default:
                evaluatie1.setSelected(false);
                break;  
        }
    }     
    
    @FXML
    private CheckBox evaluatie2;
    
    @FXML
    private void handleCheckButtonEvaluatie2(ActionEvent event) throws IOException {
        switch(dc.getHuidigeLeerling().getEvaluaties().size()){
            case 1:
                if(toonEvaluatie == false){
                    dc.getHuidigeLeerling().getEvaluaties().add(new Evaluatie(dc.getHuidigeLeerling().getVT(), dc.getHuidigeLeerling().getRT(), dc.getHuidigeLeerling().getHoofdscherm(), dc.getHuidigeLeerling().getAttitude(),2));
                    evaluatie2.setSelected(true);
                } else {
                    evaluatie2.setSelected(false);
                }
                break;
            case 2: case 3:
                if(toonEvaluatie == false){
                    evaluatie2.setSelected(true);
                    evaluatie2.setStyle("-fx-border-style: solid" );
                    evaluatie2.setStyle("-fx-border-color: lightblue");
                    toonEvaluatie = true;
                    lblEvaluatie.setVisible(true);
                    evaluatie = 1;
                    toonEvaluatie(evaluatie);
                } 
                else {
                    if(evaluatie == 1) {
                    toonEvaluatie = false;
                    lblEvaluatie.setVisible(false);
                    evaluatie2.setStyle("");
                    initData(dc, toonEvaluatie, evaluatie);
                    }
                    else {
                        evaluatie2.setSelected(true);
                    }
                }
                break;
            default:
                evaluatie2.setSelected(false);
                break;  
        }
    }
    @FXML
    private CheckBox evaluatie3;
    
    @FXML
    private void handleCheckButtonEvaluatie3(ActionEvent event) throws IOException {
        switch(dc.getHuidigeLeerling().getEvaluaties().size()){
            case 2:
                if(toonEvaluatie == false){
                    dc.getHuidigeLeerling().getEvaluaties().add(new Evaluatie(dc.getHuidigeLeerling().getVT(), dc.getHuidigeLeerling().getRT(), dc.getHuidigeLeerling().getHoofdscherm(), dc.getHuidigeLeerling().getAttitude(),3));
                    evaluatie3.setSelected(true);
                } else {
                    evaluatie3.setSelected(false);
                }
                break;
            case 3:
                if(toonEvaluatie == false){
                    evaluatie3.setSelected(true);
                    evaluatie3.setStyle("-fx-border-style: solid" );
                    evaluatie3.setStyle("-fx-border-color: lightblue");
                    toonEvaluatie = true;
                    evaluatie = 2;
                    toonEvaluatie(evaluatie);
                    lblEvaluatie.setVisible(true);
                } 
                else {
                    if(evaluatie == 2) {
                    toonEvaluatie = false;
                    lblEvaluatie.setVisible(false);
                    evaluatie3.setStyle("");
                    initData(dc, toonEvaluatie, evaluatie);
                    }
                    else {
                        evaluatie3.setSelected(true);
                    }
                }
                break;
            default:
                evaluatie3.setSelected(false);
                break;  
        }
    }
    
    private int alert = 2; 
    
    public void keerTerug() throws IOException{
        if (alert == 3) {
            Stage currentStage = (Stage) hoofdEvaScherm.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/StartScherm.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();

            Stage stage = new Stage();
            stage.setTitle("Start scherm");
            Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
            Scene scene = new Scene(root1, 1024, 743);
            stage.setScene(scene);
            StartSchermController controller = fxmlLoader.<StartSchermController>getController();
            controller.initData(dc);

            stage.show();
            currentStage.close();
        } else {
            terugknop.setStyle("-fx-background-color: Red;");
            alert += 1;

        }
    }
    
    public void openAttitude() throws IOException{
        
        Stage currentStage = (Stage) hoofdEvaScherm.getScene().getWindow();
        
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/AttitudeScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Attitude scherm");
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root1, 1024, 743);
        stage.setScene(scene);
        // DC meegeven aan de volgende controller 
        AttitudeSchermController controller = fxmlLoader.<AttitudeSchermController>getController();
        controller.initData(dc, toonEvaluatie, evaluatie);
        
        stage.show();
        currentStage.close();
    }

    public void openVerkeerstechniek() throws IOException{
        Stage currentStage = (Stage) hoofdEvaScherm.getScene().getWindow();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/VerkeerstechniekScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("VerkeersTechniek");
        
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root1, 1024, 743);
        stage.setScene(scene);
        VerkeerstechniekSchermController controller = fxmlLoader.<VerkeerstechniekSchermController>getController();
        controller.initData(dc, toonEvaluatie, evaluatie);
        stage.show();
        currentStage.close();
    }
    
    public void openRijtechniek() throws IOException{
        Stage currentStage = (Stage) hoofdEvaScherm.getScene().getWindow();

        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/RijtechniekScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Rijtechniek");
        
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root1, 1024, 743);
        stage.setScene(scene);
        // DC meegeven aan de volgende controller 
        RijtechniekSchermController controller = fxmlLoader.<RijtechniekSchermController>getController();
        controller.initData(dc, toonEvaluatie, evaluatie);
        stage.show();
        currentStage.close();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hoofdEvaScherm.setStyle("-fx-background-image: url(\"/image/achtergrond.jpg\"); -fx-background-position: center center; ");
        listViewOpmerkingen.setStyle("-fx-font: 16pt \"Arial\";");
        // top _____________________________________________________________________________________________________
        BackgroundImage imgRotonde = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Rotonde.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        rotonde.setBackground(new Background(imgRotonde));
        
        BackgroundImage imgStad = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Stad.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        stad.setBackground(new Background(imgStad));
        
        BackgroundImage imgAutoSnelweg = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Autosnelweg.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        autoSnelweg.setBackground(new Background(imgAutoSnelweg));
        
        BackgroundImage imgRijBaanMetRijStroken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/RijbaanMetRijStroken.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        rijBaanMetRijStroken.setBackground(new Background(imgRijBaanMetRijStroken));
        lblEvaluatie.setVisible(false);       
        
        // Left ____________________________________________________________________
        BackgroundImage imgSchakelaar = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Schakelaar.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        schakelaar.setBackground(new Background(imgSchakelaar));
        
        
        BackgroundImage imgVloeistof = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Vloeistof.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        vloeistof.setBackground(new Background(imgVloeistof));
        
        BackgroundImage imgBanden = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Banden.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        banden.setBackground(new Background(imgBanden));
        
        // Right ___________________________________________________________________
        BackgroundImage imgTanken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Tanken.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        tanken.setBackground(new Background(imgTanken));
        
        BackgroundImage imgGps = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Gps.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        gps.setBackground(new Background(imgGps));

        BackgroundImage imgStop = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Stop.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        stop.setBackground(new Background(imgStop));
        
        
        // Center __________________________________________________________________
        
        //BackgroundImage imgStuur = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/StuurWit.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        //btnRijtechniek.setBackground(new Background(imgStuur));
        
        //BackgroundImage imgRijtechniek = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Verkeerstechniek.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        //btnVerkeerstechniek.setBackground(new Background(imgRijtechniek));

        BackgroundImage imgAttitude = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Attitude.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        btnAttitude.setBackground(new Background(imgAttitude));
        
        evolutie.setProgress(0);
        // Bottom ______________________________________________________________
        Image imgTerugknop = new Image(getClass().getResourceAsStream("/image/Terugknop.png"));
        terugknop.setGraphic(new ImageView(imgTerugknop));
        
        
    }
    
    void initData(DomainController dc, boolean toonEvaluatie, int evaluatie) {
        this.dc = dc;
        this.toonEvaluatie = toonEvaluatie;
        this.evaluatie = evaluatie;
        if(toonEvaluatie == false){
            String kleur;
            kleur = dc.getHuidigeLeerling().getHoofdscherm().getRotonde().getKleur().toString();
            circleRotonde.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().getKleur().toString();
            circleRijbaanMetRijStroken.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getHoofdscherm().getStad().getKleur().toString();
            circleStad.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().getKleur().toString();
            circleAutosnelweg.setFill(Color.valueOf(kleur));

            kleur = dc.getHuidigeLeerling().getHoofdscherm().getSchakelaar().getKleur().toString();
            circleSchakelaar.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getHoofdscherm().getVloeistof().getKleur().toString();
            circleVloeistof.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getHoofdscherm().getBanden().getKleur().toString();
            circleBanden.setFill(Color.valueOf(kleur));

            kleur = dc.getHuidigeLeerling().getHoofdscherm().getTanken().getKleur().toString();
            circleTanken.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getHoofdscherm().getGps().getKleur().toString();
            circleGps.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getHoofdscherm().getStop().getKleur().toString();
            circleStop.setFill(Color.valueOf(kleur));
            evolutie.setProgress(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie());
            naam.setText(dc.getHuidigeLeerling().getnaam());
        } else {
            switch(evaluatie){
                case 0:
                    evaluatie1.setStyle("-fx-border-style: solid" );
                    evaluatie1.setStyle("-fx-border-color: lightblue");
                    break;
                case 1:
                    evaluatie2.setStyle("-fx-border-style: solid" );
                    evaluatie2.setStyle("-fx-border-color: lightblue");
                    break;
                case 2:
                    evaluatie3.setStyle("-fx-border-style: solid" );
                    evaluatie3.setStyle("-fx-border-color: lightblue");
                    break;
            }
            toonEvaluatie(evaluatie);
            
        }
        
        if(dc.getHuidigeLeerling().getEvaluaties().size() > 0){
            evaluatie1.setSelected(true);
        }   
        if(dc.getHuidigeLeerling().getEvaluaties().size() > 1){
            evaluatie2.setSelected(true);
        }
        if(dc.getHuidigeLeerling().getEvaluaties().size() > 2){
            evaluatie3.setSelected(true);
        }
        
       refreshList();
       int bovenkantStuurG = 0;
       if(dc.getHuidigeLeerling().getRT().getZithouding().getKleur().toString() == "GREEN"){
           bovenkantStuurG++;
       }
       if(dc.getHuidigeLeerling().getRT().getKoppeling().getKleur().toString() == "GREEN"){
           bovenkantStuurG++;
       }
       if(dc.getHuidigeLeerling().getRT().getRem().getKleur().toString() == "GREEN"){
           bovenkantStuurG++;
       }
       if(dc.getHuidigeLeerling().getRT().getStuurtechniek().getKleur().toString() == "GREEN"){
           bovenkantStuurG++;
       }
       if(dc.getHuidigeLeerling().getRT().getSchakel().getKleur().toString() == "GREEN"){
           bovenkantStuurG++;
       }
       if(dc.getHuidigeLeerling().getRT().getKijk().getKleur().toString() == "GREEN"){
           bovenkantStuurG++;
       }
       
       int linksonderStuurG = 0;
       if(dc.getHuidigeLeerling().getRT().getAanzettenHelling().getKleur().toString() == "GREEN"){
           linksonderStuurG++;
       }
       if(dc.getHuidigeLeerling().getRT().getStuurOef().getKleur().toString() == "GREEN"){
           linksonderStuurG++;
       }
       if(dc.getHuidigeLeerling().getRT().getAchteruit().getKleur().toString() == "GREEN"){
           linksonderStuurG++;
       }
       if(dc.getHuidigeLeerling().getRT().getGarage().getKleur().toString() == "GREEN"){
           linksonderStuurG++;
       }
       
       int rechtsonderStuurG = 0;
       if(dc.getHuidigeLeerling().getRT().getKeren().getKleur().toString() == "GREEN"){
           rechtsonderStuurG++;
       }
       if(dc.getHuidigeLeerling().getRT().getParkeren().getKleur().toString() == "GREEN"){
           rechtsonderStuurG++;
       }
       
       int bovenkantStuurW = 0;
       if(dc.getHuidigeLeerling().getRT().getZithouding().getKleur().toString() == "WHITE"){
           bovenkantStuurW++;
       }
       if(dc.getHuidigeLeerling().getRT().getKoppeling().getKleur().toString() == "WHITE"){
           bovenkantStuurW++;
       }
       if(dc.getHuidigeLeerling().getRT().getRem().getKleur().toString() == "WHITE"){
           bovenkantStuurW++;
       }
       if(dc.getHuidigeLeerling().getRT().getStuurtechniek().getKleur().toString() == "WHITE"){
           bovenkantStuurW++;
       }
       if(dc.getHuidigeLeerling().getRT().getSchakel().getKleur().toString() == "WHITE"){
           bovenkantStuurW++;
       }
       if(dc.getHuidigeLeerling().getRT().getKijk().getKleur().toString() == "WHITE"){
           bovenkantStuurW++;
       }
       
       int linksonderStuurW = 0;
       if(dc.getHuidigeLeerling().getRT().getAanzettenHelling().getKleur().toString() == "WHITE"){
           linksonderStuurW++;
       }
       if(dc.getHuidigeLeerling().getRT().getStuurOef().getKleur().toString() == "WHITE"){
           linksonderStuurW++;
       }
       if(dc.getHuidigeLeerling().getRT().getAchteruit().getKleur().toString() == "WHITE"){
           linksonderStuurW++;
       }
       if(dc.getHuidigeLeerling().getRT().getGarage().getKleur().toString() == "WHITE"){
           linksonderStuurW++;
       }
       
       int rechtsonderStuurW = 0;
       if(dc.getHuidigeLeerling().getRT().getKeren().getKleur().toString() == "WHITE"){
           rechtsonderStuurW++;
       }
       if(dc.getHuidigeLeerling().getRT().getParkeren().getKleur().toString() == "WHITE"){
           rechtsonderStuurW++;
       }
       
       int bovenkantStuurO = 0;
       if(dc.getHuidigeLeerling().getRT().getZithouding().getKleur().toString() == "ORANGE"){
           bovenkantStuurO++;
       }
       if(dc.getHuidigeLeerling().getRT().getKoppeling().getKleur().toString() == "ORANGE"){
           bovenkantStuurO++;
       }
       if(dc.getHuidigeLeerling().getRT().getRem().getKleur().toString() == "ORANGE"){
           bovenkantStuurO++;
       }
       if(dc.getHuidigeLeerling().getRT().getStuurtechniek().getKleur().toString() == "ORANGE"){
           bovenkantStuurO++;
       }
       if(dc.getHuidigeLeerling().getRT().getSchakel().getKleur().toString() == "ORANGE"){
           bovenkantStuurO++;
       }
       if(dc.getHuidigeLeerling().getRT().getKijk().getKleur().toString() == "ORANGE"){
           bovenkantStuurO++;
       }
       
       int linksonderStuurO = 0;
       if(dc.getHuidigeLeerling().getRT().getAanzettenHelling().getKleur().toString() == "ORANGE"){
           linksonderStuurO++;
       }
       if(dc.getHuidigeLeerling().getRT().getStuurOef().getKleur().toString() == "ORANGE"){
           linksonderStuurO++;
       }
       if(dc.getHuidigeLeerling().getRT().getAchteruit().getKleur().toString() == "ORANGE"){
           linksonderStuurO++;
       }
       if(dc.getHuidigeLeerling().getRT().getGarage().getKleur().toString() == "ORANGE"){
           linksonderStuurO++;
       }
       
       int rechtsonderStuurO = 0;
       if(dc.getHuidigeLeerling().getRT().getKeren().getKleur().toString() == "ORANGE"){
           rechtsonderStuurO++;
       }
       if(dc.getHuidigeLeerling().getRT().getParkeren().getKleur().toString() == "ORANGE"){
           rechtsonderStuurO++;
       }
       String bovenkantStuur = "W";
       if(bovenkantStuurG == 6){
           bovenkantStuur = "G";
       } else {
           if(bovenkantStuurW == 6){
               bovenkantStuur = "W";
           } else {
               if(bovenkantStuurO > 0){
                   bovenkantStuur = "O";
               }
           }
       }
       String linksonderStuur= "W";
       if(linksonderStuurG == 4){
           linksonderStuur = "G";
       } else {
           if(linksonderStuurW == 4){
               linksonderStuur = "W";
           } else {
               if(linksonderStuurO > 0){
               linksonderStuur = "O";
               }
           }
       }
       String rechtsonderStuur = "W";
       if(rechtsonderStuurG == 2){
           rechtsonderStuur = "G";
       } else {
           if(rechtsonderStuurW == 2){
               rechtsonderStuur = "W";
           } else {
               if(rechtsonderStuurO > 0){
               rechtsonderStuur = "O";
           }
           }
       }
       BackgroundImage imgStuur = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Stuur" + bovenkantStuur + linksonderStuur + rechtsonderStuur + ".png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
       btnRijtechniek.setBackground(new Background(imgStuur));
      
       int pijlRechtsG = 0;
       int pijlRechtsO = 0;
       int pijlRechtsR = 0;
       List<KnopUitgebreid> pijlRechts = new ArrayList<>();
       pijlRechts.add(dc.getHuidigeLeerling().getVT().getVoorrang());
       pijlRechts.add(dc.getHuidigeLeerling().getVT().getTekens());
       pijlRechts.add(dc.getHuidigeLeerling().getVT().getSnelheid());
        for(KnopUitgebreid k : pijlRechts){
            switch(k.getKleur().toString()){
                case "GREEN" : pijlRechtsG++;
                    break;
                case "ORANGE" : pijlRechtsO++;
                    break;
                case "RED" : pijlRechtsR++;
                    break;
           }
        }
        
        int pijlLinksG = 0;
        int pijlLinksO = 0;
        int pijlLinksR = 0;
        List<KnopUitgebreid> pijlLinks = new ArrayList<>();
        pijlLinks.add(dc.getHuidigeLeerling().getVT().getKruisen());
        pijlLinks.add(dc.getHuidigeLeerling().getVT().getAanwijzers());
        pijlLinks.add(dc.getHuidigeLeerling().getVT().getInhalen());
        for(KnopUitgebreid k : pijlLinks){
            switch(k.getKleur().toString()){
                case "GREEN" : pijlLinksG++;
                    break;
                case "ORANGE" : pijlLinksO++;
                    break;
                case "RED" : pijlLinksR++;
                    break;
           }
        }
        int pijlOnderaanG = 0;
        int pijlOnderaanO = 0;
        int pijlOnderaanR = 0;
        List<KnopUitgebreid> pijlOnderaan = new ArrayList<>();
        pijlOnderaan.add(dc.getHuidigeLeerling().getVT().getLinksaf());
        pijlOnderaan.add(dc.getHuidigeLeerling().getVT().getRechtsaf());
        pijlOnderaan.add(dc.getHuidigeLeerling().getVT().getOpenbareWeg());
        pijlOnderaan.add(dc.getHuidigeLeerling().getVT().getAfstanden());
        for(KnopUitgebreid k : pijlOnderaan){
            switch(k.getKleur().toString()){
                case "GREEN" : pijlOnderaanG++;
                    break;
                case "ORANGE" : pijlOnderaanO++;
                    break;
                case "RED" : pijlOnderaanR++;
                    break;
           }
        }
        
        String strPijlRechts;
        if(pijlRechtsG == 3){
            strPijlRechts = "G";
        } else {
            if(pijlRechtsR > 0){
                strPijlRechts = "R";
            } else {
                if(pijlRechtsO > 0){
                    strPijlRechts = "O";
                } else strPijlRechts = "W";
            }
        }
        
        String strPijlLinks;
        if(pijlLinksG == 3){
            strPijlLinks = "G";
        } else {
            if(pijlLinksR > 0){
                strPijlLinks = "R";
            } else {
                if(pijlLinksO > 0){
                    strPijlLinks = "O";
                } else strPijlLinks = "W";
            }
        }
        String strPijlOnderaan;
        if(pijlOnderaanG == 3){
            strPijlOnderaan = "G";
        } else {
            if(pijlOnderaanR > 0){
                strPijlOnderaan = "R";
            } else {
                if(pijlOnderaanO > 0){
                    strPijlOnderaan = "O";
                } else strPijlOnderaan = "W";
            }
        }
        
        BackgroundImage imgVerkeertechniek = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Verkeer" + strPijlLinks + strPijlRechts + strPijlOnderaan + ".png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        btnVerkeerstechniek.setBackground(new Background(imgVerkeertechniek));
    }
    
     
    public void refreshList(){
        ObservableList<String> olOpmerkingen = FXCollections.observableArrayList(dc.getHuidigeLeerling().getOpmerkingen());
        listViewOpmerkingen.setItems(olOpmerkingen);
    }

    private void toonEvaluatie(int evaluatie) {
        circleRotonde.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getHoofdscherm().getRotonde().getKleur().toString()));
        circleRijbaanMetRijStroken.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getHoofdscherm().getRijBaanMetRijstroken().getKleur().toString()));
        circleStad.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getHoofdscherm().getStad().getKleur().toString()));
        circleAutosnelweg.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getHoofdscherm().getAutoSnelweg().getKleur().toString()));
        circleBanden.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getHoofdscherm().getBanden().getKleur().toString()));
        circleSchakelaar.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getHoofdscherm().getSchakelaar().getKleur().toString()));
        circleVloeistof.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getHoofdscherm().getVloeistof().getKleur().toString()));
        circleTanken.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getHoofdscherm().getTanken().getKleur().toString()));
        circleGps.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getHoofdscherm().getGps().getKleur().toString()));
        circleStop.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getHoofdscherm().getStop().getKleur().toString()));
        evolutie.setProgress(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getHoofdscherm().getEvolutie());
        
        
    }
}
