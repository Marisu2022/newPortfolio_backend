
package com.portafolio.api.Service;

import com.portafolio.api.Repository.ICoursesRepository;
import com.portafolio.api.model.Courses;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService implements ICoursesService {

    @Autowired
    ICoursesRepository courseRepo;
    
    @Override
    public List<Courses> verCourses() {
     return  courseRepo.findAll();
             }

    @Override
    public void crearCourses(Courses course) {
      courseRepo.save(course);
    }

    @Override
    public void borrarCourses(Long id) {
       courseRepo.deleteById(id);
    }

    @Override
    public Courses findCourses(Long id) {
        return courseRepo.findById(id).orElse(null);
    }
    
}
