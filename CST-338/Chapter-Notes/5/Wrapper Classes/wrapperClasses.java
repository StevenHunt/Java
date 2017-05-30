/** 

Primitive Types: byte, short, long, float, double, char, int. 

WRAPPER CLASSES: Provides a class type corresponding to each of the primative types so that you can have an object of a class type that behaves somewhat like its corresponding value of a primative type. 2 Distinct Personalities: (boxing / unboxin) & a repository of usefull methods and constants. 

	BOXING: Going from a value of a primitive type (int, double, etc), to an object of its wrapper class. (Integer integerObject = new Integer(42); )
		- Automatic Boxing (automatic type casting): 
			- Double price = 499.99; 
			- Character grade = 'A'; 


	UNBOXING: Going from an object of a wrapper class to the corresponding value of a primative type. ( int i = integerObject.intValue(); )
		- byteValue, shortValue, longValue, floatValue, doubleValue, charValue, and intvalue.  
		- Automatic Unboxing: 
			- double p = price; 
			- char g = grade; 
			
	-----------------
	
	Methods and Constants:
		- MAX_VALUE & MIN_VALUE: Find the largest and smallest values of primative types. 
			- Example: Integar.MAX_VALUE or Double.MIN_VALUE
			
		- parseType and toString : Takes a string value (numerical) and returns it to a primitive type (int, long, float, and double) and visversa!
			- Double.parseDouble("199.98") OR Double.toString(199.98). 
			- Integer.parseInteger("10") or Integer.toSting(10). 
			- If there were any leading or trailing blanks, use: Double.parseDouble(theString.trim());
			
		CHARACTER METHODS: 
			
		- toUpperCase or toLowerCase : 
			- Example: Character.toUpperCase('a'); 
			
		- isUpperCase or isLowerCase : 
			- Example: Character.isUpperCase("s"); // Returns true or false if character is uppercase. 
			
		- isWhitespace 
			- Example: Character.isWhitespace(" "); Returns true or false if there is whitespace, tab (\t), or line-break (\n). 
			
		- isLetter, isDigit, and isLetterOrDigit : Returns true or false based on the argument, much like the above method. 
---------------------------------------------------------

*/

// String Processing : Illistrates the use of a static method from the Class Character. 

import java.util.Scanner; // Import Scanner class. 
import java.util.StringTokenizer; // Import StringTokenizer class.

// Static Imports: 
import static java.lang.Character.toUpperCase; // This allows the programmer to invoke toUpperCase without adding the class Character. 
// or import static java.lang.Character.*; // To allow the programmer to use any method in the Character class without invoking it with Character. before it. 


public class wrapperClasses {

	public static void main (String [] args) {


	System.out.println("\n-------------------------------------------------------------------------------------------- \n");	
	
	Scanner keyboard = new Scanner(System.in); 
	
	System.out.print("Enter a single line sentence: "); 
	String sentence = keyboard.nextLine(); 
	
	System.out.println("The sentence you wrote without any alterations is: \n" + sentence); 
	
	sentence = sentence.toLowerCase(); // Coverts the sentence to lowercase. 
	char firstCharacter = sentence.charAt(0); // firstCharacter = the first character in the String (sentence). 
	
	// If I didn't write the static import I would have to write the next line like this: sentence = Character.toUpperCase(firstCharacter) + sentence.substring(1); 
	sentence = toUpperCase(firstCharacter) + sentence.substring(1); 
	
	System.out.println("The revised sentence is: \n" + sentence); 
	
	System.out.println("-------------------------------------------------------------------------------------------- \n");	
	
	// Using the parseDouble with the String Tokenizer: (From chapter 4 notes)
	
	System.out.print("Enter two numbers on a line (with a comma between the numbers and extra blank space is ok): "); 
	String inputLine = keyboard.nextLine(); 
	
	String delimiters = ", "; // Comma and blank space.
	
	StringTokenizer numberFactory = new StringTokenizer(inputLine, delimiters); 
	
	// Create two null strings to eventually hold the values inputted by the user, they must be initialized or else an error will occur: 
	String string1 = null; 
	String string2 = null; 
	
	if (numberFactory.countTokens() >= 2) {
		string1 = numberFactory.nextToken(); 
		string2 = numberFactory.nextToken(); 
	}
	else {
		System.out.println("Fatal error..."); 
		System.exit(0); 
	}
	
	// Converting the strings to doubles via parseDouble: 
	double number1 = Double.parseDouble(string1); 
	double number2 = Double.parseDouble(string2); 
	
	System.out.println("You have entered (converted String input to doubles via parseDouble): " + number1 + " " + number2); 
	
	} // Closing main()
	
} // Closing the wrapperClass
	
/** ========================== OUTPUT ==================================

Enter a single ling sentence: this is an Example of HOW to due some string ManiPulations.
The sentence you wrote without any alterations is: 
this is an Example of HOW to due some string ManiPulations.
The revised sentence is: 
This is an example of how to due some string manipulations.

   =================================================================== */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
