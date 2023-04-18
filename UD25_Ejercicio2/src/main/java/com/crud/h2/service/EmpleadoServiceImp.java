/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IEmpleadoDAO;
import com.crud.h2.dto.Empleado;

/**
 * @author Palmira
 *
 */
@Service
public class EmpleadoServiceImp implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO empleadoDao;

	@Override
	public List<Empleado> listarEmpleado() {

		return empleadoDao.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {

		return empleadoDao.save(empleado);
	}

	@Override
	public Empleado empleadoXID(String id) {

		return empleadoDao.findById(id).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {

		return empleadoDao.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String id) {
		empleadoDao.deleteById(id);
	}

}
