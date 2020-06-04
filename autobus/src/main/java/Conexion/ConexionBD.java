package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");
        }
        return Conexion;
    }

    public void desconectar() throws SQLException {
        Conexion.close();
    }
}
