package com.xl1.algo25;

public class PlusLongueSequenceCommune {
	public static void main(String[] args) {
        String motA = "ledatascientist";
        String motB = "dicodata";

        String plusLongueSequence = trouverPlusLongueSequenceCommune(motA, motB);

        System.out.println("Plus longue séquence commune : " + plusLongueSequence);
    }

    public static String trouverPlusLongueSequenceCommune(String motA, String motB) {
        int longueurA = motA.length();
        int longueurB = motB.length();

        int[][] matrice = new int[longueurA + 1][longueurB + 1];
        int longueurMax = 0;
        int finMax = 0;

        for (int i = 1; i <= longueurA; i++) {
            for (int j = 1; j <= longueurB; j++) {
                if (motA.charAt(i - 1) == motB.charAt(j - 1)) {
                    matrice[i][j] = matrice[i - 1][j - 1] + 1;

                    if (matrice[i][j] > longueurMax) {
                        longueurMax = matrice[i][j];
                        finMax = i;
                    }
                }
            }
        }

        return motA.substring(finMax - longueurMax, finMax);
    }
}
