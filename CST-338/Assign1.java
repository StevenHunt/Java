/*

- Author  : Steven Hunt
- Course  : CST 338 - Software Design
- Date    : 04.27.17
- Program : Module 1 

- The program prompts the user for their first and last names. It then concatenates their responses into one variable and displays the output normally, in all lowercase letters, and then all uppercase letters. It also displays the length of their name and the amount of actual characters used in their name. 

- The program then displays the amount of hours each student should be dedicating towards homework, and then askes the user to input the amount of hours they spend on homework (to 3 decimal places). This amount is then rounded down to 1 decimal place and displayed accordingly. 

 */

import java.util.Scanner;  // Allows use of Scanner class.
import java.text.DecimalFormat;  // Allows use of DecimalFormat class. 


public class Assign1 {

	// Static final variables: 
	public static final int MIN_HOURS = 12;  
	public static final int MAX_HOURS = 20; 
	
	// main method: 
	public static void main(String[] args) {
		
		// Creates an object of the class Scanner named keyboard: 
		Scanner keyboard = new Scanner(System.in);     

		// Output and reads strings from keyboard: 
		System.out.print("Enter your first name (Capitalize first letter) : ");
		String firstName = keyboard.next(); 
		
		System.out.print("Enter your last name (Capitalize first letter) : ");
		String lastName = keyboard.next(); 
				
		// Concatenate the two name variables into one: 
		String fullName = firstName + " " + lastName; 
		int actualLength = firstName.length() + lastName.length(); 
		System.out.println("Your name is " + fullName + ".");
		
		// Use length method to find length of variables: 
		System.out.println("The length of your name is " + fullName.length() + ", using " + actualLength + " characters."); 
		
		// Use toUpperCase and toLowerCase methods to convert string to all lowercase and all uppercase: 
		System.out.println("All uppercase: " + fullName.toUpperCase()); 
		System.out.println("All lowercase: " + fullName.toLowerCase());
		
		// Output range of hours: 
		System.out.println("You should be spending anywhere from " + MIN_HOURS + " to " + MAX_HOURS + " per week on homework. "); 
		
		// Ask user how many hours they spend on homework and reads double from keyboard:  
		System.out.print(firstName + ", how many hours do you spend on homework each week (to 3 decimal places) : ");
		double hoursWorked = keyboard.nextDouble(); 
		
		// Creates an object of the class DecimalFormat named formattingObject, set to 1 decimal place:  
		DecimalFormat formattingObject = new DecimalFormat("00.0");
	    
		// Outputs the amount of hours worked rounded to 1 decimal place using the formatting object: 
	    System.out.println("You spend roughly " + formattingObject.format(hoursWorked) + " per hours a week on homework. ");
	   
	}

}


/************************** OUTPUT **************************

Enter your first name (Capitalize first letter) : Steven 
Enter your last name (Capitalize first letter) : Hunt
Your name is Steven Hunt.
The length of your name is 11, using 10 characters.
All uppercase: STEVEN HUNT
All lowercase: steven hunt
You should be spending anywhere from 12 to 20 per week on homework. 
Steven, how many hours do you spend on homework each week (to 3 decimal places) : 14.394
You spend roughly 14.4 per hours a week on homework. 

************************************************************/
