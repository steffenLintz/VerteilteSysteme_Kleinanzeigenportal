/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.wwi16b2.steffenlintz.kleinanzeigenportal.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author z003ne3b
 */
@Entity
public class Foto {
    @Id
    @GeneratedValue
    private long id =0;
    
    private String bezeichnung = "";
    private String bildateien = "";
    
    @ManyToOne
    Anzeige anzeige = null;
    
}
