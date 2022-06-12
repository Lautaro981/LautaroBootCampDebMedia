package models;

public abstract class Guerrero {

    private int id;

    private String nombre;
    private double fuerza;

    public Guerrero(String nombre, double fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    public double getFuerza() {
        return fuerza;
    }

    public abstract double ataqueBasico();

    // Con el setter de cada Clase que hereda de guerrero estaba resuelto éste metodo.
    public abstract void cargarArma(Arma arma, Guerrero guerrero);

    public abstract boolean estaArmado();

    public boolean matarEnemigo(Guerrero guerrero, Enemigo enemigo) {
        return guerrero.ataqueBasico() >= enemigo.getVida();
    }


}
