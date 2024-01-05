package com.zhotel.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhotel.models.dao.IDetalleFacturaDao;
import com.zhotel.models.entity.detalleFactura;

@Service
public class DetalleFacturaServicelmpl implements IDetalleFacturaService {


	@Autowired
	private IDetalleFacturaDao detaDao;

	@Override
	@Transactional(readOnly = true)
	public List<detalleFactura> findAll() {

		return (List<detalleFactura>) detaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public detalleFactura findById(Long id) {
		// TODO Auto-generated method stub
		return detaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public detalleFactura save(detalleFactura detalle) {
		// TODO Auto-generated method stub
		return detaDao.save(detalle);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		detaDao.deleteById(id);
	}
}
