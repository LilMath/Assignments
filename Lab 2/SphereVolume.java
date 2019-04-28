import java.util.Scanner; //import Scanner class

public class SphereVolume {

	public static void main(String[] args) {
		
		//Variable declarations
		double diam;
		double radi;
		double volume;
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user for diameter of sphere
		System.out.println("Please enter diameter of sphere: ");
		//read diameter
		diam = input.nextDouble();
		
		//Calculate radius
		radi = diam / 2;
		
		//Calculate volume
		volume = Math.PI * Math.pow(radi, 3) * 4 / 3;
		
		//Print volume 
		System.out.println("The volume of the sphere is: " + volume);
		
		//close scanner
		input.close();
	}

}
