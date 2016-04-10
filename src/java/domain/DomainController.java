/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jens
 */
public class DomainController {
    private Leerling huidigeLeerling ; 
    private List<Leerling> leerlingen; 

    public DomainController() {
        this.huidigeLeerling = new Leerling();
        this.leerlingen = new ArrayList<>();
    }
    
    public List<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public void setLeerlingen(List<Leerling> leerlingen) {
        this.leerlingen = leerlingen;
    }
    
    
    public Leerling getHuidigeLeerling() {
        return huidigeLeerling;
    }

    public void setHuidigeLeerling(Leerling huidigeLeerling) {
        this.huidigeLeerling = huidigeLeerling;
    }
    
    public void generateData() {
        leerlingen.add(new Leerling(1, "Johnny Cash"));
        leerlingen.add(new Leerling(2, "Walter Vanderpoorten"));
    }
    
    
}
