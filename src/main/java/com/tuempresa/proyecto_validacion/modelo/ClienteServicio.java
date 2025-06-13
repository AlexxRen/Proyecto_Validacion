package com.tuempresa.proyecto_validacion.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;


//@View(name = "Completa", members = 
//    "cliente, servicio;" +
//    "fechaContrato, fechaFin;" +
//    "costoMensual, estado;" +
//    "terminosCondiciones"
//)
@Entity @Getter @Setter
public class ClienteServicio extends Identificador {
	@Required
    private java.util.Date fechaContrato;
    
    private java.util.Date fechaFin;
    
    @Stereotype("DINERO")
    private BigDecimal costoMensual;
    
    @Stereotype("MEMO")
    private String terminosCondiciones;
    
    @Enumerated(EnumType.STRING)
    private EstadoContrato estado;
    
    @ManyToOne @Required
    private Cliente cliente;
    
    //@OneToMany(mappedBy = "contrato")
    //@ListProperties("titulo, descripcion, resultado, realizadoPor.nombre")
    //private Collection<TrabajoRealizado> trabajos;
    
    //@OneToMany(mappedBy = "contratoOrigen")
    //@ListProperties("fecha, consulta, estado, gestionadoPor.nombre")
    //private Collection<SolicitudInformacion> solicitudes;
    
    // Lógica de negocio: Cambiar estado automáticamente
    //@PreCreate @PreUpdate
    //private void actualizarEstado() {
    //    Date hoy = new Date();
    //   if(fechaFin != null && fechaFin.before(hoy) && estado != EstadoContrato.CANCELADO) {
    //        estado = EstadoContrato.FINALIZADO;
    //    }
    //}
}
