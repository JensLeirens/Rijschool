package java.domain;


public class Verkeerstechniek {
    
    private KnopKleur aanwijzers;
    private KnopKleur rechtsaf;
    private KnopKleur openbareWeg;
    private KnopKleur voorrang;
    private KnopKleur tekens;
    private KnopKleur snelheid;
    private KnopKleur afstanden;
    private KnopKleur inhalen;
    private KnopKleur kruisen;
    private KnopKleur linksaf;

    public Verkeerstechniek() {
        this.aanwijzers = new KnopKleur();
        this.rechtsaf = new KnopKleur();
        this.openbareWeg = new KnopKleur();
        this.voorrang = new KnopKleur();
        this.tekens = new KnopKleur();
        this.snelheid = new KnopKleur();
        this.afstanden = new KnopKleur();
        this.inhalen = new KnopKleur();
        this.kruisen = new KnopKleur();
        this.linksaf = new KnopKleur();
    }

    public KnopKleur getAanwijzers() {
        return aanwijzers;
    }

    public void setAanwijzers(KnopKleur aanwijzer) {
        this.aanwijzers = aanwijzer;
    }

    public KnopKleur getRechtsaf() {
        return rechtsaf;
    }

    public void setRechtsaf(KnopKleur rechtsaf) {
        this.rechtsaf = rechtsaf;
    }

    public KnopKleur getOpenbareWeg() {
        return openbareWeg;
    }

    public void setOpenbareWeg(KnopKleur openbareWeg) {
        this.openbareWeg = openbareWeg;
    }

    public KnopKleur getVoorrang() {
        return voorrang;
    }

    public void setVoorrang(KnopKleur voorrang) {
        this.voorrang = voorrang;
    }

    public KnopKleur getTekens() {
        return tekens;
    }

    public void setTekens(KnopKleur tekens) {
        this.tekens = tekens;
    }

    public KnopKleur getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(KnopKleur snelheid) {
        this.snelheid = snelheid;
    }

    public KnopKleur getAfstanden() {
        return afstanden;
    }

    public void setAfstanden(KnopKleur afstanden) {
        this.afstanden = afstanden;
    }

    public KnopKleur getInhalen() {
        return inhalen;
    }

    public void setInhalen(KnopKleur inhalen) {
        this.inhalen = inhalen;
    }

    public KnopKleur getKruisen() {
        return kruisen;
    }

    public void setKruisen(KnopKleur kruisen) {
        this.kruisen = kruisen;
    }

    public KnopKleur getLinksaf() {
        return linksaf;
    }

    public void setLinksaf(KnopKleur linksaf) {
        this.linksaf = linksaf;
    }
    
    
}
