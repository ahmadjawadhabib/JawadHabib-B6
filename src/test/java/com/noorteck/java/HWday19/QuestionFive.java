package com.noorteck.java.HWday19;

public class QuestionFive {

	public static void main(String[] args) {

		QuestionFive obj = new QuestionFive();
		
		String myResult = obj.toUpper("Pro");
		String myResult2 = obj.toUpper("java");
		String myResult3 = obj.toUpper("java training");
		
		
		
		System.out.println(myResult);
		System.out.println(myResult2);
		System.out.println(myResult3);
		
		
	}
	    String toUpper(String strOne) {
	    	
	    	String result ="";
	    	result = strOne.toUpperCase();
	    	
	    	return result ;
	    	}
	}


/**
 * 4. Write a method that takes one String parameter and the method converts the
		parameter to uppercase and return the new String value
	
	Access Modifier: default
		Non-Access Modifier: non-static
		Return Type: String
		Method Name: toUpper
		Parameter1: String strOne
	Test Data:
		toUpper (“Pro”) ----- PRO
		toUpper (“java”) ----- LEARNING
		toUpper (“java training”) ----- JAVA TRAINING
		*/




