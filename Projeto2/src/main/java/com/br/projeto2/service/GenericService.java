/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.projeto2.service;

import com.br.projeto2.DAO.IGenericDAO;
import java.util.Collection;

/**
 *
 * @author garus
 * @param <T>
 */
public class GenericService<T> implements IGenericService<T> {
    
    private IGenericDAO<T> dao;
    
    public GenericService(IGenericDAO dao){
        this.dao = dao;
    }

    @Override
    public boolean salvar(T entity) {
        return dao.cadastrar(entity);
    }

    @Override
    public void excluir(Long CPF) {
      dao.excluir(CPF);
    }

    @Override
    public void alterar(T entity) {
      dao.alterar(entity);
    }

    @Override
    public T buscarPorCPF(long CPF) {
      return dao.consultar(CPF);
    }

    @Override
    public Collection<T> buscarTodos() {
        return dao.buscarTodos();
    }    
}
