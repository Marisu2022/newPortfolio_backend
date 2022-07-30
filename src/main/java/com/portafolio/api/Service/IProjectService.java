package com.portafolio.api.Service;

import com.portafolio.api.model.Project;
import java.util.List;


public interface IProjectService  {

   public List <Project> verProject();
    public void crearProject(Project proj);
    public void borrarProject(Long id);
       public Project findProject(Long id);
    
}