
package com.portafolio.api.Service;

import com.portafolio.api.model.Persona;
import java.util.List;


public interface IPersonaService {

    public List <Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona findPersona(Long id);
    
 
}
