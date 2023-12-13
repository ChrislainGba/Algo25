package com.xl1.algo25;

public class EuclideEtenduPGCD {
	public static void main(String[] args) {
        int a = 35;
        int b = 25;

        Triplet resultat = euclideEtendu(a, b);

        System.out.println("gcd(a, b) = " + resultat.pgcd);
        System.out.println("x = " + resultat.x);
        System.out.println("y = " + resultat.y);
    }

    static class Triplet {
        int pgcd, x, y;

        Triplet(int pgcd, int x, int y) {
            this.pgcd = pgcd;
            this.x = x;
            this.y = y;
        }
    }

    public static Triplet euclideEtendu(int a, int b) {
        if (b == 0) {
            return new Triplet(a, 1, 0);
        }

        Triplet sousResultat = euclideEtendu(b, a % b);

        int pgcd = sousResultat.pgcd;
        int x = sousResultat.y;
        int y = sousResultat.x - (a / b) * sousResultat.y;

        return new Triplet(pgcd, x, y);
    }

}
