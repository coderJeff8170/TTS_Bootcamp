package introToJavaProjects;
import java.util.Scanner;

//Update the Dog Says Cat Says program:

//Ask the user for an animal
//Use if/else conditionals to program in a number of animal sounds
//Use last else for unknown animals

public class DogSaysCatSaysUpdated {
		//make a globally available scanner
		public static Scanner myScan;
		//Updated Dog Says Cat Says: ask user to enter 'dog' or 'cat', program prints animal's sound
	public static void main(String[] args) {
		// make new scanner
		myScan = new Scanner(System.in);
		// Ask for an animal
		System.out.println("What kind of animal are you?");
		//get input
		String animal = myScan.nextLine();
		//if/else to determine which sound
		if(animal.equals("cat")) {
			System.out.println("Meow");
		} else if (animal.equals("dog")) {
			System.out.println("Woof!");
		} else if (animal.equals("horse")) {
			System.out.println("Neigh!");
		} else if (animal.equals("pig")) {
			System.out.println("Oink!");
		} else if (animal.equals("cow")) {
			System.out.println("Moo!");
		} else if (animal.equals("lion")) {
			System.out.println("Roar!");
		} else if (animal.equals("frog")) {
			System.out.println("Ribbit!");
		} else if (animal.equals("chicken")) {
			System.out.println("Pa-cawk!");
		} else if (animal.equals("turkey")) {
			System.out.println("gobble gobble!");
		} else {
			System.out.printf("Sorry. I don't know what sound a %s makes", animal);
		}
		//System.exit(0);
	}
}