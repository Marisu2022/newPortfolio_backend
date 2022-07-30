/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.api.Controller;

import com.portafolio.api.Service.IExperienceService;
import com.portafolio.api.model.Experience;
import static java.lang.Math.exp;
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
@CrossOrigin(origins = "*")
public class ExperienceController {
    @Autowired
           private IExperienceService expServ;
     @PostMapping("/new/experience")
    public void crearExperience(@RequestBody Experience exp) {
        // listaPersonas.add(pers);
        expServ.crearExperience(exp);
    }
    @GetMapping("/ver/experience")
    @ResponseBody
    public List<Experience> verExperience() {
        
        return expServ.verExperience();
    }
    @DeleteMapping("experience/delete/{id}")
    public void borrarExperience(@PathVariable Long id) {
      expServ.borrarExperience(id);
    }
     @PutMapping("/editar/experience/{id}")
    public Experience editExperience(@PathVariable Long id,
                               @RequestParam("periodo") String nuevoPeriodo,
                               @RequestParam("descripcion")String nuevoDescripcion) {
        Experience exp = expServ.findExperience(id);
        
exp.setPeriodo(nuevoPeriodo);
exp.setDescripcion(nuevoDescripcion);
           expServ.crearExperience(exp);
        return exp;
    }
}
