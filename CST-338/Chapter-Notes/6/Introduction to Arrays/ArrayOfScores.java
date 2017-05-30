/** 

Chapter 6.1 : Introduction to Arrays

TYPE 1 : COLLECTION OF INDEXED VARIABLES:

Array: Data Structure used to process a collection of data that is all of the same base type. (int, double, String, class, etc.)
	- Behaves like a list of variables with a uniform naming mechanism that can be declared in a single line of simple code. 
	- Technically an object. 

	declaring the array: 
	- baseType [] arrayName; 
	- arrayName = new baseType [size]; 
	
	OR declaring and intializing: 
		- double [] score = new double [5]; 
		- Person [] speciman = new Person [100];
	
	- Basically : score [0], score [1], score [2], score [3], score [4] 
	
	- index variables: score
	- Index: 0,1,2,3,4
	
	- Indexed variables: The individual variables that make up the array (elements or subscripted variables). 
	- Index (subscript): The number in the brackets. 

	[] Square Brackets: 
		- Can be used to create a type name : double [] score; 
		- Used with an int value to create a new array : score = new double [5]; 
		- Name an indexed variable of the array : max = score[0]; 
		
	public instance variable : length
		-Automatically set to the size of the array when the array is created. 

================================================================================================

Chapter 6.2 : Arrays and References 

- Arrays are objects, therefore we are going to view arrayTypes as classes. 
- A variable of an arrayType, holds a reference. 

TYPE 2 : SINGLE ITEM WHOS VALUE IS A COLLECTION OF THE BASE TYPE: 
	
	Analogy: 
	* Invoking constructor: new double[10]; 
	* Instance Variables: [index] (Although the only instance variable in the Array class is the .lengh variable). 
	
	- Still creating indexes, not objects, when you have classTypes: This is 10 indexed variables of type className. 
		className [] arrayVariableName = new className [10]
		

*/

// Example of using a Java Array: 

import java.util.Scanner; 

public class ArrayOfScores {

	private int num; 
	private String word; 
	private double value; 
	
	
	// Takes one simple argument of type double. 
	public void myMethod(double value) {
		
		this.value = value; 
		
		System.out.println ("The value is: " + value); 
	}
	
	// Method that takes in a double array as a parameter and then multiplies its indexes by two. 
	public static void doubleArrayElements(double [] a) { // arguement for an entire array: baseType [] aParameter
	
		int i; 
		for (i = 0; i < a.length; i++) {
			a[i] = a[i] * 2;
			System.out.println(a[i]);  
		}
	}
	
