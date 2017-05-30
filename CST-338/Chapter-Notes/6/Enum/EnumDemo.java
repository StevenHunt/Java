/**

Simple type, consisting of a short list of named values. 

- Enum Types: Usually a class and it's values are objects of the class. 

PROVIDED METHODS: P. 394
	- public boolean equals( Any_Value_Of_An_Enumerated_Type) - Returns true if value is same value as calling value. == operator
	- public String toString( ) - Returns calling value as a String. 
	- public int ordinal( ) - Returns position of calling value in enum list. 
	- public int compareTo( Any_Value_Of_The_Enumerated_Type ) - (-) if follows, (0) if equals, (+) if arg proceeds calling obj. 
	- public EnumeratedType [] values( ) - Returns an array whose elements are the values of the enumerated type.	
	- public static EnumeratedType valueOf(String name) - Returns the enumerated type value with the specified name.



// --------------------------------

- enum type: WorkDay

- values : MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY

- variables of enum type: Must have a value of one of the variables, or be null.
		- WorkDay startDay =  WorkDay.MONDAY;
		- WorkDay endDay = WorkDay.null;  // has no 'real' value
		
*/

import java.util.Scanner; 

public class EnumDemo
{
		// Must be outside of the main: 
    enum WorkDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
    
 		enum Flavor {VANILLA, CHOCOLATE, STRAWBERRY}; 

    public static void main(String[] args)
    {
    
			  System.out.println("\n==============================================================\n"); 
			  
    		// Enum types cannot be compared == , as they will come back different.
        WorkDay startDay = WorkDay.MONDAY;
        WorkDay meetingDay = WorkDay.MONDAY; 
        
        WorkDay endDay = WorkDay.FRIDAY;
        
        if (startDay == meetingDay)
        	System.out.println("Meeting day will be on schedule."); 
        if (meetingDay == endDay)
        	System.out.println("It's going to be a long week... ");
        	
       	// will give an error if trying to compare startDay == "MONDAY"
       	
       	// ============================================================== 
        
        // String values can be compared == , they will result equal.
        String midDay = "Wed"; 
        
        if (midDay == "Wed")
        	System.out.println("It's Humday!"); 
        else 
        	System.out.println("It's not Humpday :( "); 

        System.out.println("Work starts on " + startDay);
        System.out.println("Work ends on " + endDay);
        
        
			  System.out.println("\n==============================================================\n"); 
				
				
				// ENUM VALUES DEMO: 
				
				// Creates an array whose elements are the values of the enumerated type.	
        WorkDay[] day = WorkDay.values( );

        Scanner keyboard = new Scanner(System.in);
        double hours = 0, sum = 0;

        for (int i = 0; i < day.length; i++)
        {
            System.out.print("Enter hours worked for " + day[i] + " : ");
            hours = keyboard.nextDouble( );
            sum = sum + hours;
        }

        System.out.println("Total hours work = " + sum);
 			 
 			 
 			  System.out.println("\n==============================================================\n");        
        
        
        Flavor favorite = null;

        System.out.print("What is your favorite icecream flavor: ");
        String answer = keyboard.next();
        answer = answer.toUpperCase();
        favorite = Flavor.valueOf(answer);

        switch (favorite)
        {
            case VANILLA:
                System.out.println("Classic");
                break;
            case CHOCOLATE:
                System.out.println("Rich");
                break;
            default:
                System.out.println("I bet you said STRAWBERRY.");
                break;
        }
    }
}


/** =================== OUTPUT ===============================

==============================================================

Meeting day will be on schedule.
It's Humday!
Work starts on MONDAY
Work ends on FRIDAY

==============================================================

Enter hours worked for MONDAY : 1
Enter hours worked for TUESDAY : 2
Enter hours worked for WEDNESDAY : 3
Enter hours worked for THURSDAY : 5
Enter hours worked for FRIDAY : 6
Total hours work = 17.0

==============================================================

What is your favorite icecream flavor: Vanilla   
Classic

   =========================================================*/




