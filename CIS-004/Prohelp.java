import java.util.*;

class Project1 {
    public static void main(String[] args) {
        byte zero = 0;
        short a = 3;
        int b = 1;
        char d = ' ';
        float e = 2.0f;
        boolean f = true;
        String output = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + d + d + e + d + f;
        System.out.println(output);

    }
}
class Prohelp
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
   
   }
  }
