package com.zhotel.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhotel.models.dao.IProvinciaDao;
import com.zhotel.models.entity.Provincia;

@Service
public class ProvinciaServicelmpl implements IProvinciaService {


	@Autowired
	private IProvinciaDao habiDao;

	@Override
	@Transactional(readOnly = true)
	public List<Provincia> findAll() {

		return (List<Provincia>) habiDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Provincia findById(String id) {
		// TODO Auto-generated method stub
		return habiDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Provincia save(Provincia enca) {
		// TODO Auto-generated method stub
		return habiDao.save(enca);
	}

	@Override
	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		habiDao.deleteById(id);
	}
}
