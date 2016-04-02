
package controllers;

import domain.DomainController;
import domain.Kleur;
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class RijtechniekSchermController implements Initializable {
    private DomainController dc = new DomainController(); 
    
    private boolean toon = false ;
    private boolean houding = false ;
    private boolean iskoppeling = false ;
    private boolean remmen = false ;
    private boolean sturen = false ;
    private boolean schakel = false ;
    private boolean kijk = false ;
    

    
    
    @FXML 
    private Label naam ;
    
    @FXML
    private Node rijtechniekScherm ;

    @FXML 
    private Button terugknop ; 
    
    @FXML
    private Button opm ; 
    
    @FXML
    private TextArea txaOpm ; 
    
    @FXML
    private Button rood ; 
    
    @FXML
    private Button oranje ; 
    
    @FXML
    private Button groen ; 
    
    @FXML
    private Button zithouding ;
    
    @FXML
    private Button koppeling ;
    
    @FXML
    private Button remtechniek ;
    
    @FXML
    private Button schakeltechniek;
    
    @FXML
    private Button stuurtechniek ; 
    
    @FXML
    private Button kijktechniek ; 
    
    @FXML
    private Button garage; 
    
    @FXML
    private Button keren ;
    
    @FXML
    private Button parkeren ;
    
    @FXML
    private Button aanzettenHelling ;
    
    @FXML
    private Button stuuroefeningen ;
    
    @FXML
    private Button achteruitrijden ; 
    
    @FXML
    private Button Opslaan ; 
    
    @FXML
    private Circle circleKeren;
    
    @FXML
    private Circle circleParkeren; 
    
    @FXML
    private Circle circleGarage; 
    
    
    @FXML
    private Circle circleStuuroefeningen;
    
    @FXML
    private Circle circleAchteruitrijden;
    
    @FXML 
    private CheckBox basisopm1;
    @FXML 
    private CheckBox basisopm2;
    @FXML 
    private CheckBox basisopm3;
    @FXML 
    private CheckBox basisopm4;
    @FXML 
    private CheckBox basisopm5;
    
    @FXML
    private Rectangle achtergrondBasis; 
    
    @FXML
    public void handleButtonTerugknop(ActionEvent event) throws IOException {
        keerTerug();        
    }
   
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        verdwijnOpmerkingen(); 
        rijtechniekScherm.setStyle("-fx-background-image: url(\"/image/achtergrond.jpg\"); -fx-background-position: center center; ");
        
        BackgroundImage imgZithouding = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/zithouding.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        zithouding.setBackground(new Background(imgZithouding));
        
        BackgroundImage imgKoppeling = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/koppeling.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        koppeling.setBackground(new Background(imgKoppeling));
        
        BackgroundImage imgRem = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/rem.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        remtechniek.setBackground(new Background(imgRem));
        
        BackgroundImage imgSchakelen = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/schakelen.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        schakeltechniek.setBackground(new Background(imgSchakelen));
        
        BackgroundImage imgStuur = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Stuur.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        stuurtechniek.setBackground(new Background(imgStuur));
        
        BackgroundImage imgKijktechniek = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/kijktechniek.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        kijktechniek.setBackground(new Background(imgKijktechniek));
        
        BackgroundImage imgGarage = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Garage.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        garage.setBackground(new Background(imgGarage));
        
        BackgroundImage imgKeren = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Keren.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        keren.setBackground(new Background(imgKeren));
        
        BackgroundImage imgParkeren = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Parkeren.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        parkeren.setBackground(new Background(imgParkeren));
        
        BackgroundImage imgVertrekken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Vertrekken.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        aanzettenHelling.setBackground(new Background(imgVertrekken));
        
        BackgroundImage imgStuurOefeningen = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/StuurOefeningen.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        stuuroefeningen.setBackground(new Background(imgStuurOefeningen));
        
        BackgroundImage imgAchteruit = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Achteruit.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        achteruitrijden.setBackground(new Background(imgAchteruit));
        
        Image uitRoepTeken = new Image(getClass().getResourceAsStream("/image/Uitroepteken.jpg"));
        opm.setGraphic(new ImageView(uitRoepTeken));
        
        
        Image imgTerugknop = new Image(getClass().getResourceAsStream("/image/Terugknop.png"));
        terugknop.setGraphic(new ImageView(imgTerugknop));
  
    }
    
    void initData(DomainController dc) {
        this.dc = dc ; 
        naam.setText(dc.getHuidigeLeerling().getnaam());
        
        String kleur;
        
        kleur = dc.getHuidigeLeerling().getRT().getAchteruit().getKleur().toString();
        circleAchteruitrijden.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getGarage().getKleur().toString();
        circleGarage.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getKeren().getKleur().toString();
        circleKeren.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getParkeren().getKleur().toString();
        circleParkeren.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getStuurOef().getKleur().toString();
        circleStuuroefeningen.setFill(Color.valueOf(kleur));
        
        if (dc.getHuidigeLeerling().getRT().getZithouding().getKleurCode() != null) {
            kleur = dc.getHuidigeLeerling().getRT().getZithouding().getKleurCode();
            zithouding.setStyle("-fx-base: " + kleur);
        }

        if (dc.getHuidigeLeerling().getRT().getKoppeling().getKleurCode() != null) {
            kleur = dc.getHuidigeLeerling().getRT().getKoppeling().getKleurCode();
            koppeling.setStyle("-fx-base: " + kleur);
        }

        if (dc.getHuidigeLeerling().getRT().getRem().getKleurCode() != null) {
            kleur = dc.getHuidigeLeerling().getRT().getRem().getKleurCode();
            remtechniek.setStyle("-fx-base: " + kleur);
        }

        if (dc.getHuidigeLeerling().getRT().getStuurtechniek().getKleurCode() != null) {
            kleur = dc.getHuidigeLeerling().getRT().getStuurtechniek().getKleurCode();
            stuurtechniek.setStyle("-fx-base: " + kleur);
        }

        if (dc.getHuidigeLeerling().getRT().getSchakel().getKleurCode() != null) {
            kleur = dc.getHuidigeLeerling().getRT().getSchakel().getKleurCode();
            schakeltechniek.setStyle("-fx-base: " + kleur);
        }

        if (dc.getHuidigeLeerling().getRT().getKijk().getKleurCode() != null) {
            kleur = dc.getHuidigeLeerling().getRT().getKijk().getKleurCode();
            kijktechniek.setStyle("-fx-base: " + kleur);
        }
    }
    
    @FXML
    public void handleButtonOpslaan(ActionEvent event) throws IOException {
        houding = false;
        iskoppeling = false;
        remmen = false;
        sturen = false;
        schakel = false;
        kijk = false;   
        toon = false;
        verdwijnOpmerkingen();
    }
    
    @FXML
    public void handleButtonGroen(ActionEvent event) throws IOException {
        geefKleur("#008000");
    }
    
    @FXML
    public void handleButtonOranje(ActionEvent event) throws IOException {
        geefKleur("#FFA500");

    }
     
    @FXML
    public void handleButtonRood(ActionEvent event) throws IOException {
        geefKleur("#FF0000");

    }
    
    //"-fx-base: #FFA500" ROOD
    //"-fx-base: #FFA500" // oranje
   // "-fx-base: #008000" // groen
    public void geefKleur(String kleur) {
        if (toon == true) {
            if (houding == true) {
                zithouding.setStyle("-fx-base: "+kleur);
                dc.getHuidigeLeerling().getRT().getZithouding().setKleurCode(kleur);
            }
            if (iskoppeling == true) {
                koppeling.setStyle("-fx-base: "+kleur);
                dc.getHuidigeLeerling().getRT().getKoppeling().setKleurCode(kleur);
            }
            if (remmen == true) {
                remtechniek.setStyle("-fx-base: "+kleur);
                dc.getHuidigeLeerling().getRT().getRem().setKleurCode(kleur);
            }
            if (sturen == true) {
                stuurtechniek.setStyle("-fx-base: "+kleur);
                dc.getHuidigeLeerling().getRT().getStuurtechniek().setKleurCode(kleur);
            }
            if (schakel == true) {
                schakeltechniek.setStyle("-fx-base: "+kleur);
                dc.getHuidigeLeerling().getRT().getSchakel().setKleurCode(kleur);
            }
            if (kijk == true) {
                kijktechniek.setStyle("-fx-base: "+kleur);
                dc.getHuidigeLeerling().getRT().getKijk().setKleurCode(kleur);
            }
        }
    }
    
    public void toonOpmerkingen(){
        opm.setVisible(true);
        txaOpm.setVisible(true);   
        rood .setVisible(true);
        oranje.setVisible(true);
        groen.setVisible(true);
        achtergrondBasis.setVisible(true);
        basisopm1.setVisible(true);
        basisopm2.setVisible(true);
        basisopm3.setVisible(true);
        basisopm4.setVisible(true);
        basisopm5.setVisible(true);
        Opslaan.setVisible(true);
    }
    
    public void verdwijnOpmerkingen(){
        opm.setVisible(false);
        txaOpm.setVisible(false);   
        rood .setVisible(false);
        oranje.setVisible(false);
        groen.setVisible(false);
        achtergrondBasis.setVisible(false);
         basisopm1.setVisible(false);
        basisopm2.setVisible(false);
        basisopm3.setVisible(false);
        basisopm4.setVisible(false);
        basisopm5.setVisible(false);
        Opslaan.setVisible(false);
    }
    
    public void keerTerug() throws IOException{
        Stage currentStage = (Stage) rijtechniekScherm.getScene().getWindow();
        currentStage.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/HoofdScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Hoofdscherm");
        stage.setScene(new Scene(root1));
        
        // DC meegeven aan de volgende controller 
        HoofdSchermController controller = fxmlLoader.<HoofdSchermController>getController();
        controller.initData(dc);
        
        stage.show();
    }

    
        
    @FXML
    public void handleButtonHouding(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            houding = true ; 
        }
    }
    
    @FXML
    public void handleButtonKoppeling(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ; 
            iskoppeling = true ; 
        }
        
    }
    
    @FXML
    public void handleButtonRem(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ; 
            remmen = true ; 
        }         
    }
    
    @FXML
    public void handleButtonStuur(ActionEvent event) throws IOException {
       if (toon == false){
            toonOpmerkingen();
            toon = true ; 
            sturen = true ; 
        }        
    }
    
    @FXML
    public void handleButtonSchakel(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            schakel = true ;         
        }   
    }
    
    @FXML
    public void handleButtonKijk(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ; 
            kijk = true ; 
        }
    }

    
    
    @FXML
    public void handleButtonParkeren(ActionEvent event) throws IOException {
                
         switch(dc.getHuidigeLeerling().getRT().getParkeren().getKleur().toString()){
            case "WHITE":
                circleParkeren.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getParkeren().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleParkeren.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getRT().getParkeren().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleParkeren.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getParkeren().setKleur(Kleur.ORANGE);
                break;  
        }
        
    }
    
    @FXML
    public void handleButtonKeren(ActionEvent event) throws IOException {
       switch(dc.getHuidigeLeerling().getRT().getKeren().getKleur().toString()){
            case "WHITE":
                circleKeren.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getKeren().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleKeren.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getRT().getKeren().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleKeren.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getKeren().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
    @FXML
    public void handleButtonGarage(ActionEvent event) throws IOException {      
        switch(dc.getHuidigeLeerling().getRT().getGarage().getKleur().toString()){
            case "WHITE":
                circleGarage.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getGarage().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleGarage.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getRT().getGarage().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleGarage.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getGarage().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
     @FXML
    public void handleButtonAchteruit(ActionEvent event) throws IOException {
        
        switch(dc.getHuidigeLeerling().getRT().getAchteruit().getKleur().toString()){
            case "WHITE":
                circleAchteruitrijden.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getAchteruit().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleAchteruitrijden.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getRT().getAchteruit().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleAchteruitrijden.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getAchteruit().setKleur(Kleur.ORANGE);
                break;  
        }
    }
     @FXML
    public void handleButtonStuurOef(ActionEvent event) throws IOException {
      
        switch(dc.getHuidigeLeerling().getRT().getStuurOef().getKleur().toString()){
            case "WHITE":
                circleStuuroefeningen.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getStuurOef().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleStuuroefeningen.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getRT().getStuurOef().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleStuuroefeningen.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getStuurOef().setKleur(Kleur.ORANGE);
                break;  
        }
    }
}
