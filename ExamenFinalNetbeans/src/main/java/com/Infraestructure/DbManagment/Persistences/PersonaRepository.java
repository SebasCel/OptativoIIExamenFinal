package com.Infraestructure.DbManagment.Persistences;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import infrastructure.models.Persona;

public class PersonaRepository {
    private Connection connection;

    public PersonaRepository(Connection connection) {
        this.connection = connection;
    }

}
