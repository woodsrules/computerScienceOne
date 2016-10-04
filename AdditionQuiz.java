
/*
 * (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates
 * a subtraction question. Revise the program to randomly generate an addition 
 * question with two integers less than 100.
 */

//I pulled code from listing 3.3 to modify

import java.util.Scanner;

public class AdditionQuiz {

public static void main(String[] args) {

String toContinue;
//Using a do_while statement to allow for multiple runs of the program.
do {	
	
	/*
	 * set up a random number generator to help make 
	 * additional numbers, so that digits from 0 to 99
	 * can be used. 
	 */
	int number1 = 0, number2 = 0;
	double integerSelector = Math.random();
	//System.out.println(integerSelector);
	
	// Generate two random two-digit integers 
	// when 0.0 <= integerSelector < 0.33
	if (integerSelector < .33) {
		number1 = (int)(Math.random() * 100);
		number2 = (int)(Math.random() * 100);
		//System.out.println(number1);
		//System.out.println(number2);
	}
	// Generate a random one-digit integer and a two-digit integer
	// when 0.33 <= integerSelector < 0.66
	else if (integerSelector < 0.66) {
		number1 = (int)(Math.random() * 10);
		number2 = (int)(Math.random() * 100);
		//System.out.println(number1);
		//System.out.println(number2);
	}
	// Generate two random one-digit integers
	// when 0.66 <= integerSelector < 1.0
	else if (integerSelector < 1.0) {
		number1 = (int)(Math.random() * 10);
		number2 = (int)(Math.random() * 10);
		//System.out.println(number1);
		//System.out.println(number2);
	}
	Scanner input = new Scanner(System.in);
	// Ask for user input
	System.out.print("What is " + number1 + " + " + number2 + "? ");
	int answer = input.nextInt(); // places user input in answer
	
	// Grade the answer and display the result
	if (number1 + number2 == answer)
		System.out.println("You are correct!");
	else {
		System.out.println("Your answer is wrong.");
		System.out.println(number1 + " + " + number2 +
				" should be " + (number1 + number2));
	}
	
	// This block of code is to see if the user would like to
	// restart the program. This was copied from problem 1.
	String wishToContinue;
	Scanner choice = new Scanner(System.in); 
	System.out.print("Do you want to try another problem? ");
	wishToContinue = choice.next();
		
	/* https://msdn.microsoft.com/en-us/library/aa987503(v=vs.80).aspx
	 * for info on .equalsIgnoreCase() so that the answer is not case sensitive.
	 * Loop will continue until a valid entry is made. "Yes" will result in 
	 * the program running again. "No" will cause the program to end. 
	 */ 
   while (!(wishToContinue.equalsIgnoreCase("yes") 
	    	|| wishToContinue.equalsIgnoreCase("no"))) {
	        System.out.println("Error, please enter a valid selection...");
	        wishToContinue = choice.next(); // this line advances the scanner
   }
   if (wishToContinue.equalsIgnoreCase("no")) {
	   System.out.println("Live long and prosper.");	
   } 
   toContinue = wishToContinue;
		
} while (toContinue.equalsIgnoreCase("yes")); 
}
}
