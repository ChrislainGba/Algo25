package com.xl1.algo25;

public class PGCDExample {
	public static void main(String[] args) {
        int nombre1 = 48;
        int nombre2 = 18;

        int pgcd = calculerPGCD(nombre1, nombre2);

        System.out.println("Le PGCD de " + nombre1 + " et " + nombre2 + " est : " + pgcd);
    }

    // Fonction pour calculer le PGCD de deux nombres
    public static int calculerPGCD(int a, int b) {
        // L'algorithme d'Euclide
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
