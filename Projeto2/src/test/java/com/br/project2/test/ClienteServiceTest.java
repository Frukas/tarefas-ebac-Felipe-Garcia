/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package com.br.project2.test;

import com.br.projeto2.Class.Cliente;
import com.br.projeto2.DAO.ClienteMapDAO;
import com.br.projeto2.service.ClienteService;
import com.br.projeto2.service.IClientService;
import java.util.Collection;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

/**
 *
 * @author garus
 */
public class ClienteServiceTest extends TestCase {
    
    private IClientService clienteService;  
    private Cliente cliente;
    
    public ClienteServiceTest(String testName) {
        super(testName);        
    }   
  
    @Override
    protected void setUp() throws Exception {
        super.setUp();        
        
        clienteService = new ClienteService(new ClienteMapDAO());
        cliente = createMockCliente();
        clienteService.salvar(cliente);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    private Cliente createMockCliente(){
        return new Cliente(
                "João",
                "1234123",
                "123123123", 
                "Rua dos Tolos",
                "01",
                "Cafundos", 
                "De Judas"  );
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    
     @Test
    public void testCadastro(){
        cliente.setCPF("234567");
        boolean result =  clienteService.salvar(cliente);
        assertTrue(result);
    }
    
    @Test
    public void testExcluir(){
        Cliente clienteApagar = createMockCliente();
        long cpf = clienteApagar.getCPF();
        clienteService.excluir(cpf);
        assertNull(clienteService.buscarPorCPF(cpf));        
    }
    
    @Test
    public void testAlterar(){
        cliente.setNome("Lucas");
        assertEquals("Lucas",cliente.getNome());        
    }
    
    @Test
    public void testBuscarPorCPF(){
        assertNotNull(clienteService.buscarPorCPF(1234123));
        assertNull(clienteService.buscarPorCPF(234));
    }
    
    @Test
    public void testBuscarTodos(){
        Collection<Cliente> resultado = clienteService.buscarTodos();
        assertTrue(!resultado.isEmpty());       
        assertTrue(resultado.contains(cliente));
    }
}
