package com.portafolio.api.Service;

import com.portafolio.api.Repository.IProjectRepository;
import com.portafolio.api.model.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService {

    @Autowired
    IProjectRepository projRepo;

    @Override
    public List<Project> verProject() {
        return projRepo.findAll();
    }

    @Override
    public void crearProject(Project proj) {
        projRepo.save(proj);
    }

    @Override
    public void borrarProject(Long id) {
        projRepo.deleteById(id);
    }

    @Override
    public Project findProject(Long id) {
        return projRepo.findById(id).orElse(null);
    }

}
