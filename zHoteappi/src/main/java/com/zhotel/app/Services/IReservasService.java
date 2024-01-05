package com.zhotel.app.Services;

import java.util.List;

import com.zhotel.app.Entity.*;

public interface IReservasService {
	
	 public List<Reservas> findAll();
	 
	 public Reservas save(Reservas reservas);
	 
	 public Reservas findById(Long idReserva);
	 
	 public void delete(Long idReserva);

}
