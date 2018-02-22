/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.wwi16b2.steffenlintz.kleinanzeigenportal.ejb;

import dhbw.wwi16b2.steffenlintz.kleinanzeigenportal.jpa.Kategorie;

/**
 *
 * @author z003ne3b
 */
public class KategorieBean extends EntityBean {
    
    public KategorieBean(Class entityClass) {
        super(Kategorie.class);
    }
    
}
