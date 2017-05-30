public class chapter5 {

	// Final Constant: 
	public static final double PI = 3.14159; 

	// Static class methods: (doesn't require a calling object) 

	// Returns the area of a sphere with a given radius: 
	public static double area (double radius) {
		
		return (PI * radius * radius ); 
	}
	
	// Returns the volume of a sphere with  a given radius: 
	public static double volume (double radius) {
		
		return ( (4.0 / 3.0) * PI * radius * radius * radius); 
	}

}
