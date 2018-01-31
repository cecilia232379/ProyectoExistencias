package com.inabif.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="txpartida")
public class Partida implements Serializable{

	public Partida(){
		bienes = new ArrayList<Bien>();
	}
	
	@Id
	@Column(name="idpartida")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PARTIDA_SEQ")
    @SequenceGenerator(sequenceName = "TXPARTIDAS_SEQ", allocationSize = 1, name = "PARTIDA_SEQ")
	private Long idPartida;	
		
	@OneToMany(mappedBy="partida",fetch = FetchType.LAZY, cascade = CascadeType.ALL)//una partida con muchos bienes
	private List<Bien> bienes;	//mappedBy se pone el combre del atributo que relaciona en la otra clase. 	private Partida partida;

	@Column(name="parpartidacod")
	private String partidaCod;
	
	@Column(name="pardescripcion")
	private String descripcion;

	@Column(name="parfeccreacion")
	private String fechaCreacion;
	
	@Column(name="parhorcreacion")
	private String horaCreacion;
	
	//@NotEmpty
	@Column(name="parfecmodificacion")
	private String fechaModificacion;
	
	//@NotEmpty
	@Column(name="parhormodificacion")
	private String horaModificacion;
	
	@Column(name="parusuario")
	private String usuario;

	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
	      return "TXPARTIDA{" +
	              "partida=" + partidaCod +
	              ", bienes=" + bienes +
	              '}';
	}
	
	
	public void addBien(Bien bien){
		bienes.add(bien);
	}	

	public List<Bien> getBienes() {
		return bienes;
	}

	public void setBienes(List<Bien> bienes) {
		this.bienes = bienes;
	}


	public Long getIdPartida() {
		return idPartida;
	}


	public void setIdPartida(Long idPartida) {
		this.idPartida = idPartida;
	}


	public String getPartidaCod() {
		return partidaCod;
	}


	public void setPartidaCod(String partidaCod) {
		this.partidaCod = partidaCod;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
