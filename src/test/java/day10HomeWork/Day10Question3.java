package day10HomeWork;

public class Day10Question3 {
	public static void main(String[] args) {
		
		
		oddEven(20);//IS CALLED FROM METHOD in MAIN METHOD
		
	}
  //Modifier    Returntype ,Method Name  ,int parameter 
	public static void oddEven(int number) {

		if (number % 2 == 0) {
			System.out.println("Even number :  " + number);
		} else {
			System.out.println("Odd number : " + number);
		}
	}

}
