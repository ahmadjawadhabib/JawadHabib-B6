package day10HomeWork;

public class Day10Question2 {

	public static void main(String[] args) {

		getGender('m');//IS CALLED FROM METHOD in MAIN METHOD
	}
	//Modifier    Returntype ,Method Name  ,CHAR parameter
	public static void getGender(char gender) {

		if (gender == 'm'|| gender == 'M') { // if statement for my condition 
			System.out.println("Male");
		} else if (gender == 'f' || gender == 'F') {
			System.out.println("Female");
		} else {
			System.out.println("Error Please select One Gender ");
		}
	}

}
