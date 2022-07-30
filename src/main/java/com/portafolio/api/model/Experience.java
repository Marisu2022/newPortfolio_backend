

package com.portafolio.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String periodo;
    private String descripcion;
     public Experience(){
            
        }
        public Experience(Long id, String periodo, String descripcion){
            this.id =id;
            this.periodo = periodo;
            this.descripcion= descripcion;
        }
   
}
    
    

