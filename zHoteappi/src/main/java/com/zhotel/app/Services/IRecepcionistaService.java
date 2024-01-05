package com.zhotel.app.Services;

import java.util.List;

import com.zhotel.app.Entity.*;

public interface IRecepcionistaService {
	
	public List<Recepcionista> findAll();
	
	public Recepcionista save(Recepcionista recepcionista);
	
	public Recepcionista findById(Long idRecepcionista);
	
	public void delete(Long idRecepcionista);

}
