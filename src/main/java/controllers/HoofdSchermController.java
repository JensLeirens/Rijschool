
package controllers;

import domain.DomainController;
import domain.Evaluatie;
import domain.Kleur;
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
    
    @FXML 
    private Button rijBaanMetRijStroken; 
    
    @FXML
    private void handleButtonRijBaanMetRijStroken(ActionEvent event) {
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
    
    @FXML 
    private Button stad; 
    
    @FXML
    private void handleButtonStad (ActionEvent event) {
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
    
    @FXML 
    private Button autoSnelweg; 
    
    @FXML
    private void handleButtonAutoSnelweg(ActionEvent event) {
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
    
    // Left ____________________________________________________________________
    @FXML 
    private Button schakelaar ; 
      
    @FXML
    private void handleButtonSchakelaar(ActionEvent event) {
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
         
    @FXML 
    private Button vloeistof; 
    
    @FXML
    private void handleButtonVloeiStof(ActionEvent event) {
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
    
    @FXML 
    private Button banden; 
    
    @FXML
    private void handleButtonBanden (ActionEvent event) {
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
    
    // Right ___________________________________________________________________
    @FXML 
    private Button tanken ; 
        
    @FXML
    private void handleButtonTanken(ActionEvent event) {
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
       
    
    @FXML 
    private Button gps; 
    
    @FXML
    private void handleButtonGps(ActionEvent event) {
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
    
    @FXML 
    private Button stop; 
    
    @FXML
    private void handleButtonStop (ActionEvent event) {     
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
        dc.getHuidigeLeerling().getHoofdscherm().setEvolutie(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie() - 0.05);
        evolutie.setProgress(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie());
    }
    
    @FXML
    private void handleButtonPlus(ActionEvent event) throws IOException {
        dc.getHuidigeLeerling().getHoofdscherm().setEvolutie(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie() + 0.05);
        evolutie.setProgress(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie());       
    }
    
    @FXML
    private void handleButtonTerugknop(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    @FXML
    private CheckBox evaluatie1;
    
    @FXML
    private void handleCheckButtonEvaluatie1(ActionEvent event) throws IOException {
        if(dc.getHuidigeLeerling().getEvaluaties().isEmpty()){
            dc.getHuidigeLeerling().getEvaluaties().add(new Evaluatie(dc.getHuidigeLeerling().getVT(), dc.getHuidigeLeerling().getRT(), dc.getHuidigeLeerling().getHoofdscherm()));
        } else evaluatie1.setSelected(false);
        if(dc.getHuidigeLeerling().getEvaluaties().size() >= 1){
            evaluatie1.setSelected(true);
        }
    }
    
    @FXML
    private CheckBox evaluatie2;
    
    @FXML
    private void handleCheckButtonEvaluatie2(ActionEvent event) throws IOException {
        if(dc.getHuidigeLeerling().getEvaluaties().size() == 1){
            dc.getHuidigeLeerling().getEvaluaties().add(new Evaluatie(dc.getHuidigeLeerling().getVT(), dc.getHuidigeLeerling().getRT(), dc.getHuidigeLeerling().getHoofdscherm()));
        } else evaluatie2.setSelected(false);
        if(dc.getHuidigeLeerling().getEvaluaties().size() >= 2){
            evaluatie2.setSelected(true);
        }
    }
    @FXML
    private CheckBox evaluatie3;
    
    @FXML
    private void handleCheckButtonEvaluatie3(ActionEvent event) throws IOException {
        if(dc.getHuidigeLeerling().getEvaluaties().size() == 2){
            dc.getHuidigeLeerling().getEvaluaties().add(new Evaluatie(dc.getHuidigeLeerling().getVT(), dc.getHuidigeLeerling().getRT(), dc.getHuidigeLeerling().getHoofdscherm()));
        } else evaluatie3.setSelected(false);
        if(dc.getHuidigeLeerling().getEvaluaties().size() == 3){
            evaluatie3.setSelected(true);
        }
    }
    
    public void keerTerug() throws IOException{
        
        Stage currentStage = (Stage) hoofdEvaScherm.getScene().getWindow();
        currentStage.close();
        
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
    }
    
    public void openAttitude() throws IOException{
        
        Stage currentStage = (Stage) hoofdEvaScherm.getScene().getWindow();
        currentStage.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/AttitudeScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Attitude scherm");
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root1, 1024, 743);
        stage.setScene(scene);
        // DC meegeven aan de volgende controller 
        AttitudeSchermController controller = fxmlLoader.<AttitudeSchermController>getController();
        controller.initData(dc);
        
        stage.show();
    }

    public void openVerkeerstechniek() throws IOException{
        Stage currentStage = (Stage) hoofdEvaScherm.getScene().getWindow();
        currentStage.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/VerkeerstechniekScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("VerkeersTechniek");
        
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root1, 1024, 743);
        stage.setScene(scene);
        VerkeerstechniekSchermController controller = fxmlLoader.<VerkeerstechniekSchermController>getController();
        controller.initData(dc);
        stage.show();
    }
    
    public void openRijtechniek() throws IOException{
        Stage currentStage = (Stage) hoofdEvaScherm.getScene().getWindow();
        currentStage.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/RijtechniekScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Rijtechniek");
        
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root1, 1024, 743);
        stage.setScene(scene);
        // DC meegeven aan de volgende controller 
        RijtechniekSchermController controller = fxmlLoader.<RijtechniekSchermController>getController();
        controller.initData(dc);
        stage.show();
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
        
        BackgroundImage imgStuur = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/StuurWit.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        btnRijtechniek.setBackground(new Background(imgStuur));
        
        BackgroundImage imgRijtechniek = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Verkeerstechniek.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        btnVerkeerstechniek.setBackground(new Background(imgRijtechniek));

        BackgroundImage imgAttitude = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Attitude.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        btnAttitude.setBackground(new Background(imgAttitude));
        
        evolutie.setProgress(0);
        // Bottom ______________________________________________________________
        Image imgTerugknop = new Image(getClass().getResourceAsStream("/image/Terugknop.png"));
        terugknop.setGraphic(new ImageView(imgTerugknop));
        
        
    }
    
    void initData(DomainController dc) {
        this.dc = dc ;
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
        
    }
    
     
    public void refreshList(){
        ObservableList<String> olOpmerkingen = FXCollections.observableArrayList(dc.getHuidigeLeerling().getOpmerkingen());
        listViewOpmerkingen.setItems(olOpmerkingen);
    }
}
