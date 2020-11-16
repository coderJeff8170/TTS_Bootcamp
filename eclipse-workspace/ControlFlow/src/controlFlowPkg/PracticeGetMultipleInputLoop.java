package controlFlowPkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeGetMultipleInputLoop {
	public static Scanner reader;

	public static void main(String[] args) {
		
		String name = null;
		int age = 0;
		double weight = 0;
		double height = 0;
		
//		array of questions
		String[] questions = {
				"What's your name?",
				"What's your age?",
				"What's your weight?",
				"What's your height?",
		};
		
		
		
		
		reader = new Scanner(System.in);
		
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			if(i==2 || i==3) {
//				varNames[i]= Double.valueOf(reader.nextLine());
			}else if (i==1) {
				
			}else {
				
			}
		}
		
//		System.out.println("What's your name?");
//		name = reader.nextLine();
//		System.out.println("What's your age?");
//		age = Integer.valueOf(reader.nextLine());
//		System.out.println("What's your weight?");
//		weight = Double.valueOf(reader.nextLine());
//		System.out.println("What's your height?");
//		height = Double.valueOf(reader.nextLine());
		
		System.out.printf(
				"Your name is %s \n"
				+ "Your age is %s \n"
				+ "Your weight is %s \n"
				+ "and your height is %s \n",
				name, age, weight, height);

	}
}