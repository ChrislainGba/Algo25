package com.xl1.algo25;

public class InverseNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 908;
		System.out.println(inverse(n));
		
		

	}
	public static int inverse(int reelNb) {
		if(reelNb==0) return 0;
		int nbIserser = 0;
		int nb = Math.abs(reelNb);
		while (nb!=0) {
			int chiffre = nb%10;
			nbIserser = nbIserser *10 + chiffre;
			nb = nb/10;
			
		}
		return reelNb>0? nbIserser:Math.abs(nbIserser);
		
	}
	
	//reverse String tringBuilder(str).reverse().toString();

}
