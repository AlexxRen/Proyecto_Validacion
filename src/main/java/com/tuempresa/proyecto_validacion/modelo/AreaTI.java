package com.tuempresa.proyecto_validacion.modelo;
import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

//@Views({
//    @View(name = "Simple", members = "nombre"),
//    @View(name = "Completa", members = "nombre, descripcion; servicios")
//})
@Entity @Getter @Setter
public class AreaTI extends Identificador{
	@Column(length = 100, nullable = false)
    @Required
    @DisplaySize(50)
    private String nombre;

    @Column(length = 500)
    @TextArea
    @DisplaySize(100)
    private String descripcion;

    //@OneToMany(mappedBy = "areaTI")
    //@ListProperties("codigo, nombre")
    //@CollectionView("Simple")
    //private Collection<Servicio> servicios;
}
