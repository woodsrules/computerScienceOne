import javax.rmi.CORBA.Util;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {

	// Start of program
	public static void main(String[] args) {
		
		//Imported code from Introduction_to_java_programming_by_Y_Daniel_Liang_10th_edition
		
		Scanner input = new Scanner(System.in);
		
		// Starting with Fahrenheit
		 //System.out.print("Enter a degree in Fahrenheit: ");
		 //double fahrenheit = input.nextDouble();
		
		// Starting with Celsius
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		 // Convert Fahrenheit to Celsius
		 //double celsius = (5.0 / 9) * (fahrenheit - 32);
		 //System.out.println("Fahrenheit " + fahrenheit + " is " +
		 //celsius + " in Celsius");
		 
		 // Convert Celsius to Fahrenheit with
		 // fahrenheit = (9 / 5) * celsius + 32
		 double fahrenheit = (9.0 / 5) * celsius + 32;
		 
		 //print answer 
		 System.out.println("Celsius " + celsius + " is " +
		 fahrenheit + " in Fahrenheit");
		
		 }
 }
