
/**
# Interfaces: A type that groups together a number of different classes, that will include method defintions for a common set of method headings. 

- NOT A CLASS, RATHER A TYPE THAT CAN BE SATISFIED BY ANY CLASS THAT IMPLEMENTS THE INTERFACE. 
- A property of a class, that says what methods it must have. 
- An interface, supplies the headings for methods that must be defined in any class that impliments the interface. 
- Normally declared public, along with its methods.
	- Methods cannot be given any other access. 

- A derived class can only have one base class! Although it can have any number of interfaces!
- Stored in a .java file and compiled just as a class definition is compiled. 

- CONSTANTS: 

public interface MonthNumbers {

	public static final int JANUARY = 1,FEBRUARY = 2, MARCH = 3, APRIL = 4, MAY = 5,JUNE = 6, JULY = 7, AUGUST = 8, SEPTEMBER = 9,
OCTOBER = 10, NOVEMBER = 11, DECEMBER = 12;

}

public 
--------------------

===========================================
CONCRETE CLASS implementing interfaces:

define: 

	public interface interface_Name {

		Methods...
	}

To implement in a concrete class, 
	- It must have the below at the start of the class definition.  
	- The class implementing, must define all of the methods in the interface. 


	public class className implements interface_Name

==========================================
ABSTRACT CLASS implementing interfaces:

An abstract class can implement an interfae and not define all of the methods in the interface. Although, the remaining methods that were not defined, must be made abstract.

public abstract className implements interface_Name

==========================================

DERIVING INTERFACE FROM BASE INTERFACE: Extending

- See ShowablyOrdered.java

==========================================
INTERFACE SEMANTICS AREN'T ENFORCED: 

- When you implement an interface into a class, the compiler will let you define the body of an interface method any way you want, provided you keep the method heading as it was given in the interface. 

==========================================
COMPARABLE INTERFACE: Automatically avialable to program (in java.lang)

Has just one method heading: Page 720

public int compareTo (Object other); 

==========================================

An interface 

==========================================
*/

public interface MonthNumbers {

	public static final int JANUARY = 1,FEBRUARY = 2, MARCH = 3, APRIL = 4, MAY = 5,JUNE = 6, JULY = 7, AUGUST = 8, SEPTEMBER = 9,
OCTOBER = 10, NOVEMBER = 11, DECEMBER = 12;

}
