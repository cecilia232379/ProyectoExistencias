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
@Table(name="tgcatalogo")
public class Tipobien implements Serializable{

	public Tipobien(){
		bienes = new ArrayList<Bien>();
	}
	
	@Id
	@Column(name="idcatalogo")//1
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TIPO_SEQ")
    @SequenceGenerator(sequenceName = "TGCATALOGO_SEQ", allocationSize = 1, name = "TIPO_SEQ")
	private Long id	;	
		
	@OneToMany(mappedBy="tipobien",fetch = FetchType.LAZY, cascade = CascadeType.ALL)//un tipo de bien con muchos bienes
	private List<Bien> bienes;	//mappedBy se pone el Nombre del atributo que relaciona en la otra clase. 	private Catalogo tipo;

	@Column(name="catgrupo")//2
	private String grupo;
	
	@Column(name="catsubgrupo")//3
	private String subgrupo;
	
	@Column(name="cattipo")//4
	private String tipo;
	
	@Column(name="catdescripcion")//5
	private String descripcion;
	
	@Column(name="catestado")//6
	private String estado;
	
	@Column(name="catusuregistra")//7
	private String usuregistra;
	
	@Column(name="catfecregistra")//8
	private String fecregistra;
	
	@Column(name="catusuactualiza")//9
	private String usuactualiza;
	
	@Column(name="catfecactualiza")//10
	private String fecactualiza;
	
	@Column(name="catusuelimina")//11
	private String usuelimina;
	
	@Column(name="catfecelimina")//12
	private String fecelimina;	
	
	@Column(name="catsisregistra")//13
	private String sisregistra;
	
	@Column(name="catsisactualiza")//14
	private String sisactualiza;
	
	@Column(name="cateliminado")//15
	private String eliminado;
	
	@Column(name="catdescripcioninner")//16
	private String descripcioninner;
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
	      return "TXMEDIDA{" +
	              "id=" + id +
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


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	public String getSubgrupo() {
		return subgrupo;
	}


	public void setSubgrupo(String subgrupo) {
		this.subgrupo = subgrupo;
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


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getUsuregistra() {
		return usuregistra;
	}


	public void setUsuregistra(String usuregistra) {
		this.usuregistra = usuregistra;
	}


	public String getFecregistra() {
		return fecregistra;
	}


	public void setFecregistra(String fecregistra) {
		this.fecregistra = fecregistra;
	}


	public String getUsuactualiza() {
		return usuactualiza;
	}


	public void setUsuactualiza(String usuactualiza) {
		this.usuactualiza = usuactualiza;
	}


	public String getFecactualiza() {
		return fecactualiza;
	}


	public void setFecactualiza(String fecactualiza) {
		this.fecactualiza = fecactualiza;
	}


	public String getUsuelimina() {
		return usuelimina;
	}


	public void setUsuelimina(String usuelimina) {
		this.usuelimina = usuelimina;
	}


	public String getFecelimina() {
		return fecelimina;
	}


	public void setFecelimina(String fecelimina) {
		this.fecelimina = fecelimina;
	}


	public String getSisregistra() {
		return sisregistra;
	}


	public void setSisregistra(String sisregistra) {
		this.sisregistra = sisregistra;
	}


	public String getSisactualiza() {
		return sisactualiza;
	}


	public void setSisactualiza(String sisactualiza) {
		this.sisactualiza = sisactualiza;
	}


	public String getEliminado() {
		return eliminado;
	}


	public void setEliminado(String eliminado) {
		this.eliminado = eliminado;
	}


	public String getDescripcioninner() {
		return descripcioninner;
	}


	public void setDescripcioninner(String descripcioninner) {
		this.descripcioninner = descripcioninner;
	}	
	
}
