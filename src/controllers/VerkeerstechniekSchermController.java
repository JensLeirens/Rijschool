package controllers;

import domain.DomainController;
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

        if ("-fx-base: #FFA500".equals(btnVoorrang.getStyle())) {
            btnVoorrang.setStyle("-fx-base: #008000");
        } 
        else{ 
            if ("-fx-base: #008000".equals(btnVoorrang.getStyle())) {
                btnVoorrang.setStyle("-fx-base: #FFA500");
            } 
            else {
                btnVoorrang.setStyle("-fx-base: #FFA500");
            }
        }
    }
    
    @FXML
    private Button btnOpenbareWeg;
    
    @FXML
    public void handleButtonOpenbareWeg(ActionEvent event) {

        if ("-fx-base: #FFA500".equals(btnOpenbareWeg.getStyle())) {
            btnOpenbareWeg.setStyle("-fx-base: #008000");
        } 
        else{ 
            if ("-fx-base: #008000".equals(btnOpenbareWeg.getStyle())) {
                btnOpenbareWeg.setStyle("-fx-base: #FFA500");
            } 
            else {
                btnOpenbareWeg.setStyle("-fx-base: #FFA500");
            }
        }
    }
    
    @FXML
    private Button btnAanwijzers;
    
    @FXML
    public void handleButtonAanwijzers(ActionEvent event) {

        if ("-fx-base: #FFA500".equals(btnAanwijzers.getStyle())) {
            btnAanwijzers.setStyle("-fx-base: #008000");
        } 
        else{ 
            if ("-fx-base: #008000".equals(btnAanwijzers.getStyle())) {
                btnAanwijzers.setStyle("-fx-base: #FFA500");
            } 
            else {
                btnAanwijzers.setStyle("-fx-base: #FFA500");
            }
        }
    }
    
    @FXML
    private Button btnRechtsaf;
    
    @FXML
    public void handleButtonRechtsaf(ActionEvent event) {

        if ("-fx-base: #FFA500".equals(btnRechtsaf.getStyle())) {
            btnRechtsaf.setStyle("-fx-base: #008000");
        } 
        else{ 
            if ("-fx-base: #008000".equals(btnRechtsaf.getStyle())) {
                btnRechtsaf.setStyle("-fx-base: #FFA500");
            } 
            else {
                btnRechtsaf.setStyle("-fx-base: #FFA500");
            }
        }
    }
    
    @FXML
    private Button btnLinksaf;
    @FXML
    public void handleButtonLinksaf(ActionEvent event) {

        if ("-fx-base: #FFA500".equals(btnLinksaf.getStyle())) {
            btnLinksaf.setStyle("-fx-base: #008000");
        } 
        else{ 
            if ("-fx-base: #008000".equals(btnLinksaf.getStyle())) {
                btnLinksaf.setStyle("-fx-base: #FFA500");
            } 
            else {
                btnLinksaf.setStyle("-fx-base: #FFA500");
            }
        }
    }
    
    @FXML
    private Button btnKruisen;
    
    @FXML
    public void handleButtonKruisen(ActionEvent event) {

        if ("-fx-base: #FFA500".equals(btnKruisen.getStyle())) {
            btnKruisen.setStyle("-fx-base: #008000");
        } 
        else{ 
            if ("-fx-base: #008000".equals(btnKruisen.getStyle())) {
                btnKruisen.setStyle("-fx-base: #FFA500");
            } 
            else {
                btnKruisen.setStyle("-fx-base: #FFA500");
            }
        }
    }
    
    @FXML
    private Button btnInhalen;
    
    @FXML
    public void handleButtonInhalen(ActionEvent event) {

        if ("-fx-base: #FFA500".equals(btnInhalen.getStyle())) {
            btnInhalen.setStyle("-fx-base: #008000");
        } 
        else{ 
            if ("-fx-base: #008000".equals(btnInhalen.getStyle())) {
                btnInhalen.setStyle("-fx-base: #FFA500");
            } 
            else {
                btnInhalen.setStyle("-fx-base: #FFA500");
            }
        }
    }
    
    @FXML
    private Button btnAfstanden;
    
    @FXML
    public void handleButtonAfstanden(ActionEvent event) {

        if ("-fx-base: #FFA500".equals(btnAfstanden.getStyle())) {
            btnAfstanden.setStyle("-fx-base: #008000");
        } 
        else{ 
            if ("-fx-base: #008000".equals(btnAfstanden.getStyle())) {
                btnAfstanden.setStyle("-fx-base: #FFA500");
            } 
            else {
                btnAfstanden.setStyle("-fx-base: #FFA500");
            }
        }
    }
    
    @FXML
    private Button btnSnelheid;
    
    @FXML
    public void handleButtonSnelheid(ActionEvent event) {

        if ("-fx-base: #FFA500".equals(btnSnelheid.getStyle())) {
            btnSnelheid.setStyle("-fx-base: #008000");
        } 
        else{ 
            if ("-fx-base: #008000".equals(btnSnelheid.getStyle())) {
                btnSnelheid.setStyle("-fx-base: #FFA500");
            } 
            else {
                btnSnelheid.setStyle("-fx-base: #FFA500");
            }
        }
    }
    
    @FXML
    private Button btnTekens;
    
    @FXML
    public void handleButtonTekens(ActionEvent event) {

        if ("-fx-base: #FFA500".equals(btnTekens.getStyle())) {
            btnTekens.setStyle("-fx-base: #008000");
        } 
        else{ 
            if ("-fx-base: #008000".equals(btnTekens.getStyle())) {
                btnTekens.setStyle("-fx-base: #FFA500");
            } 
            else {
                btnTekens.setStyle("-fx-base: #FFA500");
            }
        }
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
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
    }
}
