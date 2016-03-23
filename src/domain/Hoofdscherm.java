/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Jorit
 */
public class Hoofdscherm {
    
    private KnopKleur banden;
    private KnopKleur vloeistof;
    private KnopKleur schakelaar;
    
    private KnopKleur rotonde;
    private KnopKleur rijBaanMetRijstroken;
    private KnopKleur stad;
    private KnopKleur autoSnelweg;
    
    private KnopKleur tanken;
    private KnopKleur gps;
    private KnopKleur stop;

    public Hoofdscherm() {
        banden = new KnopKleur();
        vloeistof = new KnopKleur();
        schakelaar = new KnopKleur();
        
        rotonde = new KnopKleur();
        rijBaanMetRijstroken = new KnopKleur();
        stad = new KnopKleur();
        autoSnelweg = new KnopKleur();
        
        tanken = new KnopKleur();
        gps = new KnopKleur();
        stop = new KnopKleur();
    }
    
    public KnopKleur getBanden() {
        return banden;
    }

    public void setBanden(KnopKleur banden) {
        this.banden = banden;
    }

    public KnopKleur getVloeistof() {
        return vloeistof;
    }

    public void setVloeistof(KnopKleur vloeistof) {
        this.vloeistof = vloeistof;
    }

    public KnopKleur getSchakelaar() {
        return schakelaar;
    }

    public void setSchakelaar(KnopKleur schakelaar) {
        this.schakelaar = schakelaar;
    }

    public KnopKleur getRotonde() {
        return rotonde;
    }

    public void setRotonde(KnopKleur rotonde) {
        this.rotonde = rotonde;
    }

    public KnopKleur getRijBaanMetRijstroken() {
        return rijBaanMetRijstroken;
    }

    public void setRijBaanMetRijstroken(KnopKleur rijBaanMetRijstroken) {
        this.rijBaanMetRijstroken = rijBaanMetRijstroken;
    }

    public KnopKleur getStad() {
        return stad;
    }

    public void setStad(KnopKleur stad) {
        this.stad = stad;
    }

    public KnopKleur getAutoSnelweg() {
        return autoSnelweg;
    }

    public void setAutoSnelweg(KnopKleur autoSnelweg) {
        this.autoSnelweg = autoSnelweg;
    }

    public KnopKleur getTanken() {
        return tanken;
    }

    public void setTanken(KnopKleur tanken) {
        this.tanken = tanken;
    }

    public KnopKleur getGps() {
        return gps;
    }

    public void setGps(KnopKleur gps) {
        this.gps = gps;
    }

    public KnopKleur getStop() {
        return stop;
    }

    public void setStop(KnopKleur stop) {
        this.stop = stop;
    }

    
    
}
