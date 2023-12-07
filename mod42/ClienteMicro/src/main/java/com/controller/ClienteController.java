package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Models.Cliente;
import com.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	ClienteService service;	
	
	@PostMapping("/cliente")
	@ResponseBody
	public void addCliente(@RequestBody Cliente cliente) {
		System.out.println(cliente.toString());
		service.save(cliente);		
	}	
	
	@GetMapping("/cliente")
	@ResponseBody
	public ResponseEntity<List<Cliente>> getClientes(){

		return ResponseEntity.ok(service.searchAll());
	}
	
	@PutMapping("/cliente")
	@ResponseBody
	public void updateCliente(@RequestBody Cliente cliente) {
		System.out.println(cliente.toString());
		service.save(cliente);		
	}

}
