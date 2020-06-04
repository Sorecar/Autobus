package Modelo;

public class Boleto {

    private String idBoleto;
    private String origen;
    private String destino;
    private String hora;
    private String fecha;
    private int precio;
    private String pasajero;
    private int numero;

    public Boleto() {
    }

    public Boleto(String idBoleto, String origen, String destino, String hora, String fecha, int precio, String pasajero, int numero) {
        this.idBoleto = idBoleto;
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
        this.fecha = fecha;
        this.precio = precio;
        this.pasajero = pasajero;
        this.numero = numero;
    }

    public String getIdBoleto() {
        return idBoleto;
    }

    public void setIdBoleto(String idBoleto) {
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "BoletoDAO{" + "idBoleto=" + idBoleto + ", origen=" + origen + ", destino=" + destino + ", hora=" + hora + ", fecha=" + fecha + ", precio=" + precio + ", pasajero=" + pasajero + ", numero=" + numero + '}';
    }
}
