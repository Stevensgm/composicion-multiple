public class Llanta {
    private String marca;
    private int diametro;
    private int altura;
    private int anchura;

    public Llanta(String marca, int diametro, int altura, int anchura) {
        this.marca = marca;
        this.diametro = diametro;
        this.altura = altura;
        this.anchura = anchura;
    }

    @Override
    public String toString() {
        return "Llanta{marca='" + marca + "', diametro=" + diametro + " pulgadas, altura=" + altura + " pulgadas, anchura=" + anchura + " pulgadas}";
    }
}
