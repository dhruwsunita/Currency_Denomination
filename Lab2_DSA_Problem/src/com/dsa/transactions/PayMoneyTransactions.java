package com.dsa.transactions;

import java.util.Scanner;

public class PayMoneyTransactions {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of transactions ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values of transactions");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNum = sc.nextInt();
		while (targetNum-- != 0) {
			int flag = 0;
			long target;
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < n; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions!");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Your target is not achieved!");
			}
			System.out.println();
		}
	}
}
