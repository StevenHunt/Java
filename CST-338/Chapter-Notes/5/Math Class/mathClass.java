/** The Math class: Page 273 (APPENDIX 5 : FOR A FULL LIST OF METHODS)

	- Provided automaticall (doesn't require an import statement). 
	- Static methods (which means you use the class name 'math' in place of the calling object. 
	
POW: returns base to the power exponent 
	- Math.pow(base, exp)
	- Example: Math.pow(3,2) returns 9 
	- Example: Math.pow(2.5,2) returns 5 
	
ABS: returns the absolute value of the argument. 
	- Math.abs(argument)
	- Example: Math.abs(3) returns 3 
	- Example: Math.abs(-3.5) returns 3.5 

MIN: returns the minimum of the arguments n1 and n2. (can be used with doubles, floats, longs, and ints). 
	- Math.min(n1,n2)
	- Example: Math.min(3,2) returns 2
	- Example: Math.min(2.5, 3.2) returns 2.5
	
MAX: Same as above, but returns the maximum of the arguments n1 and n2. 

ROUND: Rounds its argument. 
	- Math.round(argument)
	- Example: Math.round(3.2) returns 3
	- Example: Math.round(3.6) returns 4
	
CEIL: returns the smallest whole number, greater than or equal to the argument. 
	- Math.ceil(argument)
	- Example: Math.ceil(3.2) and math.ceil(3.9) both return 4.0
	
FLOOR: returns the largest whole number, less than or equal to the arguement. 
	- Math.floor(argument)
	- Example: Math.floor(3.2) and math.floor(3.9) both return 3.0
	
SQRT: returns the square roof of the argument
	- Math.sqrt(argument)
	- Example: Math.sqrt(4) returns 2
	
RANDOM: returns a number greater than or equal to 0.0 and less than 1.0
	- Math.random()
	- Example: Math.random() returns 0.5505562535943004

----------------

If you want a whole (int) number, you can typecast: Can be used with round, ceil, and floor (possibly more math methods, but these for sure)

double exact = 7.61; 
int roundedValue = (int)Math.round(exact); // returns 8.0

----------------

CONSTANTS: 
	- PI = 3.14159
	- E = 2.72	
----------------	
*/

import java.util.Scanner; // Importing Scanner class from util package

// To avoid invoking the constants via Math., you can import the package.class statically: 
// import java.lang.Math.*; // The code below can now be written without the invocation of Math. before the constant variables PI and E. 

public class mathClass {
	
	// Returns the area of the circle with the given radius: 
	public static double area (double radius) {
		return (Math.PI * radius * radius); 
	}

	public static double volume (double radius) {
		return ( (4.0/3.0) * Math.PI * radius * radius * radius ); 
	}
	
	public static void main (String [] args) {
	
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.print("Enter the radius of a circle: "); 
		double radius = keyboard.nextDouble(); 
		
		System.out.println("A circle with the radius " + radius + " inches, has a volume of " + mathClass.volume(radius) + " cubic inches and an area of " + mathClass.area(radius) + " square inches."); 

	} // Closing main()

} // Closing mathClass



















































