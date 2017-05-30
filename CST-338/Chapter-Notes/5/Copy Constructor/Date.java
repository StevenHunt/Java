/** Copy constructors: 

- Constructor with a single argument that is of the same type as the class. 
- Creates an object that is a seperate, independent object but with the instance variables set so that it is an exact copy of the arument object... 

*/

public class Date {
	
	private String month; 
	private int day; 
	private itn year; // 4 digit number
	
	// ======================================= CONSTRUCTORS : Create a new object of the Date class ====================================
	
	// Constructor: 
	public Date (String monthString, int day, int year) {
	
		setDate (monthString, day, year); 
	}
	
	// Copy Constructor: Creates a new object for the class Date. 
		// Then sets the instance variables 
	public Date (Date aDate) {
	
		if (aDate == null) { // Not a real date
			System.out.println("Fatal Error"); 
		 	System.exit(0); 
		}
		
		month = aDate.month; 
		year = aDate.year; 
		day = aDate.day; 
	}
	
	// -------------------------------------- OTHER METHODS -----------------------------------------------------
	
	public void setDate (String monthString, int day, int year) {
		
		if (dateOK (monthString, day, year)) { // The method dateOk checks to see if the date is legitimate (ex. more than 31 days). 
			
			this.month = monthString; 
			this.day = day; 
			this.year = year; 
		}
		else {
			
			System.out.println("Fatal Error"); 
			System.exit(0); 
		}

	// public void setYear (....) {}
	
	// public String toString (...) {}
	
	// ...  
