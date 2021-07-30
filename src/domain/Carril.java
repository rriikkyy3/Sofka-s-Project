package domain;

public class Carril {

    private int numCarril;

    public Carril() {
        this.numCarril = this.generarCarrilAleatorio();
    }

    public int getNumCarril() {
        return this.numCarril;
    }

    public int generarCarrilAleatorio() {
        Dado dado = new Dado();
        int valorCarril = dado.dadoCuatro();
        return valorCarril;
    }

    @Override
    public String toString() {
        return "[Carril: " + this.numCarril + "]";
    }

}
