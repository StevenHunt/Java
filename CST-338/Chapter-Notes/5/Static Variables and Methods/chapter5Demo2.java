/** Chapter 5: 
----------------------------------------------------------------------
Static Methods: 
	- Example: Invoked in main. 
		className.staticMethod (arguments, if any at all) { #code }

	- Belong to the class as a whole and not to particular objects. 
	- When you invoke a static mehod, you usually use the class name instead of a calling object. 
	- Within the definition of the static method, you cannot do anything that refers to a calling object (such as accessing an instance var). 
	- Illegal to invoke a non-static method inside the body of a static method.  
		- But you can create a class object inside the body and call a non-static method with the calling object. 
	- But legal to invoke a static method inside another static method with no hoops. 

Main Method inside of another Class: (P. 264)

----------------------------------------------------------------------
Static Variables: A variable that belongs to the class as a whole, and not just one object. 
	- Each object has it's own 'copy' of a static variable, however, with SV there is only one copy and and all objects can use this one variable. (Always initialize) 
	- Objects can use SV to communicate between other objects. 
		- One object can change the SV, while another object can read the change. 
*/

// --------------------------------------------------------------------------------------------------------

// Example of having the static main method inside of another class. 

import java.util.Scanner; 

public class chapter5Demo2 {

	// Final Constant: 
	public static final double PI = 3.14159; 

	// Static class methods: (doesn't require a calling object) 

	// Returns the area of a sphere with a given radius: 
	public static double area (double radius) {
		
		return (PI * radius * radius ); 
	}
	
	// Returns the volume of a sphere with  a given radius: 
	public static double volume (double radius) {
		
		return ( (4.0 / 3.0) * PI * radius * radius * radius); 
	}
		
	public static void main (String [] args) {

		Scanner keyboard = new Scanner(System.in); 
	
		System.out.println("\nUsing Static Methods and Variables: \n"); 

		System.out.print("Enter radius: "); 
		double radius = keyboard.nextDouble(); 

		// Using className to invoke the static method (rather than a calling object): 
		System.out.println("A circle of radius " + radius + " inches has an area of " + chapter5.area(radius) + " inches"); 
	
		System.out.println("and it has a volume of " + chapter5.volume(radius) + " inches.\n"); 

	}

}








