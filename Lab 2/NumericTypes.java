/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;

public class NumericTypes {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here 
		Scanner input = new Scanner(System.in);
		//identifier declarations
		final int NUMBER = 2; // number of scores
		int score1 = 100; // first test score
		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user�s temperature
		int newTemp;
		//Task #2 prompt user to input score1
		System.out.println("Please enter score 1: ");
		//Task #2 read score1 
		score1 = input.nextInt();
		//Task #2 prompt user to input score2
		System.out.println("Please enter  score 2: ");
		//Task #2 read score2 
		score2 = input.nextInt();
		// Find an arithmetic average
		average = (double) (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (double) (BOILING_IN_F - 32) * 5 / 9;
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		//Task #2 prompt user to input another temperature
		System.out.println("Please enter a temperature in Fahrenheit: ");
		//Task #2 read the user�s temperature in Fahrenheit
		newTemp = input.nextInt();
		//Task #2 convert the user�s temperature to Celsius
		double tempCelsius = (double) (newTemp - 32) * 5 / 9;
		//Task #2 print the user�s temperature in Celsius
		String output2 = newTemp + " in Fahrenheit is " + tempCelsius + " in Celsius.";
		input.close();
		System.out.println(output2);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}

