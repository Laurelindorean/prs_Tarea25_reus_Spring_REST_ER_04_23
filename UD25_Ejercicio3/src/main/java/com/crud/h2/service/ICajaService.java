/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Caja;

/**
 * @author Palmira
 *
 */
public interface ICajaService {

	// Metodos del CRUD
	public List<Caja> listarCaja();

	public Caja guardarCaja(Caja caja);

	public Caja cajaXID(String id);

	public Caja actualizarCaja(Caja caja);

	public void eliminarCaja(String id);
}
