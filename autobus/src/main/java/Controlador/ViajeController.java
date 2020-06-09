package Controlador;

import Conexion.ConexionBD;
import Modelo.Viaje;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViajeController {

    private String Origen;
    private String Destino;
    private String Fecha;

    ConexionBD conexion = new ConexionBD();

    public ViajeController() {
    }

    public ViajeController(String Origen, String Destino, String Fecha) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.Fecha = Fecha;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    //Busca todos los viajes que estan en un origen, destino y fecha determinada
    public ArrayList<Viaje> consultaViaje(String origen, String destino, String fecha) {
        ArrayList<Viaje> encontrados = new ArrayList<Viaje>();
        try {
            ResultSet rs = conexion.getConexion().createStatement().executeQuery("SELECT * FROM Viajes WHERE origen=" + origen + "+ and destino=" + destino
                    + " and fecha=" + fecha);
            while (rs.next()) {
                encontrados.add(new Viaje(rs.getString("idviaje"), rs.getString("origen"), rs.getString("destino"), rs.getString("Fecha"),
                        rs.getString("Hora"), rs.getInt("Precio")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return encontrados;
    }
    
    public String getAutobus(String idviaje) {
        String idautobus="";
        ResultSet rs;
        try {
            rs = conexion.getConexion().createStatement().executeQuery("SELECT idautobus FROM viajes WHERE idviaje=" + idviaje);
            if (rs.next()) {
                idautobus = rs.getString("idViaje");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViajeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idautobus;
    }
    
}
