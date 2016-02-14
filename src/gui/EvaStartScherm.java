
package gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class EvaStartScherm extends Stage{

    public EvaStartScherm() {
        // gridpane TOP _______________________________________________________________________________________________
        
        //gridpane initialiseren een centreren gaps maken en paddings 
        GridPane gridPaneTop = new GridPane();
        gridPaneTop.setAlignment(Pos.CENTER);
        
        // Vrije ruimte tussen kolommen        
        gridPaneTop.setHgap(10);
        
        // Vrije ruimte tussen rijen        
        gridPaneTop.setVgap(10);
        
        // Vrije ruimte rond de randen van de grid (boven, rechts, onder, links)        
        gridPaneTop.setPadding(new Insets(10, 10, 10, 10));
        
        ImageView rotonde = new ImageView(new Image(getClass().getResourceAsStream("../image/Rotonde.png")));
        gridPaneTop.add(rotonde,1,1);
        
        // gridpane Left _______________________________________________________________________________________________
        
        GridPane gridPaneLeft = new GridPane();
        gridPaneLeft.setAlignment(Pos.CENTER);
        gridPaneLeft.setHgap(10);
        gridPaneLeft.setVgap(10);
        gridPaneLeft.setPadding(new Insets(10, 10, 10, 10));
        
        
        
        // gridpane Right _______________________________________________________________________________________________
        
        GridPane gridPaneRight = new GridPane();
        gridPaneRight.setAlignment(Pos.CENTER);
        gridPaneRight.setHgap(10);
        gridPaneRight.setVgap(10);
        gridPaneRight.setPadding(new Insets(10, 10, 10, 10));
        
        // gridpane Botttom _______________________________________________________________________________________________
        
        GridPane gridPaneBottom = new GridPane();
        gridPaneBottom.setAlignment(Pos.CENTER);
        gridPaneBottom.setHgap(10);
        gridPaneBottom.setVgap(10);
        gridPaneBottom.setPadding(new Insets(10, 10, 10, 10));
        
        
        // gridpane Center _______________________________________________________________________________________________
        GridPane gridPaneCenter = new GridPane();
        gridPaneCenter.setAlignment(Pos.CENTER);
        gridPaneCenter.setHgap(10);
        gridPaneCenter.setVgap(10);
        gridPaneCenter.setPadding(new Insets(10, 10, 10, 10));
        
        
        // Borderpane aanmaken ______________________________________________________________________________________________
        
        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(900, 700);
        
        //toevoegen van grids 
        borderPane.setRight(gridPaneRight);
        borderPane.setLeft(gridPaneLeft);
        borderPane.setTop(gridPaneTop);
        borderPane.setCenter(gridPaneCenter);
        borderPane.setBottom(gridPaneBottom);

        Scene scene = new Scene(borderPane);
        this.setScene(scene);

        
        
        
    }
    
    
}
