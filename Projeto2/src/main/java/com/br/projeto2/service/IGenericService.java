/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.projeto2.service;

import com.br.projeto2.Class.Cliente;
import java.util.Collection;

/**
 *
 * @author garus
 * @param <T>
 */
public interface IGenericService<T> {
    
    public boolean salvar(T entity);
    public void excluir(Long CPF);
    public void alterar(T entity);
    public T buscarPorCPF(long CPF);
    public Collection<T> buscarTodos(); 
}
