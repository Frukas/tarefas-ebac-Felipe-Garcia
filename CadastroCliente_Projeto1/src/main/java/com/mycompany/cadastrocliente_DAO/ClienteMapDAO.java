/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrocliente_DAO;

import com.mycompany.cadastrocliente_Class.Cliente;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author garus
 */
public class ClienteMapDAO implements IClienteDAO{
    
    private Map<Long, Cliente> map;
    
    public ClienteMapDAO(){
        this.map = new HashMap<>();
    }

    @Override
    public boolean cadastrar(Cliente cliente) {
        if(this.map.containsKey(cliente.getCPF())){
            return false;
        }
        this.map.put(cliente.getCPF(), cliente);
        
        return true;
    }

    @Override
    public void excluir(Long CPF) {
        if(this.map.containsKey(CPF)){
            this.map.remove(CPF);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        
        Cliente clienteCadastrado = this.map.get(cliente.getCPF());
        
        if(clienteCadastrado != null){
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTelefone(cliente.getTelefone());
            clienteCadastrado.setNumero(cliente.getNumero());           
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstados(cliente.getEstados());
            clienteCadastrado.setEndereco(cliente.getEndereco());            
        }        
    }

    @Override
    public Cliente consultar(long CPF) {
        return this.map.get(CPF);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }    
}
