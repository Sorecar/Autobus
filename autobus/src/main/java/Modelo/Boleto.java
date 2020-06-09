package Modelo;

public class Boleto {

	private int idBoleto;
	private String origen;
	private String destino;
	private String hora;
	private String fecha;
	private int precio;
	private String pasajero;
	private int asiento;

	public Boleto() {
	}

	public Boleto(int idBoleto, String origen, String destino, String hora, String fecha, int precio, String pasajero,
			int asiento) {
		this.idBoleto = idBoleto;
		this.origen = origen;
		this.destino = destino;
		this.hora = hora;
		this.fecha = fecha;
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

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
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

	@Override
	public String toString() {
		return "BoletoDAO{" + "idBoleto=" + idBoleto + ", origen=" + origen + ", destino=" + destino + ", hora=" + hora
				+ ", fecha=" + fecha + ", precio=" + precio + ", pasajero=" + pasajero + ", numero=" + asiento + '}';
	}
}
