package com.tuempresa.proyecto_validacion.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

//@View(name = "Completa", members = 
//	"numeroCedula, nombres, apellidos;" +
//	"email, telefono, empresa, tipo;" +
//	"direccion;" +
//	"serviciosContratados;"
//)
@Entity @Getter @Setter
public class Cliente extends Identificador {
	
	@Column(length = 20) @Required
    private String numeroCedula;
    
    @Column(length = 50) @Required
    private String nombres;
    
    @Column(length = 50) @Required
    private String apellidos;
    
    @Column(length = 20)
    private String telefonoCelular;
    
    @Column(length = 100)
    private String email;
    
    @Column(length = 200)
    private String direccion;
    
    @Column(length = 20)
    private String telefono;
    
    @Column(length = 100)
    private String empresa;
    
    @Enumerated(EnumType.STRING)
    private TipoCliente tipo;
    
    @OneToMany(mappedBy = "cliente")
    private Collection<ClienteServicio> serviciosContratados;
    
    @OneToMany(mappedBy = "cliente")
    private Collection<SolicitudInformacion> solicitudes;
}
