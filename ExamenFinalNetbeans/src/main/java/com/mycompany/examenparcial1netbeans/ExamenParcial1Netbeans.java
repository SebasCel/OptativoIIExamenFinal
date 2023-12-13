package com.mycompany.examenparcial1netbeans;
import com.Infraestructure.Connections.Conexiones;
import java.sql.Connection;
import java.sql.SQLException;

public class ExamenParcial1Netbeans {

    public static void main(String[] args) {
        LoginGUI.main(args);
    }

    public static void realizarConexion() {
        Connection connection = Conexiones.getConnection();
        if (connection == null) {
            System.err.println("No se pudo establecer una conexión.");
        } else {
            try {
                connection.close();
                System.out.println("Conexión realizada.");
            } catch (SQLException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}

