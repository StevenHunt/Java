import java.util.*; 

class Sphere1
 { 
	public static void main (String [] args)
  		{
		Scanner in=new Scanner (System.in); 
		System.out.print("Enter the radius of the sphere:  "); 
     
		double radius=in.nextDouble();
     		double area=3.14*(radius)*(radius); 
     		
		System.out.println("The area of the sphere is " + area); 
 		} 
 }
