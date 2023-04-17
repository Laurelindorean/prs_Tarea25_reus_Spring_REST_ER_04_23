/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Articulos;



/**
 * @author Palmira
 *
 */
public interface IArticulosService {
	
	//Metodos del CRUD
	//Metodos del CRUD
	public List<Articulos> listarFabricantes();//Listar todos
	
	public Articulos guardarFabricantes(Articulos articulo); //Guardar un articulo CREATE
	
	public Articulos fabricanteXID(int id); //Leer datos de un articulo READ
	
	public Articulos actualizarFabricante(Articulos articulo); //Actualiza un articulo UPDATE
	
	public void eliminarFabricante(int id); //Elimina el articulo DELETE

}
