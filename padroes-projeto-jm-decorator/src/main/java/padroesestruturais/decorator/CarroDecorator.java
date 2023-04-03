package padroesestruturais.decorator;

public abstract class CarroDecorator implements Carro {

    private Carro carro;
    public String custom;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public abstract float getPrecoPeca();

    public float getPreco() {
        return this.carro.getPreco() + (this.getPrecoPeca() );
    }

    public abstract String getCustomPeca();

    public String getCustom() {
        return this.carro.getCustom() + "/" + (this.getCustomPeca() );
    }
}


