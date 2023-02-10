package edu.craptocraft.carreraTest;

import edu.craptocraft.carrera.Carrera;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarreraTest {
    static Carrera carrera;
    @BeforeClass
    public static void inicializar(){
        carrera = new Carrera("4343567809123456");
    }
    @Test
    public void constructorTest(){
        String resultado = carrera.getTarjetaCredito();
        String esperado = "4343567809123456";
        assertEquals(esperado, resultado);
    }
    @Test
    public void gettersSettersTest(){
        carrera.setDestino("Palma");
        carrera.setOrigen("Magaluf");
        String esperado = "Palma";
        String OrigenEsperado = "Magaluf";
        assertEquals(esperado, carrera.getDestino());
        assertEquals(OrigenEsperado, carrera.getOrigen());
    }
}
