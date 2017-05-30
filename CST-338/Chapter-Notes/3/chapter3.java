// Chapter 3: 

/*
Mechanics of Branching (multiway) : 

IF STATEMENT: (Page 100)
	
 if ( stuff ) { 
	#code
}
else if ( stuff ) {
	#code	
}
else if ( stuff ) {
	#code 	
}
else {
	#code 
}	

SWITCH STATEMENT: (Page 108)

switch(variable) {
	case 1: 
		#do something;
		break; 
	case 2: 
		#do something;
		break; 
	case 3: 
		#do something;
		break; 
	default: 
		#do something;
		break; 
	}

3.2 : Flow Control
--------------------------

- Boolean : For control branch and loop statements ( Page 113 && 119) 
- Lexicographic Ordering : Alphabetic ordering of ASCII characters.  (Page 116) 
- Precedence. (Page 126)text

3.3: Loops
--------------- ( Page 132 )

	- While: Boolean expression checked BEFORE the loop body is executed. If false, the body doesn't execute. 

	-Do/ While: The body of the loop is executed first, then the boolean expression is checked AFTER. Therefore, the loop 		executes at least once. 

------------- ( Page 138 )

	- For: for (initialization; boolean_expression; update) {
		#Body of Code. 	
	}

------------

- Algorithm: Set of precise instructions that leads to a solution. 
- Pseudocode: Mixture of code and english, leaving out the fine details, but it must be precise enough for a good programmer to syntactically correct code. 

(Page 148)
- Break: Ends the loop (if nested, then the innermost loop). 
	- To end the entire loop with a break statement, an identifier is required: 
		- break identifier; // Wherever the label is put (can be on any type of statement). 

- Continue: Ends the current iteration of the loop

- Exit: Ends the program!
	- System.exit(0); 

- Assertion : A statment that asserts either something true or false. It helps track data and conditions that might cause issues in production applications. 

- Random : 
	- Random Object : Random randomObject = new Random()
	- Math.random() : 
		- Defaults to double ( 0 - .999999999999..)
		- double rand = Math.random()
		- int rand = (int) Math.random()  // Typecast to an int. 
		- int rand = (int)(Math.random() * 6) + 1; // Random int from 1 - 6. 
		
------------------------------------------------
*/

// Import packages and classes: 
import java.util.Scanner; 					// Scanner 
import java.text.NumberFormat; 			// Number format for 'Rate Calculator' 
import java.util.Locale; 					// Location 
import java.util.Random; 					// Random 

public class chapter3 {

	// Final Variables: 

