package com.Services;

import com.Infraestructure.DbManagment.Persistences.PersonaRepository;
import com.Infraestructure.DbManagment.Models.Persona;
public class PersonaService {
    private PersonaRepository personaRepository;
    
    public PersonaService (PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }
}
