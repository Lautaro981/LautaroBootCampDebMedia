package models;

import java.util.ArrayList;
import java.util.List;

public class Ejercito {
    private List<Guerrero> guerreros;
    private List<Guerrero> guerrerosDesarmados;

    private Armeria armeria;

    public Ejercito(Armeria armeria) {
        this.armeria = armeria;
    }

    public void setGuerreros(List<Guerrero> guerreros) {
        this.guerreros = guerreros;
    }

    public void setGuerrerosDesarmados(List<Guerrero> guerrerosDesarmados) {
        this.guerrerosDesarmados = guerrerosDesarmados;
    }

    public List<Guerrero> getGuerreros() {
        return guerreros;
    }

    public List<Guerrero> getGuerrerosDesarmados() {
        return guerrerosDesarmados;
    }

    public void equiparEjercito(List<Guerrero> guerreroList, List<Arma> armaList) {
        List<Arma> armaAuxiList = new ArrayList<>();
        List<Guerrero> guerrerosDesarmadosAuxi = new ArrayList<>();
        armaAuxiList.addAll(armaList);
        guerreroList.forEach(guerrero -> {
            for (Arma arma : armaAuxiList) {
                guerrero.cargarArma(arma, guerrero);
                if (guerrero.estaArmado()) {
                    armaAuxiList.remove(arma);
                    break;
                }
            }
            if (!guerrero.estaArmado()) guerrerosDesarmadosAuxi.add(guerrero);
        });
        armeria.setArmasSinEquipar(armaAuxiList);
        setGuerrerosDesarmados(guerrerosDesarmadosAuxi);
    }
}


