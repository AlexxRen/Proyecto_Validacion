package com.tuempresa.proyecto_validacion.modelo;

import javax.persistence.*;

import lombok.*;

/*@View(members =
	"DatosPersonales [numeroCedula; nombres, apellidos]; " +
	"Contacto [telefonoCelular, email; direccion]; " +
	"DatosLaborales [empresa; tipoCliente, numeroTelefono]"
)*/
@PrimaryKeyJoinColumn(name="oid")
@Entity @Getter @Setter
public class Cliente extends Persona {
    
    @Column(length = 100)
    private String nombreComercial;
}
