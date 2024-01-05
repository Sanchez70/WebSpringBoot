package com.zhotel.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.zhotel.models.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona,String>{

}
