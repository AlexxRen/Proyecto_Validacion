package com.tuempresa.proyecto_validacion.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Empleado extends Persona {
	
	@ManyToOne
	(fetch=FetchType.LAZY,
			optional = true)
	@DescriptionsList 
	Rol rol; 
	
	
	@Column(length = 50)
	@Required
	@TextArea
	String descripcion;
	
	@Column(length = 10)
	int telefonoVendedor;

}
