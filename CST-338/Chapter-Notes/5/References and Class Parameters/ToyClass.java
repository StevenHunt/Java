
/** References and Class Parameters: 

VARIABLES: 
	
*** Primitive type: If n is an int variable, then n can contain a value of type int.
		- The value of the variable is stored in the memory location assigned to the variable. 
		- Always requires the same amount of memory. (There is a known maximum value for all prim types. 
	
*** Class type : If v is a class type variable, then v doesn't directly contain an varObject of its class. Instead, v names an varObject by containng the memory 				 address of where the varObject is located in memory. 
		- Stores ONLY THE MEMORY ADDRESS of where an varObject is located. 
		- The class type variable contains only the memory address of where the varObject is stored. 
		- An varObject of a class (for example the String class) may be of any size. The memory location for a variable of type String is of a fixed size, so it cannot hold an aribitrarily long string, however, it can hold the address of any string because there is a limit to the size of the address. 
		- Because of this, two class type variables can contain the same address, and in some situations name the same varObject. This means that any change to the varObject named by one of the variables will produce a change to the varObject named by the other. 

-------------------------------------

MEMORY: 
	- Secondary : Used for file storage. 
	- Main : Used for running a program. 	
		- Values stored in a programs variables are stored in the main memory. 
		- Consists of bytes, containing bits (eight 0/1 digits).The number that identifies the byte, is called the ADDRESS.
		- Memory Location : Entire chunk of memory that holds the the data.   

-------------------------------------

ClASS PARAMETERS: All are call-by-value. 
	- Although, when an argument of class type is plugged in for a parameter, the value plugged in is the reference (memory address). 
	- The parameter is a variable that is set equal to the value of its arg. 
	- Thus, a method can change the instance variables of an varObject given as an argument. 

-------------------------------------	
	
REFERENCE VS VALUE: Comments in code!
	
-------------------------------------

NULL: 	

- Can be assigned to a variable of any class type. 
- Indicates variable has 'no real value'. 
	
*/ 

// -------------------------------------------------------------------------------------

// The Toy class to represent 'REFERENCES'. 

public class ToyClass {

	// INSTANCE VARIABLES: Declared public or private, inside of a class, but outside of a method. Every class instance created via the 'new' operand, has it's own copy of these variables. 
	private String name; 
	private int number; 
	
	int publicInstanceVar; 
	
	// CLASS VARIABLE: Declared static, inside of a class, but outside of a method. Have only a single copy, shared with all instances of a class. Any changes made are seen by all varObjects of the class. 
	public static int size; 
	
	public ToyClass (String initialName, int initialNumber) {
	
		// LOCAL VARIABLES: Inside of a method, constructor, block of code. Including those inside parameters. 
		name = initialName; 
		number = initialNumber; 
	}
	
	public ToyClass () {
	
		name = "No name yet...";
		number = 0; 
		publicInstanceVar = 100; 
	}
	
	public void set (String newName, int newNumber) {
	
		name = newName; 
		number = newNumber; 
	}
	
	public String toString() {
		return (name + " " + number); 
	}
	
	public static void changer (ToyClass aParameter) {
		
		aParameter.name = "Ser Pounce"; 
		aParameter.number = 3; 

	}
	
	// -----------
	
	public void makeEqual (ToyClass anObject) {
	
		anObject.name = this.name; 
		anObject.number = this.number; 
	}
	
	public void tryToMakeEqual (int aNumber) {
	
		aNumber = this.number;
	}

	// -----------
	
	public static void increment (int a) {
		
		System.out.println("\nInside of increment (Written as : increment(int a): "); 
		System.out.println("Value of 'a' before incrementing (x passed as argument 'a' in method): " + a);
		
		// Incrementing: 
		a = a + 1; 
		
		System.out.println("Value of 'a' after incrementing (x passed as argument 'a' in method): " + a); 
		System.out.println("Closing increment... \n"); 
	} 
	
	// Argument passed must be of a class type: 
	public static void increment2 (ToyClass aParameter) {
		
		System.out.println("\nInside of increment2 (Written as : increment2(ToyClass aParameter): "); 
		System.out.println("Value of aParameter.publicInstanceVar before incrementing (varObj is passed as argument) : " + aParameter.publicInstanceVar); 	
		
		// Incrementing: 
		aParameter.publicInstanceVar = aParameter.publicInstanceVar + 1; 

		System.out.println("Value of aParameter.publicInstanceVar after incrementing (varObj is passed as argument) : " + aParameter.publicInstanceVar); 	
		System.out.println("Closing increment2... \n "); 
	}
		
