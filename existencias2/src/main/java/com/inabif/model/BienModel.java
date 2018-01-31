package com.inabif.model;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.inabif.entity.Medida;
import com.inabif.entity.Partida;
import com.inabif.entity.Tipobien;

public class BienModel {
	
	@Override
	public String toString() {
		return "BienModel [idBien=" + idBien + ", medida=" + medida + ", tipobien="
				+ tipobien + ", codigo=" + codigo + ", ejercicio=" + ejercicio
				+ ", precioProm=" + precioProm + "]";
	}	

	private Long idBien;	

	private Partida partida;
	
	private Medida medida;
	
	private Tipobien tipobien;
	
	private String descripcion;
	
	private String codigo;
	
	private double precioProm;
	
	private int ejercicio;
	
	private String fechaCreacion;
	
	private String horaCreacion;
	
	private String fechaModificacion;
	
	private String horaModificacion;
	
	private String usuario;

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
	
	/*public int getIdUnidad() {
		return idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}*/

	public Medida getMedida() {
		return medida;
	}

	public void setMedida(Medida medida) {
		this.medida = medida;
	}

	/*public int getIdTipoBien() {
		return idTipoBien;
	}

	public void setIdTipoBien(int idTipoBien) {
		this.idTipoBien = idTipoBien;
	}*/
	
	public Tipobien getTipobien() {
		return tipobien;
	}

	public void setTipobien(Tipobien tipobien) {
		this.tipobien = tipobien;
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
