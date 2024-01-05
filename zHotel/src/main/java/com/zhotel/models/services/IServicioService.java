package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.Servicio;

public interface IServicioService {
	
	public List<Servicio> findAll();
	
	public Servicio save(Servicio servicio);
	
	public Servicio findById(Long idServicio);
	
	public void delete(Long idServicio);

}
