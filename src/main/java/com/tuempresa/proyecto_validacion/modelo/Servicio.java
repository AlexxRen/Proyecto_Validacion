package com.tuempresa.proyecto_validacion.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

//@Views({
//    @View(name = "Simple", members = "codigo, nombre"),
//    @View(name = "Completa", members = 
//        "codigo, nombre;" +
//        "resumen, alcance;" +
//        "metricas, beneficios;" +
//        "requisitos;" +
//        "area" +
//        "escenarioServicio;"
//    )
//})
@Tab(name="Catálogo de Servicios")
@Entity @Getter @Setter
public class Servicio extends Identificador {
	@Column(length = 20, unique = true) @Required
    private String codigo;
    
    @Column(length = 100, nullable = false) @Required
    private String nombre;
    
    @ManyToOne
    @Required
    @DescriptionsList
    private AreaTI areaTI;
    
    @ManyToOne
    @Required
    @DescriptionsList
    private Empleado responsable;
    
    @Stereotype("MEMO")
    @DisplaySize(100)
    private String resumen;
    
    @Stereotype("MEMO")
    @DisplaySize(100)
    private String alcance;
    
    @Stereotype("MEMO")
    @DisplaySize(100)
    private String metricas;
    
    @Stereotype("MEMO")
    @DisplaySize(100)
    private String beneficios;
    
    @Stereotype("MEMO")
    @DisplaySize(100)
    private String requisitos;
    
    
}
