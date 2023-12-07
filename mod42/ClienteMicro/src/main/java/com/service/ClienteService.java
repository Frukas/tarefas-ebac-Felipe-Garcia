package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Models.Cliente;
import com.repository.ClienteRepo;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepo clienterepo;
	
	public void save(Cliente cliente) {
		clienterepo.save(cliente);
	}
	
	public List<Cliente> searchAll(){
		return clienterepo.findAll();		
	}	
}
