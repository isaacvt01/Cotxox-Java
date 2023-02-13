package edu.craptocraft.tarifaTest;

import edu.craptocraft.carrera.Carrera;
import edu.craptocraft.tarifa.Tarifa;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TarifaTest {

    static Carrera carrera;
    static Tarifa tarifa;
    @BeforeClass
    public static void inicializar(){
        carrera = new Carrera("4343567809123456");
        carrera.setDestino("Palma");
        carrera.setOrigen("Magaluf");
        carrera.setDistancia(45.0);
        carrera.setTiempoEsperado(30);
        tarifa = new Tarifa();
    }

    @Test
    public void calcularCoste(){
        //La distancia se debe multiplicar por 1.35 y el tiempo por 0.35
        Assert.assertEquals(71.25, tarifa.getCosteTotalEsperado(carrera), 0);

    }
}
