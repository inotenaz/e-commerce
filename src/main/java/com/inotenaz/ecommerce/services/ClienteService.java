package com.inotenaz.ecommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inotenaz.ecommerce.domain.Cliente;
import com.inotenaz.ecommerce.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	public ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElse(null);		
	} 
	
	public Cliente insert(Cliente obj) {
		obj.setId(null);
		return repo.save(obj);
		
	}
	
	public Cliente update(Cliente obj) {
		return repo.save(obj);
		
	}
	
	public void delete(Integer id) {
		Optional<Cliente> obj = repo.findById(id);	

		if (!obj.isEmpty()) {
			repo.deleteById(id);				
		}
	}

}
