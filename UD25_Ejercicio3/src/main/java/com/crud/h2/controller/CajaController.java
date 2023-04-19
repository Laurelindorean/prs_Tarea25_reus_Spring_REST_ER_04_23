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

import com.crud.h2.dto.Caja;
import com.crud.h2.service.CajaServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImp cajaServiceImp;

	@GetMapping("/cajas")
	public List<Caja> listarCaja() {
		return cajaServiceImp.listarCaja();
	}

	@PostMapping("/cajas")
	public Caja guardarCaja(@RequestBody Caja caja) {
		return cajaServiceImp.guardarCaja(caja);
	}

	@GetMapping("/cajas/{id}")
	public Caja cajaXID(@PathVariable(name = "id") String id) {
		Caja caja_xid = cajaServiceImp.cajaXID(id);
		return caja_xid;
	}

	@PutMapping("/cajas/{id}")
	public Caja actualizarCaja(@PathVariable(name = "id") String id, @RequestBody Caja caja) {
		Caja caja_sel = cajaServiceImp.cajaXID(id);
		caja_sel.setContenido(caja.getContenido());
		caja_sel.setValor(caja.getValor());
		caja_sel.setAlmacen(caja.getAlmacen());
		return cajaServiceImp.actualizarCaja(caja_sel);
	}

	@DeleteMapping("/cajas/{id}")
	public void eliminarCaja(@PathVariable(name = "id") String id) {
		cajaServiceImp.eliminarCaja(id);

	}

}
