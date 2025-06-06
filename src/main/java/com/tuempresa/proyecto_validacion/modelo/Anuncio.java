package com.tuempresa.proyecto_validacion.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Anuncio {
	
	
	@Id
	@Column(length = 9)
	int IDAnuncion;
	
	@Files
	@Column(length = 32)
	String fotos;

	@Column(length = 50)
	@Required
	@TextArea
	String observaciones;
	
	@ManyToOne
		(fetch=FetchType.LAZY,
				optional = true)
	@DescriptionsList 
	Categoria categoria; 
	
	@Money
	BigDecimal precio;

}
