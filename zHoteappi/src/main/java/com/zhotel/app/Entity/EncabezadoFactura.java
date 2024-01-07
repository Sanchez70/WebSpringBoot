package com.zhotel.app.Entity;

import java.io.Serializable;
import java.util.Date;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "encabezadofactura", uniqueConstraints = {@UniqueConstraint(columnNames= {"idReserva"})})
public class EncabezadoFactura implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEncabezado;
	private String cedula_persona;
	@Temporal(TemporalType.DATE)
	private Date fechaFactura;
	private Double total;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="idDetalleFac")
	private List<detalleFactura> detalleFac;
	
	public Long getIdEncabezado() {
		return idEncabezado;
	}
	public void setIdEncabezado(Long idEncabezado) {
		this.idEncabezado = idEncabezado;
	}
	public String getCedula_persona() {
		return cedula_persona;
	}
	public void setCedula_persona(String cedula_persona) {
		this.cedula_persona = cedula_persona;
	}
	public Date getFechaFactura() {
		return fechaFactura;
	}
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public List<detalleFactura> getDetalleFac() {
		return detalleFac;
	}
	public void setDetalleFac(List<detalleFactura> detalleFac) {
		this.detalleFac = detalleFac;
	}
	
	
	

}
