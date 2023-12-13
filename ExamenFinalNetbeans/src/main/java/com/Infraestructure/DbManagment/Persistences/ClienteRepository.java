package com.Infraestructure.DbManagment.Persistences;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import infrastructure.models.Cliente;

public class ClienteRepository {
    private Connection connection;

    public ClienteRepository(Connection connection) {
        this.connection = connection;
    }
}