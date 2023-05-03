package com.projeto4.vendas;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.projeto4.cliente.Cliente;
import com.projeto4.produto.Produto;

@Entity
@Table(name="Tb_vendas")
public class Vendas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;	
	
	@ManyToMany
	@JoinTable(name="produtos_por_venda")
	private List<Produto> produtosComprados;
	
	@Column(name="produtos_comprados")
	private LocalDate dataCompra;
	
	@Column(name="valor_total")	
	private float valorTotal;
	
	public Cliente getCliente() {
		return cliente;
	}

	public Vendas() {
		super();
	}

	public Vendas(Cliente cliente, List<Produto> produtosComprados, LocalDate dataCompra, float valorTotal) {
		super();
		this.cliente = cliente;
		this.produtosComprados = produtosComprados;
		this.dataCompra = dataCompra;
		this.valorTotal = valorTotal;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;	}


	public List<Produto> getProdutosComprados() {
		return produtosComprados;
	}

	public void setProdutosComprados(List<Produto> produtosComprados) {
		this.produtosComprados = produtosComprados;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}	
	
}
