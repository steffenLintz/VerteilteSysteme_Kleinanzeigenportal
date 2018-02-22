/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.wwi16b2.steffenlintz.kleinanzeigenportal.ejb;

import dhbw.wwi16b2.steffenlintz.kleinanzeigenportal.jpa.Nachricht;

/**
 *
 * @author z003ne3b
 */
public class NachrichtBean extends EntityBean {
    
    public NachrichtBean(Class entityClass) {
        super(Nachricht.class);
    }
    
}
