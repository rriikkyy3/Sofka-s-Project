package domain;

import domain.ListaAvanceCarros.Nodo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Podio {

    private Jugador jugadores[];
    private int contadorGanadores;
    private static final int MAX_GANADORES = 3;

    public Podio() {

        this.jugadores = new Jugador[Podio.MAX_GANADORES];
    }

    public void agregarGanador(Jugador jugadores) {
        if (this.contadorGanadores < Podio.MAX_GANADORES) {
            this.jugadores[this.contadorGanadores++] = jugadores;
        } else {
            System.out.println("Se ha superado el maximo de ganadores: " + Podio.MAX_GANADORES);
        }
    }

    public void Escribir(String nombreArchivo) {
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;

        try {
            f = new File(nombreArchivo);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);

            for (int i = 0; i < 3; i++) {
                System.out.println(this.jugadores[i]);
                wr.write("" + this.jugadores[i] + "\n");

            }

            wr.close();
            bw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ha sucedido un error" + e);
        }

    }

}
