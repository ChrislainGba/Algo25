package com.xl1.algo25;

public class ConversionBits {

	public static void main(String[] args) {
        int n = 8;  // Exemple : représentation binaire 1010
        int m = 6;  // Exemple : représentation binaire 1111

        int nombreBits = countBitsToConvert(n, m);

        System.out.println("Nombre de bits à changer pour convertir " + n + " en " + m + " : " + nombreBits);
    }

	private static int countBitsToConvert(int n, int m) {
		// Effectuer une opération XOR entre n et m
        int xorResult = n ^ m;
        System.out.println(xorResult);

        // Convertir le résultat XOR en binaire
        String xorBinary = Integer.toBinaryString(xorResult);
        System.out.println(xorBinary);
        // Compter le nombre de bits à 1 dans la représentation binaire
        int count = 0;
        for (char bit : xorBinary.toCharArray()) {
            if (bit == '1') {
                count++;
            }
        }

        return count;
	}

}
