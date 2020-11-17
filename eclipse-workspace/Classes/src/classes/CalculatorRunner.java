package classes;

public class CalculatorRunner {

	public static void main(String[] args) {
		// call the calculator and magic calculator here
		Calculator myCalc = new Calculator();
		MagicCalculator myMajCalc = new MagicCalculator();
		
		System.out.println(myCalc.divide(5,  6));
		System.out.println(myMajCalc.sine(6));
	}

}
