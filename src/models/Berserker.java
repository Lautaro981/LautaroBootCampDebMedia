package Models;

public class Berserker extends Guerrero {
    private Espada espada;

    public Berserker(String nombre, double fuerza) {
        super(nombre, fuerza);
    }

    @Override
    public double ataqueBasico() {
        return getFuerza()*espada.getPoderAtaque();
    }


    @Override
    public void cargarArma(Arma arma, Guerrero guerrero) {
        if (guerrero.getClass().equals(Berserker.class) && (arma.getClass().equals(Espada.class))) {
            this.espada = (Espada) arma;
        }else {System.out.println("Soy Berserker y solo uso Espada");

        }
    }

    @Override
    public boolean estaArmado() {
        return espada!=null;
    }
}
