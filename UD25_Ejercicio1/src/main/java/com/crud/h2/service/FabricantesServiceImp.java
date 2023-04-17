/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFabricantesDAO;
import com.crud.h2.dto.Fabricantes;

/**
 * @author Palmira
 *
 */
@Service
public class FabricantesServiceImp implements IFabricantesService{

	//Utilizamos los metodos de la interface IFabricantesDao, es como si la instanciaramos
	@Autowired
	IFabricantesDAO iFabricanteDao;
	@Override
	public List<Fabricantes> listarFabricantes() {	
		return iFabricanteDao.findAll();
	}

	@Override
	public Fabricantes guardarFabricantes(Fabricantes fabricante) {		
		return iFabricanteDao.save(fabricante);
	}

	@Override
	public Fabricantes fabricanteXID(int id) {
		return iFabricanteDao.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricante(Fabricantes fabricante) {
		return iFabricanteDao.save(fabricante);
	}

	@Override
	public void eliminarFabricante(int id) {
		iFabricanteDao.deleteById(id);;
		
	}

}
