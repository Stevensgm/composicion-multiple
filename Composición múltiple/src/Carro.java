public class Carro {
    private Motor motor;
    private Chasis chasis;
    private Carroceria carroceria;
    private Llanta[] llantas;
    private Asiento[] asientos;
    private BolsaAire bolsaAire;

    public Carro(Motor motor, Chasis chasis, Carroceria carroceria, Llanta[] llantas, Asiento[] asientos, BolsaAire bolsaAire) {
        this.motor = motor;
        this.chasis = chasis;
        this.carroceria = carroceria;
        this.llantas = llantas;
        this.asientos = asientos;
        this.bolsaAire = bolsaAire;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(motor).append("\n")
          .append(chasis).append("\n")
          .append(carroceria).append("\n");
        for (Llanta llanta : llantas) {
            sb.append(llanta).append("\n");
        }
        for (Asiento asiento : asientos) {
            sb.append(asiento).append("\n");
        }
        sb.append(bolsaAire).append("\n");
        return sb.toString();
    }
}
