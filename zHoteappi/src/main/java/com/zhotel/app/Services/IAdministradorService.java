package com.zhotel.app.Services;

import java.util.List;

import com.zhotel.app.Entity.Administrador;


public interface IAdministradorService {
	
	List<Administrador> getBooksByTitle(String usuario);
	
	public List<Administrador> findAll();
	
	public Administrador save(Administrador administrador);
	
	 public Administrador findById(Long idAdmin);
	 
	 public void delete(Long idAdmin);

}
