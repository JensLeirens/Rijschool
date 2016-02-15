package gui;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class EvaStartScherm extends Stage{
    
    private Circle circleRotonde;
    private Circle circleRijbaanMetRijStroken;
    private Circle circleStad;
    private Circle circleAutosnelweg;
    
    private Circle circleBanden;
    private Circle circleSchakelaar;
    private Circle circleVloeistof;
    

    public EvaStartScherm() {
        // gridpane TOP _______________________________________________________________________________________________
        Label spacer = new Label("") ; 
        spacer.setMinWidth(10);
        //gridpane initialiseren een centreren gaps maken en paddings 
        GridPane gridPaneTop = new GridPane();
        gridPaneTop.setAlignment(Pos.CENTER);
        
        // Vrije ruimte tussen kolommen        
        //gridPaneTop.setHgap(10);
        
        // Vrije ruimte tussen rijen        
        gridPaneTop.setVgap(10);
        
        // Vrije ruimte rond de randen van de grid (boven, rechts, onder, links)        
        gridPaneTop.setPadding(new Insets(10, 50, 10, 10));
        
        ImageView rotonde = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("image/Rotonde.png")));
        
        rotonde.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
        
        @Override
            public void handle(MouseEvent event) {
                if(circleRotonde.getFill()== Color.RED){
                    circleRotonde.setFill(Color.GREEN);
                }
                else
                    circleRotonde.setFill(Color.RED);
            }
        });
        gridPaneTop.add(rotonde,0,0,4,4);
        circleRotonde = new Circle();
        circleRotonde.setRadius(7);
        circleRotonde.setFill(Color.RED);
        gridPaneTop.add(circleRotonde,4,0);
        gridPaneTop.add(spacer,5,0); 
        
        ImageView rijbaanMetRijStroken = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("image/RijbaanMetRijStroken.png")));
        rijbaanMetRijStroken.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
        
        @Override
            public void handle(MouseEvent event) {
                if(circleRijbaanMetRijStroken.getFill()== Color.RED){
                    circleRijbaanMetRijStroken.setFill(Color.GREEN);
                }
                else
                    circleRijbaanMetRijStroken.setFill(Color.RED);
            }
        });
        gridPaneTop.add(rijbaanMetRijStroken,6,0,4,4);
        
        Label spacer2 = new Label("") ; 
        spacer2.setMinWidth(10);
        circleRijbaanMetRijStroken = new Circle();
        circleRijbaanMetRijStroken.setRadius(7);
        circleRijbaanMetRijStroken.setFill(Color.RED);
        gridPaneTop.add(circleRijbaanMetRijStroken,10,0);
        gridPaneTop.add(spacer2,11,0); 
        
        ImageView stad = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("image/Stad.png")));
        stad.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
        
        @Override
            public void handle(MouseEvent event) {
                if(circleStad.getFill()== Color.RED){
                    circleStad.setFill(Color.GREEN);
                }
                else
                    circleStad.setFill(Color.RED);
            }
        });
        gridPaneTop.add(stad,12,0,4,4);
        
        Label spacer3 = new Label("") ; 
        spacer3.setMinWidth(10);
        circleStad = new Circle();
        circleStad.setRadius(7);
        circleStad.setFill(Color.RED);
        gridPaneTop.add(circleStad,16,0);
        gridPaneTop.add(spacer3,17,0); 
        
        ImageView autosnelweg = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("image/RijbaanMetRijStroken.png")));
        autosnelweg.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
        
        @Override
            public void handle(MouseEvent event) {
                if(circleAutosnelweg.getFill()== Color.RED){
                    circleAutosnelweg.setFill(Color.GREEN);
                }
                else
                    circleAutosnelweg.setFill(Color.RED);
            }
        });
        gridPaneTop.add(autosnelweg,18,0,4,4);
        
        circleAutosnelweg = new Circle();
        circleAutosnelweg.setRadius(7);
        circleAutosnelweg.setFill(Color.RED);
        gridPaneTop.add(circleAutosnelweg,22,0);
        
        
        // gridpane Left _______________________________________________________________________________________________
        
        GridPane gridPaneLeft = new GridPane();
        gridPaneLeft.setAlignment(Pos.CENTER);
        //gridPaneLeft.setHgap(10);
        gridPaneLeft.setVgap(10);
        gridPaneLeft.setPadding(new Insets(10, 10, 10, 10));

        ImageView schakelaar = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("image/Schakelaar.png")));
        schakelaar.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
        
        @Override
            public void handle(MouseEvent event) {
                if(circleSchakelaar.getFill()== Color.RED){
                    circleSchakelaar.setFill(Color.GREEN);
                }
                else
                    circleSchakelaar.setFill(Color.RED);
            }
        });
        gridPaneLeft.add(schakelaar,0,0,4,4);
        
        circleSchakelaar = new Circle();
        circleSchakelaar.setRadius(7);
        circleSchakelaar.setFill(Color.RED);
        gridPaneLeft.add(circleSchakelaar,4,0);

        ImageView vloeistof = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("image/Vloeistof.png")));
        vloeistof.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
        
        @Override
            public void handle(MouseEvent event) {
                if(circleVloeistof.getFill()== Color.RED){
                    circleVloeistof.setFill(Color.GREEN);
                }
                else
                    circleVloeistof.setFill(Color.RED);
            }
        });
        gridPaneLeft.add(vloeistof,0,4,4,4);
        
        circleVloeistof = new Circle();
        circleVloeistof.setRadius(7);
        circleVloeistof.setFill(Color.RED);
        gridPaneLeft.add(circleVloeistof,4,4);

        ImageView banden = new ImageView(new Image(getClass().getClassLoader().getResourceAsStream("image/Banden.png")));
        banden.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
        
        @Override
            public void handle(MouseEvent event) {
                if(circleBanden.getFill()== Color.RED){
                    circleBanden.setFill(Color.GREEN);
                }
                else
                    circleBanden.setFill(Color.RED);
            }
        });
        gridPaneLeft.add(banden,0,8,4,4);
        
        circleBanden = new Circle();
        circleBanden.setRadius(7);
        circleBanden.setFill(Color.RED);
        gridPaneLeft.add(circleBanden,4,8);
        
        
        
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