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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class VerkeerstechniekSchermController implements Initializable{
    
    private DomainController dc = new DomainController(); 
    
    @FXML
    private Node verkeerstechniekScherm;
    
    @FXML
    private Button btnTerug;
    
    @FXML
    private Label lblNaam;
    
    @FXML
    private Button btnVoorrang;
    
    @FXML
    private Circle circleVoorrang ;
    @FXML
    private Circle circleTekens ;
    @FXML
    private Circle circleSnelheid ;
    @FXML
    private Circle circleAfstanden ;
    @FXML
    private Circle circleInhalen ;
    @FXML
    private Circle circleKruisen ;
    @FXML
    private Circle circleLinksaf ;
    @FXML
    private Circle circleRechtsaf ;
    @FXML
    private Circle circleAanwijzers ;
    @FXML
    private Circle circleOpenbareWeg ;
    
   
    @FXML
    public void handleButtonVoorrang(ActionEvent event) {

        switch(dc.getHuidigeLeerling().getVT().getVoorrang().getKleur().toString()){
            case "WHITE":
                circleVoorrang.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getVoorrang().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleVoorrang.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getVT().getVoorrang().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleVoorrang.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getVoorrang().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
    @FXML
    private Button btnOpenbareWeg;
    
    @FXML
    public void handleButtonOpenbareWeg(ActionEvent event) {

        switch(dc.getHuidigeLeerling().getVT().getOpenbareWeg().getKleur().toString()){
            case "WHITE":
                circleOpenbareWeg.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getOpenbareWeg().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleOpenbareWeg.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getVT().getOpenbareWeg().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleOpenbareWeg.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getOpenbareWeg().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
    @FXML
    private Button btnAanwijzers;
    
    @FXML
    public void handleButtonAanwijzers(ActionEvent event) {

        switch(dc.getHuidigeLeerling().getVT().getAanwijzers().getKleur().toString()){
            case "WHITE":
                circleAanwijzers.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getAanwijzers().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleAanwijzers.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getVT().getAanwijzers().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleAanwijzers.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getAanwijzers().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
    @FXML
    private Button btnRechtsaf;
    
    @FXML
    public void handleButtonRechtsaf(ActionEvent event) {

        switch(dc.getHuidigeLeerling().getVT().getRechtsaf().getKleur().toString()){
            case "WHITE":
                circleRechtsaf.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getRechtsaf().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleRechtsaf.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getVT().getRechtsaf().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleRechtsaf.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getRechtsaf().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
    @FXML
    private Button btnLinksaf;
    @FXML
    public void handleButtonLinksaf(ActionEvent event) {

        switch(dc.getHuidigeLeerling().getVT().getLinksaf().getKleur().toString()){
            case "WHITE":
                circleLinksaf.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getLinksaf().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleLinksaf.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getVT().getLinksaf().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleLinksaf.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getLinksaf().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
    @FXML
    private Button btnKruisen;
    
    @FXML
    public void handleButtonKruisen(ActionEvent event) {

        switch(dc.getHuidigeLeerling().getVT().getKruisen().getKleur().toString()){
            case "WHITE":
                circleKruisen.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getKruisen().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleKruisen.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getVT().getKruisen().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleKruisen.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getKruisen().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
    @FXML
    private Button btnInhalen;
    
    @FXML
    public void handleButtonInhalen(ActionEvent event) {

        switch(dc.getHuidigeLeerling().getVT().getInhalen().getKleur().toString()){
            case "WHITE":
                circleInhalen.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getInhalen().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleInhalen.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getVT().getInhalen().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleInhalen.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getInhalen().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
    @FXML
    private Button btnAfstanden;
    
    @FXML
    public void handleButtonAfstanden(ActionEvent event) {

        switch(dc.getHuidigeLeerling().getVT().getAfstanden().getKleur().toString()){
            case "WHITE":
                circleAfstanden.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getAfstanden().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleAfstanden.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getVT().getAfstanden().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleAfstanden.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getAfstanden().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
    @FXML
    private Button btnSnelheid;
    
    @FXML
    public void handleButtonSnelheid(ActionEvent event) {

        switch(dc.getHuidigeLeerling().getVT().getSnelheid().getKleur().toString()){
            case "WHITE":
                circleSnelheid.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getSnelheid().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleSnelheid.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getVT().getSnelheid().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleSnelheid.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getSnelheid().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
    @FXML
    private Button btnTekens;
    
    @FXML
    public void handleButtonTekens(ActionEvent event) {

        switch(dc.getHuidigeLeerling().getVT().getTekens().getKleur().toString()){
            case "WHITE":
                circleTekens.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getTekens().setKleur(Kleur.ORANGE);
                break;
            case "ORANGE":
                circleTekens.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getVT().getTekens().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleTekens.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getVT().getTekens().setKleur(Kleur.ORANGE);
                break;  
        }
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        verkeerstechniekScherm.setStyle("-fx-background-image: url(\"/image/achtergrond.jpg\"); -fx-background-position: center center; ");
        Image imgBtnTerug = new Image(getClass().getResourceAsStream("/image/Terugknop.png"));
        btnTerug.setGraphic(new ImageView(imgBtnTerug));
    }
    
    public void handleButtonTerugknop(ActionEvent event)throws IOException{
        Stage currentStage = (Stage) verkeerstechniekScherm.getScene().getWindow();
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

    void initData(DomainController dc) {
        this.dc = dc ; 
        lblNaam.setText(dc.getHuidigeLeerling().getnaam());
        String kleur;
        kleur = dc.getHuidigeLeerling().getVT().getAanwijzers().getKleur().toString();
        circleAanwijzers.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getVT().getAfstanden().getKleur().toString();
        circleAfstanden.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getVT().getInhalen().getKleur().toString();
        circleInhalen.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getVT().getKruisen().getKleur().toString();
        circleKruisen.setFill(Color.valueOf(kleur));
        
        kleur = dc.getHuidigeLeerling().getVT().getLinksaf().getKleur().toString();
        circleLinksaf.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getVT().getOpenbareWeg().getKleur().toString();
        circleOpenbareWeg.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getVT().getRechtsaf().getKleur().toString();
        circleRechtsaf.setFill(Color.valueOf(kleur));
        
        kleur = dc.getHuidigeLeerling().getVT().getSnelheid().getKleur().toString();
        circleSnelheid.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getVT().getTekens().getKleur().toString();
        circleTekens.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getVT().getVoorrang().getKleur().toString();
        circleVoorrang.setFill(Color.valueOf(kleur));
    }
}
