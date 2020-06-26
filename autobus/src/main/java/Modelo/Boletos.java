package Modelo;

public class Boletos {

	private int idBoleto;
	private String origen;
	private String destino;
	private String fecha;
	private String hora;
	private int precio;
	private String pasajero;
	private int asiento;

	public Boletos() {
	}

	public Boletos(int idBoleto, String origen, String destino, String fecha, String hora, int precio, String pasajero,
			int asiento) {
		super();
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
