/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edwargonzalez.sessionsbeans;

import com.edwargonzalez.entities.Areas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class AreasFacade extends AbstractFacade<Areas> implements AreasFacadeLocal {

    @PersistenceContext(unitName = "com.edwargonzalez_WebEventos_IN5BV2018281PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AreasFacade() {
        super(Areas.class);
    }
    
}
