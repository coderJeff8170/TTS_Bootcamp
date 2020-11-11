package madLibPkg;
import java.util.Scanner;

public class MadLib {
	
	public static Scanner myScan;
	/*
	 * Use the variables below to compose the following paragraph:
	 * name, adjective, verbOne, verbTwo, number, yourName
	 * Dear name,
	 * You are adverb adjective and I want to be your noun! I want to go to the nounTwo with you in number days.  
	 * Sincerely, yourName
	 * */
	//madLib method:
	static void myMadLib() {
		
		//Scanner input = new Scanner(System.in);
		//begin input
				System.out.println("Welcome to my MadLib! \n");
				System.out.println("Type the name of your best friend: \n");
				String name = myScan.nextLine();
				System.out.println("Type an adverb: \n");
				String adverb = myScan.nextLine();
				System.out.println("Type an adjective: \n");
				String adjective = myScan.nextLine();
				System.out.println("Type a noun: \n");
				String noun1 = myScan.nextLine();
				System.out.println("How about another noun: \n");
				String noun2 = myScan.nextLine();
				System.out.println("Almost done; Type a number: \n");
				String num = myScan.nextLine();
				System.out.println("Finally, what is your name? \n");
				String yourName = myScan.nextLine();
				//begin output!
				System.out.println("Here is your MadLib: \n");
				System.out.printf("Dear %s, \n"
						+ "You are %s %s, and I want to be your %s. "
						+ "I want to go to the %s with you in %s days.\n"
						+ "Sincerely, %s"
						, name, adverb, adjective, noun1, noun2, num, yourName);
	  }

	public static void main(String[] args) {
		myScan = new Scanner(System.in);
		//Scanner newInput = new Scanner(System.in);
		//set age limit
		int ageLimit = 18;
		System.out.println("What is your age? \n");
		int age = Integer.parseInt(myScan.nextLine());
		//could be newInput.nextInt();//don't do this, it'll skip the line!
		
		if(age >= ageLimit) {
			myMadLib();
		}else {
			System.out.println("Sorry, you are too young to play the madLib!");
			//I guess this exits the program, lol.
			System.exit(0);
		}
		
		
	}

}
