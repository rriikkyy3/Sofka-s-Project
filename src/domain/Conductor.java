package domain;

public class Conductor {

    private Carro carro;

    public Conductor(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return this.carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "" + carro;
    }

}
