// Calculates Change (dollars, quarters, dimes, nickels, and pennies), from amount owed and paid!

import java.util.*;

class Change
 {public static void main ( String [] args )
  { Scanner in = new Scanner (System.in); 
   
  double amountOwed; 
   System.out.print("Enter the Amount Owed ");
    amountOwed=in.nextDouble(); 
    
  double amountPaid; 
   System.out.print("Enter the Amount Paid "); 
   amountPaid=in.nextDouble();
   
   int pennies=(int) ((amountPaid-amountOwed)*100); 
   int dollars=pennies/100; 
   pennies=pennies%100;
   int quarters=pennies/25;
   pennies=pennies%25; 
   int dimes=pennies/10;
   pennies=pennies%10; 
   int nickels=pennies/5; 
   pennies=pennies%5; 
 
 
  	 System.out.println("The dollars are " + dollars); 
  	 System.out.println("The quarters are " + quarters); 
  	 System.out.println("The dimes are " + dimes); 
	 System.out.println("The nickels are " + nickels);
	 System.out.println("The pennies are " + pennies); 
   }
  }
