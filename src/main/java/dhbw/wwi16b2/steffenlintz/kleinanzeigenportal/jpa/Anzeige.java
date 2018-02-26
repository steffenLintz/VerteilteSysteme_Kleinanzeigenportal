/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.wwi16b2.steffenlintz.kleinanzeigenportal.jpa;


import meineEnums.Art;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import meineEnums.Preisart;

/**
 *
 * @author z003ne3b
 */
@Entity
public class Anzeige {
    @Id
    @GeneratedValue
    private long id=0;
    
    private Art art= Art.UNBEKANNT;
    private String titel="";
    @Lob
    private String beschreibung ="";
    private Date erstellungsdatum = null;
    private Date onlinebis = null;
    private double preisvorstellung = 0.0;
    private Preisart preisart = Preisart.UNBEKANNT;
    private int plz = 00000;
    private String ort = "";
    
    @ManyToMany
    Kategorie kategorie = null;
    
    @OneToMany (mappedBy="anzeige")
    Foto foto =null;
    
    @ManyToOne
    Benutzer benutzer = null;
    
    @ManyToMany
    BenutzerMerk benutzermerk = null;

    public long getId() {
        return id;
    }

    public Art getArt() {
        return art;
    }

    public String getTitel() {
        return titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public Date getErstellungsdatum() {
        return erstellungsdatum;
    }

    public Date getOnlinebis() {
        return onlinebis;
    }

    public double getPreisvorstellung() {
        return preisvorstellung;
    }

    public Preisart getPreisart() {
        return preisart;
    }

    public int getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    public Kategorie getKategorie() {
        return kategorie;
    }

    public Foto getFoto() {
        return foto;
    }

    public Benutzer getBenutzer() {
        return benutzer;
    }

    public BenutzerMerk getBenutzermerk() {
        return benutzermerk;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setArt(Art art) {
        this.art = art;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public void setErstellungsdatum(Date erstellungsdatum) {
        this.erstellungsdatum = erstellungsdatum;
    }

    public void setOnlinebis(Date onlinebis) {
        this.onlinebis = onlinebis;
    }

    public void setPreisvorstellung(double preisvorstellung) {
        this.preisvorstellung = preisvorstellung;
    }

    public void setPreisart(Preisart preisart) {
        this.preisart = preisart;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    public void setBenutzermerk(BenutzerMerk benutzermerk) {
        this.benutzermerk = benutzermerk;
    }
    
    
    
}
