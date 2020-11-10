package madLibPkg;

import java.util.Scanner;

public class MadLib {
	/*
	 * Use the variables below to compose the following paragraph:
	 * name, adjective, verbOne, verbTwo, number, yourName
	 * Dear name,
	 * You are adverb adjective and I want to be your noun! I want to go to the nounTwo with you in number days.  
	 * Sincerely, yourName
	 * */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//begin input
		System.out.println("Welcome to my MadLib! \n");
		System.out.println("Type the name of your best friend: \n");
		String name = input.nextLine();
		System.out.println("Type an adverb: \n");
		String adverb = input.nextLine();
		System.out.println("Type an adjective: \n");
		String adjective = input.nextLine();
		System.out.println("Type a noun: \n");
		String noun1 = input.nextLine();
		System.out.println("How about another noun: \n");
		String noun2 = input.nextLine();
		System.out.println("Almost done; Type a number: \n");
		String num = input.nextLine();
		System.out.println("Finally, what is your name? \n");
		String yourName = input.nextLine();
		//begin output!
		System.out.println("Here is your MadLib: \n");
		System.out.printf("Dear %s, \n"
				+ "You are %s %s, and I want to be your %s. "
				+ "I want to go to the %s with you in %s days.\n"
				+ "Sincerely, %s"
				, name, adverb, adjective, noun1, noun2, num, yourName);
		
		
		
	}

}
