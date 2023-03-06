/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package com.br.project2.test;

import com.br.projeto2.Class.Cliente;
import com.br.projeto2.DAO.ClienteMapDAO;
import com.br.projeto2.DAO.IClienteDAO;
import java.util.Collection;
import static junit.framework.Assert.assertTrue;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

/**
 *
 * @author garus
 */
public class DaoTest extends TestCase {
    
    private Cliente cliente;
    private IClienteDAO dao;
    
    public DaoTest(String testName) {
        super(testName);
    }  
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        cliente = createMockCliente();
        dao = new ClienteMapDAO();
        dao.cadastrar(cliente);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    
      @Test
    public void testCadastrar(){
        cliente.setCPF("234567");
        boolean result =  dao.cadastrar(cliente);
        assertTrue(result);
    }
        
    @Test
    public void testExcluir(){
        Cliente clienteApagar = createMockCliente();
        long cpf = clienteApagar.getCPF();
        dao.excluir(cpf);
        assertNull(dao.consultar(cpf));    
    }
    
    @Test
    public void testAlterar(){
        cliente.setNome("Lucas");
        assertEquals("Lucas",cliente.getNome());
    }
    
    @Test
    public void testConsultar(long CPF){
        assertNotNull(dao.consultar(1234123));
        assertNull(dao.consultar(234));
    }
    
    @Test
    public void testBuscarTodos(){
        Collection<Cliente> resultado = dao.buscarTodos();
        assertTrue(!resultado.isEmpty());       
        assertTrue(resultado.contains(cliente));
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
}
