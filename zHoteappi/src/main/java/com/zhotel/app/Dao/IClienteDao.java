package com.zhotel.app.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zhotel.app.Entity.*;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	Cliente findByUsuario(String usuario);

	List<Cliente> findByUsuarioContainingIgnoreCase(String usuario);

}
