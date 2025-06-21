package com.tuempresa.proyecto_validacion.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;
@Entity @Getter @Setter
public class Anuncio extends Identificador{
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @Required
    private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @Required
    private Categoria categoria;
	
	@Stereotype("PHOTO")
    @Column(length = 512)
    private byte[] fotos;

    @Column(length = 255)
    private String descripcion;

    @Stereotype("DINERO")
    @Column(scale=2, precision=10)
    private BigDecimal precio;
}
