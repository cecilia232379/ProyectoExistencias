package com.inabif.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TXREGISTRO")
public class Registro {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REGISTROS_SEQ")
    //@SequenceGenerator(sequenceName = "TXREGISTRO_SEQ", allocationSize = 1, name = "REGISTROS_SEQ")
	@Column(name="idregistro")
	private int idregistro;
	
	@Column(name="idbien")
	private int idbien;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="precio")
	private String precio;
	
	@Column(name="procedencia")
	private String procedencia;
	
	@Column(name="fechaprocedencia")
	private String fechaprocedencia;
	
	@Column(name="ejercicio")
	private int ejercicio;
	
	@Column(name="dependencia")
	private int dependencia;
	
	@Column(name="resolucion")
	private String resolucion;
	
	@Column(name="item")
	private int item;
	
	@Column(name="partida")
	private String partida;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="unidad")
	private String unidad;
	
	@Column(name="importe")
	private String importe;

	public int getIdregistro() {
		return idregistro;
	}

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

	public void setIdregistro(int idregistro) {
		this.idregistro = idregistro;
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

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	
}
