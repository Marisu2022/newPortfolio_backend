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

@Setter @Getter
@Entity
public class Courses {
  @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String curso;
    
        
        public Courses(){
            
        }
        public Courses(Long id, String curso){
            this.id =id;
            this.curso = curso;
            
        }
    
}