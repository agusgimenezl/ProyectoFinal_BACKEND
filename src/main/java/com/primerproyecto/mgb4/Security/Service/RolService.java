
package com.primerproyecto.mgb4.Security.Service;

import com.primerproyecto.mgb4.Security.Entity.Rol;
import com.primerproyecto.mgb4.Security.Enums.RolNombre;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.primerproyecto.mgb4.Security.Repository.iRolRepository;

@Service
@Transactional //persistencia en la base de datos. si una operacion falla
//no se demuestra al cliente
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
       return irolRepository.findByRolNombre(rolNombre);  
    }
   
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}

