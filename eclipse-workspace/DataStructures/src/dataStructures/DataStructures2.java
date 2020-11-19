package dataStructures;
import java.lang.reflect.Array;
//import java.util.Math;

import java.util.Arrays;

public class DataStructures2 {
	
	//sum an array method
	public static int sumArray (int[] arr) {
		int sum=0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//to power method
	public static int[] toPower(int size, int power) {
		int pwrArray[] = new int[size]; 
		for (int i = 0; i < pwrArray.length; i++) {
			 //pwrArray[i]=Math.pow(i, power);
			pwrArray[i]=i;
			//System.out.println(pwrArray[i]);
			}
		for (int j = 0; j < pwrArray.length; j++) {
			int mult = pwrArray[j];
			for(int k = 0; k<power-1; k++) {
				pwrArray[j]*=mult;
				//System.out.println(pwrArray[j]);
			}
		}
		
		return pwrArray;
	}
	

	public static void main(String[] args) {
		
		int[] myArray = {1, 2, 3, 4, 5};
		
		double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++){

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ];

                  index = i;
             }
        }
        System.out.println(index);
        //well, if you fix the two syntax errors, the output will be 2, because once the largest
        //number has been reached, index will stop incrementing...
        
        System.out.println(sumArray(myArray));//15
        
        int[] arrayNum = toPower(6, 3);
        
        for(int i : arrayNum) {
        	System.out.println(i);
        }
        
        //System.out.println(arrayNum[3]);

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
	

}
