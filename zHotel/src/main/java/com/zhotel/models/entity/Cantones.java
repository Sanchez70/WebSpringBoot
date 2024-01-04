package com.zhotel.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "cantones")
public class Cantones {
	@Id
	private String id_canton;
	private String nombre;
	private String cod_provincia;
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
	public String getCod_provincia() {
		return cod_provincia;
	}
	public void setCod_provincia(String cod_provincia) {
		this.cod_provincia = cod_provincia;
	}
	
	
}
