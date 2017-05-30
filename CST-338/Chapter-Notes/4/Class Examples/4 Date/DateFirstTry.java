
// The file must be named the same as the class it contains with a .java on the end. 


import java.util.Scanner; 

// Class Definition: 
public  class DateFirstTry {

	// Public : No restrictions on how the variables and methods are used. 
	
	// Objects of the class (Instance variables: meanings are confined to the object of the class)
	
	// Used in void type methods: 
	public int day; 
	public String month; 
	public int year; 
	public int age; 

	// Method: void (performs action)
	public void bdayOutput () {

		// Names are used without any calling object, because the method will be invoked with different calling objects. 
		System.out.println("Birthday is : " + month + " " + day + ", " + year); 
	}

	// Method: void (performs action)

	// void means that this method will produce an action rather than a value. 
	public void ageOutput () {				// Heading 
		System.out.println("Age is : " + age); 	// Body
		return; 

		// System.out.println("This will throw an error, as the method ends after the return statement"); 
	}

	// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	// Used in return type methods: (they don't necessarily have to be private, just did this to test what it does). 
	private int birthDay; 
	private String birthMonth;
	private int birthYear;

	// Method 3: void (performs action)
	public void readInput() {

		// When readInput is invoked by a class object: 

		// Create a new Scanner object named keyboard.  (Local variable : 
		Scanner keyboard = new Scanner(System.in); 
		
		// Ouput and ask for input: 
		System.out.print("What is your birthday ( DD Month YYYY, with no commas) : "); 
		
		// Assign variables to user input: 
		birthDay = keyboard.nextInt(); 
		birthMonth = keyboard.next(); 
		birthYear = keyboard.nextInt(); 

		return; // This not necessary.

		// System.out.println("This will throw an error, as the method ends after the return statement"); 
	}		

	// Return type methods: 

	public int getBirthDay() {

		// Returns birthDay (of type int): 
		return birthDay; 
	}
	public String getBirthMonth() {

		// Returns birthMonth (of type String): 
		return birthMonth; 
	}
	public int getBirthYear() {

		// Returns birthYear (of type int): 
		return birthYear; 
	}

} // End class


/* ============== OUTPUT =================

Void Type Methdods: 

Birthday is : May 21, 1987
Age is : 29
 
Birthday is : October 19, 1988
Age is : 28
 

Using System.out.println : May 21, 1987

Return Type Methods: 

What is your birthday ( DD Month YYYY, with no commas) : 21 May 1987
Steven, you were born in May of 1987.

What is your birthday ( DD Month YYYY, with no commas) : 19 October 1988
Lindsay, you were born on day 19 of October, 1988.


   ====================================== */



