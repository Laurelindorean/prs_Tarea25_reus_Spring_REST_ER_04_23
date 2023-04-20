/**
 * 
 */
package com.crud.h2.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "salas")
public class Sala {
	// Atributos de la entidad Departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	@ManyToOne
	@JoinColumn(name = "pelicula_id")
	private Pelicula pelicula;
	
	public Sala() {
		
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param pelicula
	 */
	
	public Sala(int codigo, String nombre, Pelicula pelicula) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.pelicula = pelicula;
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
	 * @return the pelicula
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}

	/**
	 * @param pelicula the pelicula to set
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Sala [codigo=" + codigo + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}
	
	

}
