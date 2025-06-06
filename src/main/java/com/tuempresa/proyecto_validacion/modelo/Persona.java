package com.tuempresa.proyecto_validacion.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
@View(members = "numeroCedula,nombres,apellidos,numeroTelefono")

abstract public class Persona extends Identificacador {
	
	@Column(length = 10)
	int numeroCedula;
	
	@Column(length = 50)
	String nombres;
	
	@Column(length = 50)
	String apellidos;
	
	@Column(length = 125)
	String direccion;
	
	@Column(length = 10)
	int numeroTelefono;
}
