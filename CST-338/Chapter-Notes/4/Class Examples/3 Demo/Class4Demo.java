
/** CHAPTER 4:

4.1 - 4.2 ========== ACCESSORS AND MUTATORS  (Public / Private) ====================

- This program is executable (it runs correctly), although there are some bad programming practices in the source code. 
- The instance variables in the ExampleClass4 are set to public, therefore there are no restrictions on where they can be used. 
- They should be set to private, and only be able to be access via class methods. 
- The class methods should be set to public, unless they are strictly helper methods that we (as programmers) do not need to access.

- Information Hiding (abstraction): Avoiding information overloading. It keeps the information needed by the programmer using a class within reasonable bounds.

- Encapsulation: Grouping software into a unit, where there is a well defined interface. (In this case a class object)

 - API: Application Program Interface - API for a class is the description on how to use the class. 

- ADT : Abstract Data Type - Data type written using good information hiding techniques. 


4.3 ============= OVERLOADING ================================================

- When two or more methods in the same class have the same name. (Overloading the method named methodName) 

- Method signature : name of the mathod and a list of the parameters. 
 
- RULES: 	
	- When you overload a method name, each of the method definitions in the class must have a different signature. 
	- Therefore, when invoking a method, only one of the signatures for this method will match the types of arguments. 

		- EXAMPLE: 
		- setDate (int month, int year, int day) {
		- setDate (String month, int year, int day) {
		- setDate (int year) {


*/ 

public class Class4Demo {

	public static void main (String [] args) {

		// Creating ExampleClass4 objects:  

		// People: 
		
		// new ExampleClass4 : Invoking the constructor. 
		ExampleClass4 person1 = new ExampleClass4();
		ExampleClass4 person2 = new ExampleClass4();
		ExampleClass4 person3 = new ExampleClass4(); 
		ExampleClass4 person4 = new ExampleClass4();

		// Animals: 
		ExampleClass4 dog = new ExampleClass4(); 
		ExampleClass4 cat = new ExampleClass4(); 

		// Overloading Example Object: 
		ExampleClass4 oLObj = new ExampleClass4(); 
		
		// Constructor Example Object: 


//* Comment Out: 

		//  ** Illegal (Bad Practice) - Instance variables should be private, therefore they should not be able to be accessed without class methods
		
		// ********************* BAD PRACTICE *******************************
		// You should not be able to access the class instance variables (name, month, year, day), outside of a class method. 
		// Pre-assinging values: 		
		person1.name = "Lindsay"; 
		person1.month = "October"; 
		person1.day = 19; 
		person1.year = 1988; 

		person2.name = "Steven" ;
		person2.month = "May"; 
		person2.day = 21; 		
		person2. year = 1987;
		// ******************************************************************
		

		System.out.println("\n"); 

		// Displaying output:   
		person1.writeOutput(); 
		person2.writeOutput(); 

		// ---------------------------------------

		// Dog object is assigned values via user input : name & birthday. 
		dog.dogInput(); 

		int dogDay = dog.getDay(); 
		int dogMonth = dog.getMonth(); // getMonth converts the class instance month from String to int.  
		int dogYear = dog.getYear(); 

		// ********************** BAD PRACTICE ******************************
		System.out.println(dog.name + "\'s birth day is : " + dogDay); 
		System.out.println(dog.name + "\'s birth month is : " + dogMonth + " (" + dog.month + ")"); 
		System.out.println(dog.name + "\'s birth year is  : " + dogYear); 
		// ******************************************************************

		// Displaying output from user input. 
		dog.writeOutput(); 

		// ---------------------------------------		

		// Cat object is assigned values via user input : name & birthday. 
		cat.catInput(); 

		int catDay = cat.getDay(); 
		int catMonth = cat.getMonth(); // getMonth converts the class instance month from String to int.  
		int catYear = cat.getYear(); 

		// ********************* BAD PRACTICE *******************************
		System.out.println(cat.name + "\'s birth day is : " + catDay); 
		System.out.println(cat.name + "\'s birth month is : " + catMonth + " (" + cat.month + ")"); 
		System.out.println(cat.name + "\'s birth year is  : " + catYear); 
		// ******************************************************************

		// Displaying output from user input. 
		cat.writeOutput(); 	
	
		// ---------------------------------------		

		// Using setDate for Ashley's information ( setDate converts month int, into month String using StringMonth() ) 
		person4.setDate("\nAshley", 10, 10, 1985); 

		// Display output: 
		person4.writeOutput(); 

		System.out.println(""); 
		
		// ---------------------------------------		

// Questionable if this would work with private variables: 

		// Using equals and toString: 
		if ( person1.equals(person2) )
			System.out.println( person1 + " equals " + person2 + ".\n" ); 
		else
			System.out.println( person1 + " does not equal " + person2 + ".\n" ); 	

		if ( person1.precedes(person2) ) 
			System.out.println( person1.name + " is older than " + person2.name + ".\n"); 
		else 
			System.out.println( person1.name + " is younger than " + person2.name + ".\n"); 			
		
		// ---------------------------------------		

		// ******************* BAD PRACTICE  *********************************
		// Using toString ()  with println : The println method was actually written so that it automatically invokes a method named toString() 
		System.out.println(dog.name + "\'s birthday is " +  dog.toString()  + ".\n") ; 

		// *******************************************************************	

		System.out.println("-----------------------------------------------------------------"); 
		System.out.println("This is using private instance variables :");

		person3.privateInput(); 
		person3.privateOutput(); 
		person3.privateNumOutput(); 

		// ----------------------------------------

		System.out.println("-----------------------------------------------------------------"); 
		System.out.println("This is an example of overloading a method :");


		// Example of using overloaded methods: 

		int overVal1 = 1; 
		String overVal2 = "Steven"; 


		// Using ExampleClass4 object (oLObj), to call overloaded method (overLoading). 
		// There are two (2) overLoading methods defined in ExampleClass4, this is an example of Overloading a Method. 
		// Two methods with the same name can be used in a single class, but their parameters must be different, because java always
			// looks for a method signature that exactly matches the types of the arguments. If it fails to find a match, java will use 
				// automatic type conversion to a find a method that matches the (type cast) types of the method invocation. 

		oLObj.overLoading(overVal1, overVal2); 		
		oLObj.overLoading(overVal2, overVal1);

		// ###################### No overloading operators in java !!!! #######################
		
	}
}


