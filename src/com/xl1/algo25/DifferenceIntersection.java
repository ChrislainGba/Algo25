package com.xl1.algo25;

import java.util.HashSet;
import java.util.Set;

public class DifferenceIntersection {
	public static void main(String[] args) {
        String texte1 = "Le chat est sur le toit";
        String texte2 = "Le chien est dans la cour";

        Set<String> motsTexte1 = extraireMots(texte1);
        Set<String> motsTexte2 = extraireMots(texte2);

        // Différence : mots présents dans texte1 et pas dans texte2
        Set<String> difference = new HashSet<>(motsTexte1);
        difference.removeAll(motsTexte2);

        // Intersection : mots présents dans les deux textes
        Set<String> intersection = new HashSet<>(motsTexte1);
        intersection.retainAll(motsTexte2);

        // Afficher les résultats
        System.out.println("Différence : " + difference);
        System.out.println("Intersection : " + intersection);
    }

    public static Set<String> extraireMots(String texte) {
        // Utiliser une expression régulière pour extraire les mots du texte
        String[] mots = texte.split("\\s+"); // Diviser le texte en mots en utilisant des espaces comme séparateurs
        // Ajouter les mots à un ensemble pour éliminer les doublons
        return new HashSet<>(Set.of(mots));
    }
}
