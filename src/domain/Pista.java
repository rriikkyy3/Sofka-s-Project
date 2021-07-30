package domain;

public class Pista {

    private String nombrePista;
    private int longitudPista;
    
    public Pista(){
        this.setDatosPista();
    }

    public String getNombrePista() {
        return this.nombrePista;
    }

    public void setNombrePista(String nombrePista) {
        this.nombrePista = nombrePista;
    }

    public int getLongitudPista() {
        return this.longitudPista;
    }

    public void setLongitudPista(int longitudPista) {
        this.longitudPista = longitudPista;
    }
    
    

    public void setDatosPista() {  
        String nombre = "";
        int longitud = 0;
        
        Dado dado = new Dado();
        int option = dado.dadoCuatro();
        switch (option) {
            case 1:
                nombre = "Susuka";
                longitud = 1000;       
                break;
            case 2:
                nombre = "La Sarthe";
                longitud = 2000;
                break;
            case 3:
                nombre = "Laguna Seca";
                longitud = 3000;
                break;
            case 4:
                nombre = "Silverstone";
                longitud = 4000;
                break;
            default:
                throw new AssertionError();
        }
        this.setNombrePista(nombre);
        this.setLongitudPista(longitud);        
    }

    @Override
    public String toString() {
        return "<------------------->[Pista: " + nombrePista + "][longitudPista: " + longitudPista + "]";
    }

}
