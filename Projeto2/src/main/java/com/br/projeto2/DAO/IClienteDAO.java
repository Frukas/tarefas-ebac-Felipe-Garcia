/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.projeto2.DAO;

import com.br.projeto2.Class.Cliente;
import java.util.Collection;

/**
 *
 * @author garus
 */
public interface IClienteDAO {
    
    public boolean cadastrar(Cliente cliente);
    public void excluir(Long CPF);
    public void alterar(Cliente cliente);
    public Cliente consultar(long CPF);
    public Collection<Cliente> buscarTodos(); 
    
    
}
