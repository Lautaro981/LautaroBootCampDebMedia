package Models;

public class Arquero extends  Guerrero {
    private Arco arco;

    public Arquero(String nombre, double fuerza) {
        super(nombre, fuerza);
    }

    @Override
    public double ataqueBasico() {
        return getFuerza()*arco.getPoderAtaque();
    }

    @Override
    public void cargarArma(Arma arma, Guerrero guerrero) {
        if (guerrero.getClass().equals(Arquero.class) && (arma.getClass().equals(Arco.class))) {
            this.arco = (Arco) arma;
        } else {
            System.out.println("Soy Arquero y solo uso Arco");

        }
    }

    @Override
    public boolean estaArmado() {
        return arco!=null;
    }
}
