package com.zhotel.app.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zhotel.app.Entity.*;

public interface IRecepcionistaDao extends CrudRepository<Recepcionista,Long>{

	Recepcionista findByUsuario(String usuario);

	List<Recepcionista> findByUsuarioContainingIgnoreCase(String usuario);
}
