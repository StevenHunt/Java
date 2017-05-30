import java.util.*; 

class Pizza
 { public static void main (String [] args)
  { Scanner in=new Scanner (System.in); 
     System.out.print("Enter the Size "); 
     double size=in.nextDouble(); 
     double area=3.14*(size/2)*(size/2); 
     System.out.println("The area of the pizza " + area); 
  } 
 }
