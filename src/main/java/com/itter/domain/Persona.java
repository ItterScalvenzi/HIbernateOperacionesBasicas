package com.itter.domain;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="persona")
public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="id_persona")
	@Id
	private int idPersona;
	
	private String nombre;
	
	private String apellido;
	
	private String telefono;
	
	private String email;
	
	public Persona() {}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", email=" + email + "]";
	}

}
