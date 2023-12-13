package com.xl1.algo25;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class ValidationEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String emailA = "prenom.nom@contact.fr";
	     String emailB = "123prenom,nom@contact.org.fr";
	     
	     List<Integer> list = new ArrayList<>();
	     list.add(2);
	     list.add(5);
	     calculate(list);
	     System.out.println(list);
	     

	     System.out.println(validerEmail(emailA)); // true
	     System.out.println(validerEmail(emailB)); // false
	}

	private static boolean validerEmail(String email) {
		// Modèle de regex pour la validation d'une adresse e-mail
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Créer un prédicat avec le modèle de regex
        Predicate<String> predicate = Pattern.compile(regex).asPredicate();

        // Utiliser le prédicat pour tester l'e-mail
        return predicate.test(email);
	}
	
	public static void calculate(List<Integer> list) {
		list.add(67);
		list.remove(2);
		list.addAll(List.of(20,40));
		
	}

}
