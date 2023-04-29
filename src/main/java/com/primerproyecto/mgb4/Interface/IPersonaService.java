
package com.primerproyecto.mgb4.Interface;

import com.primerproyecto.mgb4.Entity.Persona;
import java.util.List;

//en Service se realiza todo el procesamiento logico
//en la interface se hace la DECLARCION de los metodos (no se los implementa)

public interface IPersonaService {   
    //traer una lista de personas, hace referencia a la clase persona
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo Persona (clase) llamado persona (var/instancia) 
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos por  ID
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
    
    
    
    
}
