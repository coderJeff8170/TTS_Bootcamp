package controlFlowPkg;
import java.util.Scanner;
//import java.util.ArrayList;
import java.util.Random; 


public class ControlFlowProject {
	//object instantiation
	public static Scanner myScan;
	public static Random myRand;

//***************************** methods *******************************
//	range checker
	public static int checkRange(int range, int num) {
		if(num > range) {
			return num - range;
		}else {
			return num;
		}
	}
//	magic ball creator
	public static int createMagicBall(int a) {

		if(a>75) {
			return a-75;
		}else {
			return a;
		}
	}
	
//	get number from character
	public static int getNumFromStringChar(int index, String a) {

		char letter = a.charAt(index);
		int asciiCode = (int) letter;
		return checkRange(65, asciiCode);

	}

	//***************************** MAIN *******************************
	
	public static void main(String[] args) {
		
		
		//make a new instance of myScan for use in main
		myScan = new Scanner(System.in);
        myRand = new Random(); 
        
    //***************************** variables *******************************

        //inputs
		String name = null;
		String petName = null;
		String actorName = null;
		int petAge = 0;
		int luckyNum = 0;
		int qBackNum = 0;
		int carYear = 0;
		int randNum = 0;
		int magicBall = 0;
		
		//final values
		int petNameNum = 0;
		int doubleRandoNum = 0;
		int actorNameNum = 0;
		int mixedNum = 0;
		int mixedNum2 = 0;
        
        // 3 randos 
        int randInt1 = myRand.nextInt(65);
//        int randInt2 = myRand.nextInt(65); not sure why we needed three of these..
//        int randInt3 = myRand.nextInt(75);
		
		//make sure it's working
		//System.out.println("Hello, World!");
        
		//print three loops from AsciiChars Class
		AsciiChars.printNumbers();
		AsciiChars.printLowerCase();
		AsciiChars.printUpperCase();
		//Ask user for name
		Boolean play = true;
		while (play) {
		    System.out.println("Yo, Mtv Rocks!");

	    //***************************** quiz *******************************
		System.out.println("Please enter your name:");
	    while (!myScan.hasNext()) {
	        System.out.println("Please enter something!");
	        myScan.nextLine();
	    }
	    name = myScan.nextLine();
		System.out.printf("Hello, %s \n", name);
		System.out.println("Would you like to continue to the interactive portion? (y/n)");
		String response = myScan.nextLine();
		//System.out.println(response);
		if (!response.equals("y")) {
			System.out.println("Please come back later to complete the survey");
			return;
		}
		System.out.println("What is the name of your favorite pet?");
		petName = myScan.nextLine();
		System.out.println("What is the age of your favorite pet?");
		petAge = Integer.valueOf(myScan.nextLine());
		System.out.println("What is your lucky number?");
		luckyNum = Integer.valueOf(myScan.nextLine());
		System.out.println("Do you have a favorite quarterback? (y/n)");
		response = myScan.nextLine();
		//System.out.println(response);
		if (response.equals("y")) {
			System.out.println("What is his jersey number?");
			qBackNum = Integer.valueOf(myScan.nextLine());
		}else {
			System.out.println("Let's move on..");
		}
		
		System.out.println("What is two digit model year of your Car?");
		carYear = Integer.valueOf(myScan.nextLine());
		System.out.println("What is the first name of your favorite actor/actress?");
		actorName = myScan.nextLine();
		System.out.println("Enter a random number between 1 and 50");
		randNum = Integer.valueOf(myScan.nextLine());
		
	    //***************************** final calculations *******************************
		//generate final magicBall value
		if(qBackNum!=0) {
			magicBall = checkRange(75, qBackNum);
		}else{
			magicBall = checkRange(75, luckyNum);
		}
		//1. use pet name to generate number
		petNameNum = getNumFromStringChar(2, petName);
		//2. Use the random number between 1 and 50, subtracting one of the generated random numbers.
		if(randNum > randInt1) {
			doubleRandoNum = randNum - randInt1;
		}else {
			doubleRandoNum = randInt1 - randNum;
		}
		//3. Convert the first letter of their favorite actor/actress to an integer and use that value
		actorNameNum = getNumFromStringChar(0, actorName);
		//4. Favorite quarterback number + age of pet + lucky number.
		mixedNum = checkRange(65, (qBackNum + petAge + luckyNum));
		//5. Use the age of their favorite pet + their car model year.
		mixedNum2 = checkRange(65, (petAge + carYear));
		
		
	    //***************************** output *******************************
		System.out.printf(
				"***************************************************\n"
				+ "Lottery numbers: %s, %s, %s, %s, %s. "
				+ "Magic Ball: %s\n"
				+ "***************************************************\n",
				petNameNum, doubleRandoNum, actorNameNum, mixedNum, mixedNum2, magicBall);
		//System.exit(0); - ends program
		System.out.println("Would you like to play again Y/N?");
	    play = myScan.nextLine().trim().equalsIgnoreCase("y"); // "y" will set 'play' to 'true', anything else will set it to 'false'
	}
	System.out.println("Bye");
	}	
	

}
