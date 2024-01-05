package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.TipoServicio;

public interface ITipoServicioService {
	
	public List<TipoServicio> findAll();
	
	public TipoServicio save(TipoServicio tipoServicio);
	
	public TipoServicio findById(Long idTipoServicio);
	
	public void delete(Long idTipoServicio);

}
