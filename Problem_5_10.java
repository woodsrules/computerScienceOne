
/*
 * Problem 5.10 form Introduction to java programming 
 * by Y Daniel Liang 10th edition
 * (Find numbers divisible by 5 and 6) Write a program that displays 
 * all the numbers from 100 to 1,000, ten per line, that are divisible 
 * by 5 and 6. Numbers are to be separated by exactly one space.
 */

public class Problem_5_10 {

	public static void main(String[] args) {
		
		int numbers, count = 0;
		
			for (numbers = 100; numbers <= 1000; numbers++){
			
				if (numbers % 5 == 0 && numbers % 6 == 0){
					System.out.print(numbers + " ");
					count ++;
				}
			
				if (count == 10){
					System.out.println();
					count = 0;
				}
			}

	}

}
