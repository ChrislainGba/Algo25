package com.xl1.algo25;

import java.util.ArrayList;
import java.util.List;

public class ComblerLesTrous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array1 = {1, null, 2, 3, null, null, 5, null};
        Integer[] array2 = {null, 7, 0, 0, 8, null, 10, null, null, null};

        System.out.println(fillBlanks(array1));
        System.out.println(fillBlanks(array2));

	}

	private static List<Integer> fillBlanks(Integer[] array) {
		// TODO Auto-generated method stub
		List<Integer> res = new ArrayList<>();
		int nextValue = 0;
		for (Integer elmt : array) {
			if(elmt != null) {
				res.add(elmt);
				nextValue = elmt;
			}else {
				res.add(nextValue);
			}
		}
		
		return res;
	}

}
