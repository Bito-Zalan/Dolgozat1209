package hu.szamalk;

import java.util.ArrayList;

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
}
