package com.inabif.model;

import com.inabif.entity.Partida;

public class BienModel {
	
	@Override
	public String toString() {
		return "BienModel [idbien=" + idbien + ", idpartida=" + idpartida + ", descripcion="
				+ descripcion + ", codigo=" + codigo + ", unidad=" + unidad + ", ejercicio=" + ejercicio+ ", tipo=" + tipo
				+ ", precioprom=" + precioprom + "]";
	}
	
	private int idbien;
	private String idpartida;
	private String descripcion;
	private String codigo;
	private String unidad;
	private String tipo;
	private String precioprom;
	private String ejercicio;
	private Partida partida;
	
	public Partida getPartida() {
		return partida;
	}
	public void setPartida(Partida partida) {
		this.partida = partida;
	}
	public int getIdbien() {
		return idbien;
	}
	public void setIdbien(int idbien) {
		this.idbien = idbien;
	}
	public String getIdpartida() {
		return idpartida;
	}
	public void setIdpartida(String idpartida) {
		this.idpartida = idpartida;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPrecioprom() {
		return precioprom;
	}
	public void setPrecioprom(String precioprom) {
		this.precioprom = precioprom;
	}
	public String getEjercicio() {
		return ejercicio;
	}
	public void setEjercicio(String ejercicio) {
		this.ejercicio = ejercicio;
	}
	
	

}
