package com.portafolio.api.Service;

import com.portafolio.api.Repository.IPortadaRepository;
import com.portafolio.api.model.Portada;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortadaService implements IPortadaService {

    @Autowired
    public IPortadaRepository portRepo;

    @Override
    public List<Portada> verPortada() {
        return portRepo.findAll();
    }

    @Override
    public void crearPortada(Portada port) {
        portRepo.save(port);
    }

    @Override
    public void borrarPortada(Long id) {
        portRepo.deleteById(id);
    }

    @Override
    public Portada findPortada(Long id) {
        return portRepo.findById(id).orElse(null);
    }

}
