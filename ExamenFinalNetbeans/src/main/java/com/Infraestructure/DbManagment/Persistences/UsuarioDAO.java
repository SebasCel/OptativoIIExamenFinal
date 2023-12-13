
package com.Infraestructure.DbManagment.Persistences;

import com.Infraestructure.DbManagment.Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    private Connection connection;

    public Usuario consultarUsuario(String nombreUsuario) throws SQLException {
        String query = "SELECT * FROM usuarios WHERE nombre_usuario = ?";
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nombreUsuario);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setNombreUsuario(resultSet.getString("nombre_usuario"));
                    usuario.setContrasena(resultSet.getString("contrasena"));
                    return usuario;
                }
            }
        }
        return null;
    }    
}
