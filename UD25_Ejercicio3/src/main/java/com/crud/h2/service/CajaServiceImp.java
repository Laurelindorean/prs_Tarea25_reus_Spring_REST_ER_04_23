/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ICajaDAO;
import com.crud.h2.dto.Caja;

/**
 * @author Palmira
 *
 */
@Service
public class CajaServiceImp implements ICajaService{
	
	@Autowired
	ICajaDAO iCajaDao;

	@Override
	public List<Caja> listarCaja() {
		return iCajaDao.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		return iCajaDao.save(caja);
	}

	@Override
	public Caja cajaXID(String id) {
		return iCajaDao.findById(id).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		return iCajaDao.save(caja);
	}

	@Override
	public void eliminarCaja(String id) {
		iCajaDao.deleteById(id);
		
	}

}
