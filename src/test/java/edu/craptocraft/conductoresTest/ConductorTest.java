package edu.craptocraft.conductoresTest;

import edu.craptocraft.conductores.Conductor;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConductorTest {
    static Conductor conductor;
    @BeforeClass
    public static void inicializar(){
        conductor = new Conductor("Antonia");
        conductor.setMatricula("XXX9999");
        conductor.setValoracion((byte) 4);
        conductor.setOcupado(true);
        conductor.setModelo("Tesla Model X");
    }
    @Test
    public void constructorTest(){
        Assert.assertEquals("Antonia", conductor.getNombre());
    }
    @Test
    public void gettersTest(){
        Assert.assertEquals("XXX9999", conductor.getMatricula());
        Assert.assertEquals(4.00, conductor.getValoracion(), 0);
        Assert.assertTrue(conductor.isOcupado());
        Assert.assertEquals("Tesla Model X", conductor.getModelo());

    }
    @Test
    public void valoracionMedia(){
        conductor.setValoracion((byte) 5);
        Assert.assertEquals(4.50, conductor.getValoracion(), 0);
    }
}
