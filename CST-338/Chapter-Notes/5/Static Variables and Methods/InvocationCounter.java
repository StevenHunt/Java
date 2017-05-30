/** 

STATIC VARIABLES (SV): 

	- SVs belong to a class as a whole. 
	- All objects of the class can read and change the SV. 
	- SVs should normally be private, unless they happen to be defined constants. 

*/

public class InvocationCounter {

	private static int numberOfInvocations = 0; // initializing private static varible.
	
	public void demoMethod () {
		numberOfInvocations++; // Increment the private static variable. 
	}
	
	public void outputCount () {
		System.out.println("Number of invocations so far = " + numberOfInvocations); // Doesn't need to be called any special way as this is a class method. 
	}
		
	public static int numberSoFar () {
		
			numberOfInvocations++; 
			return numberOfInvocations;
	}
	
	public static void main (String [] args) {
		
		int i; 
		
		// Creating class InvocationCounter object, object1. 
		InvocationCounter object1 = new InvocationCounter(); 
		for (i = 1; i <= 6; i++) {
			
			object1.demoMethod(); 
			object1.outputCount(); // Outputs '6' : 5 invocations of demoMethod and 1 invocation of outputCount. 
		}
		
		InvocationCounter object2 = new InvocationCounter(); 
		for (i = 1; i <= 5; i++) {
			
			object2.demoMethod(); 
			object2.outputCount(); 
		}
		
		System.out.println("\nTotal number of invocations: " + numberSoFar() ); 
		
	} // Closing main()
	
} // Closing class invocationCounter

