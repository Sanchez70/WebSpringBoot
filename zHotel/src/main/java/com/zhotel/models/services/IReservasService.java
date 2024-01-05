package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.Reservas;

public interface IReservasService {
	
	 public List<Reservas> findAll();
	 
	 public Reservas save(Reservas reservas);
	 
	 public Reservas findById(Long idReserva);
	 
	 public void delete(Long idReserva);

}
