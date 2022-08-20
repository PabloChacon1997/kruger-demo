package com.example.demo.models;



import java.io.Serializable;

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
@Table(name = "tipoVacuna")
public class TipoVacuna implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long tipoVacuna_id;
	
	@Column
	private String tipoVacuna_nombre;
	
	@JoinColumn(name = "estadoVacuna_id")
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private EstadoVacuna estado_vacuna;
	
	
	public TipoVacuna() {}


	public TipoVacuna(long tipoVacuna_id, String tipoVacuna_nombre) {
		this.tipoVacuna_id = tipoVacuna_id;
		this.tipoVacuna_nombre = tipoVacuna_nombre;
	}


	public long getTipoVacuna_id() {
		return tipoVacuna_id;
	}

	public void setTipoVacuna_id(long tipoVacuna_id) {
		this.tipoVacuna_id = tipoVacuna_id;
	}

	public String getTipoVacuna_nombre() {
		return tipoVacuna_nombre;
	}

	public void setTipoVacuna_nombre(String tipoVacuna_nombre) {
		this.tipoVacuna_nombre = tipoVacuna_nombre;
	}	
	
	public void setEstado_vacuna(EstadoVacuna estado_vacuna) {
		this.estado_vacuna = estado_vacuna;
	}
	
	public EstadoVacuna getEstado_vacuna() {
		return estado_vacuna;
	}
}
