
package com.portafolio.api.Repository;

import com.portafolio.api.model.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAboutRepository extends JpaRepository<About, Long> {
    
}
