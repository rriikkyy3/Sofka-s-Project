package domain;

public class Juego {

    private final int idJuego;
    private static int contadorJuegos;
    //private static final int MAX_JUGADORES = 4;
    private Jugador jugador;
    private Pista pista;

    private Juego() {
        this.idJuego = ++Juego.contadorJuegos;
    }

    public Juego(Jugador jugador, Pista pista) {
        this();
        this.jugador = jugador;
        this.pista = pista;
    }

    public int getIdJuego() {
        return this.idJuego;
    }

    public static int getContadorJuegos() {
        return Juego.contadorJuegos;
    }

    public Jugador getJugador() {
        return this.jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Pista getPista() {
        return this.pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    @Override
    public String toString() {
        return "Juego{" + "idJuego=" + idJuego + ", jugador=" + jugador + ", pista=" + pista + '}';
    }

}
