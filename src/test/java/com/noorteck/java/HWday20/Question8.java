package com.noorteck.java.HWday20;

public class Question8 {

	public static void main(String[] args) {

	char myresult = getCharacter("java training",2);
		System.out.println(myresult);
		char myresult2 = getCharacter("java training",5);
		System.out.println(myresult2);
		char myresult3 = getCharacter("java training",8);
		System.out.println(myresult3);
		char myresult4 = getCharacter("java training",24);
		System.out.println(myresult4);
		
	}

	public static char getCharacter(String strOne, int indexNum) {
	char result = ' ';
		
		
	if(indexNum >= strOne.length()) {
		result = '?';
	}else {
		result = strOne.charAt(indexNum);
		
				
	}	
		return  result;
	}
}
	