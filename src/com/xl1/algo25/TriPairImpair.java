package com.xl1.algo25;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TriPairImpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {93, 24, 38, 1, 96, 87, 100};

        System.out.println(triPairImpair(list));

	}

	private static List<Integer> triPairImpair(int[] list) {
		// TODO Auto-generated method stub
		
		List<Integer> pairs = new ArrayList<>();
		List<Integer> impairs = new ArrayList<>();
		for (Integer elmt : list) {
			if(elmt % 2 == 0) {
				pairs.add(elmt);
			}else {
				impairs.add(elmt);
			}
		}
		Collections.sort(pairs);
		Collections.sort(impairs, Comparator.reverseOrder());
		
		List<Integer> result = new ArrayList<>(pairs);
		result.addAll(impairs);
		return result;
		
	}

}
