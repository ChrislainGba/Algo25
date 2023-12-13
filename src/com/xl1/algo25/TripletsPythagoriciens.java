package com.xl1.algo25;

import java.util.ArrayList;
import java.util.List;

public class TripletsPythagoriciens {

    public static void main(String[] args) {
        int[] listeEntiers = {0, 3, 6, 1, 2, 4, 5};
        List<int[]> triplets = trouverTripletsPythagoriciens(listeEntiers);

        // Afficher les triplets
        for (int[] triplet : triplets) {
            System.out.println("(" + triplet[0] + ", " + triplet[1] + ", " + triplet[2] + ")");
        }
    }

    public static List<int[]> trouverTripletsPythagoriciens(int[] listeEntiers) {
        List<int[]> triplets = new ArrayList<>();

        // Parcourir toutes les combinaisons possibles de trois nombres dans la liste
        for (int i = 0; i < listeEntiers.length - 2; i++) {
            for (int j = i + 1; j < listeEntiers.length - 1; j++) {
                for (int k = j + 1; k < listeEntiers.length; k++) {
                    int a = listeEntiers[i];
                    int b = listeEntiers[j];
                    int c = listeEntiers[k];

                    // Vérifier si c'est un triplet pythagoricien
                    if (estTripletPythagoricien(a, b, c)) {
                        int[] triplet = {a, b, c};
                        triplets.add(triplet);
                    }
                }
            }
        }

        return triplets;
    }

    public static boolean estTripletPythagoricien(int a, int b, int c) {
        return (a * a + b * b == c * c);
    }
    
    /*public static List<int[]> trouverTripletsPythagoriciens(int[] listeEntiers) {
        List<int[]> triplets = new ArrayList<>();

        Arrays.sort(listeEntiers);

        for (int a = 0; a < listeEntiers.length - 2; a++) {
            int b = a + 1;
            int c = listeEntiers.length - 1;

            while (b < c) {
                int carreA = listeEntiers[a] * listeEntiers[a];
                int carreB = listeEntiers[b] * listeEntiers[b];
                int carreC = listeEntiers[c] * listeEntiers[c];

                if (carreA + carreB == carreC) {
                    int[] triplet = {listeEntiers[a], listeEntiers[b], listeEntiers[c]};
                    triplets.add(triplet);
                    b++;
                    c--;
                } else if (carreA + carreB < carreC) {
                    b++;
                } else {
                    c--;
                }
            }
        }

        return triplets;
    }*/
}