public class CarroTest {
    public static void main(String[] args) {
        Motor motor = new Motor(2.0);
        Chasis chasis = new Chasis(TipoChasis.MONOCASCO);
        Carroceria carroceria = new Carroceria(TipoCarroceria.TUBULAR, "Rojo");
        Llanta[] llantas = {
            new Llanta("formula01", 25, 20, 15),
            new Llanta("formula01", 25, 20, 15),
            new Llanta("formula01", 25, 20, 15),
            new Llanta("formula01", 25, 20, 15)
        };
        Asiento[] asientos = {
            new Asiento("Cuero", true),
            new Asiento("Cuero", true),
            new Asiento("Cuero", true)
        };
        BolsaAire bolsaAire = new BolsaAire(true);

        Carro carro = new Carro(motor, chasis, carroceria, llantas, asientos, bolsaAire);
        System.out.println(carro);
    }
}
