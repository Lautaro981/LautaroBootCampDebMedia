package Models;

public class Arma {

    private int id;
    private String nombre;
    private double poderAtaque;

    public Arma(String nombre, double poderAtaque) {
        this.nombre = nombre;
        this.poderAtaque = poderAtaque;
    }

    public double getPoderAtaque() {
        return poderAtaque;
    }

}
