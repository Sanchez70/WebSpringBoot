package com.zhotel.models.services;

import java.util.List;

import com.zhotel.models.entity.Cantones;

public interface ICantonesService {
	
	 public List<Cantones> findAll();
	 
	 public Cantones save(Cantones cantones);
	 
	 public Cantones findById(String id_canton);
	 
	 public void delete(String id_canton);

	 

}
