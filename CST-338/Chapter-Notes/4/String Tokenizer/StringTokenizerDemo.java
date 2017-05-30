/** =================================================================================== 

PAGE 245: 

- The StringTokenizer is often used to decompose a line of input (nextLine), however it can be used to decompose any string. 

- Example : Individual words are called 'tokens'. 

											
	StringTokenizer wordFactory = new StringTokenizer ( "This is a string of a bunch of random words."); 
	whlie (wordFactory.hasMoreTokens()) {
		System.out.println(wordFactory.nextToken()); 
	}

	- The new StringTokenizer (" "); invokes the constructor. It produces a new object of the class StringTokenizer, with the name wordFactory. \
	- This can be used to produce the individual words in the string used as the argument to the StringToken constructor. 
	- The method 'nextToken', returns the first word (token), when it is invoked for the first time, the second word (token) when it is invoked the second time, the third word (token) when it is invoked the third time... and so forth. 
	- If the code invokes nextToken after is has returned all the tokens in it's string, it will return an error and halt the program. 
	- This is why we use the boolean method hasMoreTokens in a loop to check if the string has more tokens before we invoke nextToken. 
	- When the constructor is used with a single argument (like above), the white space is used as the seperators for the tokens (words). '	
	- If you would like to define a seperator other than " " blank space, you can do so with another argument. 
		- The second argument is a string consisting of all the seperator characters. 
		- Example of blank, new-line, comma, and period as seperators: 
			- new StringTokenizer (" This is a string, example blah blah blah /n blah", "\n . , "); 
			-




    =================================================================================== */ 

import java.util.StringTokenizer;  // Import StringTokenizers Class
import java.util.Scanner; 		   // Import Scanner Class. 


public class StringTokenizerDemo {

	public static void main ( String [] args ) {

		Scanner keyword = new Scanner(System.in); 
	
		System.out.print("Enter a string of words : "); 
		String userInput = keyword.nextLine(); 
		

		String delimiters = ",  "; 	// Commas and blank space. 
		StringTokenizer stringTok = new StringTokenizer (userInput, delimiters); 

		while (stringTok.hasMoreTokens()) {
			System.out.println(stringTok.nextToken()); 
		}


		System.out.println("Please input your name ( First Last Middle ): "); 
		System.out.print("If you do not have a middle name, enter \'none\' : "); 
		String name = keyword.nextLine(); 

		StringTokenizer nameTok = new StringTokenizer (name, delimiters); 
	
		while (nameTok.hasMoreTokens()) {
		
			String firstName = nameTok.nextToken(); 
			String lastName = nameTok.nextToken(); 
			String middleName = nameTok.nextToken(); 
				
			if ( middleName.equalsIgnoreCase("None")) {
				middleName = ""; 
			}
			
			System.out.println("Your name is : " + firstName + " " + middleName + " " + lastName); 	
		}
	}
}

/* ============ OUTPUT =================

Enter a string of words : This is, to test, the StringTokenizer.
This
is
to
test
the
StringTokenizer.
Please input your name ( First Last Middle ): 
If you do not have a middle name, enter 'none' : Steven, Hunt none
Your name is : Steven  Hunt

    ==================================== */








































