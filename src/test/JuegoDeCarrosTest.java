package test;

import domain.*;

public class JuegoDeCarrosTest {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Ferrari");
        Carro carro2 = new Carro("Ford");
        Carro carro3 = new Carro("Renault");
        Carro carro4 = new Carro("Toyota");

        Conductor conductor1 = new Conductor(carro1);
        Conductor conductor2 = new Conductor(carro2);
        Conductor conductor3 = new Conductor(carro3);
        Conductor conductor4 = new Conductor(carro4);

        Jugador jugador1 = new Jugador("Juan", conductor1);
        Jugador jugador2 = new Jugador("David", conductor2);
        Jugador jugador3 = new Jugador("Daniel", conductor3);
        Jugador jugador4 = new Jugador("Ricardo", conductor4);
        
        ListaAvanceCarros lista = new ListaAvanceCarros();
        lista.insert(jugador1);
        lista.insert(jugador2);
        lista.insert(jugador3);
        lista.insert(jugador4);

        lista.show();
        lista.menu();

    }
}
