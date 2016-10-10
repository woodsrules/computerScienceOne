
/*
 * (Sum series) Write a method to compute the following series:
 * m(i) = 1/2 + 2/3 + ... + i/(i + 1)
 * 
 * Write a test program that displays the following table:
 * i             m(i)
 * ------------------
 * 1           0.5000
 * 2           1.1667
 * ...
 * 19         16.4023
 * 20         17.3546
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Problem_6_13 {
	
	/*
	 * Got this method from http://stackoverflow.com/questions/2808535
	 * /round-a-double-to-2-decimal-places
	 * for rounding off at two decimal places
	 */
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	//a method for printing a table of summations
	public static void printTable(double numStart, double numSum) {	
		System.out.println(numStart + "            " + round(numSum, 2));
	}
	
	//A custom method for the summation of a series that starts and
	//ends based on user input.
	public static double sumSeries(double numStart, double numEnd) {
		double sumSeries = 0;
		for (double num1 = numStart; num1 <= numEnd; num1++) {
			sumSeries += num1 / (num1 + 1.0);
			
			//call the printTable method for specific 
			//summation values
			printTable(num1, sumSeries);
		}
		return sumSeries;
	}
	
	//The key to the battleship
	public static void main(String[] args) {

		//Ask for user input to start the summation
		Scanner input = new Scanner(System.in);
		System.out.print("This program will sum a seris " +
				"consisting of i/(i+1).\nPlease enter a " +
				"value for i, with which you would like to start " +
				"\nthe summation: ");
		double numStart = input.nextDouble();
		System.out.println();
		
		//Asking for a final i value
		System.out.print("Please enter a final value for i: ");
		double numEnd = input.nextDouble();
		System.out.println();
		
		//print table heading
		System.out.println("i                 m(i)");
		System.out.println("----------------------");
		
		//Call the summation method
		sumSeries(numStart, numEnd);
	}
}
