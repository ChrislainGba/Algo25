package com.xl1.algo25;

import java.util.Arrays;

public class TriABulle {

	public static void main(String[] args) {
        // Exemple d'une liste de nombres à trier
        int[] liste = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Liste avant le tri : " + Arrays.toString(liste));

        triABulleCroissante(liste);

        System.out.println("Liste après le tri croissant : " + Arrays.toString(liste));

        // Réinitialiser la liste pour le tri décroissant
        liste = new int[]{64, 34, 25, 12, 22, 11, 90};

        triABulleDecroissante(liste);

        System.out.println("Liste après le tri décroissant : " + Arrays.toString(liste));
    }

    public static void triABulleCroissante(int[] liste) {
        int longueur = liste.length;

        for (int i = 0; i < longueur - 1; i++) {
            for (int j = 0; j < longueur - i - 1; j++) {
                if (liste[j] > liste[j + 1]) {
                    // Échanger les éléments si ils sont dans le mauvais ordre
                    int temp = liste[j];
                    liste[j] = liste[j + 1];
                    liste[j + 1] = temp;
                }
            }
        }
    }

    public static void triABulleDecroissante(int[] liste) {
        int longueur = liste.length;
        Arrays.sort(null);

        for (int i = 0; i < longueur - 1; i++) {
            for (int j = 0; j < longueur - i - 1; j++) {
                if (liste[j] < liste[j + 1]) {
                    // Échanger les éléments si ils sont dans le mauvais ordre
                    int temp = liste[j];
                    liste[j] = liste[j + 1];
                    liste[j + 1] = temp;
                }
            }
        }
    }
    
    
}
