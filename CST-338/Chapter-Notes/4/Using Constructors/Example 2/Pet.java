/** 
Class for basic pet records
*/ 

public class Pet {

	private String name; 	
	private int age; 
	private double weight; 


	// To String : 
	public String toString() {

		return ("Name : " + name + ", Age : " + age + ", Weight : " + weight); 
	}

	// CONSTRUCTORS:  ========================================================================
	// Constuctors typically set all instance variables, even if there is not a full set of parameters. 

	// All: 
	public Pet (String name, int age, double weight) {
		
		this.name = name; 
		if  ((age < 0 ) || (weight < 0)) {
			
			System.out.println("Error : Age or Weight cannot be less than 0."); 
			System.exit(0);
		}	
		else {
			this.age = age; 
			this.weight = weight; 
		}
	}	
	
	// Empty: 
	public Pet () {
		
		name = "No name yet."; 
		age = 0; 
		weight = 0; 
	}
	
	// Name: 
	public Pet ( String name ) {

		this.name = name; 
		age = 0; 
		weight = 0; 
	}

	// Age: 
	public Pet (int age) {
		
		name = "No name yet."; 
		weight = 0; 
		if ( age < 0 ) {
			System.out.println("Error : Age cannot be less than 0."); 
			System.exit(0); 
		}
		else {
			this.age = age; 
		}
	}

	// Weight: 
	public Pet (double weight) {
		
		if (weight < 0) {
			System.out.println("Error : Weight cannot be less than 0."); 
			System.exit(0);
		}
		else {
			this.weight = weight; 
		}
	}

	// SETTERS ================================================================================
	// To change an already existings objects value. 
	public void setAll (String name, int age, double weight) {
		
		this.name = name; 
		if ((age < 0 ) || (weight < 0)) {
			
			System.out.println("Error : Age or Weight cannot be less than 0."); 
			System.exit(0);
		}	
		else {
			this.age = age; 
			this.weight = weight; 
		}
	}	
	// Name: 
	public void setName (String name) {
		
		this.name = name; 
	}
	
	// Age: 
	public void setAge (int age) {
		
		if ( age < 0 ) {
			System.out.println("Error : Age cannot be less than 0."); 
			System.exit(0); 
		}
		else {
			this.age = age; 
		}
	}

	// Weight: 
	public void setWeight (double weight) {

		if (weight < 0) {
			System.out.println("Error: Weight cannot be less than 0."); 
			System.exit(0); 	
		}
		else {
			this.weight = weight; 
		}	
	}

	// GETTERS ================================================================================
	// Returns values: 

	// Name; 
	public String getName () {
		return name; 
	}
		
	// Age: 
	public int getAge () {
		return age; 
	}
		
	// Weight: 
	public double getWeight () {
		return weight; 
	}




}









