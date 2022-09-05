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

@Getter@Setter
@Entity
public class Skill {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long percent;
    private String text_circle;
 public Skill(){
            
        }
 public Skill(Long id, Long percent , String text_circle){
            this.id =id;
            this.text_circle = text_circle;
            this.percent= percent;
            
          
        }
        
}

    


