package com.zhotel.models.controller;

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

import com.zhotel.models.entity.Cliente;
import com.zhotel.models.services.IClienteService;


@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class clientesController {
	@Autowired
	private IClienteService ClienteSevice;
	//LISTAR Cliente
	@GetMapping("/Clientes")

		public List<Cliente> index(){
		return ClienteSevice.findAll();
		
	}
		//BUSCAR Cliente
	@GetMapping("/Clientes/{id}")
	public Cliente show(@PathVariable Long id) {
		return ClienteSevice.findById(id);
	}
	//GUARDAR Cliente

	@PostMapping("/Clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente Cliente) {
		return ClienteSevice.save(Cliente);
	}
	//EDITAR Cliente
	@PutMapping("/Clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente Cliente, @PathVariable Long id) {
		Cliente ClienteActual = ClienteSevice.findById(id);
		ClienteActual.setContrasena(Cliente.getContrasena());
		ClienteActual.setFoto(Cliente.getFoto());
		ClienteActual.setUsuario(Cliente.getUsuario());
		
		return ClienteSevice.save(ClienteActual);
	}
	//ELIMINAR Cliente
	@DeleteMapping("/Clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		ClienteSevice.delete(id);
	}
}
