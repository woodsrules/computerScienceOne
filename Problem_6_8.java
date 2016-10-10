import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * (Conversions between Celsius and Fahrenheit) Write a class that
 * contains the following two methods: 
 * 
 * Convert from Celsius to Fahrenheit 
 * public static double celsiusToFahrenheit(double celsius) 
 * 
 * Convert from Fahrenheit to Celsius 
 * public static double fahrenheitToCelsius(double fahrenheit) 
 * 
 * The formula for the conversion is: 
 * fahrenheit = (9.0 / 5) * celsius + 32 
 * celsius = (5.0 / 9) * (fahrenheit – 32)
 * 
 * Write a test program that invokes these methods to display the 
 * following tables: 
 * 
 * Celsius Fahrenheit | Fahrenheit Celsius 
 * ---------------------------------------
 *  40.0      104.0   |    120.0    48.89 
 *  39.0      102.2   |    110.0    43.33
 *  ... 
 *  32.0      89.6    |    40.0     4.44
 *  31.0      87.8    |    30.0    -1.11
 */

public class Problem_6_8 {
	
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
	//Convert from Celsius to Fahrenheit 
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheitNew = 0.0;
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheitNew = round(fahrenheit, 2);
	}		  
	//Convert from Fahrenheit to Celsius 
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsiusNew = 0.0;
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsiusNew = round(celsius, 2);
	}
	//prints the conversion table body
	public static void printTable(double num1, double num2) {	
		
		//Setting the input to a string to get character count
		String numberCount1 = Double.toString(num1), 
				numberCount2 = Double.toString(
						celsiusToFahrenheit(num1)),
				numberCount3 = Double.toString(num2),
				numberCount4 = Double.toString(
						fahrenheitToCelsius(num2));
		
		System.out.print(num1);
		
		/*
		 * the following if statements are to account for spacing
		 * changes in the table that arise with different 
		 * character counts.
		 * 
		 */
		if (numberCount1.length() == 5 && 
				numberCount2.length() == 5) {
			System.out.print("        " + celsiusToFahrenheit(num1) +
					"   |   ");
		}
		if (numberCount1.length() == 5 && 
				numberCount2.length() == 4) {
			System.out.print("        " + celsiusToFahrenheit(num1) +
					"    |   ");
		}
		if (numberCount1.length() == 5 && 
				numberCount2.length() == 3) {
			System.out.print("        " + celsiusToFahrenheit(num1) +
					"     |   ");
		}
		if (numberCount1.length() == 4 && 
				numberCount2.length() == 5) {
			System.out.print("         " + celsiusToFahrenheit(num1) +
					"   |   ");
		}
		if (numberCount1.length() == 4 && 
				numberCount2.length() == 4) {
			System.out.print("         " + celsiusToFahrenheit(num1) +
					"    |   ");
		}
		if (numberCount1.length() == 4 && 
				numberCount2.length() == 3) {
			System.out.print("         " + celsiusToFahrenheit(num1) +
					"     |   ");
		}
		if (numberCount1.length() == 3 && 
				numberCount2.length() == 5) {
			System.out.print("          " + celsiusToFahrenheit(num1) +
					"   |   ");
		}
		if (numberCount1.length() == 3 && 
				numberCount2.length() == 4) {
			System.out.print("          " + celsiusToFahrenheit(num1) +
					"    |   ");
		}
		if (numberCount1.length() == 3 && 
				numberCount2.length() == 3) {
			System.out.print("          " + celsiusToFahrenheit(num1) +
					"     |   ");
		}
		
		System.out.print(num2);
		
		if (numberCount3.length() == 5 && 
				numberCount4.length() == 5) {
			System.out.print("        " + fahrenheitToCelsius(num2));
		}
		if (numberCount3.length() == 5 && 
				numberCount4.length() == 4) {
			System.out.print("         " + fahrenheitToCelsius(num2));
		}
		if (numberCount3.length() == 5 && 
				numberCount4.length() == 3) {
			System.out.print("          " + fahrenheitToCelsius(num2));
		}
		if (numberCount3.length() == 4 && 
				numberCount4.length() == 5) {
			System.out.print("         " + fahrenheitToCelsius(num2));
		}
		if (numberCount3.length() == 4 && 
				numberCount4.length() == 4) {
			System.out.print("          " + fahrenheitToCelsius(num2));
		}
		if (numberCount3.length() == 4 && 
				numberCount4.length() == 3) {
			System.out.print("           " + fahrenheitToCelsius(num2));
		}
		if (numberCount3.length() == 3 && 
				numberCount4.length() == 5) {
			System.out.print("          " + fahrenheitToCelsius(num2));
		}
		if (numberCount3.length() == 3 && 
				numberCount4.length() == 4) {
			System.out.print("           " + fahrenheitToCelsius(num2));
		}
		if (numberCount3.length() == 3 && 
				numberCount4.length() == 3) {
			System.out.print("            " + 
				fahrenheitToCelsius(num2));
		}
		System.out.println();
	}
	//the key to the battleship
	public static void main(String[] args) {
		double fahrenheit = 120.0, celsius = 40.0;
		
		//conversion table heading
		System.out.println("Celsius   Fahrenheit | Fahrenheit   " +
				"Celsius");
		System.out.println("----------------------------------" +
				"---------");
		while (fahrenheit >= 30.0) {
			printTable(celsius, fahrenheit);
			fahrenheit --;
			celsius --;
		}
	}
}
