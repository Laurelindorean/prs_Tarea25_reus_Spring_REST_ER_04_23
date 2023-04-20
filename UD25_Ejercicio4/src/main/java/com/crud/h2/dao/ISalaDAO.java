/**
 * 
 */
package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Sala;

/**
 * @author Palmira
 *
 */
public interface ISalaDAO extends JpaRepository<Sala, Integer>{
	
	public List<Sala> findByNombre(String nombre);
}
