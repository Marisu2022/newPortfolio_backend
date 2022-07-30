
package com.portafolio.api.Repository;

import com.portafolio.api.model.Portada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPortadaRepository extends JpaRepository<Portada, Long>{
    
}
