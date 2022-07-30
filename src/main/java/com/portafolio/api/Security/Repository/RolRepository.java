
package com.portafolio.api.Security.Repository;

import com.portafolio.api.Security.Entity.Rol;
import com.portafolio.api.Security.Enum.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
   Optional<Rol> findByRolNombre (RolNombre rolNombre);
}
