package controlFlowPkg;
import java.util.Scanner;


public class ControlFlowProject {
	
	public static Scanner myScan;
	
	//TODO: make a TEST VERSION OF THE BELOW TODOS
	//TODO: make an array list of questions
	
	//TODO: make a function that loops thru each question and stores the answer in an array list.
	public static String calculateNumbers() {
		return "here are some numbers";
		//TODO: return an array list of answers
	}
	//TODO: make a function that takes in the ol of answers and returns an ol of numbers

	
	public static void main(String[] args) {
		//make a new instance of myScan for use in main
		myScan = new Scanner(System.in);
		
		//make sure it's working
		System.out.println("Hello, World!");
		//print three loops from AsciiChars Class
		AsciiChars.printNumbers();
		AsciiChars.printLowerCase();
		AsciiChars.printUpperCase();
		//Ask user for name
		
		String name;
		//NEEDS WORK!!
		System.out.println("Please enter your name:");
	    while (!myScan.hasNext()) {
	        System.out.println("Please enter something!");
	        myScan.nextLine();
	    }
	    name = myScan.nextLine();
		//get name, print name
		
		System.out.printf("Hello, %s \n", name);
		//ask about survey
		System.out.println("Would you like to continue to the interactive portion? (Y/N)");
		String response = myScan.nextLine();
		//System.out.println(response);
		if (!response.equals("y")) {
			System.out.println("Please come back later to complete the survey");
			return;
		}
		System.out.println("rest of program runs");

		System.out.println(calculateNumbers());
		
		//print hello name:
		
		//System.exit(0); - ends program
	}

}
