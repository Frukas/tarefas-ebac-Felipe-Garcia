/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.br.projeto2.service;

import com.br.projeto2.Class.Cliente;
import java.util.Collection;

/**
 *
 * @author garus
 */
public interface IClientService {
    
    public boolean salvar(Cliente cliente);
    public void excluir(Long CPF);
    public void alterar(Cliente cliente);
    public Cliente buscarPorCPF(long CPF);
    public Collection<Cliente> buscarTodos(); 
}
