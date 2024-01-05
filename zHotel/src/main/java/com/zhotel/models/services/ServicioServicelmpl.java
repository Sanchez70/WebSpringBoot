package com.zhotel.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhotel.models.dao.IServicioDao;
import com.zhotel.models.entity.Servicio;

@Service
public class ServicioServicelmpl implements IServicioService {


	@Autowired
	private IServicioDao serviDao;

	@Override
	@Transactional(readOnly = true)
	public List<Servicio> findAll() {

		return (List<Servicio>) serviDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Servicio findById(Long id) {
		// TODO Auto-generated method stub
		return serviDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Servicio save(Servicio enca) {
		// TODO Auto-generated method stub
		return serviDao.save(enca);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		serviDao.deleteById(id);
	}
}
