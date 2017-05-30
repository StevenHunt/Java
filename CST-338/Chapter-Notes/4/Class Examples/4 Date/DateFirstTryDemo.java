
// Class definition program : 

public class DateFirstTryDemo  {

	public static void main ( String [] args) {


		// Objects of the class DateFirstTry, and named it with the variables: date1 and date2.
		// Each object has three instance variables: month, day, year.  

		// Objects can use instance variables and methods of class DateFirstTry: 
		DateFirstTry steven = new DateFirstTry(); 
		DateFirstTry lindsay = new DateFirstTry(); 
		DateFirstTry mom = new DateFirstTry(); 
		DateFirstTry dad = new DateFirstTry();
		DateFirstTry ashley = new DateFirstTry();  
		DateFirstTry kitty = new DateFirstTry(); 
		DateFirstTry sailor = new DateFirstTry(); 

		// Instance Variables assigned to class object: 
		steven.month = "May"; 
		steven.day = 21; 
		steven.year = 1987; 
		steven.age = 29; 

		lindsay.month = "October"; 
		lindsay.year = 1988; 
		lindsay.day = 19; 
		lindsay.age = 28; 

		// -------------------------------------- INVOKING VOID TYPE METHODS -----------------------------------------------------------

		System.out.println("\nVoid Type Methdods: \n" );

		steven.bdayOutput(); 
		steven.ageOutput(); 

		System.out.println(" "); 

		lindsay.bdayOutput(); 
		lindsay.ageOutput(); 

		System.out.println(" " ); 

		//  Output instance variables using System class with println method: 
		System.out.println("\nUsing System.out.println : " + steven.month + " " + steven.day + ", " + steven.year); 

		// This will produce an error: Cannot invoke with class object
		// steven.System.out.println(month + " " + day + ", " + year); 


		// -------------------------------------- INVOKING RETURN TYPE METHODS -----------------------------------------------------------

		// Variables: 
		int day1, year1, day2, year2; 
		String month1, month2; 

		System.out.println("\nReturn Type Methods: \n");

		// Invoking void method (readInput), with class object steven. 
		steven.readInput(); 

		// Since we're calling this method with the steven object, the user input variables are assigned to this object. 
		// Now steven has a : steven.birthDay , steven.birthMonth, and a steven.birthYear. 

		// Assigning variables to invoked return methods of class object steven. 
		day1 = steven.getBirthDay(); 
		month1 = steven.getBirthMonth(); 
		year1 = steven.getBirthYear(); 

		System.out.println("Steven, you were born in " + month1 + " of " + year1 + ".\n"); 
		
		// Using same methods, but getting different results since we're calling it with the lindsay object this time: 
		lindsay.readInput(); 
		day2 = lindsay.getBirthDay(); 
		month2 = lindsay.getBirthMonth(); 
		year2 = lindsay.getBirthYear(); 

		System.out.println("Lindsay, you were born on day " + day2  + " of " + month2 + ", " + year2 + "."); 	
	}
}
