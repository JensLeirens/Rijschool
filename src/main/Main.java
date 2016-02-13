
package main;

import gui.EvaStartScherm;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
    
     @Override
    public void start(Stage primaryStage) {
       // comments aanpassen en uit comment zetten eens er een gui class is
        
        EvaStartScherm root = new EvaStartScherm();
        
        // titel en grootte niet FINAL moet nog aangepast worden naarmate vooruitgang
        //Scene scene = new Scene(root);
         root.setTitle("Evaluatie Leerling"); 
         root.show();      
        //primaryStage.setTitle("Basis Eva");
        //primaryStage.setScene(scene);
        //primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
