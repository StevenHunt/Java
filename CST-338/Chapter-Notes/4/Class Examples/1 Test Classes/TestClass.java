
// Left off on page 192 ( Display 4.5 )


import java.util.Scanner; 

public class TestClass {

	// TestClass instance variables: Variables declared in a class (TestClass in this case), outside of a method, constructor, or any block. 
	// Can be declared any where in the class (before or after use). 
	// Good practice to make the private
	// Can be access by any method, constructor, or blcok in the class. 

	// Public instance variables are visible by any sub/child class. 
	public String name; 
	public String month; 
	public int year; 
	
	// Private instance variables are visible by only the Class in which they are declared in (TestClass in this case). 
	private int privateVariable; 

	// TestClass Methods: 

	// When invoked : It simply displays the output with whatever values are assigned to the test object. 
	// In this case, they are pre assigned at the top of the demo program. 
	public void voidMethod() {
		
		// Using presigned object instance variables, initialized in the demo program. 
		System.out.println( "1. Initial Values : "+ name + ",  " + month + " " + year + ". \n"); 
	}

	// -------------------------------------------------------------- Can change test objects values -----------------------------------------------------------------------

	// This void method assigns the class instance variables to the users input. 
	public void voidReadMethod () {
		
		Scanner keyboard = new Scanner(System.in); 
		System.out.print("Enter your name, month born, and year born ( Name Month YYYY ) : "); 
		
		name = keyboard.next(); 		
		month = keyboard.next(); 
		year = keyboard.nextInt();	 
		
		return; 
	}

	// These return type methods return the class instance variable values.
	public String getName() {
		return name; 
	}

	public String getMonth() {
		return month; 
	}

	public int getYear() {
		return year; 
	}

	public void voidParameterMethod (String newName, int newMonth, int newYear) {
		
		name = newName; 
	  	month = switchMonth(newMonth);
		year = newYear;   
	}

	public String switchMonth(int monthNumber) { // para
		
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
				System.out.println("Fatal Error.. input not recognized"); 
				System.exit(0); 
				return "Error"; 	// To keep the console happy

		}
	}

	// ------------------------------------------------------------- Using 'this', inside method definitions ----------------------------------------------------------------

	// The 'this' parameter can be used in method definitions as a name for the calling object (in this case test). 

	public void voidMethodUsingThis () {

		System.out.println("5. Changed via 'this' parameter : " + this.name + ", " + this.month + " " +  this.year + ".");
	}	

	// ------------------------------------------------------------- Using 'this', with method (arguments) ----------------------------------------------------------------

	// This void method requires 3 arguments. The assigned arguments will be set to the classes instance variables. If I were to try and 	 
	 // pass the instance variable names directly to the parameter (String name, int month, int year), they would be 'masked' since they 
	// are considered local if declared in the parameters. So every time they were used in the body of the method, they would be 
	// refering to the local ones declared, not the instance we want. 

	// To bypass writing 'new'Name, we could explicitly let the compiler know we are refering to the instance variable name, not the local variable name. 
	public void voidParameterMethodWithThis (String name, int month, int year) {
		
		this.name = name;  
	  	this.month = switchMonth(month); // The swithMonth method convers (local parameter month (not this.month) to a string which can be used in the instance variable (public String month)
		this.year = year;   
	}




























































} 
