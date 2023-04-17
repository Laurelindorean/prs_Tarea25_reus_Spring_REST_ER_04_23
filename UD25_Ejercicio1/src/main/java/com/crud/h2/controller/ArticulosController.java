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

import com.crud.h2.dto.Articulos;
import com.crud.h2.service.ArticulosServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class ArticulosController {
	
	@Autowired
	ArticulosServiceImp articuloServicImp;
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos(){
		return articuloServicImp.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulos salvarArticulo(@RequestBody Articulos articulo) {
		return articuloServicImp.guardarArticulos(articulo);
	}
	
	@GetMapping("/articulos/{codigo}")
	public Articulos articuloXID(@PathVariable(name="codigo") int codigo) {
		Articulos articulo_xid = new Articulos();
		articulo_xid = articuloServicImp.articuloXID(codigo);
		return articulo_xid;
	}
	
	@PutMapping("/articulos/{codigo}")
	public Articulos actualizarArticulo(@PathVariable(name="codigo") int codigo, @RequestBody Articulos articulo) {
		
		Articulos articuloSelected = new Articulos();
		articuloSelected = articuloServicImp.articuloXID(codigo);
		articuloSelected.setNombre(articulo.getNombre());
		articuloSelected.setPrecio(articulo.getPrecio());
		articuloSelected.setFabricante(articulo.getFabricante());
		
		return articuloServicImp.actualizarArticulo(articuloSelected);
	}
	
	@DeleteMapping("/articulos/{codigo}")
	public void eliminarArticulo(@PathVariable(name="codigo") int codigo) {
		articuloServicImp.eliminarArticulo(codigo);
		
	}

}
