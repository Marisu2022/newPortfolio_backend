
package com.portafolio.api.Service;

import com.portafolio.api.model.Header;
import java.util.List;

/**
 *
 * @author Marisu
 */
public interface IHeaderService {
    
     public List <Header> verHeader();
    public void crearHeader(Header head);
    public void borrarHeader(Long id);
       public Header findHeader(Long id);
}
