package com.xl1.algo25;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;

public class LongueurMoyenneMots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Le blog 'ledatascientist' est le blog français de référence en Data Science.";
		System.out.println(longueurMoyenne(text));

	}
	
	public static double longueurMoyenne(String str) {
		//Double moy = Arrays.stream(str.split(" ")).mapToInt(String::length).average().orElseGet(null);
		String[]mots =  Pattern.compile("\\p{Punct}").matcher(str).replaceAll("").split(" ");
		int textLength = 0;
		for (int i = 0; i < mots.length; i++) {
			textLength += mots[i].length();
			
		}
		double moyenne = (double)textLength/mots.length;
		return arrondirNombre(moyenne,2);
	}
	
	public static Double longueurMoyenne1(String str) {
		//Double moy = Arrays.stream(str.split(" ")).mapToInt(String::length).average().orElseGet(null);
		IntSummaryStatistics ss =  Arrays.stream(str.split(" ")).mapToInt(String::length).summaryStatistics();
		return Math.floor(ss.getAverage());
	}
	
	public static double arrondirNombre(double nombre, int chiffresApresVirgule) {
        double multiplicateur = Math.pow(10, chiffresApresVirgule);
        return Math.round(nombre * multiplicateur) / multiplicateur;
    }

}
