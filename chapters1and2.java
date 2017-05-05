// Java Notes: 

/*
Chapter 1: 
--------------------

Application : Program with a class named main()
Applet: Little java application (run from web browser).  

Identifier : The name of a variable ( int variableName ) 

Variable Declartion (Type names): boolean, char, byte, short, int, long, float, double. 

Assignment Statements: count += 2, is equivalent to count = count + 2. 

Initialized during declaration : int numOfCars = 5; 
Uninitialized : int numOfCars; 

Precedence Rules: 
	1. Unary Operators : + ,  , ++, --, !
	2. Binary Operators: *, /, %
	3. Binary Operators: + , - 

Incremenet & Decrement : ++, -- 
	- v++ : Incrementing is done AFTER the value is returned.  
	- ++v : Incrementing is done BEFORE the value is returned. 

Constant Variables : Written outside of the main method (in CAPITAL_LETTERS). 

Chapter 2: 
------------------

Formatting with printf:  printf("%+|-(widthOf).(digitsAfterDecimalPlace)f, variable") : (Page 61)
	- d : int, f : floating point, e | g : floating point, s : string, c : character. 

Formatting with printf: printf("%s is %-2.2d minutes away %n", cityName) 
	- %s calls the string cityName
	- %-2.2d ( leave 2 spaces behind int with 2 decimal places) 
	- %n : line break 

Importing: import java.packageName.className 
	- You can import the entire package by using this statement : import java.packageName * , but it's recommended to only import the classes you are using throughout the program, as it helps with documentation. 

Currency (Money) Formatting -  import java.text.NumberFormat (Page 69)

Decimal Formatting - impport java.text.DecimalFormat (Page 72)

2.2:
-------

Scanner Class (console input):  import java.util.scanner  (Page 81)
	- Word : scannerObject.next()
	- Int : scannerObject.nextInt()
	- Double : scannerObject.nextDouble() 
	- Line : scannerObject.nextLine()
		- println("You entered: \"" + line + "\""); 

2.3:
---------
Text File Input: (Page 89)
	- import java.io.FileInputStream; 
	- import java.io.FileNotFoundException; 

*/

//  Examples and Terminology : 


// Import Classes
import java.util.Scanner; 					// Obtain input from files and keyboard 
import java.text.DecimalFormat; 			// Format numbers
import java.io.FileNotFoundException; 		// A program attempts to open a file that doesn't exists
import java.io.FileInputStream; 			// Conncetion between Java and file on disk

public class chapters1and2 { 	// Class name (program)

	public static final int THIS_IS_A_CONSTANT = 44; 

	public static void main (String [] args) { 	// main method	

		// Open a file and read / display content: 

		// Create a Scanner object called fileIn: 
		Scanner fileIn = null; // inititialize fileIn to empty
		try {
			// Attempt to open file: 
			fileIn = new Scanner(new FileInputStream("player.txt"));
			System.out.println("\nThe file was found");  
		}  
		catch (FileNotFoundException e) {
			// If the file is not file, this code is executed and the program exits. 
			System.out.println("The file was not found."); 
			System.exit(0); 
		}  // .. program will exit if file not found, unless exit(0) is commented out. 

		int highScore; 
		String name; 
		
		System.out.println("Text left to read: " + fileIn.hasNextLine() ); 

		highScore = fileIn.nextInt(); 
		fileIn.nextLine(); // Read newLine left from nextInt()
		
		name = fileIn.nextLine(); 

		System.out.println(name + " has the highscorest score of : " + highScore); 
		
		System.out.println("Text left to read: " + fileIn.hasNextLine()  ); 
		fileIn.close(); 

		// ----------------------------------------------------------------------------------------------------------------------------------------------------------------

		// Get input from user in console: 

		// Create a scanner object named keyboard: 
		Scanner keyboard = new Scanner(System.in); 

		System.out.print("Enter your name: "); 

		// Create sting variable to hold the string input with next() 
		String fName = keyboard.next(); 
		
		// Printout 
		System.out.println("\nFrom user input : " + fName); 

		// ----------------------------------------------------------------------------------------------------------------------------------------------------------------

		 // Uninitialized variables. 
		int answer; 
		int value;
		
		// Initialized Variables.
 		double increm = 1.2; 

		// Variable answer, set equal to constant 4.
		answer = 4;

		//type casting. 
		value = (int) 5.5; 

		// Strings object:  
		String foobar = "SaIlOr ThE dOg.";

		// String methods: Page 38
		int len = foobar.length();  // length has no argument ()
 		String fooLow  = foobar.toLowerCase(); 
		String fooUpp = foobar.toUpperCase(); 

		// Calculations: 
		increm ++;  // Incremenets variable 'increm' + 1 to 2.2

		// Decimal Format: 
		DecimalFormat dForm = new DecimalFormat ("00.0000"); 
		String numeral = dForm.format(1.73623429); 
		System.out.println("This is created via Decimal Format : " + numeral); 

		// print
		System.out.print("This is "); 
		System.out.print("using print, not println" + "\n"); 

		// printf("%(widthOf).(digitsAfterDecimalPlace)f, variable")
		double price = 4.2;
		System.out.print("$"); 
		System.out.printf("%5.2f", price); 
		System.out.println(" each"); 

		// println 
		System.out.println("The answer is : " + answer );  //  4
		System.out.println("The value is : " + value); 	//  5 
		System.out.println("The increm is : " + increm); 	//  2.2
		System.out.println("foobar is : " + foobar); 
		System.out.println("The length of foobar is : " + len); 
		System.out.println("Foobar in all lowercase : " + fooLow); 
		System.out.println("\nTesting the\nescape sequence\n");
		System.out.println("Constant Variable : " + THIS_IS_A_CONSTANT); 

		System.out.println(); 
	}
}
