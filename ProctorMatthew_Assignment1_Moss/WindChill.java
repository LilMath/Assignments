/*
 * author: Matthew Proctor
 * This class calculates the wind chill using input variables
 */

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		//variable declarations
		double v; //wind speed
		double t; //temperature
		final double windChill; //windChill
		final String programmer = "Matthew Proctor"; //programmer
		
		//Program Header
		System.out.println("Wind Chill Calculator \n");
		
		
		//Creates scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//Asks and gets temperature
		System.out.println("Please enter the temperature in Fahrenheit (temperature must be "
				+ ">= -45 and <= 40):");
		t = keyboard.nextDouble();
		
		//Asks and gets wind speed
		System.out.println("Please enter the wind speed in MPH (wind speed must be >= 5 and <= 60):");
		v = keyboard.nextDouble();
		
		//Closes scanner
		keyboard.close();
		
		//Calculates wind chill using given formula
		windChill = 35.74 + (0.6215 * t) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * t * Math.pow(v, 0.16));
		
		//Displays wind chill
		System.out.println("Wind chill temperature: " + windChill + "\n");
		
		//Displays programmer name:
		System.out.print("Programmer: " + programmer);
	}

}
