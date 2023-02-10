package edu.craptocraft.carrera;

import edu.craptocraft.conductores.Conductor;
import edu.craptocraft.conductores.PoolConductores;
import edu.craptocraft.tarifa.Tarifa;

public class Carrera {
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0d;
    private final String tarjetaCredito;
    private double distancia = 0d;

    private String origen;
    private String destino;
    private Tarifa tarifa = new Tarifa();

    private int propina = 0;

    private Conductor conductorAsignado;

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
    public int getTiempoEsperado(){
        return this.tiempoEsperado;
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
    public double getCosteEsperado(Carrera this){
        return this.tarifa.getCosteTotalEsperado(this);
    }

    public Conductor getConductor() {
        return this.conductorAsignado;
    }
    public void asignarConductor(PoolConductores conductores){
        conductorAsignado =  conductores.asignarConductor();
    }

    public int getPropina() {
        return propina;
    }

    public void recibirPropina(int propina) {
        this.propina = propina;
    }

    public void realizarPago(double pago){
        costeTotal = pago;
    }

    public void liberarConductor(){
        this.conductorAsignado.setOcupado(false);
    }

    public double getCosteTotal(){
        return tarifa.getCosteTotalEsperado(this);
    }
}
