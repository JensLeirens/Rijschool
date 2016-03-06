
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class RijtechniekSchermController implements Initializable {
    
    @FXML
    private Button opm1 ; 
    
    @FXML
    private Button opm2 ; 
    
    @FXML
    private Button opm3 ; 
    
    @FXML
    private Button opm4 ; 
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image uitRoepTeken = new Image(getClass().getResourceAsStream("/image/Uitroepteken.jpg"));
        opm1.setGraphic(new ImageView(uitRoepTeken));
        opm2.setGraphic(new ImageView(uitRoepTeken));
        opm3.setGraphic(new ImageView(uitRoepTeken));
        opm4.setGraphic(new ImageView(uitRoepTeken));
        
        Image stuur = new Image(getClass().getResourceAsStream("/image/StuurOOO.PNG"));
        
    }
    
}
