/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.api.Controller;

import com.portafolio.api.Service.IProjectService;
import com.portafolio.api.model.Project;
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

@RequestMapping()
@RestController
@CrossOrigin(origins = "*")
public class ProjectController {
    @Autowired private IProjectService projServ;
 @GetMapping("/ver/project")
    public List<Project> verProject() {
        return projServ.verProject();
    }

    @PostMapping("/new/project")
    public void crearProject(@RequestBody Project proj) {
        projServ.crearProject(proj);
    }

    @DeleteMapping("/delete/project/{id}")
    public void borrarProject(@PathVariable Long id) {
        projServ.borrarProject(id);
    }

    @PutMapping("/editar/project/{id}")
    public Project editProject(@PathVariable Long id,
            @RequestParam("img_proyecto") String nuevoImg_proyecto,
            @RequestParam("anio") String nuevoAnio,
            @RequestParam("herramientas") String nuevoHerramientas,
            @RequestParam("nombre_proyecto") String nuevoNombre_proyecto,
            @RequestParam("descripcion_proyecto") String nuevoDescripcion_proyecto) {
        
        Project proj = projServ.findProject(id);

        proj.setImg_proyecto(nuevoImg_proyecto);
        proj.setAnio(nuevoAnio);
        proj.setHerramientas(nuevoHerramientas);
        proj.setNombre_proyecto(nuevoNombre_proyecto);
        proj.setDescripcion_proyecto(nuevoDescripcion_proyecto);
        
       projServ.crearProject(proj);
       return proj;
    }
}
