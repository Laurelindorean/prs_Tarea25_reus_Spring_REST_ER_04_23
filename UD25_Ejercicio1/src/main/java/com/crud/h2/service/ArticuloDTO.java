package com.crud.h2.service;

public class ArticuloDTO {

	private int codigo;
	private String nombre;
	private int precio;
	private int idFabricante;

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
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return the idFabricante
	 */
	public int getIdFabricante() {
		return idFabricante;
	}

	/**
	 * @param idFabricante the idFabricante to set
	 */
	public void setIdFabricante(int idFabricante) {
		this.idFabricante = idFabricante;
	}
}
