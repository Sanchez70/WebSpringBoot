package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.Cliente;


public interface IClienteService {
	
	  public List<Cliente> findAll();
	  
	  public Cliente save(Cliente cliente);
	  
	  public Cliente findById(Long idCliente);
	  
	  public void delete(Long idCliente);

}
