package com.inabif.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
@Table(name="TXPARTIDA")
public class Partida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PARTIDAS_SEQ")
    @SequenceGenerator(sequenceName = "TXPARTIDA_SEQ", allocationSize = 1, name = "PARTIDAS_SEQ")
	private int idpartida;
	
	@Override
	  public String toString() {
	      return "TXPARTIDA{" +
	              "partida=" + partida +
	              ", bienes=" + bienes +
	              '}';
	  }
	
	@OneToMany(mappedBy="partida",fetch = FetchType.LAZY, cascade = CascadeType.ALL)//un cliente con muchas facturas
	private List<Bien> bienes;
	
	

	public Partida(){
		bienes = new ArrayList<Bien>();
	}
	/*@OneToMany(mappedBy = "TXPARTIDA")
	@JoinColumn(name = "partida")
    private List<Bien> bienes;*/
	

	@Column(name="partida")
	private String partida;
	
	@Column(name="pardescripcion")
	private String pardescripcion;

	public int getIdpartida() {
		return idpartida;
	}

	public void setIdpartida(int idpartida) {
		this.idpartida = idpartida;
	}	
	
	public void addBien(Bien bien){
		bienes.add(bien);
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getPardescripcion() {
		return pardescripcion;
	}

	public void setPardescripcion(String pardescripcion) {
		this.pardescripcion = pardescripcion;
	}

	public List<Bien> getBienes() {
		return bienes;
	}

	public void setBienes(List<Bien> bienes) {
		this.bienes = bienes;
	}
	
}
