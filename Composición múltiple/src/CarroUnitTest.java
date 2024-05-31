import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarroUnitTest {
    @Test
    public void testMotor() {
        Motor motor = new Motor(2.0);
        assertEquals("Motor{volumen=2.0 litros}", motor.toString());
    }

    @Test
    public void testChasis() {
        Chasis chasis = new Chasis(TipoChasis.MONOCASCO);
        assertEquals("Chasis{tipo=MONOCASCO}", chasis.toString());
    }

    @Test
    public void testCarroceria() {
        Carroceria carroceria = new Carroceria(TipoCarroceria.TUBULAR, "Rojo");
        assertEquals("Carroceria{tipo=TUBULAR, color='Rojo'}", carroceria.toString());
    }

    @Test
    public void testLlanta() {
        Llanta llanta = new Llanta("Goodyear", 25, 20, 15);
        assertEquals("Llanta{marca='Goodyear', diametro=25 pulgadas, altura=20 pulgadas, anchura=15 pulgadas}", llanta.toString());
    }

    @Test
    public void testAsiento() {
        Asiento asiento = new Asiento("Cuero", true);
        assertEquals("Asiento{material='Cuero', tieneFunda=true}", asiento.toString());
    }

    @Test
    public void testBolsaAire() {
        BolsaAire bolsaAire = new BolsaAire(true);
        assertEquals("BolsaAire{presente=true}", bolsaAire.toString());
    }

    @Test
    public void testCarro() {
        Motor motor = new Motor(2.0);
        Chasis chasis = new Chasis(TipoChasis.MONOCASCO);
        Carroceria carroceria = new Carroceria(TipoCarroceria.TUBULAR, "Rojo");
        Llanta[] llantas = {
            new Llanta("Goodyear", 25, 20, 15),
            new Llanta("Goodyear", 25, 20, 15),
            new Llanta("Goodyear", 25, 20, 15),
            new Llanta("Goodyear", 25, 20, 15)
        };
        Asiento[] asientos = {
            new Asiento("Cuero", true),
            new Asiento("Cuero", true),
            new Asiento("Cuero", true)
        };
        BolsaAire bolsaAire = new BolsaAire(true);

        Carro carro = new Carro(motor, chasis, carroceria, llantas, asientos, bolsaAire);
        String expected = "Motor{volumen=2.0 litros}\n" +
                          "Chasis{tipo=MONOCASCO}\n" +
                          "Carroceria{tipo=TUBULAR, color='Rojo'}\n" +
                          "Llanta{marca='Goodyear', diametro=25 pulgadas, altura=20 pulgadas, anchura=15 pulgadas}\n" +
                          "Llanta{marca='Goodyear', diametro=25 pulgadas, altura=20 pulgadas, anchura=15 pulgadas}\n" +
                          "Llanta{marca='Goodyear', diametro=25 pulgadas, altura=20 pulgadas, anchura=15 pulgadas}\n" +
                          "Llanta{marca='Goodyear', diametro=25 pulgadas, altura=20 pulgadas, anchura=15 pulgadas}\n" +
                          "Asiento{material='Cuero', tieneFunda=true}\n" +
                          "Asiento{material='Cuero', tieneFunda=true}\n" +
                          "Asiento{material='Cuero', tieneFunda=true}\n" +
                          "BolsaAire{presente=true}\n";
        assertEquals(expected, carro.toString());
    }
}
