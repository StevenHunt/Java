
public class chapter5Demo4 {

	// Private static variable: 
	private static int turn = 0; 
	
	// Private variables: 
	private int myTurn; 
	private String name; 
	
	// Constructor 1: Default
	public chapter5Demo4 (String theName, int theTurn) {
		
		name = theName; 
		if (theTurn >= 0)
			myTurn = theTurn; 
		else {
			System.out.println("Fatal Error..."); 
			System.exit(0); 
		}
	}
	
	// Constructor 2: Initializations
	public chapter5Demo4 () {
	
		name = "No name yet..."; 
		myTurn = 0; // Indicating no turn. 
	}
	
	// Getter: 
	public String getName () {
		return name; 
	}
	
	public static int getTurn () {
		
	  // turn here mean chapter5Demo4.turn
		turn++; // Since this is a static variable, it can be accessed within a static method (if it were not a static variable, it would need to be refered to by an obj). 
		return turn; 
	}
	
	public boolean isMyTurn () {
		return (turn == myTurn); 
	}
	
	// ------------------------------------------------------------------------------------ Main() is inside the the class body. 
	public static void main (String [] args) {
	
		// Creating class objects with parameters with constuctor 1 (name, turn): 
		
		// These two object access the same static variable turn: 
		chapter5Demo4 lover1 = new chapter5Demo4 ("Steven", 2); 
		chapter5Demo4 lover2 = new chapter5Demo4 ("Lindsay", 5);
		
		for (int i = 0; i < 10; i++) {
		
			System.out.println("Turn = " + chapter5Demo4.getTurn()); 
			
			if ( lover1.isMyTurn() )
				System.out.println("Love from " + lover1.getName() + "\n"); 
			if ( lover2.isMyTurn() )
				System.out.println("Love from " + lover2.getName() + "\n"); 
		}
		
	} // Closing main()
	
} // Closing class chapter5Demo4 ()
 
