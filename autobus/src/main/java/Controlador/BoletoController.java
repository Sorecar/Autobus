package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.ConexionBD;
import Modelo.Boleto;

public class BoletoController {
	private int idBoleto;
	private String origen;
	private String destino;
	private String fecha;
	private String hora;
	private int precio;
	private String pasajero;
	private int asiento;

	ConexionBD conexion1 = new ConexionBD();
	ConexionBD conexion2 = new ConexionBD();
	ConexionBD conexion3 = new ConexionBD();
	ConexionBD conexion4 = new ConexionBD();

	ResultSet rs;
	ResultSet rs2;

	String sql;

	public BoletoController() {
	}

	public BoletoController(int idBoleto, String origen, String destino, String fecha, String hora, int precio,
			String pasajero, int asiento) {
		this.idBoleto = idBoleto;
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.hora = hora;
		this.precio = precio;
		this.pasajero = pasajero;
		this.asiento = asiento;
	}

	public int getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getPasajero() {
		return pasajero;
	}

	public void setPasajero(String pasajero) {
		this.pasajero = pasajero;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public Boleto verBoleto(int idBoleto) {
		try {
			sql = "SELECT * FROM Boletos WHERE idboleto=" + idBoleto;
			rs = conexion1.getConexion().createStatement().executeQuery(sql);
			Boleto boleto = new Boleto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getInt(6), rs.getString(7), rs.getInt(8));
			return boleto;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Boleto crearBoleto(String idViaje, int asiento, String pasajero) {
		try {
			// consulta a bd Viajes para recuperar valores del origen, destino, fecha,
			// hor y precio
			rs = conexion1.getConexion().createStatement()
					.executeQuery("SELECT * FROM Viajes WHERE idViaje=" + idViaje);
			// Creo nuevo boleto con valores de la primera consulta y otros traidos desde el
			// usuario como asiento y nompasajero
			sql = "INSERT INTO Boletos(idBoleto,Origen,Destino,Fecha,Hora,Precio,NomPasajero" + "Asiento) VALUES(NULL,'"
					+ rs.getString("origen") + "','" + rs.getString("Destino") + "','" + rs.getString("Fecha") + "','"
					+ rs.getString("Hora") + ',' + rs.getInt("Precio") + "','" + pasajero + "','" + asiento;
			conexion2.getConexion().createStatement().execute(sql);
			// consulta a bd Boletos para recuperar el boleto nuevo
			rs2 = conexion3.getConexion().createStatement()
					.executeQuery("SELECT * FROM Boletos WHERE pasajero=" + pasajero + " AND asiento=" + asiento);
			// actualizacion de datos de los asientos
			AsientoController a = new AsientoController();
			a.ocuparAsiento(rs.getString("idViaje"), rs2.getInt("idBoleto"), rs2.getInt("Numero"));
			// Creamos el boleto que regresaremos
			Boleto boleto = new Boleto(rs2.getInt("idBoleto"), rs.getString("Origen"), rs.getString("Destino"),
					rs.getString("Fecha"), rs.getString("Hora"), rs.getInt("Precio"), rs.getString("Pasajero"),
					rs.getInt("Asiento"));

			return boleto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public boolean modificarBoleto(int idBoleto, int asiento, String pasajero) {
		try {
			sql = "UPDATE Boletos SET pasajero = " + pasajero + " WHERE idBoleto=" + idBoleto + " AND Asiento="
					+ asiento;
			conexion1.getConexion().createStatement().execute(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean cancelarBoleto(int idBoleto, int asiento) {
		try {
			sql = "DELETE ROWS FROM boletos WHERE IdBoleto=" + idBoleto + " AND Asiento=" + asiento;
			rs = conexion1.getConexion().createStatement().executeQuery(sql);
			if (rs.next()) {
				AsientoController a = new AsientoController();
				a.desocuparAsiento(idBoleto, asiento);
			}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
