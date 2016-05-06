
package controllers;

import domain.DomainController;
import domain.Kleur;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class VerkeerstechniekSchermController implements Initializable {
    private DomainController dc = new DomainController(); 
    boolean toonEvaluatie = false;
    int evaluatie;
    
    private boolean toon = false ;
    private boolean booleanVoorrang = false ;
    private boolean booleanTekens = false ;
    private boolean booleanSnelheid = false ;
    private boolean booleanAfstanden = false ;
    private boolean booleanInhalen = false ;
    private boolean booleanKruisen = false ;
    private boolean booleanLinksaf = false ;
    private boolean booleanRechtsaf = false ;
    private boolean booleanAanwijzers = false ;
    private boolean booleanOpenbareWeg = false;
    private List<String> listVoorbeeldwaarden = new ArrayList();
    private List<String> listOpmerkingen = new ArrayList();
    
    @FXML 
    private Label naam ;
    
    @FXML
    private Node verkeerstechniekScherm ;

    @FXML 
    private Button terugknop ; 
    
    @FXML
    private Button opm ; 
    
    @FXML
    private Button rood ; 
    
    @FXML
    private Button oranje ; 
    
    @FXML
    private Button groen ; 
    
    @FXML
    private Button voorrang ;
    
    @FXML
    private Button tekens ;
    
    @FXML
    private Button snelheid ;
    
    @FXML
    private Button afstanden;
    
    @FXML
    private Button inhalen ; 
    
    @FXML
    private Button kruisen ; 
    
    @FXML
    private Button linksaf; 
    
    @FXML
    private Button rechtsaf ;
    
    @FXML
    private Button aanwijzers ;
    
    @FXML
    private Button openbareWeg ;
    
    @FXML
    private Button Opslaan ; 
    
    @FXML 
    private Button huidigeKnop;
    
    @FXML
    private Circle circleVoorrang;
    
    @FXML
    private Circle circleTekens;
    
    @FXML
    private Circle circleSnelheid;
    
    @FXML
    private Circle circleAfstanden;
    
    @FXML
    private Circle circleInhalen;
    
    @FXML
    private Circle circleKruisen;
    
    @FXML
    private Circle circleLinksaf;
    
    @FXML
    private Circle circleRechtsaf;
    
    @FXML
    private Circle circleAanwijzers;
    
    @FXML
    private Circle circleOpenbareWeg;
    
    @FXML
    private Label lblOpm; 
    
    
    @FXML
    private ListView listviewOpm; 
          
    @FXML
    private Button addOpm; 
    
    @FXML
    private Button addWaarde; 
    
    @FXML
    private TextField txfOpm; 
            
    @FXML
    private Button  verwijderOpm;
    
    @FXML
    public void handleButtonTerugknop(ActionEvent event) throws IOException {
        keerTerug();
    }
   
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
         listviewOpm.setStyle("-fx-font: 12pt \"Arial\";");
          
        verdwijnOpmerkingen(); 
        verkeerstechniekScherm.setStyle("-fx-background-image: url(\"/image/achtergrond.jpg\"); -fx-background-position: center center; ");
        
        BackgroundImage imgVoorrang = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Voorrang.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        voorrang.setBackground(new Background(imgVoorrang));
        
        BackgroundImage imgTekens = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Tekens.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        tekens.setBackground(new Background(imgTekens));
        
        BackgroundImage imgSnelheid = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Snelheid.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        snelheid.setBackground(new Background(imgSnelheid));
        
        BackgroundImage imgAfstanden = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Afstanden.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        afstanden.setBackground(new Background(imgAfstanden));
        
        BackgroundImage imgInhalen = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Inhalen.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        inhalen.setBackground(new Background(imgInhalen));
        
        BackgroundImage imgKruisen = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Kruisen.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        kruisen.setBackground(new Background(imgKruisen));
        
        BackgroundImage imgLinksaf = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Linksaf.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        linksaf.setBackground(new Background(imgLinksaf));
        
        BackgroundImage imgRechtsaf = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Rechtsaf.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        rechtsaf.setBackground(new Background(imgRechtsaf));
        
        BackgroundImage imgAanwijzers = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Aanwijzers.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        aanwijzers.setBackground(new Background(imgAanwijzers));
        
        BackgroundImage imgOpenbareWeg = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/OpenbareWeg.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        openbareWeg.setBackground(new Background(imgOpenbareWeg));
        
        BackgroundImage uitRoepTeken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/uitroepteken.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        opm.setBackground(new Background(uitRoepTeken));
        
        
        Image imgTerugknop = new Image(getClass().getResourceAsStream("/image/Terugknop.png"));
        terugknop.setGraphic(new ImageView(imgTerugknop));
        
    }
    
    void initData(DomainController dc, boolean toonEvaluatie, int evaluatie) {
        this.dc = dc;
        this.toonEvaluatie = toonEvaluatie;
        this.evaluatie = evaluatie;
        naam.setText(dc.getHuidigeLeerling().getnaam());
        
        if(toonEvaluatie == false){
            String kleur;
            kleur = dc.getHuidigeLeerling().getVT().getVoorrang().getKleur().toString();
            circleVoorrang.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getVT().getTekens().getKleur().toString();
            circleTekens.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getVT().getSnelheid().getKleur().toString();
            circleSnelheid.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getVT().getAfstanden().getKleur().toString();
            circleAfstanden.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getVT().getInhalen().getKleur().toString();
            circleInhalen.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getVT().getKruisen().getKleur().toString();
            circleKruisen.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getVT().getLinksaf().getKleur().toString();
            circleLinksaf.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getVT().getRechtsaf().getKleur().toString();
            circleRechtsaf.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getVT().getAanwijzers().getKleur().toString();
            circleAanwijzers.setFill(Color.valueOf(kleur));
            kleur = dc.getHuidigeLeerling().getVT().getOpenbareWeg().getKleur().toString();
            circleOpenbareWeg.setFill(Color.valueOf(kleur));
        }
        else {
            
            circleVoorrang.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getVoorrang().getKleur().toString()));
            circleTekens.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getTekens().getKleur().toString()));
            circleSnelheid.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getSnelheid().getKleur().toString()));
            circleAfstanden.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getAfstanden().getKleur().toString()));
            circleInhalen.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getInhalen().getKleur().toString()));
            circleKruisen.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getKruisen().getKleur().toString()));
            circleLinksaf.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getLinksaf().getKleur().toString()));
            circleRechtsaf.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getRechtsaf().getKleur().toString()));
            circleAanwijzers.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getAanwijzers().getKleur().toString()));
            circleOpenbareWeg.setFill(Color.valueOf(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getOpenbareWeg().getKleur().toString()));
            Opslaan.setText("Ga terug");
        }
    }
    
      
     @FXML
    public void handleButtonOpm(ActionEvent event) throws IOException {
        if(toonEvaluatie == false){
            lblOpm.setVisible(true);
            lblOpm.setText("Opmerking is opgeslaan als belangrijk.");
            dc.getHuidigeLeerling().getOpmerkingen().addAll(listviewOpm.getSelectionModel().getSelectedItems()); 
        }
    }
    
    @FXML
    public void handleButtonAddOpm(ActionEvent event) throws IOException {
        if(toonEvaluatie == false){
            lblOpm.setText("");
            String voegOpmToe = txfOpm.getText();
            listOpmerkingen.add(voegOpmToe);
            ObservableList<String> ol = FXCollections.observableArrayList(listOpmerkingen);
            listviewOpm.setItems(ol);
            geefOpmerking(voegOpmToe);
            txfOpm.clear();
            lblOpm.setText("Opmerking toegevoegd.");
        }
    }

    @FXML
    public void handleButtonVerwijderOpm(ActionEvent event) throws IOException {
        if(toonEvaluatie == false){
            verwijderOpmerking(listviewOpm.getSelectionModel().getSelectedItems());
            listOpmerkingen.removeAll(listviewOpm.getSelectionModel().getSelectedItems());
            ObservableList<String> ol = FXCollections.observableArrayList(listOpmerkingen);
            listviewOpm.setItems(ol);
            lblOpm.setText("Opmerking verwijdert.");
        }
    }
    
    @FXML
    public void handleButtonOpslaan(ActionEvent event) throws IOException {
        toon = false;
        booleanVoorrang = false;
        booleanTekens = false;
        booleanSnelheid = false;
        booleanAfstanden = false;
        booleanInhalen = false;
        booleanKruisen = false;
        booleanLinksaf = false;
        booleanRechtsaf = false;
        booleanAanwijzers = false;
        booleanOpenbareWeg = false;
        verdwijnOpmerkingen();
        listOpmerkingen.clear();
        listviewOpm.getItems().clear();
        txfOpm.setText("");
        if (toonEvaluatie == false )
            lblOpm.setText("de opmerkingen zijn opgeslagen");
    }
    
    @FXML
    public void handleButtonGroen(ActionEvent event) throws IOException {
        if(toonEvaluatie == false){
            geefKleur("GREEN");
        }
    }
    
    @FXML
    public void handleButtonOranje(ActionEvent event) throws IOException {
        if(toonEvaluatie == false){
            geefKleur("ORANGE");
        }
    }
     
    @FXML
    public void handleButtonRood(ActionEvent event) throws IOException {
        if(toonEvaluatie == false){
            geefKleur("RED");
        }
    }
    
    public void geefKleur(String kleur) {
        if (toon == true) {
            if (booleanVoorrang == true) {
                circleVoorrang.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getVT().getVoorrang().setKleur(Kleur.valueOf(kleur));
            }
            if (booleanTekens == true) {
                circleTekens.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getVT().getTekens().setKleur(Kleur.valueOf(kleur));
            }
            if (booleanSnelheid == true) {
                circleSnelheid.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getVT().getSnelheid().setKleur(Kleur.valueOf(kleur));
            }
            if (booleanAfstanden == true) {
                circleAfstanden.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getVT().getAfstanden().setKleur(Kleur.valueOf(kleur));
            }
            if (booleanInhalen == true) {
                circleInhalen.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getVT().getInhalen().setKleur(Kleur.valueOf(kleur));
            }
            if (booleanKruisen == true) {
                circleKruisen.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getVT().getKruisen().setKleur(Kleur.valueOf(kleur));
            }
            if (booleanLinksaf == true) {
                circleLinksaf.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getVT().getLinksaf().setKleur(Kleur.valueOf(kleur));
            }
            if (booleanRechtsaf == true) {
                circleRechtsaf.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getVT().getRechtsaf().setKleur(Kleur.valueOf(kleur));
            }
            if (booleanAanwijzers == true) {
                circleAanwijzers.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getVT().getAanwijzers().setKleur(Kleur.valueOf(kleur));
            }
            if (booleanOpenbareWeg == true) {
                circleOpenbareWeg.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getVT().getOpenbareWeg().setKleur(Kleur.valueOf(kleur));
            }
        }
    }
    
    public void geefOpmerking(String opmerking) {
        if (toon == true) {
            if (booleanVoorrang == true) {
                dc.getHuidigeLeerling().getVT().getVoorrang().getOpmerking().add(opmerking);
            }
            if (booleanTekens == true) {
                dc.getHuidigeLeerling().getVT().getTekens().getOpmerking().add(opmerking);
            }
            if (booleanSnelheid == true) {
                dc.getHuidigeLeerling().getVT().getSnelheid().getOpmerking().add(opmerking);
            }
            if (booleanAfstanden == true) {
                dc.getHuidigeLeerling().getVT().getAfstanden().getOpmerking().add(opmerking);
            }
            if (booleanInhalen == true) {
                dc.getHuidigeLeerling().getVT().getInhalen().getOpmerking().add(opmerking);
            }
            if (booleanKruisen == true) {
                dc.getHuidigeLeerling().getVT().getKruisen().getOpmerking().add(opmerking);
            }
            if (booleanLinksaf == true){
                dc.getHuidigeLeerling().getVT().getLinksaf().getOpmerking().add(opmerking);
            }
            if (booleanRechtsaf == true){
                dc.getHuidigeLeerling().getVT().getRechtsaf().getOpmerking().add(opmerking);
            }
            if (booleanAanwijzers == true){
                dc.getHuidigeLeerling().getVT().getAanwijzers().getOpmerking().add(opmerking);
            }
            if (booleanOpenbareWeg == true){
                dc.getHuidigeLeerling().getVT().getOpenbareWeg().getOpmerking().add(opmerking);
            }
        }
    }
     public void verwijderOpmerking(List opmerking) {
        if (toon == true) {
            if (booleanVoorrang == true) {
                dc.getHuidigeLeerling().getVT().getVoorrang().getOpmerking().removeAll(opmerking);
            }
            if (booleanTekens == true) {
                dc.getHuidigeLeerling().getVT().getTekens().getOpmerking().removeAll(opmerking);
            }
            if (booleanSnelheid == true) {
                dc.getHuidigeLeerling().getVT().getSnelheid().getOpmerking().removeAll(opmerking);
            }
            if (booleanAfstanden == true) {
                dc.getHuidigeLeerling().getVT().getAfstanden().getOpmerking().removeAll(opmerking);
            }
            if (booleanInhalen == true) {
                dc.getHuidigeLeerling().getVT().getInhalen().getOpmerking().removeAll(opmerking);
            }
            if (booleanKruisen == true) {
                dc.getHuidigeLeerling().getVT().getKruisen().getOpmerking().removeAll(opmerking);
            }
            if (booleanLinksaf == true){
                dc.getHuidigeLeerling().getVT().getLinksaf().getOpmerking().removeAll(opmerking);
            }
            if (booleanRechtsaf == true){
                dc.getHuidigeLeerling().getVT().getRechtsaf().getOpmerking().removeAll(opmerking);
            }
            if (booleanAanwijzers == true){
                dc.getHuidigeLeerling().getVT().getAanwijzers().getOpmerking().removeAll(opmerking);
            }
            if (booleanOpenbareWeg == true){
                dc.getHuidigeLeerling().getVT().getOpenbareWeg().getOpmerking().removeAll(opmerking);
            }
        }
    }
    
    public void toonOpmerkingen(){
        if(toonEvaluatie == false){
            txfOpm.setVisible(true);
            verwijderOpm.setVisible(true);
            addOpm.setVisible(true);
            opm.setVisible(true);  
            rood .setVisible(true);
            oranje.setVisible(true);
            groen.setVisible(true);
        }
        Opslaan.setVisible(true);
        listviewOpm.setVisible(true);
        huidigeKnop.setVisible(true);
        
    }
    
    public void verdwijnOpmerkingen(){
        addOpm.setVisible(false);
        opm.setVisible(false);   
        rood .setVisible(false);
        oranje.setVisible(false);
        groen.setVisible(false);
        Opslaan.setVisible(false); 
        listviewOpm.setVisible(false);
        txfOpm.setVisible(false);
        huidigeKnop.setVisible(false);
         verwijderOpm.setVisible(false);
    }
    
    public void keerTerug() throws IOException{
        Stage currentStage = (Stage) verkeerstechniekScherm.getScene().getWindow();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/HoofdScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Hoofdscherm");
        
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root1, 1024, 743);
        stage.setScene(scene);
        // DC meegeven aan de volgende controller 
        HoofdSchermController controller = fxmlLoader.<HoofdSchermController>getController();
        controller.initData(dc, toonEvaluatie, evaluatie);
        
        stage.show();
        currentStage.close();

    }
       
    @FXML
    public void handleButtonVoorrang(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            booleanVoorrang = true ;
            if(toonEvaluatie == false){
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getVT().getVoorrang().getOpmerking()); 
                listOpmerkingen.addAll(dc.getHuidigeLeerling().getVT().getVoorrang().getOpmerking());
            } else {
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getVoorrang().getOpmerking());
            }
            BackgroundImage imgHuidigeKnop = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Voorrang.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(imgHuidigeKnop));
        }
    }
    
    @FXML
    public void handleButtonTekens(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            booleanTekens = true ; 
            if(toonEvaluatie == false){
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getVT().getTekens().getOpmerking()); 
                listOpmerkingen.addAll(dc.getHuidigeLeerling().getVT().getTekens().getOpmerking());
            } else {
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getTekens().getOpmerking());
            }
            BackgroundImage imgHuidigeKnop = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Tekens.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(imgHuidigeKnop));
        }
    }
    
    @FXML
    public void handleButtonSnelheid(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            booleanSnelheid = true ; 
            if(toonEvaluatie == false){
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getVT().getSnelheid().getOpmerking()); 
                listOpmerkingen.addAll(dc.getHuidigeLeerling().getVT().getSnelheid().getOpmerking());
            } else {
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getSnelheid().getOpmerking());
            }
            BackgroundImage imgHuidigeKnop = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Snelheid.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(imgHuidigeKnop));
        }
    }
    @FXML
    public void handleButtonAfstanden(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            booleanAfstanden = true ; 
            if(toonEvaluatie == false){
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getVT().getAfstanden().getOpmerking()); 
                listOpmerkingen.addAll(dc.getHuidigeLeerling().getVT().getAfstanden().getOpmerking());
            } else {
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getAfstanden().getOpmerking());
            }
            BackgroundImage imgHuidigeKnop = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Afstanden.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(imgHuidigeKnop));
        }
    }
    
    @FXML
    public void handleButtonInhalen(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            booleanInhalen = true ;
            if(toonEvaluatie == false){
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getVT().getInhalen().getOpmerking()); 
                listOpmerkingen.addAll(dc.getHuidigeLeerling().getVT().getInhalen().getOpmerking());
            } else {
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getInhalen().getOpmerking());
            }
            BackgroundImage imgHuidigeKnop = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Inhalen.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(imgHuidigeKnop));
        }
    }
    
    @FXML
    public void handleButtonKruisen(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            booleanKruisen = true ; 
            if(toonEvaluatie == false){
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getVT().getKruisen().getOpmerking()); 
                listOpmerkingen.addAll(dc.getHuidigeLeerling().getVT().getKruisen().getOpmerking());
            } else {
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getKruisen().getOpmerking());
                    }
            BackgroundImage imgHuidigeKnop = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Kruisen.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(imgHuidigeKnop));
        }
    }
    
    @FXML
    public void handleButtonLinksaf(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            booleanLinksaf = true ; 
            if(toonEvaluatie == false){
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getVT().getLinksaf().getOpmerking()); 
                listOpmerkingen.addAll(dc.getHuidigeLeerling().getVT().getLinksaf().getOpmerking());
            } else {
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getLinksaf().getOpmerking());
            }
            BackgroundImage imgHuidigeKnop = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Linksaf.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(imgHuidigeKnop));
        }
    }
    
    @FXML
    public void handleButtonRechtsaf(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            booleanRechtsaf = true ; 
            if(toonEvaluatie == false){
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getVT().getRechtsaf().getOpmerking()); 
                listOpmerkingen.addAll(dc.getHuidigeLeerling().getVT().getRechtsaf().getOpmerking());
            } else {
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getRechtsaf().getOpmerking());
            }
            BackgroundImage imgHuidigeKnop = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Rechtsaf.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(imgHuidigeKnop));
        }
    }
    
    @FXML
    public void handleButtonAanwijzers(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            booleanAanwijzers = true ; 
            if(toonEvaluatie == false){
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getVT().getAanwijzers().getOpmerking()); 
                listOpmerkingen.addAll(dc.getHuidigeLeerling().getVT().getAanwijzers().getOpmerking());
            } else {
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getAanwijzers().getOpmerking());
            }
            BackgroundImage imgHuidigeKnop = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Aanwijzers.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(imgHuidigeKnop));
        }
    }
    
    @FXML
    public void handleButtonOpenbareWeg(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            booleanOpenbareWeg = true ; 
            if(toonEvaluatie == false){
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getVT().getOpenbareWeg().getOpmerking()); 
                listOpmerkingen.addAll(dc.getHuidigeLeerling().getVT().getOpenbareWeg().getOpmerking());
            } else {
                listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getEvaluaties().get(evaluatie).getVT().getOpenbareWeg().getOpmerking());
            }
            BackgroundImage imgHuidigeKnop = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/OpenbareWeg.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(imgHuidigeKnop));
        }
    }
    
    
}