	public static void main(String[] args) {
		
		// Creating objects : 
		
		// Scanner : 
		Scanner keyboard = new Scanner(System.in); 
	
		// Number Format :
		NumberFormat curForm = NumberFormat.getCurrencyInstance(); 

		// Random: 
		Random randomGenerator = new Random(); 

		// ---------------------------------------------------------------- IF STATEMENTS --------------------------------------------------------------------------------------

//  Comment out to test lower programs faster: 

		double GWI, hoursWorked, GMI, hourlyRate, GAI12, GAI52; 

		System.out.print("\n\nWhat is your hourly wage : $"); 
		hourlyRate = keyboard.nextDouble(); 
		
		System.out.print("How many hours did you work : "); 
		hoursWorked = keyboard.nextDouble(); 
		
		// Gross Weekly Income: 	
		if (hoursWorked > 40) {
			GWI = 40 * hourlyRate + ((hoursWorked - 40) * (1.5 * hourlyRate)); 
		}
		else {
			GWI = hoursWorked * hourlyRate; 
		}
		
		// Gross Monthly Income: 
		GMI	= GWI * 4; 

		// Gross Annual Income: 
		GAI12 = GMI * 12; 
		GAI52 = GWI * 52.1429; 

		System.out.println("Gross Weekly Income : " + curForm.format(GWI) ); 
		System.out.println("Gross Monthly Income :  " + curForm.format(GMI) );
		System.out.println("Gross Annual Income (Based on 52 weeks) : " + curForm.format(GAI52)); 
		System.out.println("Gross Annual Income (Based on 12 months) : " + curForm.format(GAI12)); 
	
		// -------------------------

		//Net Income Calculator : Using information from above: 

		double fedTax, stateTax, ssTax, mediTax, NMI, NWI,  totalTaxes, NAI12, NAI52; 

		// Tax Rates: 
		fedTax =  .11; 
		stateTax = .04; 
		ssTax = .062; 
		mediTax = .0145; 
		
		// Total % of deductions: 
		totalTaxes = fedTax + stateTax + ssTax + mediTax; 

		// Net Weekly Income: 
		NWI = GWI - (GWI * totalTaxes); 

		// Net Monthly Income: 
		NMI = GMI - (GMI * totalTaxes); 

		// Net Annual Income: 
		NAI52 = NWI * 52.1429;
		NAI12 = NMI * 12;  
	
		// Output: 
		System.out.println("Net Weekly Income : " + curForm.format(NWI) ); 
		System.out.println("Net Monthly Income : " + curForm.format(NMI) );
		System.out.println("Net Annual Income (Based on 52 weeks) : " + curForm.format(NAI52) ); 
		System.out.println("Net Annual Income (Based on 12 months): " + curForm.format(NAI12) ); 		


		// ------------------------------------------------------------- SWITCH STATEMENTS ----------------------------------------------------------------------
			

		System.out.println("\n\nSwitch Statements : "); 
		
		// Switch Statements : 

		String gradeLetter; 
		
		System.out.print("What is the grade you have going into the final : "); 
		gradeLetter = keyboard.next(); 

		switch (gradeLetter) {
			case "A":
			case "a":
				System.out.println("You will not have to take the final! " ); 
				break; 			
			case "B": 
			case "b": 
				System.out.println("You will not have to try to hard on the final! "); 
				break; 
			case "C": 
			case "c": 
				System.out.println("If you do well on the final, you could get a B! "); 
				break; 
			case "D":
			case "d":
				System.out.println("You need at least a B to pass the class"); 
				break; 
			case "F": 
			case "f":
				System.out.println("Even with an A, you will not pass the class. Please take again next semester"); 
				break; 
			default: 
				System.out.println("Not a valid input."); 
				break; 	
			}

		// -------------------------------------------------------- COMPARING STRINGS --------------------------------------------------------------------------

		System.out.println("\n\nComparing Strings: "); 

		// Comparing Strings : 
		
		String s1, s2, s3; 
			
		s1 = "Sailor is a cute dog!"; 
		s2 = "SAILOR is a cute dog!"; 

		s3 = "Ser Pounce is a cute cat!"; 

		if (s1.equals(s2)) 
			System.out.println("s1 is the same as s2."); 

		else if (s1.equalsIgnoreCase(s2))
			System.out.println("s1 is the same as s2, but the case is different"); 

		else
			System.out.println("s1 and s2 are not the same, even ignoring case"); 

		if (s3.compareToIgnoreCase(s1) < 0) {
			System.out.println(s3); 
			System.out.println("proceeds"); 
			System.out.println(s1); 
			System.out.println("in alphabetic order."); 
		}
		else 
			System.out.println("s3 does not proceed s1. "); 		

		// -------------------------------------------------------------------- WHILE LOOP ------------------------------------------------------------------------------------

		System.out.println("\n\nWhile Loop: "); 
		// While loop: Averaging a list of scores: 
		
		double next; 
		double sum = 0; 
		int count = 0; 
		
		System.out.print("Enter a list of scores to be averaged. \nTo end the list, input a negative number : "); 
		next = keyboard.nextDouble(); 

		// Start of the while loop, using a sentinal value as a stop (negative number): 
		while (next >= 0) {
			sum = sum + next; 
			count++; 
			next = keyboard.nextDouble(); 
		}
		
		if (count == 0) {
			System.out.println("No Scores Entered."); 
		}
		else {
			double average = sum/count; 
			System.out.println(count + " scores read."); 
			System.out.println("The average score is " + average); 
		}

		// --------------------------------------------------------- DO - WHILE LOOP -----------------------------------------------------------------------------------	

		System.out.println("\n\nDo-While Loop: "); 
		
		int countDown;
		 System.out.println("\nFirst while loop:");
		countDown = 3;
		while (countDown > 0)
		{
		System.out.println("Inside First while loop");
		countDown = countDown - 1;
		}
		System.out.println("\nSecond while loop:");
		countDown = 0;
		while (countDown > 0)
		{
		System.out.println("Inside Second while loop");
		countDown = countDown - 1;
		}
		 System.out.println("\nFirst do-while loop:");
		countDown = 3;
		do
		{
		System.out.println("Inside first do-while loop");
		countDown = countDown - 1;
		} while (countDown > 0);
		 System.out.println("\nSecond do-while loop:");
		countDown = 0;
		do
		{
		System.out.println("Inside second do-while loop");
		countDown = countDown - 1;
		} while (countDown > 0);

		// -----------------------------------------------------------------FOR LOOP ----------------------------------------------------------------------------------		
		

		System.out.println("\n\nFor Loops: \n"); 

		// Sum integers 0 - 10: 
		int forSum = 0;
		for (int n = 1; n <= 10; n++){
			forSum += n;  
		}		
		System.out.println("The sum of 0 - 10 : " + forSum); 
		
		// -----------------------------------------------------------------FOR LOOP ----------------------------------------------------------------------------------		
		
		System.out.println("\n"); 
	
		int forNext; 
		int forSum2 = 0; 
		
		for (forNext = 10; forNext >= 0; forNext --) {
			forSum2 = forSum2 + forNext; 
			System.out.println("Sum up to " + forNext + " is " + forSum2); 
		}

		// -----------------------------------------------------------------FOR LOOP ----------------------------------------------------------------------------------		

		System.out.println("\n"); 

		int rowNum, columnNum; 
		
		// For every 1 iteration on the outside loop (row). 

		for (rowNum = 1; rowNum <= 3; rowNum++) {
			
			// The inside loop is iterated from beginning to end. 
			for (columnNum = 1; columnNum  <=3; columnNum ++) {
				System.out.print("row " + rowNum + "column  " + columnNum); 
			}
			System.out.println(); 
		}

		// ---------------------------------------------------------- LABLED LOOP WITH BREAK ------------------------------------------------------------
	
		System.out.println("\n\nLabled Loop with Break:"); 

		// break innerLoop : 0 1 2 3 4 5 <br> 1 2 3 4 5 < br> 2 3 4 5  <br> 3 4 5 <br> 4 5 <br> 5 <br> deafault <br> default <br> default.  
		// break outterLoop: 0 1 2 3 4 5 		

		outerLoop: 
		for (int lab1 = 0; lab1 < 6; lab1 ++) {
			
			innerLoop: 
			switch ( lab1 ) {
				case 0: 
					System.out.println("0"); 
				case 1: 
					System.out.println("1");
				case 2: 
					System.out.println("2"); 
				case 3: 
					System.out.println("3"); 
					break innerLoop; 
					// System.out.println("3"); This would throw an error : Unreachable statement.  
				case 4: 

				default: 
					System.out.println("Default");   		
			}
		}	


		// ---------------------------------------------------------- EXIT STATEMENT ------------------------------------------------------------

		// The exit statement exits the program completely: 
		
		System.out.println("\n\nExit Statement: "); 

		System.out.print("Enter a a number (negative to exit) : "); 
		double exitNum = keyboard.nextDouble(); 
		
		while (exitNum >= 0) {

			exitNum = keyboard.nextDouble(); 
		
			if (exitNum >= 0) {

				System.out.println(exitNum + " is not a negative number."); 
			
			}

			else {
				System.out.println(exitNum + " is negative. ");
				System.out.println("Aborting .... " ); 
				//System.exit(0);  // Uncomment to make program quit when negative number is entered here. 
			}
		}
		System.out.print("This shows up if System.exit(0); is commented out.\n\n "); 


		// ----------------------------------------------- ASSERT STATEMENT AND TESTING -----------------------------------------------------
	
		// Static call to isAveValid Function. 
		chapter3 d = new chapter3(); 		
		d.isAgeValid(190); 


		System.out.print("This is after the assert statement\n"); 



		// ----------------------------------------------- RANDOM NUMBER GENERATOR : With Random Object ------------------------------------		

		System.out.println("\n\nRandom Numbers : "); 

		int rand1 =  randomGenerator.nextInt();  // Generate random int in all possible ranges: 
		int rand2 =  randomGenerator.nextInt(10); // Generate random int from 0 - 9 
		int rand3 =  randomGenerator.nextInt(3) + 4 ; // Generate random int from : 0,1,2 & then 4,5,6
		double rand4 =  randomGenerator.nextDouble(); // Generate random double from 0 - .999999999999999... 

		int randCount = 1; 
		
		while (randCount < 5) {
			System.out.print("Flip number " + randCount + " : " ); 
			int coinFlip = randomGenerator.nextInt(2); 
			if (coinFlip == 1) {
				System.out.print( "heads!. \n"); 
			}
			else {
				System.out.print("tails! \n"); 
			}
			randCount ++; 
		}
	

		// ----------------------------------------------- RANDOM NUMBER GENERATOR : With Math.random() ------------------------------------		

		System.out.println("\n"); 
		
		int randVal = 0; 		

		while ( randVal < 5 ) {
			int randInt = (int)(Math.random() * 6) + 1; // Random int value from 1 - 6. 			
			System.out.print (randInt + " ");
			randVal ++; 	
		}
		System.out.println("\n"); 

	} // Close main method. 

	// This tests assert : javac programName.java -> java -ea programName to enable assertions errors. Otherwise it will not run them. 
	public boolean isAgeValid(int age) {

		assert(age < 110 && age > 60): "Age not valid :  " + age; 

		if (age > 0) {
			return true; 
		}
		else {
			return false; 
		}
	} // Close isAgeValid  	
} // Close class 


