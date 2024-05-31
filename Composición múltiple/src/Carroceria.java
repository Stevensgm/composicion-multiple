public enum TipoCarroceria {
    INDEPENDIENTE, AUTOPORTANTE, TUBULAR
}

public class Carroceria {
    private TipoCarroceria tipo;
    private String color;

    public Carroceria(TipoCarroceria tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carroceria{tipo=" + tipo + ", color='" + color + "'}";
    }
}
