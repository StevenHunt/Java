/**

	METHODS WITH A VARIABLE NUMBER OF PARAMETERS: 
	
	------------- Instead of overloading a method: 
	
	public static int max (int val1, int val2) {
		code...
	}
	public static int max (int val1, int val2, int val3) {
		code...
	}
	public static int max ( ... to how every many values you want to find the max of .... ) {
		code...
	}
	
	------------- You can : Use single method def named max, that can take any number of arguments. 
	
	It does this by taking its int arguments, and placing them in an array named arg who based type is int. 

*/	

import java.util.Scanner; 

public class UtilityClass
{
    /**
     Returns the largest of any number of int values.
    */
    
   // Parameter specification that specifies any number of parameters ( int ... ) is called a varage specification. 
   // ... : Elipsis
   // You can have any number of parameters when using a varage spec, but the varage spec can only be used once and at the end. 	 // Example: public static int max (int foo, int bar, int ... arg) { code }  
   		
   public static int max(int... arg)
    {
        if (arg.length == 0)
        {
           System.out.println("Fatal Error: maximum of zero values.");
           System.exit(0);
        }

        int largest = arg[0];
        for (int i = 1; i < arg.length; i++)
            if (arg[i] > largest)
                largest = arg[i];
        return largest;
    }
    
    
 	 public static void main(String[] args)
    {
        System.out.print("\nEnter scores for Tom, Dick, and Harriet:");
        Scanner keyboard = new Scanner(System.in);
        int tomsScore = keyboard.nextInt( );
        int dicksScore = keyboard.nextInt( );
        int harrietsScore = keyboard.nextInt( );

        int highestScore = UtilityClass.max(tomsScore, dicksScore, harrietsScore);

        System.out.println("\nHighest score = " + highestScore + "\n");
    }
}

/** ============= OUTPUT ===============

Enter scores for Tom, Dick, and Harriet: 10 20 11 

Highest score = 20


   ==================================== */
