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
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long usuario_id;
	
	@Column
	private String usuario_nombre;
	
	@Column
	private String usuario_contrasena;
	
	@Column
	private boolean usuario_admin;
	
	@JoinColumn(name = "per_id")
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Persona persona;
	
	public Usuario() {}
	
	


	public Usuario(long usuario_id, String usuario_nombre, String usuario_contrasena, boolean usuario_admin,
			Persona persona) {
		super();
		this.usuario_id = usuario_id;
		this.usuario_nombre = usuario_nombre;
		this.usuario_contrasena = usuario_contrasena;
		this.usuario_admin = usuario_admin;
		this.persona = persona;
	}




	public long getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(long usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getUsuario_nombre() {
		return usuario_nombre;
	}
	
	public void setUsuario_nombre(String usuario_nombre) {
		this.usuario_nombre = usuario_nombre;
	}

	public String getUsuario_contrasena() {
		return usuario_contrasena;
	}

	public void setUsuario_contrasena(String usuario_contrasena) {
		this.usuario_contrasena = usuario_contrasena;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public boolean isUsuario_admin() {
		return usuario_admin;
	}


	public void setUsuario_admin(boolean usuario_admin) {
		this.usuario_admin = usuario_admin;
	}
	
	
	
}
