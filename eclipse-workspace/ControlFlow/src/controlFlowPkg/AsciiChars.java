package controlFlowPkg;

public class AsciiChars {
	public static void printNumbers()
	  {
	    // TODO: print valid numeric input
		System.out.println("I'm a number");
		//48 to 57
		for(char i=48; i<=57; i++) {
			System.out.println(i);
		}
	  }

	  public static void printLowerCase()
	  {
	    // TODO: print valid lowercase alphabetic input
		//65 to 90
		  for(char i=65; i<=90; i++) {
				System.out.println(i);
			}
	  }

	  public static void printUpperCase()
	  {
	    // TODO: print valid uppercase alphabetic input
		// 97 to 122
		  for(char i=97; i<=122; i++) {
				System.out.println(i);
			}
	  }
}
