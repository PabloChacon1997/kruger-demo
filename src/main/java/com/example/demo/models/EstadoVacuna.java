package com.example.demo.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "estado_vacuna")
public class EstadoVacuna implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long estadoVacuna_id;
	
	
	@JoinColumn(name = "per_id")
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Persona persona;
	
	
	@JoinColumn(name = "tipoVacuna_id")
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private TipoVacuna tipoVacuna;
	
	
	
	@Column
	private Date estadoVacuna_fecha;
	
	@Column
	private int estadoVacuna_numDosis;
	
	public EstadoVacuna() {}

	

	public EstadoVacuna(long estadoVacuna_id, Persona persona, TipoVacuna tipoVacuna, 
			Date estadoVacuna_fecha, int estadoVacuna_numDosis) {
		this.estadoVacuna_id = estadoVacuna_id;
		this.persona = persona;
		this.tipoVacuna = tipoVacuna;
		this.estadoVacuna_fecha = estadoVacuna_fecha;
		this.estadoVacuna_numDosis = estadoVacuna_numDosis;
	}



	public long getEstadoVacuna_id() {
		return estadoVacuna_id;
	}

	public void setEstadoVacuna_id(long estadoVacuna_id) {
		this.estadoVacuna_id = estadoVacuna_id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public TipoVacuna getTipoVacuna() {
		return tipoVacuna;
	}
	
	public void setTipoVacuna(TipoVacuna tipoVacuna) {
		this.tipoVacuna = tipoVacuna;
	}
	
	
	public Date getEstadoVacuna_fecha() {
		return estadoVacuna_fecha;
	}

	public void setEstadoVacuna_fecha(Date estadoVacuna_fecha) {
		this.estadoVacuna_fecha = estadoVacuna_fecha;
	}

	public int getEstadoVacuna_numDosis() {
		return estadoVacuna_numDosis;
	}

	public void setEstadoVacuna_numDosis(int estadoVacuna_numDosis) {
		this.estadoVacuna_numDosis = estadoVacuna_numDosis;
	}
	
	
	
	
}
