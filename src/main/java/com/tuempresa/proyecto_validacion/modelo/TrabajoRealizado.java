package com.tuempresa.proyecto_validacion.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

//@View(members = "servicio; titulo; descripcion; resultado")
@Entity @Getter @Setter
public class TrabajoRealizado extends Identificador{
	@Column(length = 100,nullable = false) @Required
    private String titulo;
    
	@Stereotype("MEMO") @Required
    private String descripcion;
    
	@Stereotype("MEMO") @Required
    private String resultado;
    
    @ManyToOne @Required
    private ClienteServicio contrato;
    
    @ManyToOne
    @Required
    //@DescriptionsList
    private Empleado realizadoPor;
    
    @PrePersist
    private void validarContratoActivo() {
        if(contrato != null && !contrato.getEstado().equals(EstadoContrato.ACTIVO)) {
            throw new IllegalArgumentException("Solo se pueden agregar trabajos a contratos ACTIVOS");
        }
    }
}
