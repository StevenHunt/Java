

public class TestClassDemo {

	public static void main (String [] args) {  	//  run-time program invokes main() when a command is given to run Java program. 

	// TestClass object named test. 
	TestClass test = new TestClass();

	// TestClass2 objects named yourBill#. 
	TestClass2 yourBill = new TestClass2();
	TestClass2 yourBill2 = new TestClass2(); 

	// Initializing instance variables to class object test and assigning values. 

	// Call-by-value: 
	test.name = "Steven";
	test.month = "May"; 
	test.year = 1987;

	System.out.println("\nTestClass: Using different methods to change testObject.instanceVariables \n "); 

	// Invoking voidMethod1 with test object, so it's using the pre assigned values from above. 
	
	test.voidMethod(); 
	// Prints : Steven, May, 1987. 

	// ---------------------- USING INITIALLY SET VALUES ( System.out.print )-------------------------------------

	System.out.println( "Current test.instances (via println) : " + test.name + ", " + test.month + " " + test.year + ". \n"); 
	// Prints : Steven, May, 1987. 

	// ---------------------- USING VALUES FROM INPUT ( Void & Return Type Methods ) -------------------------------------------

	// Invoke void method (voidReadMethod), with class object test. 
	// test object is assigned to user input since we're calling this method with the test object. 
	test.voidReadMethod(); 

	// Assigning variables to invoke return methods of class object test. 
	String testName = test.getName(); 
	String testMonth = test.getMonth(); 
	int testYear = test.getYear(); 

	// The values can be changed depending on input from above method invocation: 
	System.out.println( "\n2. Changed via input values : " + test.name + ", "+ test.month + " " + test.year + ". \n");
	// Prints : whatever input user adds.  

	// ----------------------- USING PARAMETER VALUES ( int argument1, String argument2 )  ------------------------------------

	// The arguments name and year will override the test objects values normally. 
	// The month is passed as an int arguement (much like a type cast), as is then converted to a string via a switch statement in another method. 

	test.voidParameterMethod("Lisa", 8, 1960); 
	
	System.out.println( "3. Changed via parameters : " + test.name + ", " + test.month + " " + test.year + ". \n"); 
	// Prints : Lisa, August, 1960.  

	// ----------------------- CALLING BY VALUE ---------------------------------------------------
	
	int year = 1882; 
	String name = "Donkey";
	int month = 10; 
	
	// Passing local variables as method arguements, as the test object: 
	test.voidParameterMethod(name, month, year);

	System.out.println("4. Changed via call-by-value : " +  test.name  + ", " + test.month + " " + test.year + ".\n"); 
	// Prints : Donkey, October, 1882. 

	// ---------------------- THIS PARAMETER (this.instance) --------------------------------------------------

	// Have an explicit name for the calling object : this.instanceVariable

	test.name = "foo"; 
	test.month = "bar";
	test.year = 1969; 

	test.voidMethodUsingThis(); 

	System.out.println( "\nCurrent test.instances (via println) : " + test.name + ", "+ test.month + " " + test.year + ". \n");
	
	// ---------------------- 'THIS' parameter (this.instance) within class method parameters  --------------------------------------------------

	test.voidParameterMethodWithThis("Chicken", 2, 2017);

	System.out.println( "6. Changed via 'this' parameter, within class method arguements : " + test.name + ", "+ test.month + " " + test.year + ". \n");

	// ---------------------- PARAMETER VARIABLES AS LOCAL VARIABLES --------------------------------------------------

	System.out.println("----------------------------------------------------------------------"); 
	System.out.println("\nTestClass2 : Using parameter variables as local method variables.  \n"); 

	// Calculate fee, based on hours worked and rate charged. 
	yourBill.inputTimeWorked(); 		
	yourBill.updateFee(); 
	yourBill.outputBill();  

	// ------------------------------------ BOOLEAN VALUES  ----------------------------------------------------------------

	System.out.print ("\nUsing Boolean expression to check calculated fee : "); 

	// yourBill comes back between 0 - 1000: 
	// yourBill is actuall 
	if ( yourBill.isBetween( 0, 1000) ) {
		System.out.println("You got a good deal!"); 
	}
	else {
		System.out.println("You got bad deal!"); 
	}

	}
}

/* =================== OUTPUT ===================

TestClass: Using different methods to change testObject.instanceVariables 
 
1. Initial Values : Steven,  May 1987. 

Current test.instances (via println) : Steven, May 1987. 

Enter your name, month born, and year born ( Name Month YYYY ) : pounce april 2014

2. Changed via input values : pounce, april 2014. 

3. Changed via parameters : Lisa, August 1960. 

4. Changed via call-by-value : Donkey, October 1882.

5. Changed via 'this' parameter : foo, bar 1969.

Current test.instances (via println) : foo, bar 1969. 

6. Changed via 'this' parameter, within class method arguements : Chicken, February 2017. 

----------------------------------------------------------------------

TestClass2 : Using parameter variables as local method variables.  

Enter number of hours and minutes worked ( HH MM ): 02 17
Time worked : 2 hours and 17 minutes. 
Rate is : $150.0 per quarter hour. 
Amount due is : $1350.0

Using Boolean expression to check calculated fee : You got bad deal!

============================================== */


