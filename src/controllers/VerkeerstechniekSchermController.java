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
import javafx.scene.layout.Background;
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
    private Button btnOpenbareWeg;
    
    @FXML
    private Button btnAanwijzers;
    
    @FXML
    private Button btnRechtsaf;
    
    @FXML
    private Button btnLinksaf;
    
    @FXML
    private Button btnKruisen;
    
    @FXML
    private Button btnInhalen;
    
    @FXML
    private Button btnAfstanden;
    
    @FXML
    private Button btnSnelheid;
    
    @FXML
    private Button btnTekens;
    
    
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
