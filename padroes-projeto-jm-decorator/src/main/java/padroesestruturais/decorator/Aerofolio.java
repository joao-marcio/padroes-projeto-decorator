package padroesestruturais.decorator;

public class Aerofolio extends CarroDecorator {

    public Aerofolio(Carro carro) {
        super(carro);
    }

    public float getPrecoPeca() {
        return 800;
    }

    public String getCustomPeca() {
        return "Aerofolio";
    }
}
