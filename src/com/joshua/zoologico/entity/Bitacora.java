package com.joshua.zoologico.entity;

import java.time.LocalDateTime;

/**
 * @author joshu
 * clase que representa una entidad de Zoologico 
 */
public class Bitacora {
	private String usuario;
	/**
	 * atributo que representa  el nombre de usuario 
	 */
	private LocalDateTime Fecha;
	/**
	 * 
	 */
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the fecha
	 */
	public LocalDateTime getFecha() {
		return Fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDateTime fecha) {
		Fecha = fecha;
	}
	

}
