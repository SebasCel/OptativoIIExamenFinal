package com.Infraestructure.DbManagment.Persistences;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import infrastructure.models.Cuenta;

public class CuentaRepository {
    private Connection connection;

    public CuentaRepository(Connection connection) {
        this.connection = connection;
    }

}