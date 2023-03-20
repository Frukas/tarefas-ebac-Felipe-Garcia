/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.projeto2.DAO;

import java.util.Collection;

/**
 *
 * @author garus
 * @param <T>
 */
public interface IGenericDAO<T> {
    
    public Boolean cadastrar(T entity); 
    public void excluir(Long valor);
    public void alterar(T entity) ;
    public T consultar(Long valor);
    public Collection<T> buscarTodos();
    
    
}
