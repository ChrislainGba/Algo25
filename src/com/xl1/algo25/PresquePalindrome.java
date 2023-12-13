package com.xl1.algo25;

public class PresquePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mot = "kaTyak".toLowerCase();
		System.out.println(estPresquePalindrome(mot));

	}
	static boolean estPresquePalindrome(String word) {
		for (int i = 0; i < word.length(); i++) {
            String t = word.substring(0, i) + word.substring(i + 1);
            if (isPalindrome(t)) {
                System.out.println(word.charAt(i) + ", true, " + t);
                return true;
            }
        }

        return isPalindrome(word);
	}
	public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

}
