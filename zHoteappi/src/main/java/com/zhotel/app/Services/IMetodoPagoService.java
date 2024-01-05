package com.zhotel.app.Services;

import java.util.List;

import com.zhotel.app.Entity.*;

public interface IMetodoPagoService {
	
	public List<MetodoPago> findAll();
	
	public MetodoPago save(MetodoPago metodoPago);
	
	 public MetodoPago findById(Long idPago);
	 
	 public void delete(Long idPago);
 
}
