package com.inabif.model;

import java.util.Date;

public class EnvioModel {

	private int iddependencia;
	private String ejercicio;
	private int estado;
	private Date fechaenvio;
	
	
	public int getIddependencia() {
		return iddependencia;
	}
	public void setIddependencia(int iddependencia) {
		this.iddependencia = iddependencia;
	}
	public String getEjercicio() {
		return ejercicio;
	}
	public void setEjercicio(String ejercicio) {
		this.ejercicio = ejercicio;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Date getFechaenvio() {
		return fechaenvio;
	}
	public void setFechaenvio(Date fechaenvio) {
		this.fechaenvio = fechaenvio;
	}
	
	
	
}
