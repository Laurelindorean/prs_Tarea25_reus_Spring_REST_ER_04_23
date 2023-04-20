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

import com.crud.h2.dto.Pelicula;
import com.crud.h2.service.PeliculaServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImp peliServiceImp;

	@GetMapping("/peliculas")
	public List<Pelicula> listPelicula() {
		return peliServiceImp.listPelicula();
	}

	@PostMapping("/peliculas")
	public Pelicula guardarPelicula(@RequestBody Pelicula peli) {
		return peliServiceImp.guardarPelicula(peli);
	}

	@GetMapping("/peliculas/{id}")
	public Pelicula peliXID(@PathVariable(name = "id") int id) {
		Pelicula peli_xid = peliServiceImp.peliXID(id);
		return peli_xid;
	}

	@GetMapping("/peliculas/nombre/{nombre}")
	public List<Pelicula> listarPeliNombre(@PathVariable(name = "nombre") String nombre) {
		return peliServiceImp.listarPeliNombre(nombre);
	}

	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name = "id") int id, @RequestBody Pelicula pelicula) {
		Pelicula peli_sel = peliServiceImp.peliXID(id);
		peli_sel.setNombre(pelicula.getNombre());
		peli_sel.setCalificacion(pelicula.getCalificacion());
		return peliServiceImp.actualizarPelicula(peli_sel);
	}

	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable(name = "id") int id) {
		peliServiceImp.eliminarPelicula(id);

	}

}
