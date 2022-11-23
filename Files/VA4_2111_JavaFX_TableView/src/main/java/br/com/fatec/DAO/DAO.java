/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import java.sql.SQLException;
import java.util.Collection;

/**
 *
 * @author Viotti
 * @param <MODEL>
 */
public interface DAO <MODEL> {
 
    public boolean insere(MODEL obj) 
            throws SQLException;
    public boolean remove(MODEL obj) 
            throws SQLException;
    public boolean altera(MODEL obj) 
            throws SQLException;
    public MODEL buscaID(MODEL obj) 
            throws SQLException;
    public Collection<MODEL> lista(String criterio) 
            throws SQLException;    
    
}
