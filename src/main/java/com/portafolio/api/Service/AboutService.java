
package com.portafolio.api.Service;

import com.portafolio.api.Repository.IAboutRepository;
import com.portafolio.api.model.About;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService{
@Autowired IAboutRepository abtRepo;

    @Override
    public List<About> verAbout() {
        return abtRepo.findAll();
    }

    @Override
    public void crearAbout(About abt) {
       abtRepo.save(abt);
    }

    @Override
    public void borrarAbout(Long id) {
         abtRepo.deleteById(id);
    }

    @Override
    public About findAbout(Long id) {
       return  abtRepo.findById(id).orElse(null);
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
