/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.wwi16b2.steffenlintz.kleinanzeigenportal.jpa;

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
public class Kategorie {
    @Id
    @GeneratedValue
    String slug ="";
    
    private String name="";
    
    @ManyToMany (mappedBy="kategorie")
    Anzeige anzeige = null;
    
    @OneToMany 
    Kategorie kategorie = null;
    
}
