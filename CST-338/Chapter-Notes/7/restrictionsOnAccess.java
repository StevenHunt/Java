/**	
	
	PRIVATE VARIABLES AND METHODS: INFORMATION HIDING (HARD TO ACCESS AND FOR GOOD REASONS)!
	
	*** Private instance variables or methods are not accessable in derived classes without using a base class method that uses that variable or method ***
	
	*** You cannot use a private instance variable or method (for example name), in a derived class by simply saying name, you must use a method that was declared public in the base class that has access to the private instance variable (name). ***

	*** You cannot mention a private inherited instance variable or method by name in an derived class, you must use public accessors from the base class, even though they instance variables have been inherited to you, the derived class only has no much access to them ****
	
	*** The only way to get access to a private method of the base class, is if a public method of the base class invokes that private method. It's very indirect, but its what keeps information hidden ***
	
	==========================
	
	PROTECTED / PACKAGE (FRIENDLY or DEFAULT) ACCESS: 
	
	Accessing instance variables and methods by name: 
	
	- PROTECTED: Always gives access throughout own class, derived class, and any class in same package.
	
	public String toString() // Legal if instance variables in Employee are marked protected
	{
		return (name + " " + hireDate.toString() + "\n$" + wageRate + " per hour for " + hours + " hours");
	}
	// Instead the name and hireDate variables have to be accessed via accessors : getName() and  getHireDate.
   
   -------------
   
  - PACKAGE / DEFAULT / FRIENDLY : it can be accessed by name inside the definition of any class in the same package, but not outside of the package. Also considered the default access because if you were to leave off 'public,private,protect' or any access to an instance variable or method definition, then it will become PACKAGE access.
  
 */
 
 
 /**
 A class can access its own classes’ inherited variables and methods that are marked protected in the base class,but cannot directly access any such instance variables or methods of an object of the base class
 

 */

package one;  

public class B {

	protected int n; 
	private int m;
	public int s; 
	
}

// -----------
	
package two; // If they belong to the same package, I would not get the error, b/c protected access implies package access.

import one.class1;  

public class D extends B	{ // Inherits Bs stuff.

// .... code ....

	public static void main ( String [] args ) {

		// LEGIT: 
		n = 3; // Can access it by name since n is protected access in B.
	 	
	 	// LEGIT: 
	 	D object = new D (); 
	 	object.d = 4;
	 	
	 	// ERROR: A class cannot directly access any instance variable or methods of an object of the base class.
	 	B object = new B (); 
	 	object.n = 4; 
	 	
	}
} 	
