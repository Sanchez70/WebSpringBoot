package com.zhotel.app.Services;

import java.util.List;

import com.zhotel.app.Entity.*;

public interface ICantonesService {
	
	 public List<Cantones> findAll();
	 
	 public Cantones save(Cantones cantones);
	 
	 public Cantones findById(String id_canton);
	 
	 public void delete(String id_canton);

	 

}
