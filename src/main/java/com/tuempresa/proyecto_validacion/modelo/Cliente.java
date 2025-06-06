package com.tuempresa.proyecto_validacion.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Cliente extends Persona{
	
	@Column(length = 25)
	String nombresComercial;	

}
