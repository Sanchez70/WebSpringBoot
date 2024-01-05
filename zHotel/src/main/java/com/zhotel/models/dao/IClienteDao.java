package com.zhotel.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.zhotel.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
