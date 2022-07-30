
package com.portafolio.api.Repository;

import com.portafolio.api.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducationRepository extends JpaRepository<Education, Long>{
    
}
