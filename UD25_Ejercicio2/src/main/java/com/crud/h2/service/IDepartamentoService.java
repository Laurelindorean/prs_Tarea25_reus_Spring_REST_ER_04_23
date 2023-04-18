/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Departamento;

/**
 * @author Palmira
 *
 */
public interface IDepartamentoService {

	// Metodos del CRUD
	public List<Departamento> listarDepartamento();

	public Departamento guardarDepartamento(Departamento departamento);

	public Departamento departamenoXID(int id);

	public Departamento actualizarDepartamento(Departamento departamento);

	public void eliminarDepartamento(int id);
}
