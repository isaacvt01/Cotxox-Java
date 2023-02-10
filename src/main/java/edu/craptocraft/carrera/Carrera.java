package edu.craptocraft.carrera;

public class Carrera {
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0d;
    private final String tarjetaCredito;
    private double distancia = 0d;

    private String origen;
    private String destino;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }
    public String getOrigen(){
        return this.origen;
    }
    public void setOrigen(String origen){
        this.origen = origen;
    }

    public void setDistancia(double distancia){
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return this.destino;
    }

    public double getDistancia() {
        return this.distancia;
    }
}
