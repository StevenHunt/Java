/** 

Chapters 4-5: 

Pearson Absolute Java Date Class

*/


import java.util.Scanner; 

public class Date {

	private String month; 
	private int day; 
	private int year; 
	
	// CONSTRUCTORS: =====================================================
	
	// No argument constructor: 
	public Date () {
		
		month = "January";
		day = 1;
		year = 1000;
	}
	
	// Constructor for when month is an int.
	// Invoking another method inside the constructor definition to set the date. 
	public Date( int monthInt, int day, int year) {
	
		setDate(monthInt, day, year);
	}
	
	// Constructor for when month is an String.
	// Invoking another method inside the constructor definition to set the date. 
	public Date(String monthString, int day, int year) {
	
		setDate(monthString, day, year);
	}
	
	// A Constructor usually initializes all instance variables, even is not a corresponding parameter. 
	public Date( int year) {
	
		setDate(1, 1, year);
	}
	
	// Copy Constructor: 
	public Date(Date aDate) {
	
		if (aDate == null) { // Not a real date. 
		
			System.out.println("Fatal Error.");	
			System.exit(0);
		}

		// Otherwise: Copy instance variables from Class object passed in parameter, into new obj constructed. 
		month = aDate.month;
		day = aDate.day;
		year = aDate.year;
	}
	
	// RANDOM METHODS: ====================================================
	
	public String toString() {
			
		return (month + " " + day + ", " + year); 
	}
	
	public void readInput () {
	
		boolean tryAgain = true;
		Scanner keyboard = new Scanner(System.in);
		while (tryAgain) {
		
			System.out.print("Enter month, day, and year (as 3 integers, seperated by spaces) : ");
			
			int monthInput = keyboard.nextInt();
			int dayInput = keyboard.nextInt(); 
			int yearInput = keyboard.nextInt();
	
			if (dateOK(monthInput, dayInput, yearInput)) {
			
				setDate(monthInput, dayInput, yearInput);
				tryAgain = false;
			}
			else
				System.out.println("Illegal date. Reenter input.");
		}
	}
	
	public boolean equals(Date otherDate) {
	
		return 
		( (month.equalsIgnoreCase(otherDate.month)) && // The method equals of the class String
		(day == otherDate.day) && 
		(year == otherDate.year) );
	}
	
	public boolean precedes(Date otherDate) {
	
		return ( (year < otherDate.year) || (year == otherDate.year && getMonth() < otherDate.getMonth()) ||
		(year == otherDate.year && month.equals(otherDate.month) && day < otherDate.day) );
	}
	
	// dateOk for when month is an int: 
	private boolean dateOK( int monthInt, int dayInt, int yearInt) {
	
		return ( (monthInt >= 1) && (monthInt <= 12) && (dayInt >= 1) && (dayInt <= 31) && (yearInt >= 1000) && (yearInt <= 9999) );
	}
	
	// dateOk for when month is a String: 
	private boolean dateOK( String monthString, int dayInt, int yearInt) {
	
		return ( monthOK(monthString) && (dayInt >= 1) && (dayInt <= 31) && (yearInt >= 1000) && (yearInt <= 9999) );
	}
	
	private boolean monthOK(String month) {
	
		return (month.equals("January") || month.equals("February") ||
		month.equals("March") || month.equals("April") ||
		month.equals("May") || month.equals("June") ||
		month.equals("July") || month.equals("August") ||
		month.equals("September") || month.equals("October") ||
		month.equals("November") || month.equals("December") );
	}
	
	// Converting month from int to String: 
	public String monthString(int monthNumber) {

		switch (monthNumber) {
			
			case 1: 
				return "January"; 
			case 2: 
				return "February"; 
			case 3: 
				return "March"; 
			case 4: 
				return "April"; 
			case 5: 
				return "May"; 
			case 6: 
				return "June"; 
			case 7: 
				return "July"; 
			case 8: 
				return "August"; 
			case 9: 
				return "September"; 
			case 10: 
				return "October"; 
			case 11: 
				return "November"; 
			case 12: 
				return "December"; 
			default:
				System.out.println("Fatal error..."); 
				System.exit(0); 
				return "Error"; // default must retrun value (in this case it has to be a string)  	
		}
	}
	
	// ACCESSORS: =============================================================
	
	public int getDay() {
		return day;
	}

	public int getYear() {
		return year; 
	}
	
	// Converting month from String to int:
	public int getMonth() {
		
		if ( month.equalsIgnoreCase("January") )
			return 1; 
		else if ( month.equalsIgnoreCase("February") )
			return 2;
		else if ( month.equalsIgnoreCase("March") )
			return 3;
		else if ( month.equalsIgnoreCase("April") )
			return 4;
		else if ( month.equalsIgnoreCase("May") )
			return 5;
		else if ( month.equalsIgnoreCase("June") )
			return 6;
		else if ( month.equalsIgnoreCase("July") )
			return 7;
		else if ( month.equalsIgnoreCase("August") )
			return 8;
		else if ( month.equalsIgnoreCase("September") )
			return 9;
		else if ( month.equalsIgnoreCase("October") )
			return 10;
		else if ( month.equalsIgnoreCase("November") )
			return 11;
		else if ( month.equalsIgnoreCase("December") )
			return 12;
		else {
			System.out.println("Fatal Error.. "); 
			System.exit(0); 
			return 0; 
		}
	}
		
	
	// MUTATORS: =============================================================
	
	public void setDay( int day) {
	
		if ((day <= 0) || (day > 31)) {
		
			System.out.println("Fatal Error");
			System.exit(0);
		}
		else
			this.day = day;
	}
		
	public void setMonth( int monthNumber) {
	
		if ((monthNumber <= 0) || (monthNumber > 12)) {
		
			System.out.println("Fatal Error");
			System.exit(0);
		}
		else
			month = monthString(monthNumber);
	}
	
	public void setYear( int year) {
	
		if ( (year < 1000) || (year > 9999) ) {
		
			System.out.println("Fatal Error");
			System.exit(0);
		}
		else
			this.year = year;
	}
	
	// Mutator for when month is an int: 
	public void setDate( int monthInt, int day, int year) {
	
		if (dateOK(monthInt, day, year)) {
	
			this.month = monthString(monthInt);
			this.day = day;
			this.year = year;
		}	
		else {
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}
	// Mutator for when month is a String: 
	public void setDate(String monthString, int day, int year) {
	
		if (dateOK(monthString, day, year)) {
		
			this.month = monthString;
			this.day = day;
			this.year = year;
		}
		else {
		
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}

	// Mutator for when year is the only known parameter: 
	public void setDate( int year) {
	
		setDate(1, 1, year);
	}

} // Close Date Class. 
