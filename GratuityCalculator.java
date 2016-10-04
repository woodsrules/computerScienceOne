
/*
 * (Financial application: calculate tips) Write a program that reads the 
 * subtotal and the gratuity rate, then computes the gratuity and total. 
 * For example, if the user enters 10 for subtotal and 15% for gratuity 
 * rate, the program displays $1.5 as gratuity and $11.5 as total.
 * 
 *  Introduction_to_java_programming_by_Y_Daniel_Liang_10th_edition
 */

import java.util.Scanner;     // This makes the scanner commands available.

public class GratuityCalculator {

public static void main(String[] args) {
	
/* This block of code was from http://stackoverflow.com/questions/3059333/
 * validating-input-using-java-util-scanner, and from my work on problem 1.
 * Ask for the subtotal and gratuity rate to be entered, and it verifies that
 * entries are valid.
 */
Scanner input = new Scanner(System.in);
double subtotal;
double gratuityRate;
do {
	System.out.print("Please enter the subtotal followed " 
			+ "by the gratuity rate: ");
	while (!input.hasNextDouble()) {
		System.out.println("Error, please make a valid entry...!");
	    input.next(); // this advances the scanner
	 }
	 subtotal = input.nextDouble();
     gratuityRate = input.nextDouble();
} while (subtotal <= 0 || gratuityRate <= 0);
//System.out.println("Thank you! Got " + subtotal + " & " + gratuityRate);
	    
// This little guy makes sure that our waiters get a fair wage. 
if (gratuityRate < 20.0){
	Scanner input2 = new Scanner(System.in);
	do {
		System.out.println("Let's make sure our waiters get more than"
				+ " minimum wage. Enter at least 20%!!!");
	     while (!input2.hasNextDouble()) {
	    	 System.out.println("Error, please make a valid entry...!");
	    	 input2.next(); // this advances the scanner
	      }
	      gratuityRate = input2.nextDouble();
	  } while (gratuityRate < 20.0);
	  //System.out.println("The gratuity is $" + gratuity + " and the total"
	  			//+ " is $" + totalBill);
}
	    
// Calculate gratuity
double gratuity = subtotal * gratuityRate / 100;
//System.out.println("The gratuity is $" + gratuity);

// Calculate total bill
double totalBill = subtotal + gratuity;
    
// Display gratuity and total
// Pulled code from book
System.out.println("The gratuity is $" + gratuity + " and the total"
		+ " is $" + totalBill);
	    
	}

}
