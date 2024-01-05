package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.Recepcionista;

public interface IRecepcionistaService {
	
	public List<Recepcionista> findAll();
	
	public Recepcionista save(Recepcionista recepcionista);
	
	public Recepcionista findById(Long idRecepcionista);
	
	public void delete(Long idRecepcionista);

}
