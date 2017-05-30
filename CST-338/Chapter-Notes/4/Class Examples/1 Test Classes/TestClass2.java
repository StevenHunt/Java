
// Class Bill: 

// Demo: An example of using a parameter argument as a local variable inside the methods body. 

import java.util.Scanner; // To get user input

public class TestClass2 {

	// Objects of the TestClass2 class: 	

	// Final variable : 
	public static final double RATE = 150.00; // Dollars per quarter hour (15 mins)
	
	// Private Variables: 
	private int minutes; 
	private double fee;  

	// Public Variables: 
	public int hours; 
	public int hours2; 

	public int testVal; 

	// Methods: 
	public void inputTimeWorked() {
	
		Scanner keyboard = new Scanner(System.in); 
	
		System.out.print("Enter number of hours and minutes worked ( HH MM ): " ); 
		hours = keyboard.nextInt();
		minutes = keyboard.nextInt(); 
	}

	private double computeFee (int hoursWorked,   int minutesWorked) { // minutesWorked! 

		minutesWorked = hoursWorked * 60 + minutesWorked; 

		int quarterHour = minutesWorked / 15; 

		return quarterHour * RATE; 
	}

	public void updateFee () {
		fee = computeFee(hours, minutes); 
	}

	public void outputBill () {
		
		System.out.println("Time worked : " + hours + " hours and " + minutes + " minutes. "); 
		System.out.println("Rate is : $" + RATE + " per quarter hour. " ); 	
		System.out.println("Amount due is : $"  + fee );
	}

	// ------------------------------------------------------------- Boolean Values  ---------------------------------------------------------------

	// A method that returns a value of type boolean must have a return statement : return boolean_expression; 
	// Returns either true of false (good use for controlling if-else, while loops, 

	// fee in this case, really means this.fee (and this stands for the calling object). 
	public boolean isBetween (  int lowFee, int highFee) {
	
		// Can use this.instance or just the instance variable. 
		return ( ( this.fee > lowFee ) && ( fee < highFee ) ); 
	}

	// -------------------- Class object in parameter --------------------

	// I still need to look this up. 

	
	








}
