/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.wwi16b2.steffenlintz.kleinanzeigenportal.jpa;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author z003ne3b
 */
@Entity
public class BenutzerMerk extends Benutzer {
    
    
    @ManyToMany
    Anzeige anzeige = null;
}
