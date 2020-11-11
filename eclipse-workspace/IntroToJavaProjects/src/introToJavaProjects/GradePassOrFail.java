package introToJavaProjects;
import java.util.Scanner;

//Ask the user for their number grade, if the grade is at least 60, tell them they passed!
//If it's lower than 60, tell them they have to take the class again.

public class GradePassOrFail {
	
	public static Scanner myScan;

	public static void main(String[] args) {
		// assign scanner
		myScan = new Scanner(System.in);
		//ask user for grade
		System.out.println("What grade did you get?");
		int grade = Integer.parseInt(myScan.nextLine());
		//if grade > 60, print 'you passed'
		if(grade > 60) {
			System.out.println("Yay! You passed!");
		} else {
			//else print 'you gonna have to take class again'
			System.out.println("Sorry, you'll have to take the class again.");
		}
		
	}

}
