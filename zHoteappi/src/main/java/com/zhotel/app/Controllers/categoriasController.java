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

import com.zhotel.app.Entity.Categorias;
import com.zhotel.app.Services.ICategoriasService;
@CrossOrigin(origins= {"http://localhost:4200","http://192.168.40.228:8081","http://192.168.0.119:8081","http://192.168.19.119:8081"})
@RestController
@RequestMapping("/api")
public class categoriasController {
	
@Autowired
private ICategoriasService CategoriasSevice;
//LISTAR Categorias
@GetMapping("/Categoriass")

	public List<Categorias> index(){
	return CategoriasSevice.findAll();
	
}
	//BUSCAR Categorias
@GetMapping("/Categoriass/{id}")
public Categorias show(@PathVariable Long id) {
	return CategoriasSevice.findById(id);
}
//GUARDAR Categorias

@PostMapping("/Categoriass")
@ResponseStatus(HttpStatus.CREATED)
public Categorias create(@RequestBody Categorias Categorias) {
	return CategoriasSevice.save(Categorias);
}
//EDITAR Categorias
@PutMapping("/Categoriass/{id}")
@ResponseStatus(HttpStatus.CREATED)
public Categorias update(@RequestBody Categorias Categorias, @PathVariable Long id) {
	Categorias CategoriasActual = CategoriasSevice.findById(id);
	CategoriasActual.setNombre(Categorias.getNombre());
	
	return CategoriasSevice.save(CategoriasActual);
}
//ELIMINAR Categorias
@DeleteMapping("/Categoriass/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void delete(@PathVariable Long id) {
	CategoriasSevice.delete(id);
}
}
