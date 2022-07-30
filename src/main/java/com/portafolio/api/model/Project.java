package com.portafolio.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String img_proyecto;
    private String anio;
    private String herramientas;
    private String nombre_proyecto;
    private String descripcion_proyecto;
public Project(){
            
        }
        public Project(Long id, String img_proyecto , String anio,String herramientas,String nombre_proyecto, String descripcion_proyecto){
            this.id =id;
            this.img_proyecto = img_proyecto;
            this.anio= anio;
            this.herramientas = herramientas;
            this.nombre_proyecto = nombre_proyecto;
            this.descripcion_proyecto =descripcion_proyecto;
        }
        
}

    

