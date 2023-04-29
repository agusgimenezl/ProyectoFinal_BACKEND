
package com.primerproyecto.mgb4.Service;

import com.primerproyecto.mgb4.Entity.Persona;
import com.primerproyecto.mgb4.Interface.IPersonaService;
import com.primerproyecto.mgb4.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository; //permite inyectar dependencias en otras
    //ipersonaRepository es una variable de clase IPersonaRepository, al poner @autowired permite usar jpa
    //luego en las funciones

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona = ipersonaRepository.findById(id).orElse(null); //si no encuentra la persona devuelve null (y funcione)
       return persona;
   
    }
    
}
