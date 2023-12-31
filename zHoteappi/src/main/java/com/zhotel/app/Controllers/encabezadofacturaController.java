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

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class encabezadofacturaController {
	@Autowired
	private IEncabezadoFacturaService EncabezadoFacturaSevice;
	//LISTAR EncabezadoFactura
	@GetMapping("/EncabezadoFacturas")

		public List<EncabezadoFactura> index(){
		return EncabezadoFacturaSevice.findAll();
		
	}
		//BUSCAR EncabezadoFactura
	@GetMapping("/EncabezadoFacturas/{id}")
	public EncabezadoFactura show(@PathVariable Long id) {
		return EncabezadoFacturaSevice.findById(id);
	}
	//GUARDAR EncabezadoFactura

	@PostMapping("/EncabezadoFacturas")
	@ResponseStatus(HttpStatus.CREATED)
	public EncabezadoFactura create(@RequestBody EncabezadoFactura EncabezadoFactura) {
		return EncabezadoFacturaSevice.save(EncabezadoFactura);
	}
	//EDITAR EncabezadoFactura
	@PutMapping("/EncabezadoFacturas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public EncabezadoFactura update(@RequestBody EncabezadoFactura EncabezadoFactura, @PathVariable Long id) {
		EncabezadoFactura EncabezadoFacturaActual = EncabezadoFacturaSevice.findById(id);
		EncabezadoFacturaActual.setFechaFactura(EncabezadoFactura.getFechaFactura());
		EncabezadoFacturaActual.setTotal(EncabezadoFactura.getTotal());
		
		return EncabezadoFacturaSevice.save(EncabezadoFacturaActual);
	}
	//ELIMINAR EncabezadoFactura
	@DeleteMapping("/EncabezadoFacturas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		EncabezadoFacturaSevice.delete(id);
	}
}
