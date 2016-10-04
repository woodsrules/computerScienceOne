
/*
 * (Physics: finding runway length) Given an airplane’s acceleration a 
 * and take-off speed v, you can compute the minimum runway length needed 
 * for an airplane to take off using the following formula: 
 * length = v^2 / 2a 
 * Write a program that prompts the user to enter v in meters/second (m/s) 
 * and the acceleration a in meters/second squared (m/s^2), and displays the 
 * minimum runway length.
 * 
 * Introduction_to_java_programming_by_Y_Daniel_Liang_10th_edition
 */

import java.util.Scanner;     // This makes the scanner commands available.

public class FindingRunwayLength {

public static void main(String[] args) {
		
    // Ask for v in m/s and a in m/s^2
	Scanner input = new Scanner(System.in);
	double speed;
	double acceleration;
	
	/*
	 * This block of code was from http://stackoverflow.com/questions/3059333/
	 * validating-input-using-java-util-scanner, and from my work on problems
	 *  1 and 2. It checks for invalid entries
	 */
	do {
		System.out.println("Please enter the speed (in meters per second) "
				+ "followed by the rate of acceleration ");
		System.out.print("(in meters per second squared): "); 
				while (!input.hasNextDouble()) {
			System.out.println("Error, please make a valid entry...!");
		    input.next(); // this advances the scanner
		 }
		speed = input.nextDouble();
	     acceleration = input.nextDouble();
	} while (speed <= 0 || acceleration <= 0);
	//System.out.println("Thank you! Got " + speed + " & " + acceleration);
	
	// Calculate the runway length w/ length = v^2 / 2a 
	// http://www.tutorialspoint.com/java/lang/math_pow.htm
	double length = Math.pow(speed, 2) / 2 / acceleration;
	
	// convert to more useful units
	// http://www.metric-conversions.org/length/kilometers-to-miles.htm
	double km = length / 1000 ;
	double miles = length / 1609.34 ;
	
	// Display the minimum runway length 
	// modified from our book
	System.out.println();
	System.out.println("The minimum runway length is " + length + " meters, ");
	System.out.println( km + " kilometers, or ");
	System.out.println( miles + " miles.");
	
}
}
