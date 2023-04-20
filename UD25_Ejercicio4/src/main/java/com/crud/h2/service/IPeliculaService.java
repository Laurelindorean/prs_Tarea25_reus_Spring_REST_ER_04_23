/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Pelicula;

/**
 * @author Palmira
 *
 */
public interface IPeliculaService {

	// Metodos del CRUD
	public List<Pelicula> listPelicula();

	public Pelicula guardarPelicula(Pelicula peli);

	public Pelicula peliXID(int id);

	public List<Pelicula> listarPeliNombre(String nombre);

	public Pelicula actualizarPelicula(Pelicula pelicula);

	public void eliminarPelicula(int id);

}
