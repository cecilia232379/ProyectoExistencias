package com.inabif.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TXBIEN")
public class Bien {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BIENES_SEQ")
    @SequenceGenerator(sequenceName = "TXBIEN_SEQ", allocationSize = 1, name = "BIENES_SEQ")
	private int idbien;
	

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "idpartida", nullable = false, insertable=false, updatable=false)
	@ManyToOne(fetch = FetchType.LAZY)//muchos bienes pueden tener una sola partida, y una partida puede tener muchos bienes
	private Partida partida;
	
	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	
	@Column(name="idpartida")
	private String idpartida;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="codigo")
	private String codigo;

	@Column(name="unidad")
	private String unidad;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="precioprom")
	private String precioprom;
	
	@Column(name="ejercicio")
	private String ejercicio;
	
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
