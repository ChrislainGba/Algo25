package com.xl1.algo25;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class PremierCaractereUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = findFirstUnrepetableChar("bonbon du Jour");
		System.out.println(c);

	}
	
	public static char findFirstUnrepetableChar(String str) {
		
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			// Vérifier si le caractère est une lettre ou un chiffre
			if(Character.isLetterOrDigit(c)) {
				charMap.put(c, charMap.getOrDefault(c, 0)+1);
			}
		}
		/*for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
			
		}*/
		
		/*for (char c : str.toCharArray()) {
			// Vérifier si le caractère est une lettre ou un chiffre
			if(Character.isLetterOrDigit(c) && charMap.get(c) == 1) {
				return c;
			}
		}*/
		return charMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse('\0');
		//return '\0';
				

	}

}
