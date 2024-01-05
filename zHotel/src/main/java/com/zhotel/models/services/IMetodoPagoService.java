package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.MetodoPago;

public interface IMetodoPagoService {
	
	public List<MetodoPago> findAll();
	
	public MetodoPago save(MetodoPago metodoPago);
	
	 public MetodoPago findById(Long idPago);
	 
	 public void delete(Long idPago);
 
}
