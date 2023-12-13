package com.xl1.algo25;

public class TriInsertion {
	public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr, true);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr, boolean asc) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Si l'ordre est ascendant et key < arr[j], ou si l'ordre est descendant et key > arr[j], échangez les éléments
            while ((asc && j >= 0 && key < arr[j]) || (!asc && j >= 0 && key > arr[j])) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
