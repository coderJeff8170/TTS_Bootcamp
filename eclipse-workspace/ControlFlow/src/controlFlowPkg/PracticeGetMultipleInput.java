package controlFlowPkg;

import java.util.Scanner;

public class PracticeGetMultipleInput {
	public static Scanner reader;

	public static void main(String[] args) {
		
		String name = null;
		int age = 0;
		double weight = 0;
		double height = 0;
		
		
		reader = new Scanner(System.in);
		
		System.out.println("What's your name?");
		name = reader.nextLine();
		System.out.println("What's your age?");
		age = Integer.valueOf(reader.nextLine());
		System.out.println("What's your weight?");
		weight = Double.valueOf(reader.nextLine());
		System.out.println("What's your height?");
		height = Double.valueOf(reader.nextLine());
		
		System.out.printf(
				"Your name is %s \n"
				+ "Your age is %s \n"
				+ "Your weight is %s \n"
				+ "and your height is %s \n",
				name, age, weight, height);

	}

}
