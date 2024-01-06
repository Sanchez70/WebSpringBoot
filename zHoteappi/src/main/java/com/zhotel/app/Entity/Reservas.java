package com.zhotel.app.Entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="reserva", uniqueConstraints = {@UniqueConstraint(columnNames= {"idRecepcionista","idHabitaciones","idCliente","idReserva"})})
public class Reservas implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReserva;
	private String metodoPago;
	@Temporal(TemporalType.DATE)
	private Date fechaSalida;
	@Temporal(TemporalType.DATE)
	private Date fechaEntrada;
	private Double total;
	private Long idHabitaciones;
	private Long idRecepcionista;
	private Long idCliente;
	private Integer dias;
	private Integer nPersona;
	private String estado;
	public Long getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}
	public String getMetodoPago() {
		return metodoPago;
	}
	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Long getIdHabitaciones() {
		return idHabitaciones;
	}
	public void setIdHabitaciones(Long idHabitaciones) {
		this.idHabitaciones = idHabitaciones;
	}
	public Long getIdRecepcionista() {
		return idRecepcionista;
	}
	public void setIdRecepcionista(Long idRecepcionista) {
		this.idRecepcionista = idRecepcionista;
	}


	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getDias() {
		return dias;
	}
	public void setDias(Integer dias) {
		this.dias = dias;
	}
	public Integer getnPersona() {
		return nPersona;
	}
	public void setnPersona(Integer nPersona) {
		this.nPersona = nPersona;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
