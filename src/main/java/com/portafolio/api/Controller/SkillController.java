/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.api.Controller;

import com.portafolio.api.Service.ISkillService;
import com.portafolio.api.model.Skill;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@CrossOrigin
public class SkillController {
  @Autowired
private ISkillService skServ;  
@GetMapping("/ver/skill")
    public List<Skill> verSkill() {
        return skServ.verSkill();
    }

    @PostMapping("/new/skill")
    public void crearSkill(@RequestBody Skill sk) {
        skServ.crearSkill(sk);
    }

    @DeleteMapping("/delete/skill/{id}")
    public void borrarSkill(@PathVariable Long id) {
        skServ.borrarSkill(id);
    }

    @PutMapping("/editar/skill/{id}")
    public Skill editSkill(@PathVariable Long id,
            @RequestParam("percent_circle") Long nuevoPercent_circle,
            @RequestParam("text_circle") String nuevoText_circle)
             {
        
        Skill sk = skServ.findSkill(id);

        sk.setPercent_circle(nuevoPercent_circle);
        sk.setText_circle(nuevoText_circle);
               
       skServ.crearSkill(sk);
       return sk;
    }
}
