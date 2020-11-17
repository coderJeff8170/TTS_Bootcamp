package classes;

public class Calculator {
	//instance variables - do we even need these when the method expects them?
//	private int num1;
//	private int num2;
	
	//constructors
	public Calculator() {
		
	}
	
	//methods
	public int add (int num1, int num2) {
		return num1 + num2;
	}
	public int subtract (int num1, int num2) {
		return num1 - num2;
	}
	public int multiply (int num1, int num2) {
		return num1 * num2;
	}
	public float divide (float num1, float num2) {
		return num1 / num2;
	}
	public int square (int num1) {
		return num1 * num1;
	}
	
}


