package dataStructures;
import java.util.Scanner;
import java.util.ArrayList;

public class ForEachHashMapExercises {
	
	public static void main(String[] args) {
	
		Scanner myScan = new Scanner(System.in);
		ArrayList <Integer> myArray = new ArrayList();
		
		for(int i = 0; i < 5; i++) {
			int myNum;
			System.out.println("Please enter a number:");
			myNum = Integer.parseInt(myScan.nextLine());
			myArray.add(myNum);
		}
		
		System.out.printf("The fourth number you entered was %s", myArray.get(3));
		
		
		
		

	}

}
/*
 * 
 * forEach and Map.Entry Exercises
Ask the user for 5 numbers and store them in an array list.
Then find the sum, product, largest, and smallest of those numbers.

2. You are a car dealer - create a hash map of vehicles:

The model is the Key, the make is the Value.

Ask the customer what car (model) they are looking for,

use the HashMap to determine if you have that vehicle, and what make it is.

(e.g., "Oh, you're looking for a Civic? Our Honda selection is right over here...")*/
