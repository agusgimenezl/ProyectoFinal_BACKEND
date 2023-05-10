
package com.primerproyecto.mgb4.Service;

import com.primerproyecto.mgb4.Entity.Persona;
import com.primerproyecto.mgb4.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpPersonaService{ //el servicio IMPLEMENTA los metodos definidos en la interfaz 
    @Autowired 
    IPersonaRepository ipersonaRepository; //permite inyectar dependencias en otras
    //ipersonaRepository es una variable de clase IPersonaRepository, al poner @autowired permite usar jpa
    //luego en las funciones
     
    public List<Persona> list(){
        return ipersonaRepository.findAll(); 
      
    }

    public Optional<Persona> getOne(int id){
        return ipersonaRepository.findById(id);
    }
    
    public Optional<Persona> getByNombre(String nombre){
        return ipersonaRepository.findByNombre(nombre);
        
    }
    
    public void save(Persona persona){ 
        ipersonaRepository.save(persona); 
    }
    
    public void delete(int id){
        ipersonaRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return ipersonaRepository.existsById(id);
        
    }
    
    public boolean existsByNombre(String nombre){
        return ipersonaRepository.existsByNombre(nombre);
    }
    
   
    }
    
