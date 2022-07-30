
package com.portafolio.api.Repository;

import com.portafolio.api.model.Others;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOthersRepository extends JpaRepository<Others,Long>{
    
}
