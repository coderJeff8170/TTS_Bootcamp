package dataStructures;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class LoopMapExercises {
	
	//methods?
	
	static int sumArray (ArrayList<Integer> array) {
		int sum = 0;
		for(int i = 0; i<array.size(); i++) {
			sum += array.get(i);
		}
		return sum;
	}
	
	static int multArray (ArrayList<Integer> array) {
		//that identity tho!
		int prod = 1;
		for(int i = 0; i<array.size(); i++) {
			prod *= array.get(i);
		}
		return prod;
	}
	
	static int findLargest (ArrayList<Integer> array) {
		int biggest = Integer.MIN_VALUE;
		for(int i = 0; i<array.size(); i++) {
			if(array.get(i) > biggest) {
				biggest = array.get(i);
			}
		}
		return biggest;
	}
	
	static int findSmallest (ArrayList<Integer> array) {
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i<array.size(); i++) {
			if(array.get(i) < smallest) {
				smallest = array.get(i);
			}
		}
		return smallest;
	}
	
	public static void main(String[] args) {
	
		Scanner myScan = new Scanner(System.in);
		ArrayList <Integer> myArray = new ArrayList();
		
		for(int i = 0; i < 5; i++) {
			int myNum;
			System.out.println("Please enter a number:");
			myNum = Integer.parseInt(myScan.nextLine());
			myArray.add(myNum);
		}
		
		System.out.printf("The fourth number you entered was: %s\n", myArray.get(3));
		
		System.out.printf("The sum of numbers in your array is: %s\n", sumArray(myArray));
		
		System.out.printf("The product of numbers in your array is: %s\n", multArray(myArray));
		
		System.out.printf("The largest number in your array is: %s\n", findLargest(myArray));
		
		System.out.printf("The smallest number in your array is: %s\n", findSmallest(myArray));
		

		//Creates a HashMap with a String as key and Integer as the value it points to
		HashMap<String, String> vehicles = new HashMap<>();
		
		vehicles.put("Civic", "Honda");
		vehicles.put("ModelS", "Tesla");
		vehicles.put("Cherokee", "Jeep");
		vehicles.put("E-Type", "Jaguar");
		
		
		String model="";
		
		do {
			System.out.println("Welcome the the dealership! What model car are you lookin' for buddy?:");
			model = myScan.nextLine();
		}
		     while (model == null || model.trim().length() == 0);
		
		String car = vehicles.get(model);

		if(vehicles.containsKey(model)) {
			System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...", model, car);
		}else {
			System.out.printf("Sorry mate, we ain't got no %s.\n", model);
		}
		

		

		       
		
		
		

	}

}
/*
 * 
 * forEach and Map.Entry Exercises
Ask the user for 5 numbers and store them in an array list.[X]
Then find the sum, product, largest, and smallest of those numbers.

2. You are a car dealer - create a hash map of vehicles:

The model is the Key, the make is the Value.

Ask the customer what car (model) they are looking for,

use the HashMap to determine if you have that vehicle, and what make it is.

(e.g., "Oh, you're looking for a Civic? Our Honda selection is right over here...")*/
