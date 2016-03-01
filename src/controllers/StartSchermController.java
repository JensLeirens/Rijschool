
package controllers;


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
import javafx.scene.control.ListView;
import javafx.stage.Stage;



public class StartSchermController implements Initializable {

    @FXML
    private ListView<String> listViewLeerlingen = new ListView<String>();

    @FXML
    private Button zoeken;
    
    @FXML
    private  Node startScherm ;
    
     @FXML
    private void handleButtonZoeken(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/HoofdEvaScherm.fxml"));
         Parent root1 = (Parent) fxmlLoader.load();
         Stage stage = new Stage();
         stage.setTitle("Evaluatie scherm");
         stage.setScene(new Scene(root1));
        
         stage.show();
         startScherm.getScene().getWindow().hide();
         


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        ObservableList<String> listLeerlingen = FXCollections.observableArrayList(
          "Walter VandenPoorten", "Johnny Cash");
        listViewLeerlingen.setItems(listLeerlingen);


    }
    
    private void sluiten(){
        Platform.exit();
    }

}
