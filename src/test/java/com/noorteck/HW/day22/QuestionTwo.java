package com.noorteck.HW.day22;

public class QuestionTwo {

	public static void main(String[] args) {

		QuestionTwo obj = new QuestionTwo();

		boolean myResult = obj.isEndWith("java training ", "ing");
		System.out.println(myResult);

		boolean myResult2 = obj.isEndWith("java training ", "ng");
		System.out.println(myResult2);

		boolean myResult3 = obj.isEndWith("java training", "java");
		System.out.println(myResult3);

		boolean myResult4 = obj.isEndWith(null, "java");
		System.out.println(myResult4);

		boolean myResult5 = obj.isEndWith(null, null);
		System.out.println(myResult5);

		boolean myResult6 = obj.isEndWith("aaabc", "abc");
		System.out.println(myResult6);

	}

	boolean isEndWith(String strOne, String strTwo) {

		boolean result = false;

		if (strOne == null || strTwo == null) {
		
            result = false;
            
		}else if( strOne.endsWith(strOne)) { 
        	
        	result = true;
        	
        }else if( strTwo.endsWith(strTwo)) {
        
		result = true;

	}
			
		return result;

}}
