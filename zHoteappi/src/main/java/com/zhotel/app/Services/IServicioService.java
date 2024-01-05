package com.zhotel.app.Services;

import java.util.List;

import com.zhotel.app.Entity.*;

public interface IServicioService {
	
	public List<Servicio> findAll();
	
	public Servicio save(Servicio servicio);
	
	public Servicio findById(Long idServicio);
	
	public void delete(Long idServicio);

}
