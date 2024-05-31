public class Asiento {
    private String material;
    private boolean tieneFunda;

    public Asiento(String material, boolean tieneFunda) {
        this.material = material;
        this.tieneFunda = tieneFunda;
    }

    @Override
    public String toString() {
        return "Asiento{material='" + material + "', tieneFunda=" + tieneFunda + "}";
    }
}
