
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



public class RijtechniekSchermController implements Initializable {
    private DomainController dc = new DomainController(); 
    
    private boolean toon = false ;
    private boolean houding = false ;
    private boolean iskoppeling = false ;
    private boolean remmen = false ;
    private boolean sturen = false ;
    private boolean schakel = false ;
    private boolean kijk = false ;
    private boolean helling = false ;
    private List<String> listVoorbeeldwaarden = new ArrayList();
    private List<String> listOpmerkingen = new ArrayList(); 
    
    @FXML 
    private Label naam ;
    
    @FXML
    private Node rijtechniekScherm ;

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
    private Button Opslaan ; 
    
    @FXML 
    private Button huidigeKnop;
    
    @FXML
    private Circle circleKeren;
    
    @FXML
    private Circle circleParkeren; 
    
    @FXML
    private Circle circleGarage; 
    
    @FXML
    private Circle circleStuuroefeningen;
    
    @FXML
    private Circle circleAchteruitrijden;
    
    @FXML
    private Circle circleZithouding;
     
    @FXML
    private Circle circleKoppeling;
    
    @FXML
    private Circle circleRemtechniek;
    
    @FXML
    private Circle circleStuurtechniek;
    
    @FXML
    private Circle circleSchakeltechniek;

    @FXML
    private Circle circleKijktechniek;
    
    @FXML 
    private Circle circleHelling;
    
    @FXML
    private Label lblOpm ; 
    
    @FXML
    private ListView listviewStandaardOpm; 
    
    @FXML
    private ListView listviewOpm; 
          
    @FXML
    private Button addOpm; 
    
    @FXML
    private Button addWaarde; 
    
    @FXML
    private TextField txfOpm; 
    
    @FXML
    private Button verwijderOpm;
            
    @FXML
    public void handleButtonTerugknop(ActionEvent event) throws IOException {
        keerTerug();        
    }
   
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
         listviewOpm.setStyle("-fx-font: 12pt \"Arial\";");
         listviewStandaardOpm.setStyle("-fx-font: 12pt \"Arial\";");
          
        verdwijnOpmerkingen(); 
        rijtechniekScherm.setStyle("-fx-background-image: url(\"/image/achtergrond.jpg\"); -fx-background-position: center center; ");
        
        BackgroundImage imgZithouding = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/zithouding.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        zithouding.setBackground(new Background(imgZithouding));
        
        BackgroundImage imgKoppeling = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/koppeling.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        koppeling.setBackground(new Background(imgKoppeling));
        
        BackgroundImage imgRem = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/rem.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        remtechniek.setBackground(new Background(imgRem));
        
        BackgroundImage imgSchakelen = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/schakelen.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        schakeltechniek.setBackground(new Background(imgSchakelen));
        
        BackgroundImage imgStuur = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Stuur.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        stuurtechniek.setBackground(new Background(imgStuur));
        
        BackgroundImage imgKijktechniek = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/kijktechniek.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        kijktechniek.setBackground(new Background(imgKijktechniek));
        
        BackgroundImage imgGarage = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Garage.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        garage.setBackground(new Background(imgGarage));
        
        BackgroundImage imgKeren = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Keren.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        keren.setBackground(new Background(imgKeren));
        
        BackgroundImage imgParkeren = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Parkeren.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        parkeren.setBackground(new Background(imgParkeren));
        
        BackgroundImage imgVertrekken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Vertrekken.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        aanzettenHelling.setBackground(new Background(imgVertrekken));
        
        BackgroundImage imgStuurOefeningen = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/StuurOefeningen.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        stuuroefeningen.setBackground(new Background(imgStuurOefeningen));
        
        BackgroundImage imgAchteruit = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Achteruit.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        achteruitrijden.setBackground(new Background(imgAchteruit));
        
