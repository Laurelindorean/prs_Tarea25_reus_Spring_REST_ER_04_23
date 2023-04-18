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

import com.crud.h2.dto.Empleado;
import com.crud.h2.service.EmpleadoServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImp empleadoServiceImp;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleado() {
		return empleadoServiceImp.listarEmpleado();
	}

	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado emplado) {
		return empleadoServiceImp.guardarEmpleado(emplado);
	}

	@GetMapping("/empleados/{dni}")
	public Empleado empleadoXID(@PathVariable(name = "dni") String dni) {
		Empleado emp_xid = new Empleado();
		emp_xid = empleadoServiceImp.empleadoXID(dni);
		return emp_xid;
	}

	@PutMapping("/empleados/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name = "dni") String dni, @RequestBody Empleado empleado) {
		Empleado emp_sel = new Empleado();
		emp_sel = empleadoServiceImp.empleadoXID(dni);
		emp_sel.setNombre(empleado.getNombre());
		emp_sel.setApellidos(empleado.getApellidos());
		emp_sel.setDepartamento(empleado.getDepartamento());

		return empleadoServiceImp.actualizarEmpleado(emp_sel);
	}

	@DeleteMapping("/empleados/{dni}")
	public void eliminarEmpleado(@PathVariable(name = "dni") String dni) {
		empleadoServiceImp.eliminarEmpleado(dni);
	}
}
