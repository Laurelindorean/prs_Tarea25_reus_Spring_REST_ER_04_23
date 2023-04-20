/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Sala;

/**
 * @author Palmira
 *
 */
public interface ISalaService {

	// Metodos del CRUD
	public List<Sala> listarSala();

	public List<Sala> listarSalaNombre(String nombre);

	public Sala guardarSala(Sala sala);

	public Sala salaXID(int id);

	public Sala actualizarSala(Sala sala);

	public void eliminarSala(int id);
}
