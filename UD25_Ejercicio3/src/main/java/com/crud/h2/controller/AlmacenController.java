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

import com.crud.h2.dto.Almacen;
import com.crud.h2.service.AlmacenServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServiceImp almacenServiceImp;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacen() {
		return almacenServiceImp.listarAlmacen();
	}

	@PostMapping("/almacenes")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		return almacenServiceImp.guardarAlmacen(almacen);
	}

	@GetMapping("/almacen/{id}")
	public Almacen almacenXID(@PathVariable(name="id") int id) {
		Almacen almacen_xid = almacenServiceImp.almacenXID(id);
	return almacen_xid;
	}

	@PutMapping("/almacen/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name="id")int id, @RequestBody Almacen almacen) {
		Almacen almacen_sel = almacenServiceImp.almacenXID(id);
		almacen_sel.setLugar(almacen.getLugar());
		almacen_sel.setCapacidad(almacen.getCapacidad());
		return almacenServiceImp.actualizarAlmacen(almacen_sel);
	}

	@DeleteMapping("/almacen/{id}")
	public void eliminarAlmacen(@PathVariable(name="id")int id) {
		almacenServiceImp.eliminarAlmacen(id);
		
	}
}
