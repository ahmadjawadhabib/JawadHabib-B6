package com.noorteck.java.hw8;

public class Q4OddAndEven {

	public static void main(String[] args) {
		/**
		 * write Java program to calculate the sum of Odd and even numbers. Loop through
		 * numbers between 1 and 20 and display the total of odd numbers and total of
		 * even numbers. Using for loop Using while loop
		 * 
		 */

		int evenTotal = 0;

		int oddTotal = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {
				// even
				evenTotal = evenTotal + i;

			} else {
				// Odd
				oddTotal = oddTotal + i;
			}
		}
		System.out.println("even Total " + evenTotal);
		System.out.println("Odd total :" + oddTotal);

		System.out.println("==================");

		int even = 0;
		int odd = 0;
		int a = 0;
		while (a <= 20) {

			if (a % 2 == 0) {
				even = even + a;
				// System.out.println(even);
			} else {
				odd = odd + a;
				
			}
			a++;
		}
		System.out.println( "Even " +even);
		System.out.println("Odd " +odd);
	
	}
}