/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.h2.dao.IArticulosDAO;
import com.crud.h2.dto.Articulos;

/**
 * @author Palmira
 *
 */
public class ArticulosServiceImp implements IArticulosService{
	
	//Utilizamos los metodos de la interface IArticulosDao, es como si la instanciaramos
	@Autowired
	IArticulosDAO IArticulosDao;

	@Override
	public List<Articulos> listarFabricantes() {
		
		return IArticulosDao.findAll();
	}

	@Override
	public Articulos guardarFabricantes(Articulos articulo) {
		return IArticulosDao.save(articulo);
	}

	@Override
	public Articulos fabricanteXID(int id) {
		return IArticulosDao.findById(id).get();
	}

	@Override
	public Articulos actualizarFabricante(Articulos articulo) {
		return IArticulosDao.save(articulo);
	}

	@Override
	public void eliminarFabricante(int id) {
		IArticulosDao.deleteById(id);
	}

}
