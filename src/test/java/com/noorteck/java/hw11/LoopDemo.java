package com.noorteck.java.hw11;

public class LoopDemo {

	public static void main(String[] args) {
		getNum(5, 1);
		
		System.out.println("===============");
		
		getNum(5, 1); 
		
		System.out.println("**************");
		
		getNum(20, 2);

	}

	public static void getNum(int numOne, int numTwo) {
		
		for (int i = 1; i <= numOne; i = i + numTwo) {
			
			System.out.println(i);

		}

		

	}

}
