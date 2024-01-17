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

import com.zhotel.app.Entity.Servicio;
import com.zhotel.app.Services.IServicioService;

@CrossOrigin(origins= {"http://localhost:4200","http://192.168.40.228:8081"})
@RestController
@RequestMapping("/api")
public class ServiciosController {
	@Autowired
	private IServicioService servicioService;

	@GetMapping("/servicios")
	public List<Servicio> index() {
		return servicioService.findAll();
	}

	@GetMapping("/servicios/{id}")
	public Servicio show(@PathVariable Long id) {
		return servicioService.findById(id);
	}

	@PostMapping("/servicios")
	@ResponseStatus(HttpStatus.CREATED)
	public Servicio create(@RequestBody Servicio servicio) {
		return servicioService.save(servicio);
	}

	@PutMapping("/servicios/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Servicio update(@RequestBody Servicio servicio, @PathVariable Long id) {
		Servicio servicioActual = servicioService.findById(id);
		servicioActual.setEstado(servicio.getEstado());
		servicioActual.setDescripcion(servicio.getDescripcion());
		servicioActual.setIdTipo_servicio(servicio.getIdTipo_servicio());
		return servicioService.save(servicioActual);
	}

	@DeleteMapping("/servicios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		servicioService.delete(id);
	}
}
