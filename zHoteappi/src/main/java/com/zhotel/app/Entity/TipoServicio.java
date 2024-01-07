package com.zhotel.app.Entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="idTipo_Servicio")
	private List<Servicio> servicio;
	
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
	public List<Servicio> getServicio() {
		return servicio;
	}
	public void setServicio(List<Servicio> servicio) {
		this.servicio = servicio;
	}
	
	

}
