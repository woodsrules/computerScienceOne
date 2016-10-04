/*
 * Problem 5.1 form Introduction to java programming 
 * by Y Daniel Liang 10th edition
 * (Count positive and negative numbers and compute the average 
 * of numbers) Write a program that reads an unspecified number of 
 * integers, determines how many positive and negative values have 
 * been read, and computes the total and average of the input values 
 * (not counting zeros). Your program ends with the input 0. Display 
 * the average as a floating-point number.
 * 
 */

import java.util.Scanner;

public class Problem_5_1 {

	public static void main(String[] args) {
		
		//Request input of unspecified number of integers.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter positive or negative integers to "
				+ "your hears desire. \nJust make sure to hit ENTER "
				+ "between each integer. \nAlso, the program will "
				+ "terminate when 0 is entered.");
		
		//Defining some variables
		int numbers = 0, numbersPositive = 0, numbersNegative = 0, 
				numbersSum = 0, numberOfNumbers = 0;
		float numbersAverage;
		
		/*Got the idea for some of this from 
		 * http://stackoverflow.com/questions/22647352/
		 * how-to-sum-any-amount-of-user-inputted-numbers-from-a-
		 * single-line
		 */
		do {
			numbers = input.nextInt();
			
			//keeps a running sum of entered integers
			numbersSum += numbers; 
			//System.out.println(numbers);
			//System.out.println(numbersSum);
			
			if (numbers != 0){
				numberOfNumbers ++; //tracks # of integers entered
			}
			
			if (numbers > 0){
				numbersPositive ++; //Tracks # of positive integers
			}
			
			if (numbers < 0){
				numbersNegative ++; //Tracks # of negative integers
			}
			
			//System.out.println(numbersPositive); 
			//System.out.println(numbersNegative);
			
		} while (numbers != 0); //Keeps the loop running until 
								//0 entered
		
		/*
		 * The following if else statements are just used to account
		 * for grammar issues that could arise. 
		 */
		if (numbersNegative == 1 && numbersPositive == 1){
			System.out.println("You entered " + numberOfNumbers
					+ " integers, " + numbersPositive + " of which was "
					+ "positive. The other " + numbersNegative 
					+ " was negative."); 
		}
		
		else if (numbersNegative == 1){
			System.out.println("You entered " + numberOfNumbers
					+ " integers, " + numbersPositive + " of which were "
					+ "positive. The other " + numbersNegative 
					+ " was negative."); 
		}
		
		else if (numbersPositive == 1){
			System.out.println("You entered " + numberOfNumbers
					+ " integers, " + numbersPositive + " of which was "
					+ "positive. The other " + numbersNegative 
					+ " were negative."); 
		}
		
		numbersAverage = numbersSum / (numberOfNumbers * 1.0f);
		System.out.println("The sum of the integers that you entered is "
				+ numbersSum + ", and the average is "
				+ numbersAverage + ".");
		

	}

}
