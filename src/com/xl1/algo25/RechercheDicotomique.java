package com.xl1.algo25;

import java.util.Arrays;

public class RechercheDicotomique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints = {1,4,3,6,10,7};
		int k = 7;
		int index = binarySearch(ints,k);
		if(index >= 0) {
			System.out.println("L'élément " + k + " a été trouvé à l'indice : " + index);
        } else {
            System.out.println("L'élément " + k + " n'a pas été trouvé dans la liste.");
        }

	}

	private static int binarySearch(int[] listeTriee, int elementRecherche) {
        
		Arrays.sort(listeTriee);
		int debut = 0;
        int fin = listeTriee.length - 1;

        while (debut <= fin) {
            int milieu = debut + (fin - debut) / 2;

            if (listeTriee[milieu] == elementRecherche) {
                return milieu; // Element trouvé, retourne l'indice
            }

            if (listeTriee[milieu] < elementRecherche) {
                debut = milieu + 1; // Recherche dans la partie droite
            } else {
                fin = milieu - 1; // Recherche dans la partie gauche
            }
        }

        return -1; // Élément non trouvé
    }
}
