package com.zhotel.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhotel.models.dao.IAdministradorDao;
import com.zhotel.models.dao.ICantonesDao;
import com.zhotel.models.dao.ICategoriasDao;
import com.zhotel.models.entity.Administrador;
import com.zhotel.models.entity.Categorias;

@Service
public class CategoriasServicelmpl implements ICategoriasService {



	@Autowired
	private ICategoriasDao canteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Categorias> findAll() {

		return (List<Categorias>) canteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Categorias findById(Long id) {
		// TODO Auto-generated method stub
		return canteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Categorias save(Categorias cate) {
		// TODO Auto-generated method stub
		return canteDao.save(cate);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		canteDao.deleteById(id);
	}
}
