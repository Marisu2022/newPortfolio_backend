/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.api.Service;

import com.portafolio.api.Repository.IHeaderRepository;
import com.portafolio.api.model.Header;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeaderService implements IHeaderService{
@Autowired
IHeaderRepository headRepo;
    @Override
    public List<Header> verHeader() {
        return headRepo.findAll();
    }

    @Override
    public void crearHeader(Header head) {
        headRepo.save(head) ;
    }

    @Override
    public void borrarHeader(Long id) {
        headRepo.deleteById(id);
    }

    @Override
    public Header findHeader(Long id) {
        return headRepo.findById(id).orElse(null);
    }
    
}
