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
	public List<Articulos> listarArticulos();//Listar todos
	
	public Articulos guardarArticulos(Articulos articulo); //Guardar un articulo CREATE
	
	public Articulos articuloXID(int id); //Leer datos de un articulo READ
	
	public Articulos actualizarArticulo(Articulos articulo); //Actualiza un articulo UPDATE
	
	public void eliminarArticulo(int id); //Elimina el articulo DELETE

}
