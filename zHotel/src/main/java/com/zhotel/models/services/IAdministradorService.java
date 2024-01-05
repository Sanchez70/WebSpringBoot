package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.Administrador;

public interface IAdministradorService {
	
	public List<Administrador> findAll();
	
	public Administrador save(Administrador administrador);
	
	 public Administrador findById(Long idAdmin);
	 
	 public void delete(Long idAdmin);

}
