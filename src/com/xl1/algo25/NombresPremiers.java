package com.xl1.algo25;

import java.util.ArrayList;
import java.util.List;

public class NombresPremiers {
	//Un nombre entier naturel (supérieur ou égal à 2) est un nombre premier s'il admet exactement 2 diviseurs : 1 et lui-même. Exemple : 2, 3, 5, 7, 11, 13, 17, 19 … sont des nombres premiers.
	public static void main(String[] args) {
        int limite = 30; // Vous pouvez ajuster cette limite selon vos besoins
        List<Integer> nombresPremiers = trouverNombresPremiers(limite);

        System.out.println("Nombres premiers jusqu'à " + limite + " : " + nombresPremiers);
    }

	private static List<Integer> trouverNombresPremiers(int limite) {
		List<Integer> nombresPremiers = new ArrayList<>();
		for (int i = 2; i < limite; i++) {
            if (estNombrePremier(i)) {
                nombresPremiers.add(i);
            }
        }

        return nombresPremiers;
	}

	private static boolean estNombrePremier(int nombre) {
		// TODO Auto-generated method stub
		if (nombre <= 1) {
            return false;
        }
		for (int i = 2; i <= Math.sqrt(nombre); i++) {
			System.out.println(Math.sqrt(nombre));
            if (nombre % i == 0) {
                return false;
            }
        }

        return true;
	}

}
