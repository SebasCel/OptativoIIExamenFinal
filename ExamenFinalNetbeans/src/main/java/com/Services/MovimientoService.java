package com.Services;

import com.Infraestructure.DbManagment.Persistences.MovimientoRepository;
import com.Infraestructure.DbManagment.Models.Movimiento;
public class MovimientoService {
    private MovimientoRepository movimientoRepository;
    
    public Movimiento (MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }
}
