package com.zhotel.app.Services;

import java.util.List;

import com.zhotel.app.Entity.*;

public interface IPersonaService {
	
	public List<Persona> findAll();
	
	 public Persona save(Persona persona);
	 
	 public Persona findById(String cedulaPersona);
	 
	 public void delete(String cedulaPersona);
 

}
