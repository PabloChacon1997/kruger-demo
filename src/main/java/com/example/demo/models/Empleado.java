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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "empleado")
public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long emp_id;
	
	@JoinColumn(name = "per_id")
	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Persona persona;
	
	@Column
	private Date emp_fechaNacimiento;
	
	@Column
	private String emp_direccion;
	
	@Column
	private String emp_telefono;
	
	@Column
	private boolean emp_vacunado;
	
	
	public Empleado() {}
	
	


	public Empleado(long emp_id, Persona persona, Date emp_fechaNacimiento, String emp_direccion, String emp_telefono,
			boolean emp_vacunado) {
		super();
		this.emp_id = emp_id;
		this.persona = persona;
		this.emp_fechaNacimiento = emp_fechaNacimiento;
		this.emp_direccion = emp_direccion;
		this.emp_telefono = emp_telefono;
		this.emp_vacunado = emp_vacunado;
	}




	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Date getEmp_fechaNacimiento() {
		return emp_fechaNacimiento;
	}

	public void setEmp_fechaNacimiento(Date emp_fechaNacimiento) {
		this.emp_fechaNacimiento = emp_fechaNacimiento;
	}

	public String getEmp_direccion() {
		return emp_direccion;
	}

	public void setEmp_direccion(String emp_direccion) {
		this.emp_direccion = emp_direccion;
	}
	
	
	
	public String getEmp_telefono() {
		return emp_telefono;
	}


	public void setEmp_telefono(String emp_telefono) {
		this.emp_telefono = emp_telefono;
	}


	public boolean isEmp_vacunado() {
		return emp_vacunado;
	}


	public void setEmp_vacunado(boolean emp_vacunado) {
		this.emp_vacunado = emp_vacunado;
	}
	
}
