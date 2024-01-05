package com.zhotel.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhotel.models.dao.IClienteDao;
import com.zhotel.models.entity.Cliente;

@Service
public class ClienteServicelmpl implements IClienteService {


	@Autowired
	private IClienteDao cliDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {

		return (List<Cliente>) cliDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return cliDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cli) {
		// TODO Auto-generated method stub
		return cliDao.save(cli);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cliDao.deleteById(id);
	}
}
