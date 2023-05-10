/*
Interfaz 
 */
package com.primerproyecto.mgb4.Repository;

import com.primerproyecto.mgb4.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Integer> { //<Persona,integer> es la clase y el tipo
    //al crear una interface en el repositorio, se contribuye al desarrollode netbeans agregando o mejorando componentes.
    public Optional<Persona> findByNombre(String nombre); //busca el nombre
    public boolean existsByNombre(String nombre); 
}

//esto permite que la clase persona pueda utilizar metodos importantes de JPA. es el intermediario con la base de datos y JPA
