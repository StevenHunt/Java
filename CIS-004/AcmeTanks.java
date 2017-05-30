
// Start of the calculation part of the test: 

import java.util.*; // Imports util from java. 

 class AcmeTanks
  {
  public static void main(String[]args)
   {
	Scanner in=new Scanner(System.in); // Imports scanner
	double size,height;  // Creates the 2 variables
	
	System.out.print("Enter the size of the tank: "); 
	size=in.nextDouble(); 
	
	System.out.print("Enter the height: "); 
 	height=in.nextDouble(); 

	double volume =3.14*(size/2)*(size/2)*height; 
 	System.out.println("The volume needed is: " + volume); 
   }
  }