	// Method that printsall the values of a char array. 
	public static void listChars( char [] a) {
	
		int i;
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
	
	// Method that changes all the values of an int array to 0. 
	public static void zeroAll( int [] anArray) {
	
		int i;
		for (i = 0; i < anArray.length; i++)
			anArray[i] = 0;
	}
	
	// Method that checks to see if the values of two int array are equal. 
	public static boolean equalArrays ( int [] a, int [] b) {
	
		if (a.length != b.length)
			return false ;
		else {
	
			int i = 0;
			while (i < a.length) {
		
				if (a[i] != b[i])
					return false ;
				i++;
			}
		}	
		return true; 
	}
	
	// Method that returns an array : Changes to upperCase
	public static char[] upperCaseVersion ( char[] a) {
	
		char [] temp = new char [a.length];
		
		char i;
		
		for (i = 0; i < a.length; i++)
			temp[i] = Character.toUpperCase(a[i]);
		
		listChars(temp);
		return temp;
	}
	
	// Method that returns an array : Adds increment to the amount
	public static int [] incrementedArray( int [] a, int increment) {
	
		int [] temp = new int [a.length];
		int i;
		
		for (i = 0; i < a.length; i++)
			temp[i] = a[i] + increment;
			System.out.print(temp[3]);
		
		return temp;
	}
	
	// ======================== ARGUMENTS FOR THE METHOD MAIN() =================================================
	
	/**
	
	- Identifier args is a parameter for type String []. (it can therefore be replaced by any other non-keyword identifier)
	- If no argument is given, then a default empty array of strings is provided automatically as a default arg to main. 
	- You can provide any number of String args when you run the program, typically from the command line like so: 
	
				>> javac programName.java
				>> java programName blah foo blah bar
				
	- This will set args[0] = blah, args[1] = foo ... and args length to 4. 
	
	*/
	
	
	public static void main (String[] args) {
	
		// Running the program with arg[] array parameters
		System.out.println("\n\nThis is printed with the main String args: " + args[0] + " " + args[1] + " " + args[2]); 
	
		// To get input from user: 
		Scanner keyboard = new Scanner(System.in); 
		
		ArrayOfScores obj1 = new ArrayOfScores(); 
		ArrayOfScores obj2 = new ArrayOfScores(); 

		System.out.println("\n\n============================================================================ "); 
		
		System.out.println("6.1: Introduction to Arrays \n");
		
		// Create a new double array named score of size 5. 
		double [] score = new double [5]; 
		
		// Declaring variables: 
		int index; 
		double max; 
		
		// Using .length to determine array size and display to console. 
		// Storing first user input into array at location 0 (the first location)
		System.out.print("Enter " + score.length + " scores: "); 
		score[0] = keyboard.nextDouble(); 
		
		// Initialize max to the first input:
		max = score[0]; 
		
		// When index is less than the length of the array, increase index.
		for (index = 1; index < score.length; index++) {
		
			// Using nextDouble, store next user input in array index until array is full. 
			score[index] = keyboard.nextDouble(); 
			
			// Compare current greatest value to next user input. 
			if (score[index] > max)
				max = score[index]; 
		}
		
		// Print out the max value found: 
		System.out.println("The highest score is : " + max); 
		
		// Print the values stored in the array individually, followed by the difference of the max value. 
		System.out.println("The scores are : "); 
		for (index = 0; index < score.length; index++) {
			System.out.println(score[index] + " differs from max by " + (max - score[index]) ); 
		}

		// ===============================================================
				
		// Initializing Arrays: Simple
		int [] age = {2,12,1}; 
		
		System.out.println("Age[0],[1],[2] : " + age[0] + ", " + age[1] + ", " + age[2]); 
						
		// ===============================================================
				
		// Initializing Array values: For-Loop
		double [] reading = new double[100]; 
		for (index = 0; index < reading.length; index++) {
				
			reading[index] = 42.1; // All index variables are set to 42.1
		}
		
		System.out.println("The value of reading[3] : " + reading[3]); 
		
		// ===============================================================
		
		// This is a legal way of converting an array of characters, to an object of type String: 
		
		// Char array: 
		char [] a = {'S','t','e','v','e','n',' ','H','u','n','t'}; 
		
		// Class String has a constructor that takes a single parameter of type char[] . 
		String s = new String(a); 
		
		// Class String has another constructor that lets you specify a subrange of an array: 
		String s2 = new String(a,7,4); 
		
		// Printing an array of characters: 
		System.out.print("My last name is : " + s2 + "\n"); 
		System.out.print("This is how you print an array of characters with println : "); System.out.println(a);
		System.out.println("Or you can use the converted string : " + s);  
	
		// =========================================================================================================
		
		System.out.println("\n\n============================================================================ "); 
		
		System.out.println("6.2: Arrays and References \n"); 
		
		// declaring the variable 'a', which is now of an arrayType: 
		
		double [] z; 
		
		// Create an array object and store the object in memory (not the actual object), but rather the reference address in 'z'. 
		
		z = new double [10]; // The variable 'a' now holds the reference to (memory address) the array object value, 10.   
		
		// classType arrays: require an invocation of a constructor using new to create an object, or else error (NPE). 
		
		// The index variables are automatically initialized to null, not to an object of class ArrayOfScores. 
		ArrayOfScores[] scores2 = new ArrayOfScores [3]; 
		
		for (index = 0; index < scores2.length; index ++) {
			scores2[index] = new ArrayOfScores (); 
		}
		
		double x = 1; 
		double [] t = new double[10];
		
		t[3] = 4.0; 
		t[5] = 6.7;
		
		int r=5; 
		
		// Indexed variable arguments: 
		obj1.myMethod(t[3]); // Returns 4.0
		obj1.myMethod(t[2]); // Returns 0.0 (null)
		obj1.myMethod(t[r]); // Returns 6.7
		
		// Array parameters: 
		double [] randArray = new double[4]; 
		for (index = 0; index < randArray.length; index++) {
			randArray[index] = 11; // All index variables are set to 11
		}
		
		System.out.println(" "); 
		// Calling doubleArrayElements on randArray which has the value of 11 for all elements in array: 
		// The method changes the values stored in the indexed variables.
		ArrayOfScores.doubleArrayElements(randArray); // Returns 22
		
		// = : Assignment Statement
		
		int [] exam1 = new int[3]; 
		int [] exam2 = new int[3]; 
		
		for (index = 0; index < exam1.length; index++) {
			exam1[index] = index; 
		}
			
		exam1 = exam2; 
		
		System.out.println("\nexam1[0] = " + exam1[0] + ", exam2[0] = " + exam2[0]); 
		
		exam1[0] = 33; 
		System.out.println("exam1[0] = " + exam1[0] + ", exam2[0] = " + exam2[0]); 
		
		// == : Equality Operator (checks for equality of location in memory, not if they are equal in values)
		
		int [] c = new int [10];
		int [] d = new int [10]; 


		for (index = 0; index < c.length; index++) {
			c[index] = index;
		}
		for (index = 0; index < d.length; index++) {
			d[index] = index;
		}

		if (c == d)
			System.out.println("\nc and d are equal by ==.");
		else
			System.out.println("\nc and d are not equal by ==.");
		
	// equalsArray Method : Checks to see if arrays are equal in value
	
	if (equalArrays(c, d))
		System.out.println("\nc and d are equal by the equalArrays method.");
	else
		System.out.println("\nc and d are not equal by the equalArrays method.");
	
	
	System.out.println(" "); 	
	// Using methods to change an array's value and then return an array: 
	
	// Converts char a array to uppercase: 
	ArrayOfScores.upperCaseVersion(a); 
	
	System.out.println(" "); 	
	// Incrementing int c array by increment size
	
	ArrayOfScores.incrementedArray(c,12); // 3 + 12 = 15
	
	System.out.println(""); 
	System.out.println(c[3]); // Still returns 3, does not change
	
	
		
	System.out.println("\n============================================================================ ");
	System.out.println("Chapter 6.3: Programming with Arrays "); 
	
	} // Close main()

} // Close class


/** =================  OUTPUT  =====================

Enter 5 scores: 87.3 94.1 75.2 56.1 91.1
The highest score is : 94.1
The scores are : 
87.3 differs from max by 6.799999999999997
94.1 differs from max by 0.0
75.2 differs from max by 18.89999999999999
56.1 differs from max by 37.99999999999999
91.1 differs from max by 3.0
My last name is : Hunt

    ============================================= */
