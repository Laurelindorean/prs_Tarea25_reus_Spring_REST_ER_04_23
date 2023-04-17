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
@Table(name = "fabricantes")
public class Fabricantes {

	// Atributos de entidad Fabricantes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;

	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Articulos> articulo;

	// Constructores
	public Fabricantes() {

	}

	/**
	 * @param codigo
	 * @param nombre
	 */
	public Fabricantes(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
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
	 * @return the articulo
	 */
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, mappedBy="Articulos")
	public List<Articulos> getArticulo() {
		return articulo;
	}

	/**
	 * @param articulo the articulo to set
	 */
	public void setArticulo(List<Articulos> articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "Fabricantes [codigo=" + codigo + ", nombre=" + nombre + ", articulo=" + articulo + "]";
	}

	
	
}
