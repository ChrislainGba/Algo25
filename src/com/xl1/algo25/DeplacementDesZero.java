package com.xl1.algo25;

import java.util.ArrayList;
import java.util.List;

public class DeplacementDesZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> liste = new ArrayList<>();
        liste.add(0);
        liste.add(5);
        liste.add(0);
        liste.add(8);
        liste.add(0);
        liste.add(2);
        liste.add(0);
        liste.add(7);

        deplacerZerosALaFin(liste);
        System.out.println("Liste après déplacement des zéros : " + liste);

	}

	private static void deplacerZerosALaFin(List<Integer> liste) {
		// TODO Auto-generated method stub
		System.out.println(liste);
		List<Integer> listZero = new ArrayList<>();
		for (int i = 0; i < liste.size(); i++) {
			//liste.removeIf(x -> x.equals(0));
			if(liste.get(i) == 0) {
				liste.remove(liste.get(i));
				listZero.add(0);
			}
		}
		liste.addAll(listZero);
		System.out.println(liste);
		
		
	}

}
