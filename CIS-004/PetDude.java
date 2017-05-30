import java.util.Scanner;

class Pet {
	
	private String type; 
	private double price; 
	private int count; 
	
	public String getType()
	{ return type; }
	
	public double getPrice() 
	{ return price; }
	
	public int getCount()
	{ return count; }
	
	public void setType(String aType)
	{ type = aType; }
	
	public void setPrice(String aPrice)
	{ type = aPrice; }
	
	public void setCount(String aCount)
	{ type = aCount; }
	
	public String toString()
	{ return type+price+count; }
	
	// Constructor
	
	public Pet(String aType, double aPrice, int aCount)
	{type = aType; 
	price = aPrice; 
	count = aCount; }
}

class PetDude
{
	public static void main(String[]Args)
	{
		Scanner in = new Scanner(System.in);
		
		Pet[] PetSmart = new Pet[3]; 
		
		for(int i=0;i<PetSmart.length;i++)
		{
			System.out.print("Enter the type of pet: ");
			String type = in.nextLine(); 
			
			System.out.print("Enter the price of the pet: ");
			double price = in.nextDouble(); 
			
			System.out.print("Enter the number of pets: ");
			int count = in.nextInt(); 
			in.nextLine();
			
			PetSmart[i] = new Pet(type,price,count);
		}
		
		System.out.print("what is your price range: ");
		double range = in.nextDouble();
		for(int i=0;i<PetSmart.length;i++)
			if(PetSmart[i].getPrice() <= range)
				System.out.print(PetSmart[i]);
	}
}
