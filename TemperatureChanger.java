/*
*  Convert user input in the format xxxF or yyyC from Celsius to Farenheit
*
*  @author Kent Collins
*  @version 25 September, 2014
**/

import java.util.Scanner;

public class TemperatureChanger {

  public static void main (String[] args) {

	double result = 0;

	//Create the Scanner and assign the next input to a string.

	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter a number followed by a unit to convert to the other. Ex: 32F...");
	String input = scnr.next();

	
	//Test if the input ends with C or F

	if (input.charAt(input.length()-1) == 'C') {
		
		//Remove the type and expose the number.
		String number = input.substring(0, input.length()-1);

		//Convert to a double.
		double inputNumber = Double.parseDouble(number);
		
		//Perform conversion and print out the result.
		result = (((inputNumber*9)/5) + 32);
		System.out.println(result+"F");
	}

	if (input.charAt(input.length()-1) == 'F') {

		//Remove the type and expose the number.		
		String number = input.substring(0, input.length()-1);

		//Convert to a double.
		double inputNumber = Double.parseDouble(number);

		//Perform conversion and print out the result.
		result = (((inputNumber-32)*5)/9);
		System.out.println(result+"C"); 
	}
  }
  
}


