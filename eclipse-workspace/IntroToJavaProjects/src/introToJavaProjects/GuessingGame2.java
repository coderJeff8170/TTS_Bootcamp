package introToJavaProjects;
import java.util.Scanner;

//Ask the user for a number between 1 & 100
//Use both AND/OR to test for exactness and closeness
//e.g., if the guess is only five away, have a message to say something like "Oh! So close!"

public class GuessingGame2 {
	//** scanner declared in class scope
	public static Scanner myScan;
	//function to generate random number:
	static int getRando (int min, int max) {
		double rando = Math.random() * (max - min + 1) + min;
		return (int)rando;
	}

	public static void main(String[] args) {
		//** scanner used in main scope
		myScan = new Scanner(System.in);
		//ask user for input
		System.out.println("I am thinking of a number between 1 and 100.\n"
				+ "Can you guess what it is?");
		//get input
		int myNum = Integer.parseInt(myScan.nextLine());
		
		//if the input is not an integer, try again
		if(!(myNum % 1 == 0)){
			System.out.println("Sorry, try again!");
		
		}
		//generate random number between 1 and 100
		//int rando = getRando(1, 100);
		int rando = 50;//test
		//if number is same, congrats
		if(myNum == rando) {
			System.out.printf("Wow! Good guess! The number I was thinking of was"
					+ " %s, and the number you guessed was %s.", rando, myNum);
		} else if (myNum > (rando-5) && myNum < (rando+5)) {
			System.out.printf("Wow! Sooooo close! The number was"
					+ " %s, and the number you guessed was %s.", rando, myNum);
		}
		else {
			//if not, do something else
			System.out.printf("Sorry, not even close! The number I was thinking of was"
					+ " %s. The number you guessed was %s.", rando, myNum);
		}
	}
}
