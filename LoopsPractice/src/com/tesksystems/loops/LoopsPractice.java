package com.tesksystems.loops;

import java.util.Scanner;

public class LoopsPractice {

	public void printMultiplicationTable() {

		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				System.out.print(j * i + " ");

			}
			System.out.println();
		}
	}

	public void findGCD() {

		Scanner input = new Scanner(System.in);
		System.out.println("Provide first value: ");
		int n1 = input.nextInt();
		System.out.println("Provide second value: ");
		int n2 = input.nextInt();

		int gcd = 1;

		int lowestValue = 0;

		// find lowest value
		if (n1 > n2) {
			lowestValue = n2;
		} else {
			lowestValue = n1;
		}

		for (int i = 2; i <= lowestValue; i++) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				gcd = i;
			}
		}

		System.out.println(gcd);

	}

	public void predictFutureTuition() {

		double tuition = 10000;
		int year = 0;

		while (tuition < 20000) {

			year += 1;
			tuition = 1.07 * tuition;

		}

		System.out.println("Tuition will be doubled in " + (year) + " years");

	}

}
