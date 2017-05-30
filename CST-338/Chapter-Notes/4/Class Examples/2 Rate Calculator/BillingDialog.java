
public class BillingDialog {
	
	public static void main (String [] args) {

		Bill yourBill = new Bill(); // creating a bill object

		yourBill.inputTimeWorked(); 		
		yourBill.updateFee(); 
		yourBill.outputBill(); 

	}
}

/* ================ OUTPUT ==================

Enter number of hours and minutes worked ( HH MM ): 05 30
Time worked : 5 hours and 30 minutes. 
Rate is : 150.0 per quarter hour. 
Amount due is : $3300.0

   ======================================== */
