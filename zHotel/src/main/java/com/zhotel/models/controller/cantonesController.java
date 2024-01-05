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

import com.zhotel.models.entity.Cantones;
import com.zhotel.models.services.ICantonesService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class cantonesController {
	@Autowired
	private ICantonesService CantonSevice;
	//LISTAR Canton
	@GetMapping("/Cantons")

		public List<Cantones> index(){
		return CantonSevice.findAll();
		
	}
		//BUSCAR Canton
	@GetMapping("/Cantons/{id}")
	public Cantones show(@PathVariable String id) {
		return CantonSevice.findById(id);
	}
}
