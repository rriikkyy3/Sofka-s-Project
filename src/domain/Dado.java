package domain;

import java.util.Random;

public class Dado {

    public int dadoSeis() {
        Random dado = new Random();
        int x;
        x = dado.nextInt(5) + 1;
        return x;
    }
    
    public int dadoCuatro() {
        Random dado = new Random();
        int x;
        x = dado.nextInt(3) + 1;
        return x;
    }
}
