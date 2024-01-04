package com.zhotel.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "provincias")
public class Provincia {
	@Id
	private String id_provincia;
	private String nombre;
	public String getId_provincia() {
		return id_provincia;
	}
	public void setId_provincia(String id_provincia) {
		this.id_provincia = id_provincia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
