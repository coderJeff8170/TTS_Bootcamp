package dataStructures;
import java.lang.reflect.Array;
import java.util.Arrays;

public class DataStructures2 {
	
	static int sumArray (Array array) {
		int sum=0;
		for(int i = 0; i<array.length(); i++) {
			sum += array.getInt(i);
		}
		return sum;
	}
	

	public static void main(String[] args) {
		
		int[] myArray = {1, 2, 3, 4, 5};
		
		

	}

}
/*
 * Write a program to sum all the values of a given Array in Java.
What is the output?
          double[ ] exampleArray = {1,5,6,5,4,1};

          double maximum = examplesArray[0];

          int index = 0;

          for (int i = 1; i<exampleArray.length>; i++){

               if (exampleArray[ i ] > maximum) {

                    maximum = exampleArray[ i ];

                    index = i;

               }

          }

          System.out.println(index);

Write a public static method called "toPower" that takes in as parameters two integers called size and power.
The method should return an array of size "size" with each array index raised to the value of "power."
So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should
return the following result: [0,1,4,9].
 */
*/