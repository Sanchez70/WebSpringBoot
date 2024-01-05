package com.zhotel.models;

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

import com.zhotel.models.entity.Categorias;
import com.zhotel.models.services.ICategoriasService;


@CrossOrigin(origins= {"http://localhost:4200"})
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
