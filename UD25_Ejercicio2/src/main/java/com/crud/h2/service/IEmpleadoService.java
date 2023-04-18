/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Empleado;

/**
 * @author Palmira
 *
 */
public interface IEmpleadoService {

	// Metodos del CRUD

	public List<Empleado> listarEmpleado();

	public Empleado guardarEmpleado(Empleado empleado);

	public Empleado empleadoXID(String id);

	public Empleado actualizarEmpleado(Empleado empleado);

	public void eliminarEmpleado(String id);
}
