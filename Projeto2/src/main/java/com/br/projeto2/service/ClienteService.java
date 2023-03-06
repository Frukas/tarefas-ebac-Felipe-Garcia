/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.projeto2.service;

import com.br.projeto2.Class.Cliente;
import com.br.projeto2.DAO.IClienteDAO;
import java.util.Collection;

/**
 *
 * @author garus
 */
public class ClienteService implements IClientService {
    
    private IClienteDAO dao;
    
    
    public ClienteService(IClienteDAO dao){
        this.dao = dao;
    }

    @Override
    public boolean salvar(Cliente cliente) {
        return dao.cadastrar(cliente);
    }

    @Override
    public void excluir(Long CPF) {
        dao.excluir(CPF);
    }

    @Override
    public void alterar(Cliente cliente) {
        dao.alterar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(long CPF) {
        return dao.consultar(CPF);
    }

    @Override
    public Collection<Cliente> buscarTodos() {        
        return dao.buscarTodos();
    }    
}
