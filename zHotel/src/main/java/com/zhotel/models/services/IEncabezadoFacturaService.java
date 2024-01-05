package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.EncabezadoFactura;

public interface IEncabezadoFacturaService {
	
	 public List<EncabezadoFactura> findAll();
	 
	 public EncabezadoFactura save(EncabezadoFactura encabezadoFactura);
	 
	 public EncabezadoFactura findById(Long idEncabezado);
	 
	 public void delete(Long idEncabezado);

}
