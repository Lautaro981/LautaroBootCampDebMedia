import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Armeria armeria = new Armeria();

    private static Ejercito ejercito = new Ejercito(armeria);


    public static void main(String[] args) {
        cargarEjercito();
        cargarArmeria();
        ejercito.equiparEjercito(ejercito.getGuerreros(),armeria.getArmas());
        resultadoArmeria();
    }

    public static void cargarEjercito() {
        // Con ésto te ahorrabas la implementacion o el uso de clase Ejercito y haciendo lo mismo con Armas, la clase Armeria.
        List<Guerrero> guerrerosAuxi = new ArrayList<>();

        mostrarOpcionesDeGuerreros();

        Scanner scanner = new Scanner(System.in);

        String opcion = scanner.next().toLowerCase();

        while (!opcion.equals("s")) {

            switch (opcion) {
                case "a": {
                    System.out.println("Ingrese nombre de Arquero");
                    String nombre = scanner.next();
                    System.out.println("Ingrese fuerza de Arquero");
                    double fuerza = scanner.nextDouble();
                    Arquero arq = new Arquero(nombre, fuerza);
                    guerrerosAuxi.add(arq);
                    break;
                }
                case "b": {
                    System.out.println("Ingrese nombre de Berserker");
                    String nombre = scanner.next();
                    System.out.println("Ingrese fuerza de Berserker");
                    double fuerza = scanner.nextDouble();
                    Berserker berserker = new Berserker(nombre, fuerza);
                    guerrerosAuxi.add(berserker);
                    break;
                }
                case "c": {
                    System.out.println("Ingrese nombre de Mago");
                    String nombre = scanner.next();
                    System.out.println("Ingrese fuerza de Mago");
                    double fuerza = scanner.nextDouble();
                    Mago mago = new Mago(nombre, fuerza);
                    guerrerosAuxi.add(mago);
                    break;
                }
                default: {
                    System.out.println("Opcion incorrecta, las opciones validas son a,b,c o s");
                }
            }

            mostrarOpcionesDeGuerreros();
            opcion = scanner.next().toLowerCase();
        }
        // Si usabas la lista que tens sobre éste metodo te ahorras el uso de la clase.
        // Pero sirve para ver lo de metodos estaticos
        ejercito.setGuerreros(guerrerosAuxi);
    }

    public static void mostrarOpcionesDeGuerreros() {
        System.out.println("Ingrese tipo de guerrero");
        // Podes usar un solo sysout y con el \n en un String haces un salto de linea.
        System.out.println("A. Arquero");
        System.out.println("B. Berserker");
        System.out.println("C. Mago");
        System.out.println("S. Salir");
    }

    public static void cargarArmeria() {

        List<Arma> armaAuxiList = new ArrayList<>();

        mostrarOpcionesDeArmas();

        Scanner scanner = new Scanner(System.in);

        String opcion = scanner.next().toLowerCase();

        while (!opcion.equals("s")) {

            switch (opcion) {
                case "a": {
                    System.out.println("Ingrese nombre de arco");
                    String nombre = scanner.next();
                    System.out.println("Ingrese fuerza de arco");
                    double fuerza = scanner.nextDouble();
                    Arco arco = new Arco(nombre, fuerza);
                    armaAuxiList.add(arco);
                    break;
                }
                case "b": {
                    System.out.println("Ingrese nombre de espada");
                    String nombre = scanner.next();
                    System.out.println("Ingrese fuerza de espada");
                    double fuerza = scanner.nextDouble();
                    Espada espada = new Espada(nombre, fuerza);
                    armaAuxiList.add(espada);
                    break;
                }
                case "c": {
                    System.out.println("Ingrese nombre de baculo");
                    String nombre = scanner.next();
                    System.out.println("Ingrese fuerza de baculo");
                    double fuerza = scanner.nextDouble();
                    Baculo baculo = new Baculo(nombre, fuerza);
                    armaAuxiList.add(baculo);
                    break;
                }
                default: {
                    System.out.println("Opcion incorrecta, las opciones validas son a,b,c o s");
                }
            }

            mostrarOpcionesDeArmas();
            opcion = scanner.next().toLowerCase();
        }
        armeria.setArmas(armaAuxiList);
    }

    public static void mostrarOpcionesDeArmas() {
        // Mismo comentario que en Guerreros.
        System.out.println("Ingrese tipo de arma");
        System.out.println("A. Arco");
        System.out.println("B. Espada");
        System.out.println("C. Baculo");
        System.out.println("S. Salir");
    }

    public static  void resultadoArmeria(){
        // Acá seria bueno que lo loopees al ejercito.getGuerrerosDesarmados e imprimas el objeto.
        System.out.println("Los siguientes guerreros quedaron desarmados"+ejercito.getGuerrerosDesarmados());
        // Este solo estaria bien.
        System.out.println("Quedo "+armeria.getArmasSinEquipar().size() + "armas sin equipar");
    }

}
