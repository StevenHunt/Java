
import java.util.Scanner; 

public class conExample {

	private String name; 
	private int age; 

	// Constuctor 1 : No arguments. 
	public conExample () {

		// Initializing instance variables: 
		age = 28; 
		name = "Lindsay"; 
	}

	// Constructor 2 : name as argument. 
	public conExample (String name) {
		setInfo(name); 
	}

	// Constructor 3 : name and age as arguments. 
	public conExample(String name, int age) {
		setInfo(name, age); 
	}

	// toString Method: 
	public String toString () {
		return ("toString = Name: " + name + ", Age : " + age); 
	}

	// Overloaded methods: 
	public void setInfo(String name) {	
		this.name = name;  
	}
	public void setInfo(String name, int age) {
		this.name = name; 
		this.age = age; 
	}

	// Change input: 
	public void infoInput () {
		
		Scanner keyboard = new Scanner(System.in); 
		System.out.print("What is your name: "); 
		name = keyboard.nextLine();

		System.out.print("What is your age: "); 
		age = keyboard.nextInt();
	}

	// To show what the 'no-argument' constructor initialized the variables to: 
	public void conOutput () {
		System.out.println("Initialized in constuctor : " + name + ", you are " + age + " years old.");  
	}

	// To show what the output has been changed to: 
	public void infoOutput() {
		System.out.println("Changed via users input to : " + name + ", you are " + age + " years old.");  
	}





}
