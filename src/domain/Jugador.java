package domain;

public class Jugador {

    private String nombreJugador;
    private Conductor conductor;

    public Jugador(String nombreJugador){
        this.nombreJugador = nombreJugador;
    }
    
    public Jugador(String nombreJugador, Conductor conductor) {
        this.nombreJugador = nombreJugador;
        this.conductor = conductor;
    }

    public String getNombreJugador() {
        return this.nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Conductor getJugador() {
        return this.conductor;
    }

    public void setJugador(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "[Jugador: " + nombreJugador + "]" + conductor + "";
    }

}
