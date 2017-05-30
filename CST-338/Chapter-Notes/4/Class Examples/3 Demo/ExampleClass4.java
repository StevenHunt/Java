

/** ======= Preconditions and Postconditions: =============

- Precondition : What is assumed to be true when the method is called. The method shouldn't be used, or expect to run properly unless the precondition holds. 

- Postcodition : Effects of the method call, what will be true after the method is executed, in a situation where the precondition holds. 
	- Return Type: Describes the value returned by the method. 

===================================================


================= MODIFIERS ========================

Modifiers: 
	- Public: There are no restrictions on where (the instance variables) can be used. 
	
	- Private: (The instance variables) Cannot be accessed outside of the class definition
		
		- Good programming practice to make all instance variables private ( to simply the task of any programmer using the class ), and all class methods be made public. If the method was labeled 'private', that method could only be used inside of another method in the same class (as  a helper method). 

		-  Once an instance variable is labeled 'private', there is no way to change it's value or reference it, except by using by using one of the methods belonging to the class. 
		
==================================================

- A class definition should have no public instance variables. 

4.4 ===================== CONSTRUCTORS =======================================

- To initialize an instance variable for an object when you create an object. 
- Constructor usually initializes all instance variables, even if there is not a corresponding parameter. 

- public nameOfClass (int num) { // you can choose to have arguments or not.  

		You can _______ inside the constructor : 
		------------
		- initialize instanceVariables: month = "January"; 
		- invoke a method: setNum(num); 	
	}

==================================================

// 4.2 

// Information Hiding (abstraction): Avoiding information overloading. It keeps the information needed by the programmer using a class within reasonable bounds.

// Encapsulation: Grouping software into a unit, where there is a well defined interface. (In this case a class object)

// API: Application Program Interface - API for a class is the description on how to use the class. 

// ADT : Abstract Data Type - Data type written using good information hiding techniques. 

/* Modifiers: 
	- Public: There are no restrictions on where (the instance variables) can be used. 
	
	- Private: (The instance variables) Cannot be accessed outside of the class definition
		
		- Good programming practice to make all instance variables private ( to simply the task of any programmer using the class ), and all class methods be made public. If the method was labeled 'private', that method could only be used inside of another method in the same class (as  a helper method). 

		-  Once an instance variable is labeled 'private', there is no way to change it's value or reference it, except by using by using one of the methods belonging to the class. 
		 
*/

 ================================================= */


import java.util.Scanner; 

public class ExampleClass4 {


	// Class variables (instances): 

	// This is bad programming practice (It is rare that instance variables should be set to public).  
	public String month; // 
	public int day; 
	public int year; 
	public String name; 
	

	// Private variables: Only accessable using class methods
	private String state;
	private String city;  
	private String phoneNumber;  // This must be a string due to exceeding max value of an int (2,147,483,647) 
	private String pickNum; // This is originally input as an int, but then gets converted to a String. 

	/**
	Precondition: All instance variables of the calling object have values. 
	Postcondition: The data in the calling object has been written to the screen. 
	*/ 
	public void writeOutput() {
		System.out.println(name + " was born on " + month  + " " + day + ", " + year + "."); 
	}

	/**
	Precondition: All instance variables of the calling object have values. 
	Postcondition: The data in the calling object has been written to the screen. 
	*/ 
	public void privateOutput () {
		System.out.println(name + ", you live in " + city + ", " + state + " and your phone number is " + phoneNumber + "."); 	
	}

	/**
	Precondition: All instance variables of the calling object have values. 
	Postcondition: The data in the calling object has been written to the screen. 
	*/ 
	public void privateNumOutput () {
		System.out.println(name + ", you picked number " + pickNum + ".\n"); 
	}

	/**
	Precondition: All instance variables of the calling object have values. 
	Postcondition: The data in the calling object has been written to the screen. 
	*/ 
	public void privateInput () {
		
		boolean tryAgain = true; 
		Scanner keyboard = new Scanner(System.in); 
	
		System.out.print("\nWhat is your name : "); 
		name = keyboard.nextLine(); 

		System.out.print("What city do you live in: "); 
		city = keyboard.nextLine(); 
	
		System.out.print("What state do you live in: "); 
		state = keyboard.nextLine();

		System.out.print("What is your phone number (10 digit) : "); 
		phoneNumber = keyboard.next(); 
 		
		while (tryAgain) {
		System.out.print("Pick a number between 1 and 10: "); 
		int pickNumInput = keyboard.nextInt();	// 1. User inputs as an int. 
		
			if ( numOk(pickNumInput) ){	// 2. Checks to see if the input was between 1 - 10. 
				setNum(pickNumInput); // 3.  
				tryAgain = false; 
			}
			else {
				System.out.println("Illegal number. Please choose again. ");  
			}	
		}
	}
	
	// I could possibly remove this method and combine it with setNum, but it's good for a demo. 
	private boolean numOk( int numInt ) {		

		return ( (numInt > 0) && (numInt <= 10) ); 
	}	

