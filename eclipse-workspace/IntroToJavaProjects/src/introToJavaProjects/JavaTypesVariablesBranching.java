package introToJavaProjects;

// Create a small program that defines some fields.[X]

//Try creating some illegal field names and see what kind of error the compiler produces.[X]
//Use the naming rules and conventions as a guide.[X]

//In the program you created, try leaving the fields uninitialized and print out their values.[X]
//^^ I mean, if it won't work without being public static, not having a value isn't going to improve it, right?


//Try the same with a local variable and see what kind of compiler errors you can produce.[X]
//if you leave uninitialized inside main, it'll tell you it wasn't initialized and the error line #

//Becoming familiar with common compiler errors will make it easier to recognize bugs in your code. 
//Submit your work to your GitHub, and for this assignment submit a link to the repository.

public class JavaTypesVariablesBranching {
	//fields are just variables inside a class
//	String name = "Jeff";
	//^^ declaring this public static will allow it's use inside main ( i guess because it's allowed access??)
	//public static String name = "Jeff";
//	int myNum = 3;
//	boolean myBool = false;
//	double myDbl = 5643432.8987789535544322323232322222;//up to 15 decimal digits and abs value of 
//	float myFloat = 2.4f;//must have the f, or it'll want to be a double :/
//	byte myByte = 126;// if the abs value of your int is 127, you can save three bytes by making it a byte!
//	short Shortie = 32700;//if the abs value of your number is 32700, you can save two bytes with a short!
	

	public static void main(String[] args) {
		// okay, so if the variables are not declared inside main, they won't work?
		// ^^ unless they're declared public and static too... 
//		name = "jeff";
//		System.out.printf("The value of my string is: %s", name);
		double myDbl = 4.3538;
//		System.out.printf("The value of my double is: %d", name); <= %d is not the format specifier for double, it's for decimal int!!
		System.out.println("The value of my double is: " + myDbl);
	}

}
