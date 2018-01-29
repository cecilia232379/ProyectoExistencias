package com.inabif.model;

import javax.persistence.Column;

public class RegistroModel {

	@Override
	public String toString() {
		return "RegistroModel [idbien=" + idbien + ", cantidad=" + cantidad + ", precio="
				+ precio + ", procedencia=" + procedencia + ", fechaprocedencia=" + fechaprocedencia + ", ejercicio=" + ejercicio+ ", dependencia=" + dependencia
				+ ", idregistro=" + idregistro+ ", resolucion=" + resolucion + "]";
	}
	
	private int idbien;
	private int cantidad;
	private String precio;
	private String procedencia;
	private String fechaprocedencia;	
	private int ejercicio;
	private int dependencia;
	private int idregistro;
	private String resolucion;
	

	private int item;
	private String partida;
	private String tipo;
	private String descripcion;
	private String unidad;
	private String importe;
	
	
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getImporte() {
		return importe;
	}
	public void setImporte(String importe) {
		this.importe = importe;
	}
	public int getIdbien() {
		return idbien;
	}
	public void setIdbien(int idbien) {
		this.idbien = idbien;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getFechaprocedencia() {
		return fechaprocedencia;
	}
	public void setFechaprocedencia(String fechaprocedencia) {
		this.fechaprocedencia = fechaprocedencia;
	}
	public int getEjercicio() {
		return ejercicio;
	}
	public void setEjercicio(int ejercicio) {
		this.ejercicio = ejercicio;
	}
	public int getDependencia() {
		return dependencia;
	}
	public void setDependencia(int dependencia) {
		this.dependencia = dependencia;
	}
	public int getIdregistro() {
		return idregistro;
	}
	public void setIdregistro(int idregistro) {
		this.idregistro = idregistro;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	
	
	
}
