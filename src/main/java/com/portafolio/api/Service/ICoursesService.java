
package com.portafolio.api.Service;

import com.portafolio.api.model.Courses;
import java.util.List;


public interface ICoursesService {
   public List<Courses>verCourses();
    public void crearCourses(Courses cours);
    public void borrarCourses(Long id);
    public Courses findCourses(Long id);
 
}
