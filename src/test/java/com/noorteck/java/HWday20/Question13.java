package com.noorteck.java.HWday20;



public class Question13 {

	public static void main(String[] args) {

		
		Question13 resultOne = new Question13();
		
		boolean obj = resultOne.isStartWith("java training", "ing");
		System.out.println(obj);
		
		boolean obj1 = resultOne.isStartWith("java training", "ja");
		System.out.println(obj1);
		
		boolean obj2	=resultOne.isStartWith("java training", "java");
		System.out.println(obj2);
		
		boolean obj3 = resultOne.isStartWith("java training", "train");
		System.out.println(obj3);
		
	}
	
	boolean isStartWith (String strOne, String strTwo) {
		boolean result = false;
		
		if ( strOne.startsWith(strTwo)){
			result = true;
		}
		
		return result;
	}

}
/**
	Write a method to check whether a given string starts with the contents(Characters) of
		another string
		
	Access Modifier: default
		Non-Access Modifier: non-static
		Return Type: boolean
		Method Name: isStartWith
		Parameter1: String strOne
		Parameter2: String strTwo
		
	Test Data:
      isStartWith (“java training”, “ing”) ----- False
      isStartWith (“java training”, “ja”) ----- TRUE
      isStartWith (“java training”, “java”) ----- TRUE
      isStartWith (“java training”, “train”) ----- False
		
		
		
		
		
		
		

*/