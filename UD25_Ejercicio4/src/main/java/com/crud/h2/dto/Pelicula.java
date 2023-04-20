/**
 * 
 */
package com.crud.h2.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "peliculas")
public class Pelicula {
	// Atributos de la entidad Departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	@Column(name = "calificacion_edad")
	private String calificacion;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "pelicula_id")
	private List<Sala> sala;

	// Constructores
	public Pelicula() {
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param calificacion
	 */
	public Pelicula(int codigo, String nombre, String calificacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacion = calificacion;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the calificacion
	 */
	public String getCalificacion() {
		return calificacion;
	}

	/**
	 * @return the sala
	 */
	@JsonIgnore
	public List<Sala> getSala() {
		return sala;
	}

	
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	/**
	 * @param sala the sala to set
	 */
	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", calificacion=" + calificacion + "]";
	}

}
