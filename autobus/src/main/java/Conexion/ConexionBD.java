package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    private final String base = "autobus";
    private final String user = "root";
    private final String password = "1234";
    private final String url = "jdbc:mysql://localhost:3306/" + base + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private Connection Conexion = null;

    public Connection getConexion() {
        try {            
            Conexion = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Conexion a la BD fallida");
        }
        return Conexion;
    }

    public void desconectar() throws SQLException {
        Conexion.close();
    }
}
