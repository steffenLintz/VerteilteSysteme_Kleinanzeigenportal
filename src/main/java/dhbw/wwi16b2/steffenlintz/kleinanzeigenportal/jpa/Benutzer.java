/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.wwi16b2.steffenlintz.kleinanzeigenportal.jpa;

import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author z003ne3b
 */
@Entity
public class Benutzer {
   @Id
   private String benutzername ="";
   
   private HashSet<String> passwort = null;
   private String vorname = "";
   private String nachname = "";
   private String straße = "";
   private int hausnummer = 0;
   private int plz =0;
   private String email = "";
   private long telefonnummer=0;
   
   @OneToMany(mappedBy= "benutzer")
   Nachricht nachricht = null;
   
   @OneToMany (mappedBy="benutzer")
   Anzeige anzeige =null;
   
    public String getBenutzername() {
        return benutzername;
    }

    public HashSet<String> getPasswort() {
        return passwort;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getStraße() {
        return straße;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public int getPlz() {
        return plz;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefonnummer() {
        return telefonnummer;
    }

    public Nachricht getNachricht() {
        return nachricht;
    }

    public Anzeige getAnzeige() {
        return anzeige;
    }

    public BenutzerMerk getBenutzer_merkliste() {
        return benutzer_merkliste;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public void setPasswort(HashSet<String> passwort) {
        this.passwort = passwort;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonnummer(long telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public void setNachricht(Nachricht nachricht) {
        this.nachricht = nachricht;
    }

    public void setAnzeige(Anzeige anzeige) {
        this.anzeige = anzeige;
    }

    public void setBenutzer_merkliste(BenutzerMerk benutzer_merkliste) {
        this.benutzer_merkliste = benutzer_merkliste;
    }
   
   
}
