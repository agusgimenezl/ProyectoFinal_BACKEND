
package com.primerproyecto.mgb4.Interface;

import com.primerproyecto.mgb4.Entity.Persona;
import java.util.List;


//en la interface se hace la DECLARCION de los metodos (no se los implementa)
//esta es la interfaz de lo que posteriormente sera el servicio de Persona
public interface IPersonaService {   
    //traer una lista de personas, hace referencia a la clase persona
    public List<Persona> getPersona(); //devuelve una lista de clase persona
    
    //guardar un objeto de tipo Persona (clase) llamado persona (var/instancia) 
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos por  ID
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
    
    
    
    
}
