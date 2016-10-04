
/*
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius 
 * degree in a double value from the console, then converts it to 
 * Fahrenheit and displays the result. The formula for the conversion is 
 * as follows: fahrenheit = (9 / 5) * celsius + 32
 * 
 * Introduction_to_java_programming_by_Y_Daniel_Liang_10th_edition
 */

import java.util.Scanner;   // This makes the scanner commands available.

public class temperatureUnitConversion1 {

	// Start of program
	public static void main(String[] args) {
	
	// I got the idea for this layout from
	// http://stackoverflow.com/questions/15046702/basic-calculator-how-to-
	// allow-user-to-make-multiple-choices-code-works-already
    
	// Prints the Unit conversion choice box to console 
	System.out.println("==========================================");
    System.out.println("|         Temperature Conversion         |");
    System.out.println("==========================================");
    System.out.println("| Options:                               |");
    System.out.println("|        a. Celsius -> Fahrenheit        |");
    System.out.println("|        b. Celsius -> Kelvin            |");
    System.out.println("|        c. Fahrenheit -> Celsius        |");
    System.out.println("|        d. Fahrenheit -> Rankine        |");
    System.out.println("|        e. Kelvin -> Celsius            |");
    System.out.println("|        f. Rankine -> Fahrenheit        |");
    System.out.println("==========================================");
    System.out.println();
	    
    /* This do-while loop asks for input from the conversion table and verifies
     * that the entry is valid. An error will be printed for invalid entries, 
     * and the user will be prompted to try again. The main source for this 
     * block of code was from http://stackoverflow.com/questions/3059333/
     * validating-input-using-java-util-scanner 
     * I also called my brother for a little help, The Ben Woods, 
     *  and I used http://www.tutorialspoint.com/java/java_basic_operators.htm
     */
    Scanner conversionChoice = new Scanner(System.in);
    String menuSelect1;
    do {
    	System.out.println("Please enter a letter for the temperature" 
    			+ " conversion you would like to perform: "); 	
        while (!(conversionChoice.hasNext("a")        
	    	 	|| conversionChoice.hasNext("b")     
	    	 	|| conversionChoice.hasNext("c") 
	    	 	|| conversionChoice.hasNext("d") 
	    	 	|| conversionChoice.hasNext("e") 
	    	 	|| conversionChoice.hasNext("f") 
    		 	)
        	) {
        		System.out.println("Error, please enter a valid selection...");
        		conversionChoice.next(); // this line advances the scanner
         	}
        
        // this line re-defines menuSelect1 to the new letter that was entered. 
        menuSelect1 = conversionChoice.next(); 
    } while (!(menuSelect1.equals("a")
    	 	|| menuSelect1.equals("b")    
    	 	|| menuSelect1.equals("c") 
    	 	|| menuSelect1.equals("d") 
    	 	|| menuSelect1.equals("e") 
    	 	|| menuSelect1.equals("f")
		 	  )
    		);
	 
     // If "a", then ask for temp to convert from Celsius to Fahrenheit.
    if(menuSelect1.equals("a")) {
    	 Scanner tempFinder = new Scanner(System.in); 
    	 System.out.println("Type the temperature that you want to convert "
    			 + "from Celsius to Fahrenheit and press enter: ");
    	 double celsius = tempFinder.nextDouble(); 
    	 
    	 // Fahrenheit = (9.0 / 5) * Celsius + 32 
    	 //	form our textbook.
    	 double fahrenheit = ((9.0 / 5) * celsius + 32);
    	 
    	//print answer 
		 System.out.println(celsius + " Celsius " + "is " +
				 fahrenheit + " Fahrenheit");
     }
    
     // If "b", then ask for temp to convert from Celsius to Kelvin.
     else if(menuSelect1.equals("b")) {
    	 Scanner tempFinder = new Scanner(System.in);
    	 System.out.println("Type the temperature that you want to convert "
    			 + "from Celsius to Kelvin and press enter: ");
    	 double celsius = tempFinder.nextDouble(); 
    	 
    	 // Kelvin = Celsius + 273.15
    	 // From http://www.rapidtables.com/convert/temperature/
    	 // how-celsius-to-kelvin.htm
    	 double kelvin = (celsius + 273.15);
    	 
    	//print answer 
		 System.out.println(celsius + " Celsius " + "is " +
				 kelvin + " Kelvin");
     }
    
     // If "c", then ask for temp to convert from Fahrenheit to Celsius.
     else if(menuSelect1.equals("c")) {
    	 Scanner tempFinder = new Scanner(System.in);
    	 System.out.println("Type the temperature that you want to convert"
    			 + "from Fahrenheit to Celsius and press enter: ");
    	 double fahrenheit = tempFinder.nextDouble();
    	 
    	 // Celsius = (5.0 / 9) * (Fahrenheit + 32) 
    	 //	form our textbook.
    	 double celsius = ((5.0 / 9) * (fahrenheit - 32));
    	 
    	// print answer 
		 System.out.println(fahrenheit + " Fahrenheit " + "is " +
				 celsius + " Celsius");
     }
    
     // If "d", then ask for temp to convert from Fahrenheit to Rankine.
     else if(menuSelect1.equals("d")) {
    	 Scanner tempFinder = new Scanner(System.in);
    	 System.out.println("Type the temperature that you want to convert "
    			 + "from Fahrenheit to Rankine and press enter: ");
    	 double fahrenheit = tempFinder.nextDouble();
    	 
    	 // Rankine = Fahrenheit + 459.67
    	 // From http://www.rapidtables.com/convert/temperature/
    	 // fahrenheit-to-rankine.htm
 	     double rankine = (fahrenheit + 459.67);
 	 
 	     // print answer 
		 System.out.println(fahrenheit + " Fahrenheit " + "is " +
				 rankine + " Rankine");
     }
    
     // If "e", then ask for temp to convert from Kelvin to Celsius.
     else if(menuSelect1.equals("e")) {
    	 Scanner tempFinder = new Scanner(System.in);
    	 System.out.println("Type the temperature that you want to convert "
    			 + "from Kelvin to Celsius and press enter: ");
    	 double kelvin = tempFinder.nextDouble();
    	 
    	 // Celsius = Kelvin - 273.15
    	 // From http://www.rapidtables.com/convert/temperature/
    	 // how-celsius-to-kelvin.htm
 	     double celsius = (kelvin - 273.15);
 	 
 	     // print answer 
		 System.out.println(kelvin + " Kelvin " + "is " +
				 celsius + " Celsius");
     }
    
     // If "f", then ask for temp to convert from Rankine to Fahrenheit.
     else if(menuSelect1.equals("f")) {
    	 Scanner tempFinder = new Scanner(System.in);
    	 System.out.println("Type the temperature that you want to convert "
    			 + "from Rankine to Fahrenheit and press enter: ");
    	 double rankine = tempFinder.nextDouble();
    	 
    	 // Fahrenheit = Rankine - 459.67
    	 // From http://www.rapidtables.com/convert/temperature/
    	 // fahrenheit-to-rankine.htm
 	     double fahrenheit = (rankine - 459.67);
 	 
 	     // print answer 
		 System.out.println(rankine + " Rankine " + "is " +
				 fahrenheit + " Fahrenheit");
     }
	}
}
