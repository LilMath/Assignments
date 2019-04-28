/*
 * author: Matthew Proctor
 * Lab3
 */

import java.util.Scanner; //Import Scanner class

public class MovieDriver {

	public static void main(String[] args) {
		
		//Initialize loop condition variable
		char c = 0;
		
		//Create scanner object
		Scanner stdin = new Scanner(System.in);
		
		//Create Movie object (default constructor)
		Movie movie = new Movie();
		
		do {	
			//Prompts user for movie title
			System.out.println("Please enter a movie title: ");
			//Reads movie title
			String title = stdin.nextLine();
			//Sets title
			movie.setTitle(title);
		
			//Prompts user for movie rating
			System.out.println("Please enter a movie rating: ");;
			//Reads movie rating
			String rating = stdin.nextLine();
			//Sets rating
			movie.setRating(rating);
			
			//Prompts user for tickets sold
			System.out.println("Please enter tickets sold: ");
			//Reads tickets sold
			int soldTickets = stdin.nextInt();
			//Sets tickets sold
			movie.setSoldTickets(soldTickets);
			
			//prints toString method
			System.out.println(movie.toString() + "\n");
			
			//Prompts user to continue
			System.out.println("Would you like to enter another? (y or n): " );
			//Reads loop condition
			c = stdin.next().charAt(0);
			//skips next line
			stdin.nextLine();
			
		} while(c == 'y' || c == 'Y' );
		
		//close scanner object
		stdin.close();
		
		//Program end statement
		System.out.println("Goodbye");
	}	

}
