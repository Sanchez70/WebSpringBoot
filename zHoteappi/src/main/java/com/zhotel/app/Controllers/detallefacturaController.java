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
public class detallefacturaController {
	@Autowired
	private IDetalleFacturaService detalleFacturaSevice;
	//LISTAR detalleFactura
	@GetMapping("/detalleFacturas")

		public List<detalleFactura> index(){
		return detalleFacturaSevice.findAll();
		
	}
		//BUSCAR detalleFactura
	@GetMapping("/detalleFacturas/{id}")
	public detalleFactura show(@PathVariable Long id) {
		return detalleFacturaSevice.findById(id);
	}
	//GUARDAR detalleFactura

	@PostMapping("/detalleFacturas")
	@ResponseStatus(HttpStatus.CREATED)
	public detalleFactura create(@RequestBody detalleFactura detalleFactura) {
		return detalleFacturaSevice.save(detalleFactura);
	}
	//EDITAR detalleFactura
	@PutMapping("/detalleFacturas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public detalleFactura update(@RequestBody detalleFactura detalleFactura, @PathVariable Long id) {
		detalleFactura detalleFacturaActual = detalleFacturaSevice.findById(id);
		detalleFacturaActual.setSubTotal(detalleFactura.getSubTotal());
		
		return detalleFacturaSevice.save(detalleFacturaActual);
	}
	//ELIMINAR detalleFactura
	@DeleteMapping("/detalleFacturas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		detalleFacturaSevice.delete(id);
	}
}
