package introToJavaProjects;
import java.util.Scanner;

//Guessing Game: user provides a number (between 1 and 10),
//if the number stored in the program is the same, "Wow!", else, "Nope!"

public class GuessingGame1 {
	//** scanner declared in class scope
	public static Scanner myScan;
	//function to generate random number:
	static int getRando (int min, int max) {
		//Declare the minimum value of the range
		//Declare the maximum value of the range
		//Use the formula Math.random() * (max - min + 1) + min 
		double rando = Math.random() * (max - min + 1) + min;
		return (int)rando;
	}

	public static void main(String[] args) {
		//** scanner used in main scope
		myScan = new Scanner(System.in);
		//ask user for input
		System.out.println("I am thinking of a number between 1 and 10.\n"
				+ "Can you guess what it is?");
		//get input
		int myNum = Integer.parseInt(myScan.nextLine());
		//generate random number - call method
		int rando = getRando(1, 10);
		//if number is same, do something
		//remember, primitives can be compared with ==
		if(myNum == rando) {
			System.out.printf("Wow! Good guess! The number I was thinking of was"
					+ " %s, and the number you guessed was %s.", rando, myNum);
		}else {
			//if not, do something else
			System.out.printf("Sorry. The number I was thinking of was"
					+ " %s. The number you guessed was %s.", rando, myNum);
		}
	}
}
