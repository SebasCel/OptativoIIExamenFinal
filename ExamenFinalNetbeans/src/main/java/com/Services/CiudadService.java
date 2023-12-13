package com.Services;

import com.Infraestructure.DbManagment.Persistences.CiudadRepository;
import com.Infraestructure.DbManagment.Models.Ciudad;
public class CiudadService {
    private CiudadRepository ciudadRepository;
    
    public CiudadService (CiudadRepository ciudadRepository) {
        this.ciudadRepository = ciudadRepository;
    }
}
