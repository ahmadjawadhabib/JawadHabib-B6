package com.noorteck.java.HWday19;

public class HomeWorkQ10 {

	public static void main(String[] args) {
		  HomeWorkQ10 obj = new HomeWorkQ10();
		  
		  boolean strOne = obj.isEndWith("java training", "ing");
		  System.out.println(strOne);
		  boolean strTwo = obj.isEndWith("java training", "ng");
		  System.out.println(strTwo);
		  boolean strthree = obj.isEndWith("java training", "java");
		  System.out.println(strthree);
		
	}
	
	boolean isEndWith(String strOne, String strTwo) {
		boolean result = false;
		
		 if (strOne.endsWith(strTwo)) {
			 result = true;
		 }
		   
		
		
		return result ;
		
	}

}
