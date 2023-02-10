package edu.craptocraft.tarifa;

import edu.craptocraft.carrera.Carrera;

public class Tarifa {
    private final double costeMilla = 1.35;
    private final double costeMinuto = 0.35;
    private final int costeMinimo = 5;
    private final double comision = 0.20;

    public Tarifa() {}
    public double getCosteDistancia(double distancia){
       return distancia * costeMilla;
    }
    public double getCosteTiempo(int minutos){
        return costeMinuto * minutos;
    }
    public double getCosteTotalEsperado(Carrera carrera){
        double precioDistancia = this.getCosteDistancia(carrera.getDistancia());
        double precioTiempo = this.getCosteTiempo(carrera.getTiempoEsperado());
        double precioTotal = precioDistancia + precioTiempo;
        return  precioTotal;
    }
}
