package hu.szamalk;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //f1
        /*Tabla tabla = new Tabla('#');

        System.out.println("Sima tábla:");
        tabla.megjelenit();

        System.out.println("Királynőkkel:");
        tabla.elhelyez(4);
        tabla.megjelenit();*/

        //----------------------------------------------------------
        //f3
        String szoveg = "Bitó Zalán";
        HashSet<Character> halmaz = new HashSet<>();
        for (int i = 0; i < szoveg.length(); i++) {
            halmaz.add(szoveg.charAt(i));
        }
        String betuk = "gawcaCpoKAdsdalpődsa";
        for (int i = 0; i < 10; i++) {
            halmaz.add(betuk.charAt(i));
        }
        System.out.println("Név és 10 betű:");
        Kiirasok kiirasok = new Kiirasok(szoveg,betuk);
        kiirasok.nevKiIras();
        kiirasok.abcFeltolt();
        kiirasok.abcKiIras();




    }
}