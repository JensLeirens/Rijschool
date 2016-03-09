
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class RijtechniekSchermController implements Initializable {
    private DomainController dc = new DomainController(); 
    
    private boolean isZithouding = false ;
    private boolean isKoppeling = false;
    private boolean isRemtechniek = false;
    private boolean isSchakeltechniek= false;
    private boolean iStuurtechniek = false; 
    private boolean isKijktechniek = false; 
    
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
        
        Image uitRoepTeken = new Image(getClass().getResourceAsStream("/image/Uitroepteken.jpg"));
        opm.setGraphic(new ImageView(uitRoepTeken));
        
        
        Image imgTerugknop = new Image(getClass().getResourceAsStream("/image/Terugknop.png"));
        terugknop.setGraphic(new ImageView(imgTerugknop));
       
        
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

    void initData(DomainController dc) {
        this.dc = dc ; 
        naam.setText(dc.getHuidigeLeerling().getnaam());
    }
    @FXML
    public void handleButtonHouding(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    @FXML
    public void handleButtonKoppeling(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    @FXML
    public void handleButtonRem(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    @FXML
    public void handleButtonStuur(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    @FXML
    public void handleButtonSchakel(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    @FXML
    public void handleButtonKijk(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    
    
    
    
    @FXML
    public void handleButtonParkeren(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    @FXML
    public void handleButtonKeren(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
    @FXML
    public void handleButtonGarage(ActionEvent event) throws IOException {
        keerTerug();        
    }
    
     @FXML
    public void handleButtonAchteruit(ActionEvent event) throws IOException {
        keerTerug();        
    }
     @FXML
    public void handleButtonStuurOef(ActionEvent event) throws IOException {
        keerTerug();        
    }
}
