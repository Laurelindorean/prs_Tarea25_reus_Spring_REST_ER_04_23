/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Fabricantes;

/**
 * @author Palmira
 *
 */
public interface IFabricantesService {

	//Metodos del CRUD
	public List<Fabricantes> listarFabricantes();//Listar todos
	
	public Fabricantes guardarFabricantes(Fabricantes fabricante); //Guardar un Fabricante CREATE
	
	public Fabricantes fabricanteXID(int id); //Leer datos de un fabricante READ
	
	public Fabricantes actualizarFabricante(Fabricantes fabricante); //Actualiza un Fabricante UPDATE
	
	public void eliminarFabricante(int id); //Elimina el Fabricante DELETE
	
}
