package com.portafolio.api.Service;

import com.portafolio.api.model.Portada;
import java.util.List;


public interface IPortadaService {
  //Traer una lista portada
   public List <Portada> verPortada();
    public void crearPortada(Portada port);
    public void borrarPortada(Long id);
       public Portada findPortada(Long id);
    
}
