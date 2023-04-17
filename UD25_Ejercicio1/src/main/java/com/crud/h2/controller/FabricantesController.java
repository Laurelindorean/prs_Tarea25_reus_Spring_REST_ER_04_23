/**
 * 
 */
package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Fabricantes;
import com.crud.h2.service.IFabricantesService;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class FabricantesController {
	
	@Autowired
	IFabricantesService fabricanteServiceImp;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes(){
		return fabricanteServiceImp.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricantes salvarFabricante(@RequestBody Fabricantes fabricante) {
		return fabricanteServiceImp.guardarFabricantes(fabricante);
	}
	
	@GetMapping("/fabricantes/{codigo}")
	public Fabricantes fabricanteXID(@PathVariable(name="codigo") int codigo) {
		Fabricantes fabricante_xid = new Fabricantes();
		fabricante_xid = fabricanteServiceImp.fabricanteXID(codigo);
		return fabricante_xid; 
	}
	
	@PutMapping("/fabricantes/{codigo}")
	public Fabricantes actualizarFabricantes(@PathVariable(name="codigo") int codigo, @RequestBody Fabricantes fabricante) {
		Fabricantes fabricante_selected = new Fabricantes();
		fabricante_selected = fabricanteServiceImp.fabricanteXID(codigo);
		fabricante_selected.setNombre(fabricante.getNombre());
		
		return fabricanteServiceImp.actualizarFabricante(fabricante_selected);
	}
	
	@DeleteMapping("/fabricantes/{codigo}")
	public void eliminarFabricante(@PathVariable(name="codigo")int codigo) {
		fabricanteServiceImp.eliminarFabricante(codigo);
	}
	
	

}
