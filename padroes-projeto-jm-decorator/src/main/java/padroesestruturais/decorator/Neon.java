package padroesestruturais.decorator;

public class Neon extends CarroDecorator {

    public Neon(Carro carro) {
        super(carro);
    }

    public float getPrecoPeca() {
        return 1200;
    }

    public String getCustomPeca() {
        return "Neon";
    }
}
