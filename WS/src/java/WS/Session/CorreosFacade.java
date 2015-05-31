/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WS.Session;

import WS.entities.Correos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author einstein pc
 */
@Stateless
public class CorreosFacade extends AbstractFacade<Correos> {
    @PersistenceContext(unitName = "WSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CorreosFacade() {
        super(Correos.class);
    }
    
}
