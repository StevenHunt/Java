/**

	FOR-EACH LOOPS: a new kind of for loop that can cycle through all the elements in a collection even though there are no indices for the elements (as there are with an array).
	
	This type of for-loop is prefered over the standard for-loop: for(int index; i < a.length; i++), when using a loop to cycle (iterate) through the array elements, because it can make the code a lot cleaner, and less error prone. 

	for (arrayBaseType Variable : arrayName)
		statement

	Example: Reads "For each element in a, print out all of a's elements"
	
	for (int element : a){
		System.out.println(element); 
	}
	
	=====================================================================================
	

	
*/

public class forEachLoops {
	
	public static void main (String [] args) {
	
		// A double array, with size 10, and reference variable 'a'. 
		double [] a = new double [10]; 
		
		// Partially filled: 
		a[0] = 20; 
		a[1] = 30; 
		a[2] = 40; 
		a[3] = 50; 
		a[4] = 60; 

		System.out.println("\n"); 
				
		// Prints the entire array, even those that have not had their values filled with substantial data: 
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " "); 
		}
		// OUTPUT: 20.0 30.0 40.0 50.0 60.0 0.0 0.0 0.0 0.0 0.0
		
		System.out.println("\n"); 
		
		for (double element : a) {
			System.out.print(element + " "); 
		}
		// OUTPUT: 20.0 30.0 40.0 50.0 60.0 0.0 0.0 0.0 0.0 0.0
		
		System.out.println("\n"); 
				
		double sum1 = 0; 
		for (int i = 0; i < a.length; i++) {
			sum1 += a[i]; 
		}
		System.out.println("\nSum1 = " + sum1); 
		
		double sum2 = 0; 
		for (double element : a) {
			sum2 += element;
		}
		System.out.println("Sum2 = " + sum2 + "\n"); 
		
		
		
		// ===================================================================================================
	
		// The above sample code bits simply iterate through the array of elements, so a for-each-loop is prefered. 
		
		// But when a for loop uses another variable like below, it is ok to keep with the standard for-loop: 
		
		for (int i = 0; i < a.length; i++) {
		
			a[i] = 2 * i; // i is used not only as an index, but as a multiplier as well. 
		}
	
	}
}


/** ============= OUTPUT ===============

20.0 30.0 40.0 50.0 60.0 0.0 0.0 0.0 0.0 0.0 

20.0 30.0 40.0 50.0 60.0 0.0 0.0 0.0 0.0 0.0 


Sum1 = 200.0
Sum2 = 200.0

   =================================== */
