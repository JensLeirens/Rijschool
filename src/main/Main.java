
package main;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
    
     @Override
    public void start(Stage stage) throws Exception {
        //VOOR SCENE BUILDER-----------------------
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("gui/HoofdEvaScherm.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        //--------------------------------------------
    }

    public static void main(String[] args) {
        launch(args);
    }
}
