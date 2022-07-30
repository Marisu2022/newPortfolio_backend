
package com.portafolio.api.Repository;

import com.portafolio.api.model.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marisu
 */
@Repository
public interface IHeaderRepository extends JpaRepository<Header, Long >{
    
}
