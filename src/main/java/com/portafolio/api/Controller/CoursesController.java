
package com.portafolio.api.Controller;

import com.portafolio.api.Service.ICoursesService;
import com.portafolio.api.model.Courses;
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
public class CoursesController {
    @Autowired ICoursesService courseServ;
    
     @PostMapping("/new/courses")
    public void crearCourses(@RequestBody Courses courses) {
        courseServ.crearCourses(courses);
    }

    @GetMapping("/ver/courses")
    @ResponseBody
    public List<Courses> verCourses() {
         return courseServ.verCourses();
    }

    @DeleteMapping("/delete/courses/{id}")
    public void borrarCourses(@PathVariable Long id) {
        courseServ.borrarCourses(id);
    }

    @PutMapping("/editar/courses/{id}")
    public Courses editCourses(@PathVariable Long id,
            @RequestParam("curso") String nuevoCurso) {
        Courses courses = courseServ.findCourses(id);

        courses.setCurso(nuevoCurso);
        
        return courses;
    }
}

