
/*
 * Problem 5.23 form Introduction to java programming 
 * by Y Daniel Liang 10th edition
 * (Demonstrate cancellation errors) A cancellation error occurs when 
 * you are manipulating a very large number with a very small number. 
 * The large number may cancel out the smaller number. For example, the 
 * result of 100000000.0 + 0.000000001 is equal to 100000000.0. To 
 * avoid cancellation errors and obtain more accurate results, carefully 
 * select the order of computation. For example, in computing the 
 * following series, you will obtain more accurate results by computing 
 * from right to left rather than from left to right: 
 *                    1 + 1/2 + 1/3 + ... + 1/n
 * Write a program that compares the results of the summation of the 
 * preceding series, computing from left to right and from right to 
 * left with n = 50000.
 */

public class Problem_5_23 {

	public static void main(String[] args) {
		
		double denominator, nthFraction, sumSeriesRightToLeft = 0.0, 
				sumSeriesLeftToRight = 0.0;
		
		//A for loop to sum the series from right to left
		for (denominator = 50000; denominator >= 1; 
				denominator--) {
			nthFraction = 1.0 / denominator;
			sumSeriesRightToLeft += nthFraction;
			//System.out.println(sumSeriesRightToLeft);
		}
		
		//A for loop to sum the series from left to right
		for (denominator = 1; denominator <= 50000; 
				denominator++) {
			nthFraction = 1.0 / denominator;
			sumSeriesLeftToRight += nthFraction;
			//System.out.println(sumSeriesLeftToRight);
		}
		
		System.out.println("The series total when added from left "
				+ "to right is " + sumSeriesLeftToRight + ".");
		System.out.println("The series total when added from right "
				+ "to left is " + sumSeriesRightToLeft + ", \nwhich"
				+ " is " + sumSeriesRightToLeft / sumSeriesLeftToRight
				+ " times larger than when added from "
				+ "\nleft to right.");
		
	}

}
