/**
 * 
 */
package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Articulos;

/**
 * @author Palmira
 *
 */
public interface IArticulosDAO extends JpaRepository<Articulos, Integer>{
	

}
