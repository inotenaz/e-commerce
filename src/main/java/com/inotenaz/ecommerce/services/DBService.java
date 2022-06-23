package com.inotenaz.ecommerce.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inotenaz.ecommerce.domain.Cliente;
import com.inotenaz.ecommerce.repositories.ClienteRepository;

@Service
public class DBService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public void intantiateTestDataBase() {
		
		Cliente cli1 = new Cliente(null, "Mario Jose da Silva", "12345678912");
		Cliente cli2 = new Cliente(null, "Evandro Pinheiro", "32165498721");
		Cliente cli3 = new Cliente(null, "Ana Maria da Silva", "14785236936");
		Cliente cli4 = new Cliente(null, "Ester Camponato", "36925814714");

		clienteRepository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4));
	}

}
