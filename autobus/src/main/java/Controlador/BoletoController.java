package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.ConexionBD;
import Modelo.Boletos;
import Modelo.Viajes;

public class BoletoController {
	private int idBoleto;
	private String origen;
	private String destino;
	private String fecha;
	private String hora;
	private int precio;
	private String pasajero;
	private int asiento;

	ConexionBD conexion = new ConexionBD();

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

	public Boletos verBoleto(int idBoleto) {
		Boletos boleto;
		try {
			sql = "SELECT * FROM Boletos WHERE idboleto='" + idBoleto + "'";
			rs = conexion.getConexion().createStatement().executeQuery(sql);
			if (rs.next()) {
				boleto = new Boletos(rs.getInt("idBoleto"), rs.getString("Origen"), rs.getString("Destino"),
						rs.getString("Fecha"), rs.getString("Hora"), rs.getInt("Precio"), rs.getString("Pasajero"),
						rs.getInt("Asiento"));
			} else {
				boleto = null;
			}
			return boleto;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Boletos crearBoleto(String idViaje, int asiento, String pasajero) {
		Boletos boleto = null;
		try {
			// consulta Viajes para recuperar valores del origen, destino, fecha, hor y
			// precio
			ViajeController vc = new ViajeController();
			Viajes viaje = vc.getDatosViaje(idViaje);
			if (viaje.getOrigen() != null && viaje.getDestino() != null) {
				// Creo nuevo boleto en la base de datos
				sql = "INSERT INTO Boletos(idBoleto,Origen,Destino,Fecha,Hora,Precio,Pasajero,Asiento) VALUES(NULL,'"
						+ viaje.getOrigen() + "','" + viaje.getDestino() + "','" + viaje.getFecha() + "','"
						+ viaje.getHora() + "','" + viaje.getPrecio() + "','" + pasajero + "','" + asiento + "')";
				conexion.getConexion().createStatement().execute(sql);

				// consulta a bd Boletos para recuperar el boleto nuevo
				sql = "SELECT * FROM boletos WHERE Pasajero='" + pasajero + "' AND Asiento='" + asiento + "'";
				rs = conexion.getConexion().createStatement().executeQuery(sql);
				if (rs.next()) {
					boleto = new Boletos(rs.getInt("idBoleto"), rs.getString("Origen"), rs.getString("Destino"),
							rs.getString("Fecha"), rs.getString("Hora"), rs.getInt("Precio"), rs.getString("Pasajero"),
							rs.getInt("Asiento"));
				}
				// actualizacion de datos de los asientos
				AsientoController ac = new AsientoController();
				ac.ocuparAsiento(viaje.getIdViaje(), boleto.getIdBoleto(), boleto.getAsiento());
			}
			return boleto;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean modificarBoleto(int idBoleto, int asiento, String pasajero) {
		boolean bandera = false;
		try {
			sql = "SELECT * From Boletos WHERE idBoleto='" + idBoleto + "' AND Asiento='"+asiento+"'";
			rs = conexion.getConexion().createStatement().executeQuery(sql);
			if (rs.next()) {
				sql = "UPDATE Boletos SET pasajero = '" + pasajero + "' WHERE idBoleto='" + idBoleto + "' AND Asiento='"
						+ asiento + "'";
				conexion.getConexion().createStatement().execute(sql);
				bandera = true;
			} else {
				bandera = false;
			}
			return bandera;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean cancelarBoleto(int idBoleto, int asiento) {
		boolean bandera = false;
		try {
			sql = "SELECT * From Boletos WHERE idBoleto='" + idBoleto + "' AND Asiento='"+asiento+"'";
			rs = conexion.getConexion().createStatement().executeQuery(sql);
			if (rs.next()) {
				sql = "DELETE FROM Boletos WHERE idBoleto='" + idBoleto + "' AND Asiento='" + asiento + "'";
				conexion.getConexion().createStatement().execute(sql);
				// Desocupamos el asiento que tenia
				AsientoController a = new AsientoController();
				a.desocuparAsiento(idBoleto, asiento);
				bandera = true;
			} else {
				bandera = false;
			}
			return bandera;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
