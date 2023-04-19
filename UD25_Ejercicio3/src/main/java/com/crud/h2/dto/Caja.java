/**
 * 
 */
package com.crud.h2.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "cajas")
public class Caja {

	@Id
	@Column(name = "num_referencia")
	private String numReferencia;
	private String contenido;
	private int valor;

	@ManyToOne
	@JoinColumn(name = "almacen_id")
	private Almacen almacen;

	public Caja() {
		
	}

	/**
	 * @param numReferencia
	 * @param contenido
	 * @param valor
	 * @param almacen
	 */
	public Caja(String numReferencia, String contenido, int valor, Almacen almacen) {
		super();
		this.numReferencia = numReferencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	/**
	 * @return the numReferencia
	 */
	public String getNumReferencia() {
		return numReferencia;
	}

	/**
	 * @param numReferencia the numReferencia to set
	 */
	public void setNumReferencia(String numReferencia) {
		this.numReferencia = numReferencia;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the almacen
	 */
	public Almacen getAlmacen() {
		return almacen;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	
	
}
