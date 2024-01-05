package com.zhotel.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhotel.models.dao.ITipoServicioDao;
import com.zhotel.models.entity.TipoServicio;

@Service
public class TipoServicioServicelmpl implements ITipoServicioService {


	@Autowired
	private ITipoServicioDao tipserviDao;

	@Override
	@Transactional(readOnly = true)
	public List<TipoServicio> findAll() {

		return (List<TipoServicio>) tipserviDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public TipoServicio findById(Long id) {
		// TODO Auto-generated method stub
		return tipserviDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public TipoServicio save(TipoServicio enca) {
		// TODO Auto-generated method stub
		return tipserviDao.save(enca);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipserviDao.deleteById(id);
	}
}
