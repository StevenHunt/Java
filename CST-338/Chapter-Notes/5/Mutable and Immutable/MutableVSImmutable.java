public class MutableVSImmutable {

	public static void main (String [] args) {
	
		// Immutable: Everytime an object is modified, it actually creates a new object with the new value. 
		// Everytime one of these objects is changed, it's actually changing a different part of the memory. 
		
		// Integer is an Inmutable objects:
		Integer a = new Integer(3); 
		Integer b = a; 
		a += 5; // 'a' is pointing to a memory location with a value of 8, as well as pointing to a memory location with a value of 3?
						// How do you access the a that had been changed, since technically it's a copy? 
		System.out.println("a = " + a + ", b = " + b); 		
		
		// ===================================================================================================
		
		// Mutable: The contents of an object live in a memory address to which the object always points to. All the mutable objects
		MutableInt m = new MutableInt(3); 
		MutableInt p = m;  // p now points to the exact same memory address as m. 
		m.number += 5; 
		System.out.println("m = " + m + ", p = " + p); 

	} // Close main()
	
} // Close MvI class


/**
IMMUTABLE CLASS / OBJECT:  A class that contains no methods (other than constructors) that change any of the
data in an object of the class is called an immutable class , and objects of the class are
called immutable objects . The class String is an immutable class. It is perfectly safe
to return a reference to an immutable object, because the object cannot be changed in
any undesirable way; in fact, it cannot be changed in any way whatsoever.




	#  a's value never changes. Copies are made whenever 'a' is changed. When a value is assigned (b=a), b is actually assigned to a copy of a. 
	1. A new reference variable 'a' is created from class Integer (which is an immutable object). 
	2. It holds the memory location that has the value 3. 
	3. 'b' points to another memory location that has a copy of the value of 'a', which is 3.  
	4. 'a' is increased, and since it's immutable, it now points to another memory location that has a value of 8. 
	5. Prints: a = 8, b = 3
	
	========================================================
	
MUTABLE CLASS / OBJECTS: A class that contains public mutator methods or other public methods, such as
input methods, that can change the data in an object of the class is called a mutable
class , and objects of the class are called mutable objects. 

******* Never Return a Reference to a Mutable Private Object *************
You should never write a method that returns a mutable object, but should instead use a
copy constructor (or other means) to return a reference to a completely independent
copy of the mutable object. 


	#  m's value constantly changed, and when it had other values assigned to it, those pointed to the actual same address. 
	1. A new reference variable 'm' is created  from class MutableInt (which is a mutable object). 
	2. 'm' carries a memory address, which points to the value of 3. 
	3. 'p' now points to the same memory address as 'm', they point to the exact same space in memory (they are now virtually the same object). 
	4. 'p' = 3
	5. 'm' is increased by 5, making it's value 8. 'm' is still pointing the the same address as it was before, but the value within that address has increased. Since p & m were pointing to the same location, the value of p has increased as well to 8. 
	6. Unlike Immutable objects, there are no additional copies being made when the objects are altered, the values that are being pointed to from the reference variables are changing at their same location. 
	7. Prints: m = 8, p = 8


========== OUPUT ===========

a = 8, b = 3
m = 8, p = 8


*/
