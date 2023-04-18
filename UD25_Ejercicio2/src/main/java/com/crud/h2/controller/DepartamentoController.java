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

import com.crud.h2.dto.Departamento;
import com.crud.h2.service.DepartamentoServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImp departamentoServiceImp;

	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamento() {
		return departamentoServiceImp.listarDepartamento();
	}

	@PostMapping("/departamentos")
	public Departamento guardarDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImp.guardarDepartamento(departamento);
	}

	@GetMapping("/departamentos/{codigo}")
	public Departamento departamentoXID(@PathVariable(name = "codigo") int codigo) {
		Departamento departamento_xid = new Departamento();
		departamento_xid = departamentoServiceImp.departamenoXID(codigo);
		return departamento_xid;
	}

	@PutMapping("/departamentos/{codigo}")
	public Departamento actualizarDepartamento(@PathVariable(name = "codigo") int codigo,
			@RequestBody Departamento departamento) {
		Departamento departamento_sel = new Departamento();
		departamento_sel = departamentoServiceImp.departamenoXID(codigo);
		departamento_sel.setNombre(departamento.getNombre());
		departamento_sel.setPresupuesto(departamento.getPresupuesto());
		return departamentoServiceImp.actualizarDepartamento(departamento_sel);
	}

	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamento(@PathVariable(name = "codigo") int codigo) {
		departamentoServiceImp.eliminarDepartamento(codigo);
	}
}
