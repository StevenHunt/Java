import java.util.Scanner; 

public class chapter5Demo3 {

	private double degrees; // Celsius
	
	// Constructor: Default Degrees
	public chapter5Demo3 () {
		degrees = 0; 
	}
	
	// Constructor: Initialized Degrees
	public chapter5Demo3 (double initialDegrees) {
		degrees = initialDegrees; 
	}
	
	// Setter: To change the degrees
	public void setDegrees (double newDegrees) {
		degrees = newDegrees; 
	}
	
	// Getter: 
	public double getDegrees () {
		return degrees; 
	}
	
	public String toString () {
		return (degrees + " C"); 
	}
	
	public boolean equals (chapter5Demo3 otherTemperature) {
		return (degrees == otherTemperature.degrees); 
	}
	
	// Return s number of Celcius degrees equal to degreesF Fahrenheit degrees. 
	public static double toCelcius (double degreesF) {
		return 5 * (degreesF - 32) / 9; 
	}
	
	public static void main (String [] args) {
		
		double degreesF, degreesC; 
			
		Scanner keyboard = new Scanner(System.in); 
			
		System.out.print("Enter degrees in Fahrenheit: "); 
		degreesF = keyboard.nextDouble(); 
			
		// Because this is in the class chapter5Demo3, this is equal to chapter5Demo3.toCelcius(degreesF); 
		degreesC = toCelcius(degreesF); 
			
		chapter5Demo3 classObject = new chapter5Demo3(degreesC); 
			
		// Because main is a static method, toString must have a specified calling object (in this case, the classObject I created). 
		System.out.println("Equivalent Celcius Temperature is " + classObject.toString()); 
	}
}
