
package com.portafolio.api.Service;

import com.portafolio.api.Repository.PersonaRepository;
import com.portafolio.api.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
@Autowired
public PersonaRepository persoRepo;
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void crearPersona(Persona per) {
       persoRepo.save(per);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


    @Override
    public Persona findPersona(Long id) {
       return persoRepo.findById(id).orElse(null);
    }
}
