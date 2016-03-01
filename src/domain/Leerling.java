
package domain;

import java.util.Date;
import javafx.scene.image.Image;


public class Leerling {
    private int id ; 
    private String naam;
    private String email ; 
    private String geboorteDatum ; 
    private Image afbeelding; 

    public Leerling(){
        
    }
    
    public Leerling(int id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    public Image getAfbeelding() {
        return afbeelding;
    }

    public void setAfbeelding(Image afbeelding) {
        this.afbeelding = afbeelding;
    }

    public int getId() {
        return id;
    }

    
    public String getnaam() {
        return naam;
    }

    public void setnaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(String geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    @Override
    public String toString() {
        return String.format("%s", naam); 
    }
    
    
    
}
