package Modelo;

public class Asiento {

    private String pasajero;
    private int numAsiento;

    public Asiento() {
    }

    public Asiento(String pasajero, int numAsiento) {
        this.pasajero = pasajero;
        this.numAsiento = numAsiento;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    @Override
    public String toString() {
        return "AsientoDAO{" + "pasajero=" + pasajero + ", numAsiento=" + numAsiento + '}';
    }
}
