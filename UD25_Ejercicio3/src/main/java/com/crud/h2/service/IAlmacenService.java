/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Almacen;

/**
 * @author Palmira
 *
 */
public interface IAlmacenService {

	// Metodos del CRUD
	public List<Almacen> listarAlmacen();

	public Almacen guardarAlmacen(Almacen almacen);

	public Almacen almacenXID(int id);

	public Almacen actualizarAlmacen(Almacen almacen);

	public void eliminarAlmacen(int id);

}
