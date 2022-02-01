package com.noorteck.HWday24;

public class QuesttionTwo {
public static void main(String[] args) {
		
		int [] n1 = {13,2,3,4,5,6,1,2,3};
		int [] n2 = {13,2,9,4,5,6,1,2,3};
		int [] n3 = {6,1,2,3};
		
		boolean result1 = checkNum(n1);
		boolean result2 = checkNum(n2);
		boolean result3 = checkNum(n3);
		
		System.out.println(result1);// true
		System.out.println(result2);// true
		System.out.println(result3);// false

	}

	protected static boolean checkNum(int [] number) {
		
		boolean result = false;
		
		int fiveCount =0;
		int twoCount =0;
		for(int i =0; i<number.length;i++) {
			
		if(number  [i]==2) {
			twoCount++;
			
		}else if (number[i]==5) {
			fiveCount++;
		}
		}
		if(twoCount ==2||fiveCount == 2) {
			
		result = true;
		
		}
		return result;
	
	}
}



