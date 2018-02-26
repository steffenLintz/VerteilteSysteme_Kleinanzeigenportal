/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.wwi16b2.steffenlintz.kleinanzeigenportal.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;


//Steffen ist der größste
/**
 *
 * @author z003ne3b
 */
@Entity
public class Nachricht {
    @Id
    @GeneratedValue
    private long id=0;
    
    private String vonBenutzer = "";
    private String anBenutzer = "";
    private String zuArtikel = "";
    @Lob
    private String text = "";
    
    @ManyToOne
    Benutzer benutzer = null;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVonBenutzer() {
        return vonBenutzer;
    }

    public void setVonBenutzer(String vonBenutzer) {
        this.vonBenutzer = vonBenutzer;
    }

    public String getAnBenutzer() {
        return anBenutzer;
    }

    public void setAnBenutzer(String anBenutzer) {
        this.anBenutzer = anBenutzer;
    }

    public String getZuArtikel() {
        return zuArtikel;
    }

    public void setZuArtikel(String zuArtikel) {
        this.zuArtikel = zuArtikel;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Benutzer getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }
    
    
}
