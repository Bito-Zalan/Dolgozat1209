package hu.szamalk;

public class Tabla {
    private char [][] T;
    private char uresCella;

    public Tabla(char uresCella) {
        T = new char[8][8];
        this.uresCella = uresCella;


        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                T[i][j] = uresCella;
            }
        }
    }

    public void megjelenit(){
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                System.out.print(T[i][j]);
            }
            System.out.println("");
        }
    }

    public void elhelyez(int N){
        char K;
        int veletlenSor  = (int)(Math.random());
        int veletlenOszlop = (int)(Math.random());
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                if (T[i][j] == '#'){
                    for (int k = 0; k < N; k++) {
                        this.uresCella = 'K';
                    }
                }
            }

        }

    }
}


