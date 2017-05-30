
public class conDemo {

	public static void main (String [] args) {

	// conExample class object: 
	conExample conObj = new conExample(); 
	conExample conObj2 = new conExample("Sailor"); 
	conExample conObj3 = new conExample("Ser Pounce", 3); 

	conObj.conOutput(); 	// This first prints out the intialized value of age, which was set to 21 in the constuctor. 

	System.out.println("println(conObj) : " + conObj); 

	conObj.infoInput(); 	// Setting age and name via user input.  

	conObj.infoOutput();  // Outputs user input. 

	System.out.println("println (conObj2) : " + conObj2); // Since there is no age assigned to this object yet, the toString method returns null (0). 

	System.out.println("println (conObj3) : " + conObj3); // Returns 
	}
}
