
package com.portafolio.api.Repository;

import com.portafolio.api.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoursesRepository extends JpaRepository<Courses, Long>{
    
}
