/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primerproyecto.mgb4.Service;

import com.primerproyecto.mgb4.Entity.Experiencia;
import com.primerproyecto.mgb4.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional //significa que mantiene persistencia con la base de datos
public class SExperiencia {
    @Autowired //inyectamos el repositorio
    RExperiencia rExperiencia;
    
    public List<Experiencia> list(){
        return rExperiencia.findAll(); //armo lista con todas las experiencias
      
    }
    
    public Optional<Experiencia> getOne(int id){
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return rExperiencia.findByNombreE(nombreE);
        
    }
    
    public void save(Experiencia expe){ //variable expe de tipo experiencia
        rExperiencia.save(expe); //el repositorio guarda estas variables expe
    }
    
    public void delete (int id){
        rExperiencia.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rExperiencia.existsById(id);
        
    }
    
    public boolean existsByNombreE(String nombreE){
        return rExperiencia.existsByNombreE(nombreE);
    }
    
}


