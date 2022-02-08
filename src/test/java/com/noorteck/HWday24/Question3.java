package com.noorteck.HWday24;

public class Question3 {
public static void main(String[] args) {


		

		int n1 []= {6,1,2,3};
		int myR =gettotal(n1);
		System.out.println(myR);
		
		int n2 []= {13,6,1,2,3};
		int myR2 =gettotal(n2);
		System.out.println(myR2);
		
		int n3 []= {0,6,0};
		int myR3 =gettotal(n3);
		System.out.println(myR3);
		
		
		
	}
	
	public static int gettotal(int []number ){
		
		int result1 = 0;
		
		for(int i =0; i < number.length;i++) {
			result1 = result1 +number[i];
		}
		
		return result1;
		
		
	}
}
/**

  	Write a method that takes an array of int parameter and return the sum of all the
			elements
	Access Modifier: public
	Non-Access Modifier: static
	Return Type: int
	Method Name: getTotal
	Parameter1: int [] number
	
	Test Data:
	getTotal ([6, 1, 2, 3]) ----- 12
	getTotal ([13, 6, 1, 2, 3]) ----- 25
	getTotal ([0, 1, 4, 3 ,6]) ----- 14
	getTotal ([0, 6, 0]) ----- 6 



*/


