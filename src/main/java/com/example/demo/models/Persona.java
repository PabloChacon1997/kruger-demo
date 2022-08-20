package com.example.demo.models;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;




@Entity
@Table(name = "persona")
public class Persona implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long per_id;
	
	@Column
	private int per_cedula;
	
	@Column
	private String per_nombre;
	
	@Column
	private String per_apellidos;
	
	@Column
	@Email
	private String per_correo;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "persona")
	private List<EstadoVacuna> estadoVacunas;
	

	public Persona() {}

	

	public Persona(long per_id, int per_cedula, String per_nombre, String per_apellidos, String per_correo,
			List<EstadoVacuna> estadoVacunas) {
		super();
		this.per_id = per_id;
		this.per_cedula = per_cedula;
		this.per_nombre = per_nombre;
		this.per_apellidos = per_apellidos;
		this.per_correo = per_correo;
		this.estadoVacunas = estadoVacunas;
	}



	public long getPer_id() {
		return per_id;
	}

	public void setPer_id(long per_id) {
		this.per_id = per_id;
	}

	public int getPer_cedula() {
		return per_cedula;
	}

	public void setPer_cedula(int per_cedula) {
		this.per_cedula = per_cedula;
	}

	public String getPer_nombre() {
		return per_nombre;
	}

	public void setPer_nombre(String per_nombre) {
		this.per_nombre = per_nombre;
	}

	public String getPer_apellidos() {
		return per_apellidos;
	}

	public void setPer_apellidos(String per_apellidos) {
		this.per_apellidos = per_apellidos;
	}

	public String getPer_correo() {
		return per_correo;
	}

	public void setPer_correo(String per_correo) {
		this.per_correo = per_correo;
	}
	
	public List<EstadoVacuna> getEstadoVacunas() {
		return estadoVacunas;
	}
	
	public void setEstadoVacunas(List<EstadoVacuna> estadoVacunas) {
		this.estadoVacunas = estadoVacunas;
	}
	
	
}
