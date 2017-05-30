import java.util.*; 

class Evaluations
{
 public static void main(String[]Args)
  {
	Scanner in=new Scanner(System.in); 
	String grade; // Creates variable. 
	
	System.out.print("Enter a letter grade 'Q' to quit: "); // Sentinal loop 
	grade=in.nextLine(); // Creates variable
	while(!grade.equals("Q")) // While grade isn't Q, then it keeps going. 

  {
	if(grade.equals("A")) // Starts with if. 
	System.out.println("Outstanding Student!"); 
	
	if(grade.equals("B")) // Then goes to else.if 
	System.out.println("Great Student!"); 

	if(grade.equals("C"))
	System.out.println("Average Student!"); 
	
	if(grade.equals("D"))
	System.out.println("Below Average Student!"); 
	
	if(grade.equals("F"));
	System.out.println("You need to work harder!"); 
    	
	System.out.println("Another: "); 
	grade=in.nextLine(); 
    }
  }
}
	
