public class Motor {
    private double volumen;

    public Motor(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Motor{volumen=" + volumen + " litros}";
    }
}
