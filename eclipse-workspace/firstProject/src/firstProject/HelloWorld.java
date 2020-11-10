package firstProject;
import java.util.Scanner;

public class HelloWorld {
	//my first program!
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.println("Hello, World \n");
		//System.out.print("It was an awesome weekend! \n");
		System.out.println("What is your first name? \n");
		String firstName = input.nextLine();
		System.out.println("What is your last name? \n");
		String lastName = input.nextLine();
		System.out.printf("Hello, %s %s! \n", firstName, lastName);
		System.out.printf("Goodbye, %s %s! \n", firstName, lastName);
	}
}
