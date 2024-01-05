package com.zhotel.app.Services;

import java.util.List;

import com.zhotel.app.Entity.*;

public interface IHabitacionesService {
	
	public List<Habitaciones> findAll();
	
	public Habitaciones save(Habitaciones habitaciones);
	
	public Habitaciones findById(Long idHabitaciones);
	
	public void delete(Long idHabitaciones);

}
