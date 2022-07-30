/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.api.Service;

import com.portafolio.api.model.Skill;
import java.util.List;


public interface ISkillService  {
     public List <Skill> verSkill();
    public void crearSkill(Skill sk);
    public void borrarSkill(Long id);
       public Skill findSkill(Long id);
}
