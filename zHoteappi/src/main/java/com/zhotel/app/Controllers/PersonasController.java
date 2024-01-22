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

import com.zhotel.app.Entity.Persona;
import com.zhotel.app.Services.IPersonaService;



@CrossOrigin(origins= {"http://localhost:4200","http://192.168.137.19:8081"})
@RestController
@RequestMapping("/api")
public class PersonasController {
	@Autowired
	private IPersonaService personaService;

	@GetMapping("/personas")
	public List<Persona> index() {
		return personaService.findAll();
	}

	@GetMapping("/personas/{id}")
	public Persona show(@PathVariable String id) {
		return personaService.findById(id);
	}

	@PostMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona create(@RequestBody Persona persona) {
		return personaService.save(persona);
	}

	@PutMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona update(@RequestBody Persona persona, @PathVariable String id) {
		Persona personaActual = personaService.findById(id);
		personaActual.setNombre(persona.getNombre());
		personaActual.setNombre2(persona.getNombre2());
		personaActual.setApellido(persona.getApellido());
		personaActual.setApellido2(persona.getApellido2());
		personaActual.setDireccion(persona.getDireccion());
		personaActual.setTelefono(persona.getTelefono());
		return personaService.save(personaActual);
	}

	@DeleteMapping("/personas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		personaService.delete(id);
	}
}
