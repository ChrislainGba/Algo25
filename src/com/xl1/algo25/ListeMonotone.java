package com.xl1.algo25;

public class ListeMonotone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] liste1 = {1, 2, 3, 4, 5};
	        int[] liste2 = {5, 4, 3, 2, 1};
	        int[] liste3 = {1, 2, 3, 2, 4};

	        System.out.println("Liste 1 est monotone : " + estMonotone(liste1));
	        System.out.println("Liste 2 est monotone : " + estMonotone(liste2));
	        System.out.println("Liste 3 est monotone : " + estMonotone(liste3));

	}

	private static boolean estMonotone(int[] liste) {
		// TODO Auto-generated method stub
		boolean croissant = true;
		boolean decroissant = true;
		for (int i = 0; i < liste.length-1; i++) {
			if (liste[i] > liste[i+1]) {
				croissant = false;
			}
			if (liste[i] < liste[i+1]) {
				decroissant = false;
			}
		}
		return croissant || decroissant;
	}

}
