package hu.szamalk;

public class Main {
    public static void main(String[] args) {

        Tabla tabla = new Tabla('#');

        System.out.println("Sima tábla:");
        tabla.megjelenit();

        System.out.println("Királynőkkel:");
        tabla.elhelyez(4);
        tabla.megjelenit();
    }
}