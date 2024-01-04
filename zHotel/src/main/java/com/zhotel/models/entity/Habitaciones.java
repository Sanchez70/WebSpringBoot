package com.zhotel.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "habitaciones")
public class Habitaciones implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHabitaciones;
	private Double precio;
	private Integer nHabitacion;
	private Integer nPiso;
	private Long idCategoria;
	
	public Long getIdHabitaciones() {
		return idHabitaciones;
	}
	public void setIdHabitaciones(Long idHabitaciones) {
		this.idHabitaciones = idHabitaciones;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getnHabitacion() {
		return nHabitacion;
	}
	public void setnHabitacion(Integer nHabitacion) {
		this.nHabitacion = nHabitacion;
	}
	public Integer getnPiso() {
		return nPiso;
	}
	public void setnPiso(Integer nPiso) {
		this.nPiso = nPiso;
	}
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	

}
