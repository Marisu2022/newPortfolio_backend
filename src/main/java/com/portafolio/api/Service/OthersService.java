/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.api.Service;

import com.portafolio.api.Repository.IOthersRepository;
import com.portafolio.api.model.Others;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OthersService implements IOthersService{
@Autowired
 public IOthersRepository othRepo;
    
        @Override
    public List<Others> verOthers() {
        return othRepo.findAll();
    }

    @Override
    public void crearOthers(Others oth) {
    othRepo.save(oth);
    }

    @Override
    public void borrarOthers(Long id) {
        othRepo.deleteById(id);
       
    }

    @Override
    public Others findOthers(Long id) {
       return othRepo.findById(id).orElse(null);
    }
    
}
