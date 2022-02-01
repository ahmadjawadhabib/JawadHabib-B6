package com.noorteck.java.HWday20;

public class Question16 { 
	public static void main(String[] args) {
		
		Question16 obj = new Question16();
		
		String myResult = obj.concatString("java", "awesome");
		
		System.out.println(myResult.replaceAll("aa", "a"));
		
		String myResult2 = obj.concatString("food", "door");
		System.out.println(myResult2.replaceAll("dd", "d"));
		
		String myResult3 = obj.concatString("Pr", "ogress");
		System.out.println(myResult3);
		
		String myResult4 = obj.concatString("java", "training");
		System.out.println(myResult4);
		
	}

	String concatString (String strOne , String strTwo) {
		
		String result ="";
		
		result = strOne.concat(strTwo);
			
		
		
		
		return result ;
	}
	
	
}
/**

  	Write a method to concatenate two given strings such that, if the concatenation creates
		a double characters then removes one of the characters.
		a. For example strOne = “food”; strTwo =”door”. After concatenating two
		strings it will give us “fooddoor”(dd is double character, remove one of the
		d) then the string after concatenation are: “foodoor”

	Access Modifier: default
		Non-Access Modifier: non-static
		Return Type: String
		Method Name: concatString
		Parameter1: String strOne
		Parameter2: String strTwo
	Test Data:
		concatString (“Java”, “awesome”) ----- javawesome
		concatString (“food”, “door”) ----- foodoor
		concatString (“java”, “training”) ----- javatraining
		concatString (“Pro”, “ogress”) ----- Progress

----------------------------------------------------------------------------------------------------------------
*/