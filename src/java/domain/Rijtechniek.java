/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author jens
 */
public class Rijtechniek {
    private KnopKleur parkeren;
    private KnopKleur keren;
    private KnopKleur garage;
    private KnopKleur achteruit;
    private KnopKleur stuurOef;
    
    private KnopUitgebreid kijk;
    private KnopUitgebreid schakel;
    private KnopUitgebreid stuurtechniek;
    private KnopUitgebreid rem;
    private KnopUitgebreid koppeling;
    private KnopUitgebreid zithouding;

    public Rijtechniek() {
        this.parkeren = new KnopKleur();
        this.keren = new KnopKleur();
        this.garage = new KnopKleur();
        this.achteruit = new KnopKleur();
        this.stuurOef = new KnopKleur();
        
        this.kijk = new KnopUitgebreid();
        this.schakel = new KnopUitgebreid();
        this.stuurtechniek = new KnopUitgebreid();
        this.rem = new KnopUitgebreid();
        this.koppeling = new KnopUitgebreid();
        this.zithouding = new KnopUitgebreid();
    }

    
    
    public KnopKleur getParkeren() {
        return parkeren;
    }

    public void setParkeren(KnopKleur parkeren) {
        this.parkeren = parkeren;
    }

    public KnopKleur getKeren() {
        return keren;
    }

    public void setKeren(KnopKleur keren) {
        this.keren = keren;
    }

    public KnopKleur getGarage() {
        return garage;
    }

    public void setGarage(KnopKleur garage) {
        this.garage = garage;
    }

    public KnopKleur getAchteruit() {
        return achteruit;
    }

    public void setAchteruit(KnopKleur achteruit) {
        this.achteruit = achteruit;
    }

    public KnopKleur getStuurOef() {
        return stuurOef;
    }

    public void setStuurOef(KnopKleur stuurOef) {
        this.stuurOef = stuurOef;
    }

    public KnopUitgebreid getKijk() {
        return kijk;
    }

    public void setKijk(KnopUitgebreid kijk) {
        this.kijk = kijk;
    }

    public KnopUitgebreid getSchakel() {
        return schakel;
    }

    public void setSchakel(KnopUitgebreid schakel) {
        this.schakel = schakel;
    }

    public KnopUitgebreid getStuurtechniek() {
        return stuurtechniek;
    }

    public void setStuurtechniek(KnopUitgebreid stuurtechniek) {
        this.stuurtechniek = stuurtechniek;
    }

    public KnopUitgebreid getRem() {
        return rem;
    }

    public void setRem(KnopUitgebreid rem) {
        this.rem = rem;
    }

    public KnopUitgebreid getKoppeling() {
        return koppeling;
    }

    public void setKoppeling(KnopUitgebreid koppeling) {
        this.koppeling = koppeling;
    }

    public KnopUitgebreid getZithouding() {
        return zithouding;
    }

    public void setZithouding(KnopUitgebreid zithouding) {
        this.zithouding = zithouding;
    }
    
    
}
