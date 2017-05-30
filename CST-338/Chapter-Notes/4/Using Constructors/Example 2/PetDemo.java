import java.util.Scanner; // Import Scanner

public class PetDemo { // PetDemo class: 

	public static void main (String [] args) { // Main method: 

	Pet usersPet = new Pet("Jane Doe"); 
	
	System.out.println("My records on my pet are incomplete."); 
	System.out.println("Here is what they currently say :"); 

	System.out.println(usersPet); 

	Scanner keyboard = new Scanner(System.in); 

	System.out.print("What is the name of your animal : "); 
	String name = keyboard.nextLine(); 

	System.out.print("What is the age of your animal : "); 
	int age = keyboard.nextInt(); 
		
	System.out.print("What is the weight of your animal : "); 
	double weight = keyboard.nextDouble(); 

	usersPet.setAll(name,age,weight); 

	System.out.println(usersPet); 

	}
}

/* ================ OUTPUT =====================

My records on my pet are incomplete.
Here is what they currently say :
Name : Jane Doe, Age : 0, Weight : 0.0
What is the name of your animal : Sailor J
What is the age of your animal : 7
What is the weight of your animal : 61.5
Name : Sailor J, Age : 7, Weight : 61.5

  ============================================ */
