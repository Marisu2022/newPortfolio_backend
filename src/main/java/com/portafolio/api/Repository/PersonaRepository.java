
package com.portafolio.api.Repository;

import com.portafolio.api.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marisu
 */
@Repository
public interface PersonaRepository extends JpaRepository <Persona , Long> {
    
}
