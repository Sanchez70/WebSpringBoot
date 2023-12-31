package com.zhotel.app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zhotel.app.Entity.Habitaciones;
import com.zhotel.app.Services.IHabitacionesService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class habitacionesController {
	
@Autowired
private IHabitacionesService HabitacionesSevice;
//LISTAR Habitaciones
@GetMapping("/Habitaciones")

	public List<Habitaciones> index(){
	return HabitacionesSevice.findAll();
	
}
	//BUSCAR Habitaciones
@GetMapping("/Habitaciones/{id}")
public Habitaciones show(@PathVariable Long id) {
	return HabitacionesSevice.findById(id);
}
//GUARDAR Habitaciones

@PostMapping("/Habitaciones")
@ResponseStatus(HttpStatus.CREATED)
public Habitaciones create(@RequestBody Habitaciones Habitaciones) {
	return HabitacionesSevice.save(Habitaciones);
}
//EDITAR Habitaciones
@PutMapping("/Habitaciones/{id}")
@ResponseStatus(HttpStatus.CREATED)
public Habitaciones update(@RequestBody Habitaciones Habitaciones, @PathVariable Long id) {
	Habitaciones HabitacionesActual = HabitacionesSevice.findById(id);
	HabitacionesActual.setnHabitacion(Habitaciones.getnHabitacion());
	HabitacionesActual.setnPiso(Habitaciones.getnPiso());
	HabitacionesActual.setPrecio(Habitaciones.getPrecio());
	
	return HabitacionesSevice.save(HabitacionesActual);
}
//ELIMINAR Habitaciones
@DeleteMapping("/Habitaciones/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void delete(@PathVariable Long id) {
	HabitacionesSevice.delete(id);
}
}
