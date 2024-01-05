package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.Categorias;

public interface ICategoriasService {
	
	public List<Categorias> findAll();
	
	public Categorias save(Categorias categorias);
	
	 public Categorias findById(Long idCategoria);
	 
	 public void delete(Long idCategoria); 


}
