import java.util.Scanner;

public class StudentDatebase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int studentNumber;
		boolean go = true;
		String Continue;
		
		String[] studentName = {" Michael Jackson", "Beyonce Knowles", "Aretha Franklin", "Sean Carter", "Kimberly Jones"};
		String[] birthDate = {"August 29, 1958", "September 4, 1981", "March 25, 1942", "December 4, 1969", "July 11, 1974"};
		String[] homeTown = {"Gary, IN", "Houston, TX", "Detroit, MI", "Brooklyn, NY", "Brooklyn, NY"};
		
		System.out.println("Welcome to our Java class. ");
		
		while (go) {
			System.out.println("Which student would you like to learn more about? (Please enter a number 1-5):");
			studentNumber = input.nextInt();
		
		}
		
		System.out.println("Student" + studentNumber "is" + [studentName]);
		
		System.out.println("What would you like to know about" + [studentName]"? Birthdate or Hometown?");
		
		
		
		
		

}
}