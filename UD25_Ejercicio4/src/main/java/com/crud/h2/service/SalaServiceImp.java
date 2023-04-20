/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ISalaDAO;
import com.crud.h2.dto.Sala;

/**
 * @author Palmira
 *
 */
@Service
public class SalaServiceImp implements ISalaService {

	@Autowired
	ISalaDAO iSalaDao;

	@Override
	public List<Sala> listarSala() {
		return iSalaDao.findAll();
	}

	@Override
	public List<Sala> listarSalaNombre(String nombre) {
		return iSalaDao.findByNombre(nombre);
	}

	@Override
	public Sala guardarSala(Sala sala) {
		return iSalaDao.save(sala);
	}

	@Override
	public Sala salaXID(int id) {
		return iSalaDao.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		return iSalaDao.save(sala);
	}

	@Override
	public void eliminarSala(int id) {
		iSalaDao.deleteById(id);
	}

}
