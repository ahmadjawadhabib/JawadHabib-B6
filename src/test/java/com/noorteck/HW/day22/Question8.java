package com.noorteck.HW.day22;

public class Question8 {

	
		
		public static void main(String[] args) {
			
			char result1 = getCharacter("java training ", 2);
			char result2 = getCharacter("java training ", 5);
			char result3 = getCharacter("java training ", 8);
			char result4 = getCharacter("java training ", 22);
			
			System.out.println(result1);
			System.out.println(result2);

			System.out.println(result3);

			System.out.println(result4);

		}
		public static char getCharacter(String str, int indexNum) {
			char result = ' ';
			
			
			if(indexNum >= str.length()) {
				result = '?';
			}else {
				result = str.charAt(indexNum);
			}
			return result;
		}

	}


