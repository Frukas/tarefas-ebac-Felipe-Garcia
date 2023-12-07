package com.produtomicro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.produtomicro.model.Produto;
import com.produtomicro.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepo;
	
	public void saveProduto(Produto produto) {
		produtoRepo.save(produto);
	}
	
	public List<Produto> getAllProdutos(){
		return produtoRepo.findAll();
	}

}