	public void setNum ( int pickNum ) {
		
		if ( numOk(pickNum) ) {
			this.pickNum = numString(pickNum);
		}
	}

	public void dogInput() {
		
		Scanner keyboard = new Scanner(System.in); 

		System.out.print("\nYour dog's name is: "); 
		name = keyboard.nextLine(); 
		
		System.out.print("\n" + this.name + "\'s birthday ( Month DD YYYY ) is: "); 
		month = keyboard.next(); 
		day = keyboard.nextInt(); 
		year = keyboard.nextInt(); 
	}

	public void catInput() {
		
		Scanner keyboard = new Scanner(System.in); 

		System.out.print("\nYour cat's name is: "); 
		name = keyboard.nextLine(); 
		
		System.out.print("\n" + this.name + "\'s birthday ( Month DD YYYY ) is: "); 
		month = keyboard.next(); 
		day = keyboard.nextInt(); 
		year = keyboard.nextInt(); 
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year; 
	}
	
	// Converting month from String to int:
	public int getMonth() {
		
		if ( month.equalsIgnoreCase("January") )
			return 1; 
		else if ( month.equalsIgnoreCase("February") )
			return 2;
		else if ( month.equalsIgnoreCase("March") )
			return 3;
		else if ( month.equalsIgnoreCase("April") )
			return 4;
		else if ( month.equalsIgnoreCase("May") )
			return 5;
		else if ( month.equalsIgnoreCase("June") )
			return 6;
		else if ( month.equalsIgnoreCase("July") )
			return 7;
		else if ( month.equalsIgnoreCase("August") )
			return 8;
		else if ( month.equalsIgnoreCase("September") )
			return 9;
		else if ( month.equalsIgnoreCase("October") )
			return 10;
		else if ( month.equalsIgnoreCase("November") )
			return 11;
		else if ( month.equalsIgnoreCase("December") )
			return 12;
		else {
			System.out.println("Fatal Error.. "); 
			System.exit(0); 
			return 0; 
		}
	}

	// Converting month from int to String: 
	public String monthString(int monthNumber) {

		switch (monthNumber) {
			
			case 1: 
				return "January"; 
			case 2: 
				return "February"; 
			case 3: 
				return "March"; 
			case 4: 
				return "April"; 
			case 5: 
				return "May"; 
			case 6: 
				return "June"; 
			case 7: 
				return "July"; 
			case 8: 
				return "August"; 
			case 9: 
				return "September"; 
			case 10: 
				return "October"; 
			case 11: 
				return "November"; 
			case 12: 
				return "December"; 
			default:
				System.out.println("Fatal error..."); 
				System.exit(0); 
				return "Error"; // default must retrun value (in this case it has to be a string)  	
		}
	}

	private String numString ( int numNumber) {

		switch (numNumber) {
		
			case 1: 
				return "one"; 
			case 2: 
				return "two"; 
			case 3: 
				return "three"; 
			case 4: 
				return "four"; 
			case 5: 
				return "five"; 
			case 6: 
				return "six"; 
			case 7: 
				return "seven"; 
			case 8: 
				return "eight"; 
			case 9: 
				return "nine"; 
			case 10: 
				return "ten"; 
			default:
				System.out.println("Fatal error..."); 
				System.exit(0); 
				return "Error"; // default must retrun value (in this case it has to be a string)  	
		}
	}
		

	public void setDate( String name, int newMonth, int newDay, int newYear) {
		
		// Assiging instance variable month to the input of the argument (which will be converted to a String)
		month = monthString(newMonth); 
		
		// Assigning instance variables to the input of the argument
		day = newDay; 
		year = newYear; 
	
		// Showing the use of the this statement ( #how ). 
		this.name = name; 
	}

	//  Returns a string value that represents the data of the object. ( Example returns : "October 19, 1988" as a String)
	public String toString() {
			
		return (month + " " + day + ", " + year); 
	}

	// In the definition of the class, you can access private members of any object of the class, not just private members of the calling object. 
	public boolean equals (ExampleClass4 otherDate) {

		return ( (this.month.equals(otherDate.month) ) && (this.day == otherDate.day ) && (this.year == otherDate.year)); 	
	}

	public boolean precedes( ExampleClass4 otherDate) {

		return ( ( year < otherDate.year) || // year 1 precdes year 2 
			       ( year == otherDate.year && getMonth() < otherDate.getMonth() ) || // year 1 = year 2 & month 1 precedes month 2 
			       ( this.year == otherDate.year  && month.equals(otherDate.month) && day < otherDate.day ) );  // year 1 = year 2 & month 1 = month 2 & day 1 precedes day 2
		}

		// Overloading Example Methods: 

		public void overLoading (int b, String a) {
			System.out.println("overLoading Method: int : " + b + ", String : " + a ); 
		}

		public void overLoading (String a, int b) {
			System.out.println("overLoading Method: String : " + a + ", int : " + b); 
		}
		
		
		



























}
