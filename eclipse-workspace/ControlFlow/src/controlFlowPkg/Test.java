package controlFlowPkg;
import java.util.Scanner;
import java.util.Random;

public class Test {
	//object instantiation
	public static void isBalanced (String input){

        //get first half
        String string1 = input.substring(0, (input.length()/2)-1);
        //get second half
        String string2 = input.substring(input.length()/2);
        System.out.println(string1);
        System.out.println(string1);
        //compare the two
//        if(string1 == string2){
//            return true;
//        }else{
//            return false;
//        }
    
	}

	public static void main(String[] args) {

//substring​(int beginIndex, int endIndex)
		
		String jeff = "oooo";
		isBalanced("jeff");
//		String firstHalf = jeff.substring(0, (jeff.length()/2));
//		String secondHalf = jeff.substring(jeff.length()/2);
//		System.out.println(firstHalf);
//		System.out.println(secondHalf);
		
	}

}
