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
public class KnopKleur {
    private Kleur kleur = Kleur.WHITE; 

    public KnopKleur() {
    }
    
    public KnopKleur(Kleur kleur) {
        this.kleur = kleur;
    }

    public Kleur getKleur() {
        return kleur;
    }

    public void setKleur(Kleur kleur) {
        this.kleur = kleur;
    }
   
}
