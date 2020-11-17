package classes;
import java.lang.Math;

public class MagicCalculator extends Calculator {
	public MagicCalculator() {
		
	}
	//methods
		public double sqrt (double num1) {
			return Math.sqrt(num1);
		}
		//sine cosine tangent factorial
		public double sine (double num1) {
			return Math.sin(num1);
		}
		public double cosine (double num1) {
			return Math.cos(num1);
		}
		public int factorial (int num1) {
			int fact = 1;
			for(int i=1; i<=num1; i++) {
				fact = fact*i;
			}
			return fact;
		}
		
}
