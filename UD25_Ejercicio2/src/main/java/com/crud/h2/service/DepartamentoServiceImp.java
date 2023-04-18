/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IDepartamentoDAO;
import com.crud.h2.dto.Departamento;

/**
 * @author Palmira
 *
 */
@Service
public class DepartamentoServiceImp implements IDepartamentoService {

	@Autowired
	IDepartamentoDAO departamentoDao;

	@Override
	public List<Departamento> listarDepartamento() {

		return departamentoDao.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {

		return departamentoDao.save(departamento);
	}

	@Override
	public Departamento departamenoXID(int id) {

		return departamentoDao.findById(id).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {

		return departamentoDao.save(departamento);
	}

	@Override
	public void eliminarDepartamento(int id) {
		departamentoDao.deleteById(id);
	}

}
