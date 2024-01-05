package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.Habitaciones;

public interface IHabitacionesService {
	
	public List<Habitaciones> findAll();
	
	public Habitaciones save(Habitaciones habitaciones);
	
	public Habitaciones findById(Long idHabitaciones);
	
	public void delete(Long idHabitaciones);

}
