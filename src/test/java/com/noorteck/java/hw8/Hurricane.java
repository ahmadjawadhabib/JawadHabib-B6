package com.noorteck.java.hw8;

public class Hurricane {

	public static void main(String[] args) {

		for (int i = 20; i <= 200; i++) {
			
			if (i > 74 && i < 95) {
				System.out.println("Category 1" + "Wind Speed :" + i); 
				
			} else if (i > 105 && i < 110) {
				System.out.println("Category 2" + "Wind Speed :" + i);
				
			} else if (i > 120 && i < 130) {
				System.out.println("Category 3" + "Wind Speed :" + i);

			} else if (i > 140 && i < 155) {
				System.out.println("Category 4" + "Wind Speed :" + i);
				
			} else if (i > 165 && i < 194) {
				System.out.println("Category 5" + "Wind Speed :" + i);
				
			} else {
				System.out.println("Good Weather "+ "Wind Speed :" + i);
			}
			//System.out.println(i);
		}
	}
}
