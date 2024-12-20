package hu.szamalk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Kiirasok {
    private Character[] nev;
    private Character[] abc;
    private ArrayList<Character> lista;
    private String szoveg;
    private String betuk;
    private int hossz;

    public Kiirasok(String szoveg,String betuk) {
        this.szoveg = szoveg;
        this.betuk = betuk;
        hossz = szoveg.length();
        nev = new Character[hossz];
        abc = new Character[10];
        lista = new ArrayList<>();
        for (int i = 0; i < hossz; i++) {
            nev[i] = szoveg.charAt(i);
            this.lista.add(szoveg.charAt(i));
        }

        for (int i = 0; i < 10; i++) {
            abc[i] = betuk.charAt(i);
            this.lista.add(betuk.charAt(i));
        }

    }

    public void nevKiIras(){
        String kimenet = "";
        for (int i = 0; i < hossz; i++) {
            if (i != hossz-1){
                kimenet += nev[i] + ",";
            }else{
                kimenet += nev[i];
            }
        }
        System.out.println(kimenet);
    }

    public void abcFeltolt() {
        /*String kimenet = "";
        for (int i = 0; i < abc.length; i++) {
            int elem = abc[i];
            int betu = (int) Math.random() * 10;
            boolean kivalasztott = false;
            if (abc[i] == betu) {
                kivalasztott = true;
            }

        }*/
        HashSet<Character> kivalasztottBetuk = new HashSet<>(); // HashSet az egyedi betűk tárolásához
        Random veletlen = new Random(); // Véletlenszerű szám generálásához

        // Véletlenszerűen választunk 10 betűt a 'betuk' karakterláncból
        while (kivalasztottBetuk.size() < 10) {
            int index = veletlen.nextInt(betuk.length()); // Véletlenszerű index választása
            char veletlenBetu = betuk.charAt(index); // A választott betű
            kivalasztottBetuk.add(veletlenBetu); // Hozzáadjuk a HashSet-hez, hogy ne legyenek duplikáltak
        }

        // Az egyedi betűket átmásoljuk az abc tömbbe
        int i = 0;
        for (Character betu : kivalasztottBetuk) {
            abc[i++] = betu; // Betűk hozzáadása az abc tömbhöz
        }
    }

    public void abcKiIras(){
        String kimenet = "";
        for (int i = 0; i < 10; i++) {
            if (i != hossz-1){
                kimenet += abc[i] + ",";
            }else{
                kimenet += abc[i];
            }
        }
        System.out.println(kimenet);
    }

    public void felhasznalt(){

    }
}
