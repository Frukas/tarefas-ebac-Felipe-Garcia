package com.projeto3.produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.project3.interfaces.IConnectionFactory;
import com.project3.interfaces.IGenericDAO;

public class ProdutoDAO implements IGenericDAO<Produto>{

	private IConnectionFactory conFactory;	
	
	public ProdutoDAO(IConnectionFactory conFactory) {
		this.conFactory  = conFactory;
	}
	
	public int cadastrar(Produto entity) throws Exception {
		try(Connection con = conFactory.getDBConnection()){
			String sql = "INSERT INTO produto (nome, fabricante) VALUES (?,?)";
			PreparedStatement stm = con.prepareStatement(sql);
			int res;		
			
			stm.setString(1, entity.getNome());
			stm.setString(2, entity.getFabricante());
			res = stm.executeUpdate();			

			stm.close();
			
			return res;			
		}
	}

	public int atualizar(Produto entity) throws Exception {
		try(Connection con = conFactory.getDBConnection()){
			String sql = "UPDATE produto SET nome= ? , fabricante= ? WHERE nome= ?";
			PreparedStatement stm = con.prepareStatement(sql);
			int res;		
			
			stm.setString(1, entity.getNome());
			stm.setString(2, entity.getFabricante());
			stm.setString(3, entity.getNome());
			res = stm.executeUpdate();			
	
			stm.close();
			
			return res;	
		} 
	}

	public Produto buscar(String codigo) throws Exception {
		
		try(Connection con = conFactory.getDBConnection()){
			Produto resProduto = null;
			String sql = "SELECT * FROM produto WHERE nome= ?";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, codigo);
			
			ResultSet res = stm.executeQuery();
			
			while(res.next()) {			
				resProduto = new Produto(res.getInt("id"), res.getString("nome"), res.getString("fabricante"));
			}		
			
			return resProduto;
		}
	}

	public List<Produto> buscarTodos() throws Exception {
		Produto resProduto = null;
		List<Produto> produtoList = new ArrayList<Produto>() ;
		
		try(Connection con = conFactory.getDBConnection()){
			String sql = "SELECT * FROM produto ";
			PreparedStatement stm = con.prepareStatement(sql);		
			
			ResultSet res = stm.executeQuery();
			
			while(res.next()) {			
				resProduto = new Produto(res.getInt("id"), res.getString("nome"), res.getString("fabricante"));
							
				produtoList.add(resProduto);
			}
			
			stm.close();
			
			return produtoList;
		}
	}

	public int excluir(String deleteName) throws Exception {
		try(Connection con = conFactory.getDBConnection()){
			String sql = "DELETE FROM produto WHERE nome= ?";
			PreparedStatement stm = con.prepareStatement(sql);
			int res;		

			stm.setString(1, deleteName);
			res = stm.executeUpdate();
			
			stm.close();
			return res;
		}			
	}
}
