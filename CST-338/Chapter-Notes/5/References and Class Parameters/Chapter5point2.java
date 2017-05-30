
/** References and Class Parameters: 

	VARIABLES: 
	* Primitive type: If n is an int variable, then n can contain a value of type int.
		- The value of the variable is stored in the memory location assigned to the variable. 
		- Always requires the same amount of memory. (There is a known maximum value for all prim types. 
		
	* Class Objects : If v is a class type variable, then v doesn't directly contain an object of its class. Instead, v names an object by containng the memory address of where the object is located in memory. 
		- Stores ONLY THE MEMORY ADDRESS of where an object is located. 
		- The class type variable contains only the memory address of where the object is stored. 
		- An object of a class (for example the String class) may be of any size. The memory location for a variable of type String is of a fixed size, so it cannot hold an aribitrarily long string, however, it can hold the address of any string because there is a limit to the size of the address. 
		- Because of this, two class type variables can contain the same address, and in some situations name the same object. This means that any change to the object named by one of the variables will produce a change to the object named by the other. 
	
	MEMORY: 
	- Secondary : Used for file storage. 
	- Main : Used for running a program. 	
		- Values stored in a programs variables are stored in the main memory. 
		- Consists of bytes, containing bits (eight 0/1 digits).The number that identifies the byte, is called the ADDRESS.
		- Memory Location : Entire chunk of memory that holds the the data.   
		
*/ 

// -------------------------------------------------------------------------------------

// The Toy class to represent 'REFERENCES'. 

public class ToyClass {

	private String name; 
	private int number; 
	
	public ToyClass (String initialName, int initialNumber) {
	
		name = initialName; 
		number = initialNumber; 
	}
	
	public ToyClass {
	
		name = "No name yet..."
		number = 0; 
	}
	
	pubilc void set (String newName, int newNumber) {
	
		name = newName; 
		number = newNumber; 
	}
	
	public String toString() {
		return (name + " " + number); 
	}
	
	public static void changer (ToyClass aParamter) {
		
		aParameter.name = "Hot Shot"; 
		aParameter.number = 42; 
	}
	
	public boolean equals ( ToyClass otherObject ) {
	
		return ( (name.equals (otherObject.name) ) && (number = otherObject.number) ); 
	}	
	
	public static void main (String [] args) {
		
		ToyClass
		
	} // Closing main method
	
} // Closing the ToyClass. 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
