package com.Infraestructure.DbManagment.Persistences;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import infrastructure.models.Ciudad;

public class CiudadRepository {
    private Connection connection;

    public CiudadRepository(Connection connection) {
        this.connection = connection;
    }

}