package controlFlowPkg;
import java.util.Scanner;

public class NoInputLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input="";
	
		do {
		    System.out.println("Enter a string: ");
		    input = sc.nextLine();
		}
		     while (input == null || input.trim().length() == 0);
		    
		
		System.out.printf("Your answer was %s ", input);
		sc.close();
}
}
