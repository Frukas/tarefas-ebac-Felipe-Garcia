package com.produtomicro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id", nullable=false)
	private int id;
	private String nome;
	private int quantide;
	
	public Produto() {}
	
}
