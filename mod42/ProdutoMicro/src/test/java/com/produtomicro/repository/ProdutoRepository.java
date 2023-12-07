package com.produtomicro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtomicro.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>  {

}
