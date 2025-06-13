package com.tuempresa.proyecto_validacion.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

//@View(name = "Completa", members = 
//	"nombre, departamento, rol;"
//)
@Entity @Getter @Setter
public class Empleado extends Identificador {
	
	@Column(length = 50) @Required
    private String nombre;
    
    @Column(length = 20)
    private String telefonoCelular;
    
    @Column(length = 50)
    private String departamento;
    
    @Enumerated(EnumType.STRING)
    private RolEmpleado rol;
    
    @OneToMany(mappedBy = "responsable")
    private Collection<Servicio> serviciosGestionados;
    
    @OneToMany(mappedBy = "empleado")
    private Collection<SolicitudInformacion> solicitudesGestionadas;
    
    @OneToMany(mappedBy = "realizadoPor")
    private Collection<TrabajoRealizado> trabajosRealizados;
}
