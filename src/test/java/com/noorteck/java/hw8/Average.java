package com.noorteck.java.hw8;

public class Average {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;

		for (int number = 20; number <= 30; number++) {

			// System.out.println(number);

			sum = sum + number;
			count++;

		}
		System.out.println("Sum  :" + sum);
		System.out.println("Count  :" + count);

		int average = sum / count;

		System.out.println("Average :" + average);

	}

}
