/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primerproyecto.mgb4.Repository;

import com.primerproyecto.mgb4.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> { //<Persona,Long> es el objeto y el tipo
    
}

//esto permite utilizar metodos importantes de JPA. es el intermediario con la base de datos y JPA
