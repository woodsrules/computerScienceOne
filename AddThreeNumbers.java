
/*
 * (Game: add three numbers) The program in Listing 3.1,
 * AdditionQuiz.java, generates two integers and prompts 
 * the user to enter the sum of these two integers. Revise 
 * the program to generate three single-digit integers and 
 * prompt the user to enter the sum of these three integers.
 */

/*
 * The problem has been modified to not only allow for addition games,
 * but it also tests with other mathematical operators. The problems
 * will generate on a random bases. 
 */

import java.util.Scanner;

public class AddThreeNumbers {

public static void main(String[] args) {
	
String toContinue;
	
//Using a do_while statement so the program can be run multiple times. 
do{	
	// Using Math.random() to generate random numbers, which will
	// effect which if_else statement is read.  
	// Found the Math.random() method in our book. 
	int randomChoice = (int)(Math.random() * 10);
		//System.out.println(randomChoice);
	
	// from listing 3.1 in the book.
	int number1 = (int)(System.currentTimeMillis() % 10);
	int number2 = (int)(System.currentTimeMillis() / 7 % 10);
	int number3 = (int)(System.currentTimeMillis() / 3 % 10); //new line

	// Addition of 3 numbers when Math.random() is either 0 or .1
	if (randomChoice <= 1){
		//System.out.println("random number: 0-1");  //test print
		Scanner input = new Scanner(System.in); 	// Creates a Scanner
		System.out.print("What is " + number1 + " + " + number2 
				+ " + " + number3 + "? "); //asks for a solution
		int number = input.nextInt();	//places input in number
		
		//checking for incorrect answer, and asking for another attempt
		//if necessary. 
		while (number1 + number2 + number3 != number) {
			System.out.println(number1 + " + " + number2 + " + " + number3 
					+ " = " + number + " is false.");
        	System.out.print("Wow, that's embarrassing. "
					+ "\nTry again.");
        	number = input.nextInt(); //replaces number with new input
		}	
		//checking for correct answer
		if (number1 + number2 + number3 == number){
			System.out.println(number1 + " + " + number2 + " + " + number3 
					+ " = " + number + " is true.");
		}
	}	
	// Multiplication of 3 numbers when Math.random() is either .2 or .3
	else if (randomChoice <= 3){
		//System.out.println("random number: 2-3");  //test print
		Scanner input = new Scanner(System.in); 	// Creates a Scanner
		System.out.print("What is " + number1 + " X " + number2 
				+ " X " + number3 + "? ");  //asking for user input
		int number = input.nextInt(); //places user input in number
		
		//checking for incorrect answer, and asking for another attempt
		//if necessary.
		while (number1 * number2 * number3 != number) {
			System.out.println(number1 + " X " + number2 + " X " + number3 
					+ " = " + number + " is false.");
        	System.out.print("Surely you can do better than that. "
					+ "\nTry again.");
        	number = input.nextInt();  //replaces number with new input
		}	
		// checking for correct answer.
		if (number1 * number2 * number3 == number){
			System.out.println(number1 + " X " + number2 + " X " + number3 
					+ " = " + number + " is true.");
		}	
	}	

	// Division of 3 numbers when Math.random() is either 4 or 5
	else if (randomChoice <= 5){
		//System.out.println("random number: 4-5");  //test print
		
		// changing numbers 1,2, and 3 from int to double.
		// for more accurate division
		double number1Double = number1;
		double number2Double = number2;
		double number3Double = number3;
		//System.out.println(number1Double / number1Double / number1Double);
		
		Scanner input = new Scanner(System.in);   // Creates a Scanner
		System.out.print("What is " + number1 + " / " + number2 
				+ " / " + number3 + "? ");  //asks for user input
		double number = input.nextDouble(); //places input in number as double
		
		// Idea from book to get more accurate match on division answers by 
		// using an epsilon delta argument.
		final double EPSILON = 0.01;
		
		//checking for incorrect answer, and asking for another attempt
		//if necessary. 
		while (!(Math.abs(number-(number1Double / number2Double 
				/ number3Double)) <= EPSILON)) {
			System.out.println(number1 + " / " + number2 + " / " + number3 
					+ " = " + number + " is false.");
        	System.out.print("Maybe you should look into buying "
					+ "a calculator." + "\nTry again.");
        	number = input.nextDouble();  //replaces number with new input
		}	
		//checking for correct answer
		if (Math.abs(number-(number1Double / number2Double / number3Double)) 
				<= EPSILON) {
			System.out.println(number1 + " / " + number2 + " / " + number3 
					+ " = " + number + " is true.");
		}	
	}	
	// Subtraction of 3 numbers when Math.random() is either 6 or 7
	else if (randomChoice <= 7){
		//System.out.println("random number: 6-7");  //test print
		Scanner input = new Scanner(System.in);  //creates a scanner
		System.out.print("What is " + number1 + " - " + number2 
				+ " - " + number3 + "? ");  //asks for user input
		int number = input.nextInt();  //places user input in number
		
		//checking for incorrect answer, and asking for another attempt
		//if necessary.
		while (number1 - number2 - number3 != number) {
			System.out.println(number1 + " - " + number2 + " - " + number3 
					+ " = " + number + " is false.");
        	System.out.print("Arithmetic must not be your strong suit. "
					+ "\nTry again.");
        	number = input.nextInt(); //replaces number with new input
		}	
		//checking for correct answer.
		if (number1 - number2 - number3 == number){
			System.out.println(number1 + " - " + number2 + " - " + number3 
					+ " = " + number + " is true.");
		}
	}	
	// mixed functions applied to 3 numbers when Math.random() is either 8 or 9
	else{
		//System.out.println("random number: 8-9");  //test print
		Scanner input = new Scanner(System.in);  //creates a scanner
		System.out.print("What is " + number1 + " + " + number2 
				+ " X " + number3 + "? ");
		int number = input.nextInt();	 //places user input in number
		
		//checking for incorrect order of operations, and asking for another 
		//attempt if necessary.
		while ((number1 + number2) * number3 == number) {
				System.out.println(number1 + " + " + number2 + " X " 
						+ number3 + " = " + number + " is false.");
	        	System.out.print("Check your order of operations, and "
						+ "try again.");
	        	number = input.nextInt(); //replaces number with new input
	    }
		//checking for incorrect answer, and asking for another attempt
		//if necessary.
		while (number1 + number2 * number3 != number) {
			System.out.println(number1 + " + " + number2 + " X " + number3 
					+ " = " + number + " is false.");
        	System.out.print("You can do better than that. "
					+ "\nTry again.");
        	number = input.nextInt(); //replaces number with new input
		}
		//checking for correct answer
		if (number1 + number2 * number3 == number) {
			System.out.println(number1 + " + " + number2 + " X " + number3 
					+ " = " + number + " is true.");
		}
	}
	// This block of code is to see if the user would like to
	// restart the program.
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
} while(toContinue.equalsIgnoreCase("yes")); 	
}
}
