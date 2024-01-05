package com.zhotel.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhotel.models.dao.IHabitacionesDao;
import com.zhotel.models.entity.Habitaciones;

@Service
public class HabitacionesServicelmpl implements IHabitacionesService {


	@Autowired
	private IHabitacionesDao habiDao;

	@Override
	@Transactional(readOnly = true)
	public List<Habitaciones> findAll() {

		return (List<Habitaciones>) habiDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Habitaciones findById(Long id) {
		// TODO Auto-generated method stub
		return habiDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Habitaciones save(Habitaciones enca) {
		// TODO Auto-generated method stub
		return habiDao.save(enca);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		habiDao.deleteById(id);
	}
}
