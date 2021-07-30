package domain;

public class Carro {

    private String nombreCarro;
    private Carril carril;

    public Carro(String nombreCarro) {
        this.nombreCarro = nombreCarro;
        this.carril = new Carril();
    }

    public String getNombreCarro() {
        return this.nombreCarro;
    }

    public void setNombreCarro(String nombreCarro) {
        this.nombreCarro = nombreCarro;
    }

    public Carril getCarril() {
        return this.carril;
    }

    public void setCarril(Carril carril) {
        this.carril = carril;
    }

    @Override
    public String toString() {
        return "[Carro: " + nombreCarro + "]" + carril + "";
    }

}
