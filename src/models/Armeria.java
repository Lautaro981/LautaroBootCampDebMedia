package models;

import java.util.List;

public class Armeria {
    private int cantArmasNoUsadas;

    private List<Arma> armasSinEquipar;
    private List<Arma> armas;

    private Ejercito ejercito;

    public int getCantArmasNoUsadas() {
        return cantArmasNoUsadas;
    }

    public void setCantArmasNoUsadas(int cantArmasNoUsadas) {
        this.cantArmasNoUsadas = cantArmasNoUsadas;
    }


    public List<Arma> getArmasSinEquipar() {
        return armasSinEquipar;
    }

    public void setArmasSinEquipar(List<Arma> armasSinEquipar) {
        this.armasSinEquipar = armasSinEquipar;
    }

    public List<Arma> getArmas() {
        return armas;
    }

    public void setArmas(List<Arma> armas) {
        this.armas = armas;
    }

    public Ejercito getEjercito() {
        return ejercito;
    }

    public void setEjercito(Ejercito ejercito) {
        this.ejercito = ejercito;
    }
}
