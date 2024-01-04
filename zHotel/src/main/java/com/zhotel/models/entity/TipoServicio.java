package com.zhotel.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tiposervicio")
public class TipoServicio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipo_servicio;
	private String descripcion;
	public Long getIdTipo_servicio() {
		return idTipo_servicio;
	}
	public void setIdTipo_servicio(Long idTipo_servicio) {
		this.idTipo_servicio = idTipo_servicio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
