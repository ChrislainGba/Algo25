package com.xl1.algo25;

public class InverserEtGargerCaracteresSpeciaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "Alo*etui@l)ios82?";
        String chaineInverse = inverserEtGarderCaracteresSpeciaux(chaine);

        System.out.println("Chaine inversée avec caractères spéciaux : " + chaineInverse);

	}

	private static String inverserEtGarderCaracteresSpeciaux(String str) {
		// TODO Auto-generated method stub
		int debut = 0;
		int fin = str.length() - 1;
		char[] chars = str.toCharArray();
		while(debut<fin) {
			if(Character.isLetterOrDigit(chars[debut]) && Character.isLetterOrDigit(chars[fin])) {
				char tmp = chars[debut];
				chars[debut] = chars[fin];
				chars[fin] = tmp;
				
				debut++;
				fin--;
			}else if(Character.isLetterOrDigit(chars[debut]) && !Character.isLetterOrDigit(chars[fin])) {
				fin--;
			}else if(!Character.isLetterOrDigit(chars[debut]) && Character.isLetterOrDigit(chars[fin])) {
				debut++;
			}else {
				debut++;
				fin--;
			}
			
		}
		return new String(chars);
	}

}
