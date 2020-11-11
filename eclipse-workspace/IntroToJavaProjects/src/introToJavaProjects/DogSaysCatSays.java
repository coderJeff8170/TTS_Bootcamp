package introToJavaProjects;
import java.util.Scanner;

public class DogSaysCatSays {
		//make a globally available scanner
		public static Scanner myScan;
		//Dog Says Cat Says: ask user to enter 'dog' or 'cat', program prints animal's sound
	public static void main(String[] args) {
		// make new scanner
		myScan = new Scanner(System.in);
		// string asking question
		System.out.println("Are you a dog or a cat?");
		//get input
		String animal = myScan.nextLine();
		//if/else to determine which sound
		if(animal.equals("cat")) {
			System.out.println("Meow");
		} else if (animal.equals("dog")) {
			System.out.println("Woof!");
		} else {
			System.out.printf("I have no information for a %s", animal);
		}
		//System.exit(0);
	}
}
