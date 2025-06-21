package com.tuempresa.proyecto_validacion.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Categoria extends Identificador{
	@Column(length=20) @Required
    private String nombre;

    @Column(length=50)
    private String descripcion;
}
