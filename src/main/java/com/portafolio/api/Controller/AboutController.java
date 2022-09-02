/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.api.Controller;

import com.portafolio.api.Service.IAboutService;
import com.portafolio.api.model.About;
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
@CrossOrigin
public class AboutController {

    @Autowired
    private IAboutService abtServ;

    @GetMapping("/ver/about")
    @ResponseBody
    public List<About> verAbout() {
        return abtServ.verAbout();
    }
    
  

    @PostMapping("/new/about")
    public String crearAbout(@RequestBody About abt) {
        abtServ.crearAbout(abt);
        return "Se ha creado correctamente el texto acerca de...";
    }

    @DeleteMapping("/delete/about/{id}")
    public String borrarAbout(@PathVariable Long id) {
        abtServ.borrarAbout(id);
        return "El texto fue eliminado correctamente";
    }

    @PutMapping("/editar/about/{id}")
    public About editAbout(@PathVariable Long id,
            @RequestParam("about") String nuevoAbout) {
        About abt = abtServ.findAbout(id);

        abt.setAbout(nuevoAbout);

        abtServ.crearAbout(abt);
        return abt;
    }
}
