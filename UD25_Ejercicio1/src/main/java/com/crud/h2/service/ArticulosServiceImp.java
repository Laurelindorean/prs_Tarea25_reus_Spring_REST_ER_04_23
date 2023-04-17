/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IArticulosDAO;
import com.crud.h2.dto.Articulos;

/**
 * @author Palmira
 *
 */
@Service
public class ArticulosServiceImp implements IArticulosService{
	
	//Utilizamos los metodos de la interface IArticulosDao, es como si la instanciaramos
	@Autowired
	IArticulosDAO IArticulosDao;

	@Override
	public List<Articulos> listarArticulos() {
		
		return IArticulosDao.findAll();
	}

	@Override
	public Articulos guardarArticulos(Articulos articulo) {
		return IArticulosDao.save(articulo);
	}

	@Override
	public Articulos articuloXID(int id) {
		return IArticulosDao.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulo(Articulos articulo) {
		return IArticulosDao.save(articulo);
	}

	@Override
	public void eliminarArticulo(int id) {
		IArticulosDao.deleteById(id);
	}

}
