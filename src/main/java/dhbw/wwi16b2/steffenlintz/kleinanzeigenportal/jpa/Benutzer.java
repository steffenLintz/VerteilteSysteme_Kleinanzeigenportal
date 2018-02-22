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
   
   @OneToMany(mappedBy= "")
   Nachricht nachricht = null;
   
   @OneToMany (mappedBy="benutzer")
   Anzeige anzeige =null;
   
   @ManyToMany (mappedBy="benutzermerk")
   BenutzerMerk benutzer_merkliste = null;
}