	public static void main (String [] args) {

		ToyClass varObj1 = new ToyClass("Steven", 29); // Creates the variable 'variable1' and the varObject. The varObject is placed somewhere in memory, and the address of the varObject is placed in the variable/varObject 'varObj1'. 
		
		ToyClass varObj2; // Creates the class variable 'varObj2' in memory but assigns in no value.  
		
		System.out.println("\n\nvarObj1 : " + varObj1); 
		
		varObj2 = varObj1; // Now both variables point to the same address,  due to the assignment statement. Two names for the same object. 
		
		varObj2.set("Lindsay", 28); // Setting the object value to "Lindsay", 28, but since varObj1 = varObj2, varObj1 now points to this location as well. 
		
		System.out.println("varObj2 : " + varObj2); 
		System.out.println("varObj1 (varObj1 = varObj2): " + varObj1); // returns Lindsay 28
		
		// -----------------  Creating an obect from the ToyClass: ---------------------------------- 
		
		// 1. Declaration: A variable of a class type declaration with a variable name varObj3 initialized to null. 
		ToyClass varObj3 = null; 
		
		// 2. Instantiation: The 'new' keyword is used to create the varObject (instance of the class), and...
		// 3. Initialization: The 'new' keyword is followed by an invocation to a constructor. This call initializes the new varObject.
		varObj3 = new ToyClass ("Sailor", 7); 
		
		System.out.println("varObj3 : " + varObj3); 
		
		ToyClass.changer(varObj3); // varObj3 and aParameter become two names for the same object.
		
		System.out.println("varObj3 (changed via changer method): "+ varObj3); 
		
		System.out.println("-------------------------------------------------------------------------------------------- \n"); 
		
		// Primative Type: 
		int x = 3; 
		
		System.out.println("Value of x before calling increment() : " + x); 
		increment(x); 
		System.out.println("Value of x after calling increment() (value hasn't changed): " + x); // The value of x remains unchanged. 
		
		System.out.println("** When x was passed in for the argument of increment(a), the value of x changed inside of the method, but remained the same when the method was finished executing outside of it. **"); 
		
		System.out.println("-------------------------------------------------------------------------------------------- \n"); 
		
		// Class Type (reference types): 	
		ToyClass varObj = new ToyClass(); // The variable varObj contains only the memory address(reference) of the objects it stores. 
		
		System.out.println("Value of varObj.publicInstanceVar set by constructor : " + varObj.publicInstanceVar); 
		varObj.publicInstanceVar = 200; // varObj doesn't store the value 200, but rather the address (reference) to where the value 200 is stored. 
		System.out.println("Value of varObj.publicInstanceVar after assigning it to value 200 (before calling increment2 ) : " + varObj.publicInstanceVar);
		
		increment2(varObj);  
		System.out.println("value of varObj.publicInstanceVar after calling increment2() (value changed) : " + varObj.publicInstanceVar); 
		System.out.println("** Since publicInstanceVar is part of the varObject, the changes made within the method had an effect on the original variable. **\n");  
		
		System.out.println("-------------------------------------------------------------------------------------------- \n");
		
		ToyClass varObj4 = new ToyClass("Ashley", 31); 
		ToyClass varObj5 = new ToyClass("Adam", 29); 
		
		
		System.out.println("Value of varObj4 : " + varObj4); 
		System.out.println("Value of varObj5 : " + varObj5); 
		
		varObj4.makeEqual(varObj5);  	
		
		System.out.println("Value of varObj5 - After calling method varObj4.makeEqual(varObj5): " + varObj5); 	
		
		System.out.println("-------------------------------------------------------------------------------------------- \n");
			
			
		ToyClass variable1 = new ToyClass("Joe", 42);
		
		// Anonymous Object: Creating an object of a class type without assigning it to a variable (Single time use): 
		
		System.out.print("Comparing variable1 with anon obj with same name and number: "); 
		if (variable1.equals( new ToyClass("Joe", 42))) // Anon object.
			System.out.println("Equal");
		else
			System.out.println("Not equal");	
			
		System.out.print("Comparing varObj4.makeEqual(varObj5) : "); 	
		if (varObj4.equals(varObj5))
			System.out.println("Equal");
		else
			System.out.println("Not equal");			
		
		System.out.print("Comparing varObj1 = varObj2 : "); 	
		if (varObj2.equals(varObj1))
			System.out.println("Equal");
		else
			System.out.println("Not equal");				
	
		System.out.println("-------------------------------------------------------------------------------------------- \n");
		
	} // Closing main method
	
} // Closing the ToyClass. 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
