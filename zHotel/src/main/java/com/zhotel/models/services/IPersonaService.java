package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.Persona;

public interface IPersonaService {
	
	public List<Persona> findAll();
	
	 public Persona save(Persona persona);
	 
	 public Persona findById(String cedulaPersona);
	 
	 public void delete(String cedulaPersona);
 

}
