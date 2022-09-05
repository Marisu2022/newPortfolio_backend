/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String detalle;
    private String img_institution;
        
        public Education(){
            
        }
        public Education(Long id, String detalle, String img_institution){
            this.id =id;
            this.detalle = detalle;
            this.img_institution = img_institution;
        }
    
}
