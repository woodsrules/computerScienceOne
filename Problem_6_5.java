
/*
 * (Sort three numbers) Write a method with the following header 
 * to display three numbers in increasing order:
 * 
 * public static void displaySortedNumbers(double num1, double num2, 
 * double num3) 
 * 
 * Write a test program that prompts the user to enter three numbers 
 * and invokes the method to display them in increasing order.
 */

import java.util.Scanner;

public class Problem_6_5 {
	
	/* pulled the header from our book. 
	 * This method will be used to sort a series of three
	 * numbers obtained from a user. They will be sorted from 
	 * least to greatest.
	 */
	public static void displaySortedNumbersAscending(double num1,
			double num2, double num3) {
		
		double tempNum1, tempNum2;
		
		boolean theMaster = true;
		
		//This is the sorting algorithm for ascending order 
		while(theMaster) {	
			if (num1 > num2) {
				tempNum1 = num1;
				num1 = num2;
				num2 = tempNum1;
			}
			if (num2 > num3) {
				tempNum2 = num2;
				num2 = num3;
				num3 = tempNum2;
			}
			if (num1 < num2 && num1 < num3 && num2 < num3) {
				theMaster = false;
			}
		}
		System.out.println(num1 + " < " +  num2 + " < " +  num3);	
	}
	
	/* This method will be used to sort a series of three
	 * numbers obtained from a user. They will be sorted from 
	 * greatest to least.
	 */
	public static void displaySortedNumbersDescending(double num1,
			double num2, double num3) {
		
		double tempNum2, tempNum3;
		
		boolean theMaster = true;
		
		//this is the sorting algorithm for descending order
		while(theMaster) {		
			if (num3 > num2) {
				tempNum3 = num3;
				num3 = num2;
				num2 = tempNum3;
			}
			if (num2 > num1) {
				tempNum2 = num2;
				num2 = num1;
				num1 = tempNum2;
			}
			if (num1 > num2 && num1 > num3 && num2 > num3) {
				theMaster = false;
			}
		}
		System.out.println(num1 + " > " +  num2 + " > " +  num3);	
	}
	
	//This is the key to the battleship
	public static void main(String[] args) {
		
		double num1, num2, num3;
		
		Scanner numInput = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);
		
		//Ask for input of three numbers and set to variables
		System.out.print("Please enter three numbers you would " +
				"like to have sorted: ");
		num1 = numInput.nextDouble();
		num2 = numInput.nextDouble();
		num3 = numInput.nextDouble();
		//System.out.print("You entered " + num1 + " " + 
				//num2 + " " + num3);
		
		//Asking for ascending or descending order
		System.out.println("Would you like these numbers to be " +
				"printed in ascending or descending order? ");
		String answer = stringInput.next();
		
		// calls method for ascending order
		if (answer.equalsIgnoreCase("ascending")) {
			displaySortedNumbersAscending(num1, num2, num3);
		}
		
		// calls method for descending order
		else if (answer.equalsIgnoreCase("descending")) {
			displaySortedNumbersDescending(num1, num2, num3);		
		}
	}
}
