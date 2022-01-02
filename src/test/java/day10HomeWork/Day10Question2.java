package day10HomeWork;

public class Day10Question2 {

	public static void main(String[] args) {

		getGender('f');//IS CALLED FROM METHOD in MAIN METHOD
	}
	//Modifier    Returntype ,Method Name  ,CHAR parameter
	public static void getGender(char gender) {

		if (gender == 'm') {
			System.out.println("Male");
		} else if (gender == 'f') {
			System.out.println("Female");
		} else {
			System.out.println("Error Please select One Gender ");
		}
	}

}
