package hu.szamalk;

import java.util.ArrayList;

public class Kiirasok {
    private Character[] nev;
    private ArrayList<Character> lista;
    private String szoveg;
    private int hossz;

    public Kiirasok(String szoveg) {
        this.szoveg = szoveg;
        hossz = szoveg.length();
        nev = new Character[hossz];
        lista = new ArrayList<>();
        for (int i = 0; i < hossz; i++) {
            nev[i] = szoveg.charAt(i);
            this.lista.add(szoveg.charAt(i));
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
}
