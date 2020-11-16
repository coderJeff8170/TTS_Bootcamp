package controlFlowPkg;

public class AsciiChars {
	public static void printNumbers()
	  {
	    //print valid numeric input
		//48 to 57
		for(char i=48; i<=57; i++) {
			System.out.print(i);
		}
		  System.out.println("\n");
	  }

	  public static void printLowerCase()
	  {
	    //print valid lowercase alphabetic input
		//65 to 90
		  for(char i=65; i<=90; i++) {
				System.out.print(i);
			}
		  System.out.println("\n");
	  }

	  public static void printUpperCase()
	  {
	    //print valid uppercase alphabetic input
		// 97 to 122
		  for(char i=97; i<=122; i++) {
				System.out.print(i);
			}
		  System.out.println("\n");
	  }
}
