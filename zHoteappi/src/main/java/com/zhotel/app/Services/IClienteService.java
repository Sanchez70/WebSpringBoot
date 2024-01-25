package com.zhotel.app.Services;
import java.util.List;

import com.zhotel.app.Entity.*;


public interface IClienteService {
	
	List<Cliente> getBooksByTitle(String usuario);
	
	  public List<Cliente> findAll();
	  
	  public Cliente save(Cliente cliente);
	  
	  public Cliente findById(Long idCliente);
	  
	  public void delete(Long idCliente);
	  
	  

}
