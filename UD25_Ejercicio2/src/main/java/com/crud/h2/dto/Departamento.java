/**
 * 
 */
package com.crud.h2.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "departamentos")
public class Departamento {

	// Atributos de la entidad Departamento
	@Id
	private int codigo;
	private String nombre;
	private int presupuesto;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "departamento_id")
	private List<Empleado> empleado;

	public Departamento() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param presupuesto
	 * @param empleado
	 */
	public Departamento(int codigo, String nombre, int presupuesto, List<Empleado> empleado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.empleado = empleado;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the presupuesto
	 */
	public int getPresupuesto() {
		return presupuesto;
	}

	/**
	 * @param presupuesto the presupuesto to set
	 */
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	/**
	 * @return the empleado
	 */
	@JsonIgnore
	public List<Empleado> getEmpleado() {
		return empleado;
	}

	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

}
