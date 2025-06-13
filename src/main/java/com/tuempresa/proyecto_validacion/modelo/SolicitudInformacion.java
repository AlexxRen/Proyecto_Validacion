package com.tuempresa.proyecto_validacion.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

//@View(name = "Completa", members = 
//    "fecha, estado;" +
//    "cliente, servicio;" +
//    "asignadoA;" +
//    "consulta; solucion"
//)
@Entity @Getter @Setter
public class SolicitudInformacion extends Identificador{
	@Required
    private java.util.Date fecha;
    
	@Stereotype("MEMO") @Required
    private String consulta;
    
	@Stereotype("MEMO") @Required
    private String solucion;
	
	@Enumerated(EnumType.STRING)
    private EstadoSolicitud estado;
    
    @ManyToOne @Required
    private Cliente cliente;
    
    @ManyToOne
    private Empleado empleado;
    
    @ManyToOne
    private ClienteServicio clienteServicio;
    
 // L�gica de negocio: Asignar autom�ticamente
    @PrePersist
    private void asignarEstadoInicial() {
        if(estado == null) {
            estado = EstadoSolicitud.NUEVA;
        }
    }
}
