/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.api.Service;

import com.portafolio.api.Repository.IEducationRepository;
import com.portafolio.api.model.Education;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{
@Autowired
IEducationRepository eduRepo;
    @Override
    public List<Education> verEducation() {
       return eduRepo.findAll();
    }

    @Override
    public void crearEducation(Education edu) {
     eduRepo.save(edu);
    }

    @Override
    public void borrarEducation(Long id) {
       eduRepo.deleteById(id);   
    }

    @Override
    public Education findEducation(Long id) {
     return eduRepo.findById(id).orElse(null);
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
