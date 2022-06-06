package Models;

public class Mago extends Guerrero {
    private Baculo baculo;

    public Mago(String nombre, double fuerza) {
        super(nombre, fuerza);
    }

    @Override
    public double ataqueBasico() {
        return 0;
    }

    public double ataqueMagico() {
        return getFuerza()*baculo.getPoderAtaque();
    }

    @Override
    public void cargarArma(Arma arma, Guerrero guerrero) {
        if (guerrero.getClass().equals(Mago.class) && (arma.getClass().equals(Baculo.class))) {
            this.baculo = (Baculo) arma;
        } else System.out.println("Soy Mago y solo uso Baculo");
    }

    @Override
    public boolean estaArmado() {
        return baculo!=null;
    }
}
