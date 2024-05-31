public enum TipoChasis {
    INDEPENDIENTE, MONOCASCO
}

public class Chasis {
    private TipoChasis tipo;

    public Chasis(TipoChasis tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Chasis{tipo=" + tipo + "}";
    }
}
