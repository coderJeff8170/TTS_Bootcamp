package controlFlowPkg;
import java.util.Scanner;

public class PracticeInputLoop {
	
	public static Scanner myScan;

	public static void main(String[] args) {
//		myScan = new Scanner(System.in);
//		// TODO Auto-generated method stub
//		boolean valid = false;
//		System.out.println("Please input something");
//		String input = myScan.nextLine();
//		if(hasNextLine()) {
//			System.out.println("you didn't say anyting");
//			
//		}
//		
//		
//		System.out.printf("Your word is: %s", input);
//	}
	
//	Scanner sc = new Scanner(System.in);
//	int number;
//	do {
//	    System.out.println("Please enter a positive number!");
//	    while (!sc.hasNextInt()) {
//	        System.out.println("That's not a number!");
//	        sc.next(); // this is important!
//	    }
//	    number = sc.nextInt();
//	} while (number <= 0);
//	System.out.println("Thank you! Got " + number);
//	sc.close();
		
		Scanner sc = new Scanner(System.in);
		String answer;
	
		    System.out.println("Please enter a word");
		    //regex [yn] for either y or n
		    while (!sc.hasNext("[A-Za-z]+")) {
		        System.out.println("Please input an actual word!");
		        sc.nextLine();
		    }
		    answer = sc.nextLine();
		    
		
		System.out.printf("Your answer was %s ", answer);
		sc.close();
}
}
