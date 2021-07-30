package domain;

import java.util.Scanner;

public class ListaAvanceCarros {

    private Nodo head;
    private static Pista pista;
    private static int avanceCarros = 100;

    public class Nodo {

        private Jugador jugador;
        private int avance;
        Nodo next;

        public Jugador getJugador() {
            return this.jugador;
        }

        public void setJugador(Jugador jugador) {
            this.jugador = jugador;
        }

        public int getAvance() {
            return this.avance;
        }

        public void setAvance(int avance) {
            this.avance = avance;
        }

        public Nodo getNext() {
            return this.next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }

        @Override
        public String toString() {
            //return jugador + "" + pista;
            //return "" + jugador + "[Avance: " + this.avance + "]";
//            Dado dado = new Dado();
//            int avance;
//            avance = ListaAvanceCarros.avanceCarros * dado.dadoSeis();
            return "" + jugador + "[Avance: " + avance + "]";

        }
    }

    public Nodo getHead() {
        return this.head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public void insert(Jugador jugador) {
        Nodo nodo = new Nodo();
        nodo.setJugador(jugador);

        nodo.next = null;

        if (this.getHead() == null) {
            this.setHead(nodo);
        } else {
            Nodo n = this.getHead();
            while (n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(nodo);
        }
    }

    public void show() {
        Nodo n = this.getHead();

        while (n != null) {
            System.out.println(n);
            n = n.getNext();
        }
    }

    public void menu() {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        Pista pista = new Pista();
        pista.setDatosPista();
        Podio podio = new Podio();

        do {
            System.out.println(pista.getNombrePista());
            System.out.println(pista.getLongitudPista());
            Nodo n = this.getHead();
            System.out.println("1: Avanzar\n2: Resultado\n0: Salir");
            System.out.println("Ingrese opcion: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:

                    while (n != null) {
                        int bandera = 0;
                        Dado dado = new Dado();
                        int rand = dado.dadoSeis();
                        System.out.println("rand: " + rand);

                        n.setAvance(n.getAvance() + (100 * rand));

                        if (n.getAvance() >= pista.getLongitudPista() && bandera == 0) {
                            podio.agregarGanador(n.getJugador());
                            System.out.println("Ganador agregado");
                            bandera = 1;
                        }

                        n = n.getNext();
                    }

                    this.show();
                    break;

                case 2:
                    podio.Escribir("PODIO.txt");
                    break;

            }
        } while (option != 0);
    }

}
