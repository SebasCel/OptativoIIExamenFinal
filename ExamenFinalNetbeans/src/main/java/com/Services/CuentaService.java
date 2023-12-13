package com.Services;

import com.Infraestructure.DbManagment.Persistences.CuentaRepository;
import com.Infraestructure.DbManagment.Models.Cuenta;
public class CuentaService {
    private CuentaRepository cuentaRepository;
    
    public CuentaService (CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }
}
