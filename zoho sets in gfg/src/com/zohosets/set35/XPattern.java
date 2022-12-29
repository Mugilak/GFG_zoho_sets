package com.zohosets.set35;

import java.util.Scanner;

public class XPattern {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new XPattern().getInput();
	}

	private void getInput() {
		System.out.println("Enter String : ");
		String word = input.nextLine() + "*";
		int length = findLength(word.toCharArray());
		if (length % 2 != 0)
			printPattern(word.toCharArray(), length);
	}

	private void printPattern(char[] array, int length) {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (i == j) {
					System.out.print(array[i] + " ");
				} else if ((i + j) == (length - 1)) {
					System.out.print(array[i] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	private int findLength(char[] array) {
		int length = 0, i = 0;
		while (array[i] != '*') {
			length++;
			i++;
		}
		return length;
	}

}
