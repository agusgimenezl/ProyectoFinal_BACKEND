/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primerproyecto.mgb4.Service;

import com.primerproyecto.mgb4.Entity.Proyectos;
import com.primerproyecto.mgb4.Repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SProyectos {
    
    @Autowired
    RProyectos rProyectos;
    
   public List<Proyectos> list(){
        return rProyectos.findAll();
    }
    public Optional<Proyectos> getOne(int id){
        return rProyectos.findById(id);
    }
    public Optional<Proyectos> getByNombre(String nombre){
        return rProyectos.findByNombre(nombre);
    }
    
        public void save(Proyectos proyectos){
        rProyectos.save(proyectos);
    }
         public void delete(int id){
        rProyectos.deleteById(id);
    }
    
     public boolean ExistsById(int id){
         return rProyectos.existsById(id);
     }
      public boolean ExistsByNombreE(String nombre){
         return rProyectos.existsByNombre(nombre);
     }
    
}
