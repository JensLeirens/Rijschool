
package java.controllers;


import java.domain.DomainController;
import java.domain.Leerling;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class StartSchermController implements Initializable {
    private ArrayList<Leerling> listLeerlingen; 
    private DomainController dc; 
    
    @FXML
    private ListView<String> listViewLeerlingen = new ListView<>();
    
    @FXML
    private  Node startScherm ;
    
    @FXML
    private Label lblMessage; 
    
    @FXML
    private  TextField txtNaam ;
    
    @FXML
    private TextField txtNummer; 
    
    @FXML
    private void handleButtonZoeken(ActionEvent event) {
        lblMessage.setVisible(true);
        lblMessage.setText("deze knop zoekt een leerling in de online database en slaat deze lokaal op (TBI)");
    }
    
    @FXML
    private void handleButtonSync(ActionEvent event) {
        lblMessage.setVisible(true);
        lblMessage.setText("synchroniseert lokale leerlingen met online database (TBI)");
    }
    
    
    @FXML
    private void handleButtonOpenEva(ActionEvent event) throws IOException {
        
        
        if(listViewLeerlingen.getSelectionModel().getSelectedItem() != null){
            for (Leerling leerling : dc.getLeerlingen()) {
                if(listViewLeerlingen.getSelectionModel().getSelectedItem().equalsIgnoreCase(leerling.getnaam())){
                    dc.setHuidigeLeerling(leerling);
                }
            }
            
            sluiten();
        }
        else {
            lblMessage.setVisible(true);
            lblMessage.setText("gelieve een leerling te selecteren in de rechter kader");
        }
    }
    
    @FXML
    private void handleButtonNieuw(ActionEvent event) {
        boolean leerlingBestaatAl = true; 
        try {
        lblMessage.setTextFill(Color.web("#e42d2d"));   
        
        lblMessage.setVisible(true);
        if (txtNaam.getText().isEmpty() == true   && txtNummer.getText().isEmpty() == true ){
            lblMessage.setText("Gelieve een naam en een nummer in te geven!");
        }
        else if(txtNaam.getText().isEmpty() == true){
            lblMessage.setText("gelieve een naam in te geven!");
        }
        else if(txtNummer.getText().isEmpty() == true){
            lblMessage.setText("gelieve een nummer in te geven!");
        }
        
        else {
            for (Leerling l : dc.getLeerlingen()) {
                if( l.getId() != Integer.parseInt(txtNummer.getText())){
                    leerlingBestaatAl = false ; 
                } 
                else {
                    leerlingBestaatAl = true ;
                    lblMessage.setText("Leerling bestaat al");
                }
            }
            
            if (leerlingBestaatAl == false){
                dc.getLeerlingen().add(new Leerling(Integer.parseInt(txtNummer.getText()), txtNaam.getText()));
                lblMessage.setTextFill(Color.web("#006400"));
                lblMessage.setText("Leerling aangemaakt");
            
            }
            
           
        }
        } catch (NumberFormatException e) {
            lblMessage.setTextFill(Color.web("#e42d2d"));
            lblMessage.setText("GELIEVE EEN GELDIG NUMMER IN TE GEVEN!");
        }
        refreshList();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {  
        startScherm.setStyle("-fx-background-image: url(\"/image/achtergrond.jpg\"); -fx-background-position: center center; ");
        listViewLeerlingen.setStyle("-fx-font: 12pt \"Arial\";");
        if(dc == null){
            dc = new DomainController(); 
            dc.generateData();
        }
        refreshList();
        
    }
    
    private void sluiten() throws IOException{
        
        Stage currentStage = new Stage();
        currentStage = (Stage) startScherm.getScene().getWindow();
        currentStage.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/HoofdScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Evaluatie scherm");
        stage.setScene(new Scene(root1));
        
        // DC meegeven aan de volgende controller 
        HoofdSchermController controller = fxmlLoader.<HoofdSchermController>getController();
        controller.initData(dc);
        
        stage.show();
        
    }

    public void refreshList(){
        ArrayList<String> listLeerlingenNamen = new ArrayList<>() ; 
        dc.getLeerlingen().stream().forEach((leerling) -> {
            listLeerlingenNamen.add(leerling.toString());
        });
        
        ObservableList<String> olLeerlingen = FXCollections.observableArrayList(listLeerlingenNamen);
        listViewLeerlingen.setItems(olLeerlingen);
    }
    
    public void initData(DomainController dc) {
        this.dc = dc ;
        refreshList();
    }
}
