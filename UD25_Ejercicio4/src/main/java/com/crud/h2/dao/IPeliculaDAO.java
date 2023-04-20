/**
 * 
 */
package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Pelicula;

/**
 * @author Palmira
 *
 */
public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer>{

	public List<Pelicula> findByNombre(String nombre);
}
