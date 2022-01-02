package day10HomeWork;

public class Day10Question4 {
	public static void main(String[] args) {

		getDoWhileLoopResult(2, 10); // getDoWhileloopResult IS CALLED FROM METHOD in MAIN METHOD
	}

	
	//Modifier    Returntype  ,Method Name  ,  int parameters 
	public static void getDoWhileLoopResult(int minNum, int maxNum) {
    
		// DO WHILE LOOPING
		do {
			System.out.println(minNum); // PRINTING 
			minNum++;    // INCREMENT OR UPDATE
		} while (minNum <= maxNum);
	}

}
