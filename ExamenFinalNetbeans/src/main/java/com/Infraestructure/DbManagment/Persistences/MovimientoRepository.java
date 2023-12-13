package com.Infraestructure.DbManagment.Persistences;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import infrastructure.models.Movimiento;

public class MovimientoRepository {
    private Connection connection;

    public MovimientoRepository(Connection connection) {
        this.connection = connection;
    }
    
}