/* ==================== OUTPUT ========================

Lindsay was born on October 19, 1988.
Steven was born on May 21, 1987.

Your dog's name is: Sailor Jerry

Sailor Jerry's birthday ( Month DD YYYY ) is: July 20 2010
Sailor Jerry's birth day is : 20
Sailor Jerry's birth month is : 7 (July)
Sailor Jerry's birth year is  : 2010
Sailor Jerry was born on July 20, 2010.

Your cat's name is: SerPounce Alot

SerPounce Alot's birthday ( Month DD YYYY ) is: April 20 2014
SerPounce Alot's birth day is : 20
SerPounce Alot's birth month is : 4 (April)
SerPounce Alot's birth year is  : 2014
SerPounce Alot was born on April 20, 2014.

Ashley was born on October 10, 1985.

October 19, 1988 does not equal May 21, 1987.

Lindsay is younger than Steven.

Sailor Jerry's birthday is July 20, 2010.


This is using private instance variables : 

What is your name : Chris Hunt
What city do you live in: San Jose
What state do you live in: California
What is your phone number (10 digit) : 4085551234
Pick a number between 1 and 10: 0
Illegal number. Please choose again. 
Pick a number between 1 and 10: 11
Illegal number. Please choose again. 
Pick a number between 1 and 10: 34
Illegal number. Please choose again. 
Pick a number between 1 and 10: 1
Chris Hunt, you live in San Jose, California and your phone number is 4085551234.
Chris Hunt, you picked number one.

overLoading Method: int : 1, String : Steven
overLoading Method: String : Steven, int : 1


==================================================== */
