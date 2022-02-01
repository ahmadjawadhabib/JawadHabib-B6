package com.noorteck.HWday24;

public class QuestionOne {

	public static void main(String[] args) {

		QuestionOne obj = new  QuestionOne();
		int n1[] = {6,1,2,3};
		int n2[]= {13,3};
		
		int [] myResult = obj.getDouble(n1);
		
		
		for( int i =0; i < myResult.length; i++ ){
		
			System.out.println(myResult[i]);
		
		}
		System.out.println("*************************");
		
		int [] myResult2 = obj.getDouble(n2);
		
		
		for( int i =0; i < myResult2.length; i++ ){
		
			System.out.println(myResult2[i]);
		
		}
		
		
	}
	
	
	private int [] getDouble(int [] number ) {
		int [] result = new int [number.length*2];
		
		int lastIndex =result.length-1 ;
		int lastElement = number [number.length-1];
		
		
		result [lastIndex] = lastElement;
		return result ;
	}

}
