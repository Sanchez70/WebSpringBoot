package com.zhotel.app.Entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="cantones", uniqueConstraints = {@UniqueConstraint(columnNames= {"id_provincia"})})
public class Cantones implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id_canton;
	private String nombre;
	private String id_provincia;
	
	public String getId_canton() {
		return id_canton;
	}
	public void setId_canton(String id_canton) {
		this.id_canton = id_canton;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getId_provincia() {
		return id_provincia;
	}
	public void setId_provincia(String id_provincia) {
		this.id_provincia = id_provincia;
	}
	
	
}
