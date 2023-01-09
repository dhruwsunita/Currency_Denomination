package com.dsa.currencydenominations;

import java.util.Scanner;

public class CurrencyDenominations {

	// function to count and print currency notes
	public static void countCurrency(int notes[], int amount) {

		int noteCount[] = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCount[i] = amount / notes[i];
					amount = amount % notes[i];
				}
			}

			// Count and print the minimum number of notes required
			if (amount > 0) {
				System.out.println("Exact amount cannot be given by the provided denomination!");
			} else {
				System.out.println("Your payment approach in order to give min number of notes will be ");
				for (int i = 0; i < notes.length; i++) {
					if (noteCount[i] != 0) {
						System.out.println(notes[i] + ":" + noteCount[i]);
					}
				}

			}

		} catch (ArithmeticException e) {
			System.out.println(e + " Notes of denomination 0 is Invalid!");
		}
	}

	// Driver code
	public static void main(String[] args) {

		MergeSort sort = new MergeSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int n = sc.nextInt();
		int notes[] = new int[n];
		System.out.println("Enter the currency denominations values");
		for (int i = 0; i < n; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		if (amount > 0) {
			sort.mergeSort(notes, 0, notes.length - 1);
			countCurrency(notes, amount);
		} else {
			System.out.println("Please enter a valid amount!");
		}

	}

}
