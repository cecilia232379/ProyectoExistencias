package com.inabif.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="txbienes")
public class Bien implements Serializable {	

	@Id
	@NotEmpty
	@Column(name="nbn_bien_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBien;	

	@ManyToOne(fetch = FetchType.LAZY)//muchos bienes pueden tener una sola partida, y una partida puede tener muchos bienes
	private Partida partida;
			
	@Column(name="nbn_partida_id")
	private int idPartida;
	
	@Column(name="nbn_unidad_id")//cambio
	private int idUnidad;	
	
	@Column(name="nbn_tipo_bien_id")//cambio
	private int idTipoBien;
			
	@Column(name="cbn_descripcion")
	private String descripcion;
	
	@Column(name="cbn_codigo")
	private String codigo;	
	
	@Column(name="dbn_precio_prom", columnDefinition="Decimal(10,2) default '1.00'")
	private double precioProm;
	
	@Column(name="nbn_ejercicio")
	private int ejercicio;
	
	@NotEmpty
	@Column(name="fbn_fecha_creacion")
	@DateTimeFormat(pattern="yyyyMMdd")
	private String fechaCreacion;
	
	@NotEmpty
	@Column(name="hbn_hora_creacion")
	@DateTimeFormat(pattern="HHmmss")
	private String horaCreacion;
	
	@NotEmpty
	@DateTimeFormat(pattern="yyyyMMdd")
	@Column(name="fbn_fecha_modificacion")
	private String fechaModificacion;
	
	@NotEmpty
	@Column(name="hbn_hora_modificacion")
	@DateTimeFormat(pattern="HHmmss")
	private String horaModificacion;
	
	@Column(name="cbn_usuario")
	private String usuario;

	private static final long serialVersionUID = 1L;

	public Long getIdBien() {
		return idBien;
	}

	public void setIdBien(Long idBien) {
		this.idBien = idBien;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public int getIdPartida() {
		return idPartida;
	}

	public void setIdPartida(int idPartida) {
		this.idPartida = idPartida;
	}

	public int getIdUnidad() {
		return idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}

	public int getIdTipoBien() {
		return idTipoBien;
	}

	public void setIdTipoBien(int idTipoBien) {
		this.idTipoBien = idTipoBien;
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

	public double getPrecioProm() {
		return precioProm;
	}

	public void setPrecioProm(double precioProm) {
		this.precioProm = precioProm;
	}

	public int getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(int ejercicio) {
		this.ejercicio = ejercicio;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getHoraCreacion() {
		return horaCreacion;
	}

	public void setHoraCreacion(String horaCreacion) {
		this.horaCreacion = horaCreacion;
	}

	public String getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getHoraModificacion() {
		return horaModificacion;
	}

	public void setHoraModificacion(String horaModificacion) {
		this.horaModificacion = horaModificacion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
