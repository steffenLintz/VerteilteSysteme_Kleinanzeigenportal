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
    
}
