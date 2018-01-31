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
@Table(name="txmedida")
public class Medida implements Serializable{

	public Medida(){
		bienes = new ArrayList<Bien>();
	}
	
	@Id
	@Column(name="idmedida")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEDIDA_SEQ")
    @SequenceGenerator(sequenceName = "TXMEDIDAS_SEQ", allocationSize = 1, name = "MEDIDA_SEQ")
	private Long idMedida;	
		
	@OneToMany(mappedBy="medida",fetch = FetchType.LAZY, cascade = CascadeType.ALL)//una unidad de medida con muchos bienes
	private List<Bien> bienes;	//mappedBy se pone el Nombre del atributo que relaciona en la otra clase. 	private Partida partida;

	@Column(name="medabr")
	private String medidaAbr;
	
	@Column(name="meddescripcion")
	private String descripcion;

	@Column(name="medfeccreacion")
	private String fechaCreacion;
	
	//@Temporal(TemporalType.TIME)
	@Column(name="medhorcreacion")
	//@DateTimeFormat(pattern="HHmmss")
	private String horaCreacion;
	
	//@NotEmpty
	@Column(name="medfecmodificacion")
	private String fechaModificacion;
	
	//@NotEmpty
	@Column(name="medhormodificacion")
	private String horaModificacion;
	
	@Column(name="medusuario")
	private String usuario;

	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
	      return "TXMEDIDA{" +
	              "medidaAbr=" + medidaAbr +
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


	public Long getIdMedida() {
		return idMedida;
	}


	public void setIdMedida(Long idMedida) {
		this.idMedida = idMedida;
	}


	public String getMedidaAbr() {
		return medidaAbr;
	}


	public void setMedidaAbr(String medidaAbr) {
		this.medidaAbr = medidaAbr;
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
