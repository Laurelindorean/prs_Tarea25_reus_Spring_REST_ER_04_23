/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IPeliculaDAO;
import com.crud.h2.dto.Pelicula;

/**
 * @author Palmira
 *
 */
@Service
public class PeliculaServiceImp implements IPeliculaService{

	@Autowired
	IPeliculaDAO ipeliDao;

	@Override
	public List<Pelicula> listPelicula() {
		return ipeliDao.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula peli) {
		return ipeliDao.save(peli);
	}

	@Override
	public Pelicula peliXID(int id) {
		return ipeliDao.findById(id).get();
	}

	@Override
	public List<Pelicula> listarPeliNombre(String nombre) {
		return ipeliDao.findByNombre(nombre);
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return ipeliDao.save(pelicula);
	}

	@Override
	public void eliminarPelicula(int id) {
		ipeliDao.deleteById(id);
		
	}
	

	
}
