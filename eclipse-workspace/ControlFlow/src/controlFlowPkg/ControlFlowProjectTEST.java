package controlFlowPkg;

import java.util.Scanner;

public class ControlFlowProjectTEST {
	
	public static Scanner myScan;
	//globals


	
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
		String petName = null;
		int petAge = 0;
		int luckyNum = 0;
		int qBackNum = 0;
		int carYear = 0;
		String actor = null;
		int randNum = 0;

		String[] questions = {
				"What is the name of your favorite pet?",
				"What is the age of your favorite pet?",
				"What is your lucky number?",
				"What is your favorite quarterback jersey number?",
				"What is two-digit model year of their car?",
				"What is the first name of the their favorite actor or actress?",
				"Enter a random number between 1 and 50."
		};
//		array of variable names
		String[] varNames = {
				"petName",
				"petAge",
				"luckyNum",
				"qBackNum",
				"carYear",
				"actor",
				"randNum"
		};
//		loop thru questions
		for(int i = 0; i<questions.length; i++) {
			System.out.println(questions[i]);
			varNames[i] = myScan.nextLine();
			//if varNames i = carriage return, i-- and continue?
		}
		
//		for(int i = 0; i<varNames.length; i++) {
//			System.out.println(varNames[i]);
//		}


		System.out.printf(
				"******************************************************\n"
				+ "Lottery numbers: %s, %s, %s, %s, %s, %s."
				+ "Magic Ball: %s\n"
				+ "******************************************************",
				petName, petAge, luckyNum, qBackNum, carYear, actor, randNum);

		
		//System.exit(0); - ends program
	}
}
