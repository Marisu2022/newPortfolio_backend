
package com.portafolio.api.Service;

import com.portafolio.api.model.Others;
import java.util.List;


public interface IOthersService {
   public List <Others> verOthers();
    public void crearOthers(Others oth);
    public void borrarOthers(Long id);
       public Others findOthers(Long id); 
}
