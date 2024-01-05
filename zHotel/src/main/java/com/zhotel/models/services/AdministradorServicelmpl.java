package com.zhotel.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhotel.models.dao.IAdministradorDao;
import com.zhotel.models.entity.Administrador;

@Service
public class AdministradorServicelmpl implements IAdministradorService {



	@Autowired
	private IAdministradorDao adminDao;

	@Override
	@Transactional(readOnly = true)
	public List<Administrador> findAll() {

		return (List<Administrador>) adminDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Administrador findById(Long id) {
		// TODO Auto-generated method stub
		return adminDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Administrador save(Administrador admin) {
		// TODO Auto-generated method stub
		return adminDao.save(admin);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		adminDao.deleteById(id);
	}
}
