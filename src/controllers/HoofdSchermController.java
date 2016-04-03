
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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
    private Button rotonde ; 
    
    @FXML
    private void handleButtonRotonde(ActionEvent event) {
        if (dc.getHuidigeLeerling().getHoofdscherm().getRotonde().getKleur() == Kleur.WHITE) {
            circleRotonde.setFill(Color.ORANGE);
            dc.getHuidigeLeerling().getHoofdscherm().getRotonde().setKleur(Kleur.ORANGE);
        }
        else if(dc.getHuidigeLeerling().getHoofdscherm().getRotonde().getKleur() == Kleur.ORANGE){
                circleRotonde.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getHoofdscherm().getRotonde().setKleur(Kleur.GREEN);
            } 
            else if(dc.getHuidigeLeerling().getHoofdscherm().getRotonde().getKleur() == Kleur.GREEN){
                circleRotonde.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getHoofdscherm().getRotonde().setKleur(Kleur.ORANGE);
            }
    }
    
    @FXML 
    private Button rijBaanMetRijStroken; 
    
    @FXML
    private void handleButtonRijBaanMetRijStroken(ActionEvent event) {
        if (dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().getKleur() == Kleur.WHITE) {
            circleRijbaanMetRijStroken.setFill(Color.ORANGE);
            dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().setKleur(Kleur.ORANGE);
        }
        else if(dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().getKleur() == Kleur.ORANGE){
                circleRijbaanMetRijStroken.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().setKleur(Kleur.GREEN);
            }  
            else if(dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().getKleur() == Kleur.GREEN){
                circleRijbaanMetRijStroken.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getHoofdscherm().getRijBaanMetRijstroken().setKleur(Kleur.ORANGE);
            }
    }
    
    @FXML 
    private Button stad; 
    
    @FXML
    private void handleButtonStad (ActionEvent event) {
        if (dc.getHuidigeLeerling().getHoofdscherm().getStad().getKleur() == Kleur.WHITE) {
            circleStad.setFill(Color.ORANGE);
            dc.getHuidigeLeerling().getHoofdscherm().getStad().setKleur(Kleur.ORANGE);
        }
        else if(dc.getHuidigeLeerling().getHoofdscherm().getStad().getKleur() == Kleur.ORANGE){
                circleStad.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getHoofdscherm().getStad().setKleur(Kleur.GREEN);
            }
            else if(dc.getHuidigeLeerling().getHoofdscherm().getStad().getKleur() == Kleur.GREEN){
                circleStad.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getHoofdscherm().getStad().setKleur(Kleur.ORANGE);
            }
    }
    
    @FXML 
    private Button autoSnelweg; 
    
    @FXML
    private void handleButtonAutoSnelweg(ActionEvent event) {
        if (dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().getKleur() == Kleur.WHITE) {
            circleAutosnelweg.setFill(Color.ORANGE);
            dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().setKleur(Kleur.ORANGE);
        }
        else if(dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().getKleur() == Kleur.ORANGE){
                circleAutosnelweg.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().setKleur(Kleur.GREEN);
            }  
            else if(dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().getKleur() == Kleur.GREEN){
                circleAutosnelweg.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getHoofdscherm().getAutoSnelweg().setKleur(Kleur.ORANGE);
            }
    }
    
    // Left ____________________________________________________________________
    @FXML 
    private Button schakelaar ; 
      
    @FXML
    private void handleButtonSchakelaar(ActionEvent event) {
        if (dc.getHuidigeLeerling().getHoofdscherm().getSchakelaar().getKleur() == Kleur.WHITE) {
            circleSchakelaar.setFill(Color.GREEN);
            dc.getHuidigeLeerling().getHoofdscherm().getSchakelaar().setKleur(Kleur.GREEN);
        }
    }
         
    @FXML 
    private Button vloeistof; 
    
    @FXML
    private void handleButtonVloeiStof(ActionEvent event) {
        if (dc.getHuidigeLeerling().getHoofdscherm().getVloeistof().getKleur() == Kleur.WHITE) {
            circleVloeistof.setFill(Color.GREEN);
            dc.getHuidigeLeerling().getHoofdscherm().getVloeistof().setKleur(Kleur.GREEN);
        }
    }
    
    @FXML 
    private Button banden; 
    
    @FXML
    private void handleButtonBanden (ActionEvent event) {
        if (dc.getHuidigeLeerling().getHoofdscherm().getBanden().getKleur() == Kleur.WHITE) {
            circleBanden.setFill(Color.GREEN);
            dc.getHuidigeLeerling().getHoofdscherm().getBanden().setKleur(Kleur.GREEN);
        }
    }
    
    // Right ___________________________________________________________________
    @FXML 
    private Button tanken ; 
        
    @FXML
    private void handleButtonTanken(ActionEvent event) {
        if (dc.getHuidigeLeerling().getHoofdscherm().getTanken().getKleur() == Kleur.WHITE) {
            circleTanken.setFill(Color.GREEN);
            dc.getHuidigeLeerling().getHoofdscherm().getTanken().setKleur(Kleur.GREEN);
        }
    }
       
    
    @FXML 
    private Button gps; 
    
    @FXML
    private void handleButtonGps(ActionEvent event) {
        if (dc.getHuidigeLeerling().getHoofdscherm().getGps().getKleur() == Kleur.WHITE) {
            circleGps.setFill(Color.GREEN);
            dc.getHuidigeLeerling().getHoofdscherm().getGps().setKleur(Kleur.GREEN);
        }
    }
    
    @FXML 
    private Button stop; 
    
    @FXML
    private void handleButtonStop (ActionEvent event) {
        if (dc.getHuidigeLeerling().getHoofdscherm().getStop().getKleur() == Kleur.WHITE) {
            circleStop.setFill(Color.GREEN);
            dc.getHuidigeLeerling().getHoofdscherm().getStop().setKleur(Kleur.GREEN);
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
    private Slider evolutie ; 
    
    @FXML
    private void handleButtonMin(ActionEvent event) throws IOException {
        dc.getHuidigeLeerling().getHoofdscherm().setEvolutie(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie() - 5);
        evolutie.setValue(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie());
    }
    
    @FXML
    private void handleButtonPlus(ActionEvent event) throws IOException {
        dc.getHuidigeLeerling().getHoofdscherm().setEvolutie(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie() + 5);
        evolutie.setValue(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie());       
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
        if(dc.getHuidigeLeerling().getEvaluaties().size() == 1){
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
        if(dc.getHuidigeLeerling().getEvaluaties().size() == 2){
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
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hoofdEvaScherm.setStyle("-fx-background-image: url(\"/image/achtergrond.jpg\"); -fx-background-position: center center; ");
        
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
        
        BackgroundImage imgRijtechniek = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Rijtechniek.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        btnVerkeerstechniek.setBackground(new Background(imgRijtechniek));

        BackgroundImage imgAttitude = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Attitude.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        btnAttitude.setBackground(new Background(imgAttitude));
        
        ObservableList<String> listOpmerkingen = FXCollections.observableArrayList(
          "Hier komen later alle opmerkingen", "die gemaakt zijn in de vorige les.");
        listViewOpmerkingen.setItems(listOpmerkingen);
        
        evolutie.setValue(0);
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
        stage.setScene(new Scene(root1));
        
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
        stage.setScene(new Scene(root1));
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
        stage.setScene(new Scene(root1));
        
        // DC meegeven aan de volgende controller 
        RijtechniekSchermController controller = fxmlLoader.<RijtechniekSchermController>getController();
        controller.initData(dc);
        stage.show();
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
        evolutie.setValue(dc.getHuidigeLeerling().getHoofdscherm().getEvolutie());
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
        
        
    }
}
