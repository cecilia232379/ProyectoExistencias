package com.inabif.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="txbien")
public class Bien  implements Serializable{

	@Id
	@NotEmpty
	@Column(name="idbien")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BIEN_SEQ")
    @SequenceGenerator(sequenceName = "TXBIENES_SEQ", allocationSize = 1, name = "BIEN_SEQ")
	private Long idBien;	

	@ManyToOne(fetch = FetchType.LAZY)//muchos bienes pueden tener una misma partida, y una partida puede tener muchos bienes
	private Partida partida;
	
	@ManyToOne(fetch = FetchType.LAZY)//muchos bienes pueden tener una misma unidad de medida, y una misma unidad de medida puede abarcar muchos bienes
	private Medida medida;
	
	@ManyToOne(fetch = FetchType.LAZY)//muchos bienes pueden tener un mismo tipo de bien, y un mismo tipo de bien puede abarcar muchos bienes
	private Tipobien tipobien;
			
	//@Column(name="nbn_partida_id")
	//private int idPartida;
	
	//@Column(name="nbn_unidad_id")//cambio
	//private int idUnidad;	
	
	//@Column(name="nbn_tipo_bien_id")//cambio
	//private int idTipoBien;
			
	@Column(name="biendescripcion")
	private String descripcion;

	@Column(name="biencodigo")
	private String codigo;	
	
	@Column(name="bienprecioprom", columnDefinition="Decimal(10,2) default 1.00")
	private double precioProm;
	
	@Column(name="bienejercicio")
	private int ejercicio;
	
	@NotEmpty
	@Column(name="bienfeccreacion")
	@DateTimeFormat(pattern="yyyyMMdd")
	private String fechaCreacion;
	
	@NotEmpty
	@Column(name="bienhorcreacion")
	@DateTimeFormat(pattern="HHmmss")
	private String horaCreacion;
	
	@NotEmpty
	@DateTimeFormat(pattern="yyyyMMdd")
	@Column(name="bienfecmodificacion")
	private String fechaModificacion;
	
	@NotEmpty
	@Column(name="bienhormodificacion")
	@DateTimeFormat(pattern="HHmmss")
	private String horaModificacion;
	
	@Column(name="bienusuario")
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

	/*public int getIdPartida() {
		return idPartida;
	}

	public void setIdPartida(int idPartida) {
		this.idPartida = idPartida;
	}*/

	public Medida getMedida() {
		return medida;
	}

	public void setMedida(Medida medida) {
		this.medida = medida;
	}
	
	/*public int getIdUnidad() {
		return idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}*/
	
	public Tipobien getTipobien() {
		return tipobien;
	}

	public void setTipobien(Tipobien tipobien) {
		this.tipobien = tipobien;
	}

	/*public int getIdTipoBien() {
		return idTipoBien;
	}	

	public void setIdTipoBien(int idTipoBien) {
		this.idTipoBien = idTipoBien;
	}*/	

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
