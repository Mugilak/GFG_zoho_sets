package com.zohosets.set35;

import java.util.Scanner;

public class MergeTwoArraysDistinct {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new MergeTwoArraysDistinct().getInput();
	}

	private void getInput() {
		System.out.println("Enter size 1 : ");
		int size1 = input.nextInt();
		System.out.println("Enter size 2 : ");
		int size2 = input.nextInt();
		System.out.println("Enter array 1 elements : ");
		int[] array1 = new int[size1];
		for (int i = 0; i < size1; i++) {
			array1[i] = input.nextInt();
		}
		System.out.println("Enter array 2 elements : ");
		int[] array2 = new int[size2];
		for (int i = 0; i < size2; i++) {
			array2[i] = input.nextInt();
		}
		mergeArray(size1, array1, size2, array2);
	}

	private void mergeArray(int size1, int[] array1, int size2, int[] array2) {
		int i = 0, j = 0;
		while (i < size1 && j < size2) {
			if (array1[i] < array2[j]) {
				System.out.print(array1[i] + " ");
				i++;
			} else if (array1[i] > array2[j]) {
				System.out.print(array2[j] + " ");
				j++;
			} else {
				System.out.print(array2[j] + " ");
				i++;
				j++;
			}
		}
		if (i < size1) {
			while (i < size1) {
				System.out.print(array1[i] + " ");
				i++;
			}
		}
		if (j < size2) {
			while (j < size2) {
				System.out.print(array2[j] + " ");
				j++;
			}
		}
	}

}
//Enter size 1 : 
//5
//Enter size 2 : 
//4
//Enter array 1 elements : 
//1 2 3 4 5
//Enter array 2 elements : 
//5 6 7 7
//1 2 3 4 5 5 6 7 7 
