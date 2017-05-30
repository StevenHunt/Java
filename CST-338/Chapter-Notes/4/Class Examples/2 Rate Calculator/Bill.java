
// Class Bill: 

// Demo: An example of using a parameter argument as a local variable inside the methods body. 

import java.util.Scanner; // To get user input

public class Bill {

	// Final variable : 
	public static final double RATE = 150.00; // Dollars per quarter hour (15 mins)
	
	// Private Variables: 
	private int hours; 
	private int minutes; 
	private double fee; 

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
		System.out.println("Rate is : " + RATE + " per quarter hour. " ); 	
		System.out.println("Amount due is : $"  + fee );
	}
}
