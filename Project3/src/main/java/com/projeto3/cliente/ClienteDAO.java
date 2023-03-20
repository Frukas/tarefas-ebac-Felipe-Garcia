package com.projeto3.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project3.interfaces.IConnectionFactory;
import com.project3.interfaces.IGenericDAO;

public class ClienteDAO implements IGenericDAO<Cliente> {
	
	private IConnectionFactory conFactory;	
	
	public ClienteDAO(IConnectionFactory conFactory) {
		this.conFactory  = conFactory;
	}

	public int cadastrar(Cliente entity) throws Exception {
		try(Connection con = conFactory.getDBConnection()){
			String sql = "INSERT INTO cliente (cpf, nome, endereco) VALUES (?,?,?)";
			PreparedStatement stm = con.prepareStatement(sql);
			int res;
			
			stm.setString(1, entity.getCpf());
			stm.setString(2, entity.getNome());
			stm.setString(3, entity.getEndereco());
			res = stm.executeUpdate();			
			
			stm.close();
			
			return res;
		}
	}

	public int atualizar(Cliente entity) throws Exception {
		try(Connection con = conFactory.getDBConnection()){
			String sql = "UPDATE cliente SET nome= ? , endereco= ? WHERE cpf= ?";
			PreparedStatement stm = con.prepareStatement(sql);
			int res;		
			
			stm.setString(1, entity.getNome());
			stm.setString(2, entity.getEndereco());
			stm.setString(3, entity.getCpf());
			res = stm.executeUpdate();			
			
			stm.close();
			
			return res;	
		}
	}

	public Cliente buscar(String codigo) throws Exception {
		Cliente resCliente = null;
		try(Connection con = conFactory.getDBConnection()){
			String sql = "SELECT * FROM cliente WHERE cpf= ?";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, codigo);
			
			ResultSet res = stm.executeQuery();
			
			while(res.next()) {			
				resCliente = new Cliente(res.getInt("id"), res.getString("cpf"), res.getString("nome"), res.getString("endereco"));
			}
			
			stm.close();
			
			return resCliente;
			}
	}

	public List<Cliente> buscarTodos() throws Exception {
		Cliente resCliente = null;
		List<Cliente> clienteList = new ArrayList<Cliente>() ;
		
		try(Connection con = conFactory.getDBConnection()){
			String sql = "SELECT * FROM cliente ";
			PreparedStatement stm = con.prepareStatement(sql);		
			
			ResultSet res = stm.executeQuery();
			
			while(res.next()) {			
				resCliente = new Cliente(res.getInt("id"),res.getString("cpf"), res.getString("nome"), res.getString("endereco"));
							
				clienteList.add(resCliente);
			}
			
			stm.close();
			
			return clienteList;
		}
	}

	public int excluir(String deleteName) throws Exception {
		try(Connection con = conFactory.getDBConnection()){
			String queryString = "DELETE FROM cliente WHERE cpf=? ";
			int res;

			PreparedStatement stm = con.prepareStatement(queryString.toString());
			stm.setString(1, deleteName);	
			
			res = stm.executeUpdate();			

			stm.close();
			
			return res;
		}
	}
}
