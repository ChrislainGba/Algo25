package com.xl1.algo25;

import java.util.Arrays;

public class CalculMedian {

    public static void main(String[] args) {
        // Exemple d'un ensemble de valeurs
        double[] ensemble = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};

        double mediane = calculerMediane(ensemble);

        System.out.println("La médiane est : " + mediane);
    }

    public static double calculerMediane(double[] ensemble) {
        // Trier l'ensemble
        Arrays.sort(ensemble);

        int n = ensemble.length;

        if (n % 2 == 0) {
            // Si le nombre d'éléments est pair, utiliser la formule avec deux éléments du milieu
            double valeur1 = ensemble[n / 2 - 1];
            double valeur2 = ensemble[n / 2];
            return (valeur1 + valeur2) / 2;
        } else {
            // Si le nombre d'éléments est impair, utiliser la valeur du milieu
        	System.out.println(ensemble);
        	for (int i = 0; i < ensemble.length; i++) {
				System.out.println(ensemble[i]);
				
			}
            return ensemble[n / 2];
        }
    }
}