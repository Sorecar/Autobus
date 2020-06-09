package Modelo;

public class Asiento {

    private int idAsiento;
    private String idViaje;
    private int estatus;

    public Asiento() {
    }
    
	public Asiento(int idAsiento, String idViaje, int estatus) {
		this.idAsiento = idAsiento;
		this.idViaje = idViaje;
		this.estatus = estatus;
	}

	public int getIdAsiento() {
		return idAsiento;
	}

	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}

	public String getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(String idViaje) {
		this.idViaje = idViaje;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
    
}
