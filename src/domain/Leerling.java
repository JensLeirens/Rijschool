
package domain;

import java.util.Date;


public class Leerling {
    private int id ; 
    private String voornaam; 
    private String Achternaam; 
    private String email ; 
    private Date geboorteDatum ; 

    public Leerling() {
    }

    public Leerling(int id, String voornaam, String Achternaam, String email, Date geboorteDatum) {
        this.id = id;
        this.voornaam = voornaam;
        this.Achternaam = Achternaam;
        this.email = email;
        this.geboorteDatum = geboorteDatum;
    }

    public int getId() {
        return id;
    }

    
    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return Achternaam;
    }

    public void setAchternaam(String Achternaam) {
        this.Achternaam = Achternaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(Date geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }
    
    
    
}
