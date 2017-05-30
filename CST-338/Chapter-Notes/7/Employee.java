
/**
 Class Invariant: All objects have a name string and hire date.
 A name string of "No name" indicates no real name specified yet.
 A hire date of Jan 1, 1000 indicates no real hire date specified yet.
 
 - If you add the modifier 'final' to a class, it indicates that that class cannot be a base class to derive other classes.
 
 INHERITANCE: A new class (derived class) is created from another class (base class).
 	- Derived class automatically has all the instance variables and static variables, as well as public methods, and can have additonal methods and/or instance variables itself. 
 	 
 	 
- There are classes of people who are all employees.	
- All employees have a name and hire date. 
- Methods for changing hourly / salary wages. 
 
 (BASE / SUPERCLASS) = EMPLOYEE: 
 	
		 (DERIVED / SUBCLASS) = HOURLY
		 		-  Fulltime
		 		-	 Partime
		 			
		 (DERIVED / SUBCLASS) = SALARY
		 		- Engineers
		 		- Execs
		 
		 etc... 

 Syntax: 
 
 class subClass_Name extends baseClass_Name

 =============================
 OVERRIDING: 
 	- You can override a method definition in a derived class that was inherited from the base class so that it has another meaning in the derived class. 
 	
 	- If you add the modifier final to a method def, it indicates that the method cannot be redefined in the derived class.
 
 ---------
 
 COVARIENT RETURN: 
 - You may not change the return type of an overriden method, void to return, or return to void. 
 - Only if the return type is a class type, the derived method may be overriden to return the derived classtype. 
 
 ---------
 
 CHANGING ACCESS PERMISSION: 
 - You can change the overriden method in the derived class from private to public. 
 - ** YOU CANNOT CHANGE THE DERIVED CLASS FROM PUBLIC TO PRIVATE THOUGH! ** 
 
 ==========================
 THE SUPER CONSTRUCTOR: 
 
 - Invoke the constructor from a base class, in a derived class. 
 - You cannot use an instance variable (of the derived class) as an argument to super.  
 - The call to the base class (super), must be the first action taken in a constructor def. 
 - If the constructor of a derived class doesnt have a call to the constructor of the base class, the base class no-arg constructor is invoked automatically in the start of the derived class constructor.
 
 ## TAKEN FROM HourlyEmployee ##
 
 public HourlyEmployee(String theName, Date theDate, double theWageRate, double theHours)
    {
    		 // Call to a constructor from the base class. 
         super(theName, theDate);
         
         if ((theWageRate >= 0) && (theHours >= 0))
         {
             wageRate = theWageRate;
             hours = theHours;
         }
         else
         {
             System.out.println(
                       "Fatal Error: creating an illegal hourly employee.");
             System.exit(0);
         }
    }
 
  ==========================
  INVOKE ANOTHER CONSTRUCTOR FROM THE SAME CLASS : this.
  
  *Restrictions : Same as using super. See HourlyEmployee (no arg constructor for example)
 
  ==========================
  INHERITANCE : 
  
  * An object of a derived class, is an instance of a base class. ( An hourly employee, is an employee). 
  
  Is A - Hourly employee 'is a' employee. 
  Has A (Composition) : Employee 'has a' Date. 
  
  * Because hourlyEmployee inherits the instance variable of type Date from Employee... HourlyEmployee 'has a' Date, as well. 
  
  Hourly employee is an employee and has a Date. 
 
	========================== 
	SUPER RELATIONSHIP: A way to access a base method that has been overridden in a derived class with a derived class object. 
	
	## Taken from HourlyEmployee : you can still invoke the toString() from the base class with the 'super' keyword. ## 
	public String toString() {

		return ( super.toString() + "\n$" + wageRate + " per hour for " + hours + " hours");
	}
	
	This is illegal : super.super.toString() 
	  
   ==========================
   THE CLASS Object : Every class is a descendednt of hte class Object. So every object, of every class, is of type object, as well as being of the type of its class. 
   
   - inherits : clone, equals and toString, but they should always be overriden when you create a new class because they are simple methods that most likely will not have suitable defintions for your specific classes needs.
   
   ===========================
   DEFINING EQUALS: 
   
   Page 465 - 469: 
   instanceOf: Checks to see if an object is of the type given as its second argument. 
   getClass() : 
  
*/
public class Employee
{
    private String name;
    private Date hireDate;
    
    public Employee( )
    {
         name = "No name";
         hireDate = new Date("Jan", 1, 1000); //Just a placeholder.
    }

    /**
     Precondition: Neither theName nor theDate is null.
    */
    public Employee(String theName, Date theDate)
    {
        if (theName == null || theDate == null)
        {
             System.out.println("Fatal Error creating employee.");
             System.exit(0);
        }
        name = theName;
        hireDate = new Date(theDate);
    }

    public Employee(Employee originalObject)
    {
         name = originalObject.name;
         hireDate = new Date(originalObject.hireDate);
    }

    public String getName( )
    {
        return name;
    }

    public Date getHireDate( )
    {
        return new Date(hireDate);
    }

    /**
     Precondition newName is not null.
    */
    public void setName(String newName)
    {
        if (newName == null)
        {
             System.out.println("Fatal Error setting employee name.");
             System.exit(0);
        }
       else
            name = newName;
    }

    /**
     Precondition newDate is not null.
    */
    public void setHireDate(Date newDate)
    {
        if (newDate == null)
        {
             System.out.println("Fatal Error setting employee hire date.");
             System.exit(0);
        }
        else
            hireDate = new Date(newDate);
    }


    public String toString( )
    {
        return (name + " " + hireDate.toString( ));
    }

		// Nees to work for any kind of object, if the object is not an employee then return false. 
    public boolean equals(Object otherObject)
		{
			if (otherObject == null)
				return false;
			else if (getClass() != otherObject.getClass())
				return false;
			else
			{
				Employee otherEmployee = (Employee)otherObject;
				return (name.equals(otherEmployee.name) && hireDate.equals(otherEmployee.hireDate));
			}
		}
}

