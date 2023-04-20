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

import com.crud.h2.dto.Sala;
import com.crud.h2.service.SalaServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class SalaController {
	
	@Autowired
	SalaServiceImp salaServiceImp;

	@GetMapping("/salas")
	public List<Sala> listarSala() {
		return salaServiceImp.listarSala();
	}

	@GetMapping("/salas/nombre/{nombre}")
	public List<Sala> listarSalaNombre(@PathVariable(name="nombre") String nombre) {
		return salaServiceImp.listarSalaNombre(nombre);
	}

	@PostMapping("/salas")
	public Sala guardarSala(@RequestBody Sala sala) {
		return salaServiceImp.guardarSala(sala);
	}

	@GetMapping("/salas/{id}")
	public Sala salaXID(@PathVariable(name="id") int id) {
		Sala sala_xid = salaServiceImp.salaXID(id);
		return sala_xid;
	}

	@PutMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name="id") int id, @RequestBody Sala sala) {
		Sala sala_sel = salaServiceImp.salaXID(id);
		sala_sel.setNombre(sala.getNombre());
		sala_sel.setPelicula(sala.getPelicula());
		return salaServiceImp.actualizarSala(sala_sel);
	}

	@DeleteMapping("/salas/{id}")
	public void eliminarSala(@PathVariable(name="id") int id) {
		salaServiceImp.eliminarSala(id);
	}
}
