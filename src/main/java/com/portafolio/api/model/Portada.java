
package com.portafolio.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Marisu
 */
@Getter @Setter
@Entity
public class Portada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String info;
    private String img_profile;
   
      
    public Portada(){
            
        }
        public Portada(Long id, String nombre, String apellido,String info,String img_profile){
            this.id =id;
            this.nombre = nombre;
            this.apellido= apellido;
            this.info = info;
            this.img_profile = img_profile;
        }
        
}

    

