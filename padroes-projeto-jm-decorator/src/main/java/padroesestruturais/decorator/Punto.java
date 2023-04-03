package padroesestruturais.decorator;

public class Punto implements Carro {

    public float preco;

    public Punto() {
    }

    public Punto(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getCustom() {
        return "Punto";
    }

}
