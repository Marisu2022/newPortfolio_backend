package com.portafolio.api.Controller;

import com.portafolio.api.Service.IEducationService;
import com.portafolio.api.model.Education;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@CrossOrigin(origins = " * ")
public class EducationController {

    @Autowired
    IEducationService eduServ;

    @PostMapping("/new/education")
    public void crearEducation(@RequestBody Education edu) {
        eduServ.crearEducation(edu);
    }

    @GetMapping("/ver/education")
    @ResponseBody
    public List<Education> verEducation() {
         return eduServ.verEducation();
    }

    @DeleteMapping("/delete/education/{id}")
    public void borrarEducation(@PathVariable Long id) {
        eduServ.borrarEducation(id);
    }

    @PutMapping("/editar/education/{id}")
    public Education editEducation(@PathVariable Long id,
            @RequestParam("detalle") String nuevoDetalle,
            @RequestParam("img_institucion") String nuevoImg_institucion) {
        Education edu = eduServ.findEducation(id);

        edu.setDetalle(nuevoDetalle);
        edu.setImg_institucion(nuevoImg_institucion);
        eduServ.crearEducation(edu);
        return edu;
    }
}
