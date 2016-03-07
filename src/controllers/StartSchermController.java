
package controllers;


import domain.Leerling;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class StartSchermController implements Initializable {
    private ArrayList<Leerling> listLeerlingen; 
    
    
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
            for (Leerling l : listLeerlingen) {
                if( l.getId() != Integer.parseInt(txtNummer.getText())){
                    leerlingBestaatAl = false ; 
                    System.out.println(" leerling is nieuw");
                } 
                else {
                    leerlingBestaatAl = true ;
                    lblMessage.setText("Leerling bestaat al");
                }
            }
            
            if (leerlingBestaatAl == false){
                listLeerlingen.add(new Leerling(Integer.parseInt(txtNummer.getText()), txtNaam.getText()));
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
        listLeerlingen = new ArrayList<Leerling>() ;  
        listLeerlingen.add(new Leerling(0, "Johnny Cash")); 
        listLeerlingen.add(new Leerling(1, "Walter Van Der Poorten"));
       
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
        
        stage.show();
        
    }

    public void refreshList(){
        ArrayList<String> listLeerlingenNamen = new ArrayList<>() ; 
        listLeerlingen.stream().forEach((leerling) -> {
            listLeerlingenNamen.add(leerling.toString());
        });
        
        ObservableList<String> olLeerlingen = FXCollections.observableArrayList(listLeerlingenNamen);
        listViewLeerlingen.setItems(olLeerlingen);
    }
}
