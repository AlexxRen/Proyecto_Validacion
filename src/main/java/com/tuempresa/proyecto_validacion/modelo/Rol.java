package com.tuempresa.proyecto_validacion.modelo;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Rol extends Identifiable{
	@Column(length = 50)
	String descripcion;
}
