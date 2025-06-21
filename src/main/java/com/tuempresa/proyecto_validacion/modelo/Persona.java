package com.tuempresa.proyecto_validacion.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter
abstract public class Persona extends Identificador{
	@Column(length = 20) @Required
    private String numeroCedula;
    
    @Column(length = 50) @Required
    private String nombres;
    
    @Column(length = 50) @Required
    private String apellidos;
    
    @Column(length = 20) @Required
    private String numeroTelefono;
    
    @Column(length = 50) @Required
    @Stereotype("EMAIL")
    private String email;
    
    @Column(length = 125) @Required
    private String direccion;
}
