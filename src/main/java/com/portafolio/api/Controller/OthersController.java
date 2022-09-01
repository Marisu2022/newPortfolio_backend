/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.api.Controller;

import com.portafolio.api.Service.IOthersService;
import com.portafolio.api.model.Others;
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
public class OthersController {
    @Autowired  IOthersService othServ;
   @GetMapping("/ver/others")
    public List<Others> verOthers(){
      return othServ.verOthers();
    }
    @PostMapping("/new/others")
    public void crearOthers(@RequestBody Others oth) {
        othServ.crearOthers(oth);
    }
     @DeleteMapping("/delete/others/{id}")
    public void borrarOthers(@PathVariable Long id) {
        othServ.borrarOthers(id);
    }
    
     @PutMapping("/editar/others/{id}")
    public Others editOthers(@PathVariable Long id,
                               @RequestParam("item") String nuevoItem
                               ) {
        Others oth = othServ.findOthers(id);
        
        oth.setItem(nuevoItem);
      
        
        othServ.crearOthers(oth);
        return oth;
    }
}
