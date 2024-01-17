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

import com.zhotel.app.Services.*;
import com.zhotel.app.Entity.*;


@CrossOrigin(origins= {"http://localhost:4200","http://192.168.40.228:8081"})
@RestController
@RequestMapping("/api")
public class administradorController {
	@Autowired
	private IAdministradorService AdministradorSevice;
	//LISTAR Administrador
	@GetMapping("/Administradors")

		public List<Administrador> index(){
		return AdministradorSevice.findAll();
		
	}
		//BUSCAR Administrador
	@GetMapping("/Administradors/{id}")
	public Administrador show(@PathVariable Long id) {
		return AdministradorSevice.findById(id);
	}
	//GUARDAR Administrador

	@PostMapping("/Administradors")
	@ResponseStatus(HttpStatus.CREATED)
	public Administrador create(@RequestBody Administrador Administrador) {
		return AdministradorSevice.save(Administrador);
	}
	//EDITAR Administrador
	@PutMapping("/Administradors/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Administrador update(@RequestBody Administrador Administrador, @PathVariable Long id) {
		Administrador AdministradorActual = AdministradorSevice.findById(id);
		AdministradorActual.setContrasena(Administrador.getContrasena());
		AdministradorActual.setUsuario(Administrador.getUsuario());
		
		return AdministradorSevice.save(AdministradorActual);
	}
	//ELIMINAR Administrador
	@DeleteMapping("/Administradors/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		AdministradorSevice.delete(id);
	}
}
