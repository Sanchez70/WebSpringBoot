package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.Provincia;

public interface IProvinciaService {
	
	 public List<Provincia> findAll();
	 
	 public Provincia save(Provincia provincia);
	 
	 public Provincia findById(String idProvincia);
	 
	 public void delete(String idProvincia);

}
