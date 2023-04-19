/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAlmacenDAO;
import com.crud.h2.dto.Almacen;

/**
 * @author Palmira
 *
 */
@Service
public class AlmacenServiceImp implements IAlmacenService{
	
	@Autowired
	IAlmacenDAO iAlmacenDao;
	
	@Override
	public List<Almacen> listarAlmacen() {
		return iAlmacenDao.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		return iAlmacenDao.save(almacen);
	}

	@Override
	public Almacen almacenXID(int id) {
		return iAlmacenDao.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		return iAlmacenDao.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int id) {
		iAlmacenDao.deleteById(id);
		
	}

}