        BackgroundImage uitRoepTeken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/uitroepteken.png")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
        opm.setBackground(new Background(uitRoepTeken));
        
        
        Image imgTerugknop = new Image(getClass().getResourceAsStream("/image/Terugknop.png"));
        terugknop.setGraphic(new ImageView(imgTerugknop));
        
    }
    
    void initData(DomainController dc) {
        this.dc = dc ; 
        naam.setText(dc.getHuidigeLeerling().getnaam());
        
        String kleur;
        
        kleur = dc.getHuidigeLeerling().getRT().getAchteruit().getKleur().toString();
        circleAchteruitrijden.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getGarage().getKleur().toString();
        circleGarage.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getKeren().getKleur().toString();
        circleKeren.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getParkeren().getKleur().toString();
        circleParkeren.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getStuurOef().getKleur().toString();
        circleStuuroefeningen.setFill(Color.valueOf(kleur));
        
        kleur = dc.getHuidigeLeerling().getRT().getKijk().getKleur().toString();
        circleKijktechniek.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getSchakel().getKleur().toString();
        circleSchakeltechniek.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getStuurtechniek().getKleur().toString();
        circleStuurtechniek.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getRem().getKleur().toString();
        circleRemtechniek.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getKoppeling().getKleur().toString();
        circleKoppeling.setFill(Color.valueOf(kleur));
        kleur = dc.getHuidigeLeerling().getRT().getZithouding().getKleur().toString();
        circleZithouding.setFill(Color.valueOf(kleur));
    }
    
      public void refreshList(){
        ObservableList<String> olVoorbeelden = FXCollections.observableArrayList(listVoorbeeldwaarden);
        listviewStandaardOpm.setItems(olVoorbeelden);
    }
      
     @FXML
    public void handleButtonOpm(ActionEvent event) throws IOException {
        lblOpm.setVisible(true);
        lblOpm.setText("Opmerking is opgeslaan als belangrijk.");
        dc.getHuidigeLeerling().getOpmerkingen().addAll(listviewOpm.getSelectionModel().getSelectedItems()); 
    }
    
    @FXML
    public void handleButtonAddWaarde(ActionEvent event) throws IOException {
        txfOpm.setText("");
        lblOpm.setText("");
        List<String> check = new ArrayList(); 
        check.addAll(listviewStandaardOpm.getSelectionModel().getSelectedItems());
        
        if(!listOpmerkingen.contains(check.get(0))){
            listOpmerkingen.addAll(listviewStandaardOpm.getSelectionModel().getSelectedItems());
            ObservableList<String> ol = FXCollections.observableArrayList(listOpmerkingen);
            listviewOpm.setItems(ol);
            geefOpmerking(check.get(0));
        } else{
            lblOpm.setVisible(true);
            lblOpm.setText("de gewenste opmerking staat er al in");
        }
    }
    
    @FXML
    public void handleButtonAddOpm(ActionEvent event) throws IOException {
        lblOpm.setText("");
        String voegOpmToe = txfOpm.getText();
        List<String> check = new ArrayList();
        check.addAll(listviewOpm.getSelectionModel().getSelectedItems());
        if (!check.isEmpty()) {
            if (check.get(0) != null) {
                if (!txfOpm.getText().equals("")) {
                    verwijderOpmerking(listviewOpm.getSelectionModel().getSelectedItems());
                    listOpmerkingen.removeAll(check);
                    txfOpm.setText(check.get(0) + ": " + voegOpmToe);
                    voegOpmToe = txfOpm.getText();
                    listOpmerkingen.add(voegOpmToe);
                    ObservableList<String> ol = FXCollections.observableArrayList(listOpmerkingen);
                    listviewOpm.setItems(ol);
                    geefOpmerking(voegOpmToe);
                } else {
                    lblOpm.setVisible(true);
                    lblOpm.setText("gelieve een opmerking in te geven!");
                }
            } else {
                lblOpm.setVisible(true);
                lblOpm.setText("gelieve een standaard opmerking te selecteren");
            }
        } else {
            lblOpm.setVisible(true);
            lblOpm.setText("gelieve een standaard opmerking te selecteren");
        }
    }

    @FXML
    public void handleButtonVerwijderOpm(ActionEvent event) throws IOException {
        verwijderOpmerking(listviewOpm.getSelectionModel().getSelectedItems());
        listOpmerkingen.removeAll(listviewOpm.getSelectionModel().getSelectedItems());
        ObservableList<String> ol = FXCollections.observableArrayList(listOpmerkingen);
        listviewOpm.setItems(ol);
        lblOpm.setVisible(true);
        lblOpm.setText("de opmerking is verwijdert");
    }
    
    @FXML
    public void handleButtonOpslaan(ActionEvent event) throws IOException {
        houding = false;
        iskoppeling = false;
        remmen = false;
        sturen = false;
        schakel = false;
        kijk = false;   
        toon = false;
        helling = false; 
        verdwijnOpmerkingen();
        lblOpm.setText("");
        listOpmerkingen.clear();
        listviewOpm.getItems().clear();
        txfOpm.setText("");
    }
    
    @FXML
    public void handleButtonGroen(ActionEvent event) throws IOException {
        geefKleur("GREEN");
    }
    
    @FXML
    public void handleButtonOranje(ActionEvent event) throws IOException {
        geefKleur("ORANGE");

    }
     
    @FXML
    public void handleButtonRood(ActionEvent event) throws IOException {
        geefKleur("RED");

    }
    
    public void geefKleur(String kleur) {
        if (toon == true) {
            if (houding == true) {
                circleZithouding.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getRT().getZithouding().setKleur(Kleur.valueOf(kleur));
            }
            if (iskoppeling == true) {
                circleKoppeling.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getRT().getKoppeling().setKleur(Kleur.valueOf(kleur));
            }
            if (remmen == true) {
                circleRemtechniek.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getRT().getRem().setKleur(Kleur.valueOf(kleur));
            }
            if (sturen == true) {
                circleStuurtechniek.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getRT().getStuurtechniek().setKleur(Kleur.valueOf(kleur));
            }
            if (schakel == true) {
                circleSchakeltechniek.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getRT().getSchakel().setKleur(Kleur.valueOf(kleur));
            }
            if (kijk == true) {
                circleKijktechniek.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getRT().getKijk().setKleur(Kleur.valueOf(kleur));
            }
            if (helling == true) {
                circleHelling.setFill(Color.valueOf(kleur));
                dc.getHuidigeLeerling().getRT().getAanzettenHelling().setKleur(Kleur.valueOf(kleur));
            }
        }
    }
    
    public void geefOpmerking(String opmerking) {
        if (toon == true) {
            if (houding == true) {
                dc.getHuidigeLeerling().getRT().getZithouding().getOpmerking().add(opmerking);
            }
            if (iskoppeling == true) {
                dc.getHuidigeLeerling().getRT().getKoppeling().getOpmerking().add(opmerking);
            }
            if (remmen == true) {
                dc.getHuidigeLeerling().getRT().getRem().getOpmerking().add(opmerking);
            }
            if (sturen == true) {
                dc.getHuidigeLeerling().getRT().getStuurtechniek().getOpmerking().add(opmerking);
            }
            if (schakel == true) {
                dc.getHuidigeLeerling().getRT().getSchakel().getOpmerking().add(opmerking);
            }
            if (kijk == true) {
                dc.getHuidigeLeerling().getRT().getKijk().getOpmerking().add(opmerking);
            }
            if (helling == true){
                dc.getHuidigeLeerling().getRT().getAanzettenHelling().getOpmerking().add(opmerking);
            }
        }
    }
     public void verwijderOpmerking(List opmerking) {
        if (toon == true) {
            if (houding == true) {
                dc.getHuidigeLeerling().getRT().getZithouding().getOpmerking().removeAll(opmerking);
            }
            if (iskoppeling == true) {
                dc.getHuidigeLeerling().getRT().getKoppeling().getOpmerking().removeAll(opmerking);
            }
            if (remmen == true) {
                dc.getHuidigeLeerling().getRT().getRem().getOpmerking().removeAll(opmerking);
            }
            if (sturen == true) {
                dc.getHuidigeLeerling().getRT().getStuurtechniek().getOpmerking().removeAll(opmerking);
            }
            if (schakel == true) {
                dc.getHuidigeLeerling().getRT().getSchakel().getOpmerking().removeAll(opmerking);
            }
            if (kijk == true) {
                dc.getHuidigeLeerling().getRT().getKijk().getOpmerking().removeAll(opmerking);
            }
            if (helling == true){
                dc.getHuidigeLeerling().getRT().getAanzettenHelling().getOpmerking().removeAll(opmerking);
            }
        }
    }
    
    public void toonOpmerkingen(){
        addOpm.setVisible(true);
        addWaarde.setVisible(true);
        opm.setVisible(true);  
        rood .setVisible(true);
        oranje.setVisible(true);
        groen.setVisible(true);
        Opslaan.setVisible(true);
        listviewStandaardOpm.setVisible(true); 
        listviewOpm.setVisible(true);
        txfOpm.setVisible(true);
        huidigeKnop.setVisible(true);
        verwijderOpm.setVisible(true);
        
    }
    
    public void verdwijnOpmerkingen(){
        addOpm.setVisible(false);
        addWaarde.setVisible(false);
        opm.setVisible(false);   
        rood .setVisible(false);
        oranje.setVisible(false);
        groen.setVisible(false);
        Opslaan.setVisible(false);
        listviewStandaardOpm.setVisible(false); 
        listviewOpm.setVisible(false);
        txfOpm.setVisible(false);
        huidigeKnop.setVisible(false);
        verwijderOpm.setVisible(false);
        
    }
    
    public void keerTerug() throws IOException{
        Stage currentStage = (Stage) rijtechniekScherm.getScene().getWindow();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/gui/HoofdScherm.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Hoofdscherm");
        
        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root1, 1024, 743);
        stage.setScene(scene);
        // DC meegeven aan de volgende controller 
        HoofdSchermController controller = fxmlLoader.<HoofdSchermController>getController();
        controller.initData(dc);
        
        stage.show();
        currentStage.close();

    }
       
    @FXML
    public void handleButtonAanzettenHelling(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            helling = true ; 
            listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getRT().getAanzettenHelling().getOpmerking()); 
            listOpmerkingen.addAll(dc.getHuidigeLeerling().getRT().getAanzettenHelling().getOpmerking());
            listVoorbeeldwaarden.clear();
            listVoorbeeldwaarden.add("B"); 
            listVoorbeeldwaarden.add("H"); 
            listVoorbeeldwaarden.add("V"); 
            refreshList();
            
            BackgroundImage uitRoepTeken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Vertrekken.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(uitRoepTeken));
            
        }
        
    }
    @FXML
    public void handleButtonHouding(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            houding = true ; 
            listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getRT().getZithouding().getOpmerking()); 
            listOpmerkingen.addAll(dc.getHuidigeLeerling().getRT().getZithouding().getOpmerking());
            listVoorbeeldwaarden.clear();
            listVoorbeeldwaarden.add("Zithouding"); 
            listVoorbeeldwaarden.add("Gordel"); 
            listVoorbeeldwaarden.add("Spiegels"); 
            listVoorbeeldwaarden.add("Handrem"); 
            listVoorbeeldwaarden.add("Andere: "); 
            refreshList();
            BackgroundImage uitRoepTeken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/zithouding.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(uitRoepTeken));
        }
        
    }
    
    @FXML
    public void handleButtonKoppeling(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ; 
            iskoppeling = true ; 
            listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getRT().getKoppeling().getOpmerking());
            listOpmerkingen.addAll(dc.getHuidigeLeerling().getRT().getKoppeling().getOpmerking());
            listVoorbeeldwaarden.clear();
            listVoorbeeldwaarden.add("Dosering"); 
            listVoorbeeldwaarden.add("Volledig"); 
            listVoorbeeldwaarden.add("Plaatsing voet"); 
            listVoorbeeldwaarden.add("Onnodig"); 
            listVoorbeeldwaarden.add("bocht"); 
            listVoorbeeldwaarden.add("Andere: "); 
            refreshList();
            BackgroundImage uitRoepTeken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/koppeling.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(uitRoepTeken));
        }
        
    }
    
    @FXML
    public void handleButtonRem(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ; 
            remmen = true ; 
            listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getRT().getRem().getOpmerking());
            listOpmerkingen.addAll(dc.getHuidigeLeerling().getRT().getRem().getOpmerking()); 
            listVoorbeeldwaarden.clear();
            listVoorbeeldwaarden.add("Dosering"); 
            listVoorbeeldwaarden.add("Volgorde"); 
            listVoorbeeldwaarden.add("Te laat"); 
            listVoorbeeldwaarden.add("Afremmen op motor"); 
            listVoorbeeldwaarden.add("Andere: "); 
            refreshList();
            BackgroundImage uitRoepTeken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/rem.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(uitRoepTeken));
        }         
    }
    
    @FXML
    public void handleButtonStuur(ActionEvent event) throws IOException {
       if (toon == false){
            toonOpmerkingen();
            toon = true ; 
            sturen = true ; 
            listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getRT().getStuurtechniek().getOpmerking());
            listOpmerkingen.addAll(dc.getHuidigeLeerling().getRT().getStuurtechniek().getOpmerking());
            listVoorbeeldwaarden.clear();
            listVoorbeeldwaarden.add("Dosering"); 
            listVoorbeeldwaarden.add("Houding");  
            listVoorbeeldwaarden.add("Andere: "); 
            refreshList();
            BackgroundImage uitRoepTeken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/Stuur.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(uitRoepTeken));
       }        
    }
    
    @FXML
    public void handleButtonSchakel(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ;
            schakel = true ; 
            listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getRT().getSchakel().getOpmerking());
            listOpmerkingen.addAll(dc.getHuidigeLeerling().getRT().getSchakel().getOpmerking());
            listVoorbeeldwaarden.clear();
            listVoorbeeldwaarden.add("Bediening"); 
            listVoorbeeldwaarden.add("Aangepaste versnelling"); 
            listVoorbeeldwaarden.add("Andere: "); 
            refreshList();
            BackgroundImage uitRoepTeken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/schakelen.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(uitRoepTeken));
        }   
    }
    
    @FXML
    public void handleButtonKijk(ActionEvent event) throws IOException {
        if (toon == false){
            toonOpmerkingen();
            toon = true ; 
            kijk = true ; 
            listviewOpm.getItems().addAll(dc.getHuidigeLeerling().getRT().getKijk().getOpmerking());
            listOpmerkingen.addAll(dc.getHuidigeLeerling().getRT().getKijk().getOpmerking());
            listVoorbeeldwaarden.clear();
            listVoorbeeldwaarden.add("Ver/dichtbij"); 
            listVoorbeeldwaarden.add("Meer vergewissen"); 
            listVoorbeeldwaarden.add("Spiegels"); 
            listVoorbeeldwaarden.add("Dode Hoeken"); 
            listVoorbeeldwaarden.add("Scannen/Selecteren"); 
            listVoorbeeldwaarden.add("Andere: "); 
            refreshList();
            BackgroundImage uitRoepTeken = new BackgroundImage(new Image(getClass().getResourceAsStream("/image/kijktechniek.jpg")),BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
            huidigeKnop.setBackground(new Background(uitRoepTeken));
        }
    }

    @FXML
    public void handleButtonParkeren(ActionEvent event) throws IOException {
                
         switch(dc.getHuidigeLeerling().getRT().getParkeren().getKleur().toString()){
            case "WHITE":
                circleParkeren.setFill(Color.RED);
                dc.getHuidigeLeerling().getRT().getParkeren().setKleur(Kleur.RED);
                break;
            case "ORANGE":
                circleParkeren.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getRT().getParkeren().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleParkeren.setFill(Color.RED);
                dc.getHuidigeLeerling().getRT().getParkeren().setKleur(Kleur.RED);
                break; 
            case "RED":
                circleParkeren.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getParkeren().setKleur(Kleur.ORANGE);
                break;
        }
    }
    
    @FXML
    public void handleButtonKeren(ActionEvent event) throws IOException {
       switch(dc.getHuidigeLeerling().getRT().getKeren().getKleur().toString()){
            case "WHITE":
                circleKeren.setFill(Color.RED);
                dc.getHuidigeLeerling().getRT().getKeren().setKleur(Kleur.RED);
                break;
            case "ORANGE":
                circleKeren.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getRT().getKeren().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleKeren.setFill(Color.RED);
                dc.getHuidigeLeerling().getRT().getKeren().setKleur(Kleur.RED);
                break;  
            case "RED":
                circleKeren.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getKeren().setKleur(Kleur.ORANGE);
                break;
        }
    }
    
    @FXML
    public void handleButtonGarage(ActionEvent event) throws IOException {      
        switch(dc.getHuidigeLeerling().getRT().getGarage().getKleur().toString()){
            case "WHITE":
                circleGarage.setFill(Color.RED);
                dc.getHuidigeLeerling().getRT().getGarage().setKleur(Kleur.RED);
                break;
            case "ORANGE":
                circleGarage.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getRT().getGarage().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleGarage.setFill(Color.RED);
                dc.getHuidigeLeerling().getRT().getGarage().setKleur(Kleur.RED);
                break;  
            case "RED":
                circleGarage.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getGarage().setKleur(Kleur.ORANGE);
                break;
        }
    }
    
    @FXML
    public void handleButtonAchteruit(ActionEvent event) throws IOException {
        
        switch(dc.getHuidigeLeerling().getRT().getAchteruit().getKleur().toString()){
            case "WHITE":
                circleAchteruitrijden.setFill(Color.RED);
                dc.getHuidigeLeerling().getRT().getAchteruit().setKleur(Kleur.RED);
                break;
            case "ORANGE":
                circleAchteruitrijden.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getRT().getAchteruit().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleAchteruitrijden.setFill(Color.RED);
                dc.getHuidigeLeerling().getRT().getAchteruit().setKleur(Kleur.RED);
                break;  
            case "RED":
                circleAchteruitrijden.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getAchteruit().setKleur(Kleur.ORANGE);
                break;
        }
    }
     @FXML
    public void handleButtonStuurOef(ActionEvent event) throws IOException {
      
        switch(dc.getHuidigeLeerling().getRT().getStuurOef().getKleur().toString()){
            case "WHITE":
                circleStuuroefeningen.setFill(Color.RED);
                dc.getHuidigeLeerling().getRT().getStuurOef().setKleur(Kleur.RED);
                break;
            case "ORANGE":
                circleStuuroefeningen.setFill(Color.GREEN);
                dc.getHuidigeLeerling().getRT().getStuurOef().setKleur(Kleur.GREEN);
                break;
            case "GREEN":
                circleStuuroefeningen.setFill(Color.RED);
                dc.getHuidigeLeerling().getRT().getStuurOef().setKleur(Kleur.RED);
                break;  
            case "RED":
                circleStuuroefeningen.setFill(Color.ORANGE);
                dc.getHuidigeLeerling().getRT().getStuurOef().setKleur(Kleur.ORANGE);
                break;
        }
    }
}
