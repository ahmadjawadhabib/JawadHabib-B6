package com.noorteck.java.hw8;

public class Question5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 32; i++) {

			if (i % 2 == 0 && i >= 2 && i <= 5) {
				System.out.println("Even number between 2 -5 " + i);
			} else if (i % 2 == 0 && i >= 6 && i <= 20) {
				System.out.println("even number between 6 - 20" + i);
			} else if (i % 2 == 0 && i >= 15 && i <= 20) {
				System.out.println("even number between 15 - 20" + i);

			}
		}
	}

}
