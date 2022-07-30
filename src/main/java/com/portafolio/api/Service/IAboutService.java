
package com.portafolio.api.Service;

import com.portafolio.api.model.About;
import java.util.List;

public interface IAboutService {
    public List<About>verAbout();
    public void crearAbout(About abt);
    public void borrarAbout(Long id);
    public About findAbout(Long id);

  
}

