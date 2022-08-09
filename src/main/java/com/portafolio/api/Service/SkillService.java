/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.api.Service;

import com.portafolio.api.Repository.ISkillRepository;
import com.portafolio.api.model.Skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
@Autowired
ISkillRepository skRepo;
    @Override
    public List<Skill> verSkill() {
       return skRepo.findAll();
    }

    @Override
    public void crearSkill(Skill sk) {
      skRepo.save(sk);
    }

    @Override
    public void borrarSkill(Long id) {
        skRepo.deleteById(id);    }

    @Override
    public Skill findSkill(Long id) {
       return skRepo.findById(id).orElse(null);
    }
    @Override
    public boolean existsById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
