package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.detalleFactura;

public interface IDetalleFacturaService {
	
	public List<detalleFactura> findAll();
	
	public detalleFactura save(detalleFactura detalleFactura);
	
	public detalleFactura findById(Long idDetalleFac);
	
	public void delete(Long idDetalleFac);

}
