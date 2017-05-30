/** 

Abstract Classes: A class that has at least one method that is abstract.
Concrete Class: Classes we've been using since day 1, they have no abstract methods. 
	
	CANT: 
		- Create objects with this class constructor. 
		- Employee joe = new Employee(); // Illegal now
	
	CAN: 
		- Use a base class to define a derived class. 
		
		- Because getPaid() is not a method (nor can we right a usable one) in Employee, there are two seperate getPay() methods in its derived classes (hourlyEmployee and salaryEmployee). 
		
---------------
		
Abstract Method: Placeholder for a method that will be fully defined in a descending class. The class must have the modifier abstract as well in the head. 

		- We would like to simply add a note to the Employee class, that says " There will be a method getPay() for each employee, but we do not know how it is defined". We can do this, with what is called an 'ABSTRACT METHOD'. 
		
		- Heading : 
				-public abstract double getPay(); 
		
		- Examples:		
				public abstract double getPay();
				public abstract void doSomething( int count);
				
		- CANT: Be private, it's typically public (but package and protected are allowed)




 Class Invariant: All objects have a name string and hire date.
 A name string of "No name" indicates no real name specified yet.
 A hire date of January 1, 1000 indicates no real hire date specified yet.

*/

public abstract class Employee
{
    private String name;
    private Date hireDate;

    public abstract double getPay( );

    public boolean samePay(Employee other)
    {
        if (other == null)
        {
            System.out.println("Error: null Employee object.");
            System.exit(0);
        }
        //else
        return (this.getPay( ) == other.getPay( ));
    }

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


    public boolean equals(Object otherObject)
	{
	    if (otherObject == null)
	        return false;
	    else if (getClass( ) != otherObject.getClass( ))
	        return false;
	    else
	    {
	        Employee otherEmployee =
	                       (Employee)otherObject;
	        return (name.equals(otherEmployee.name)
	         && hireDate.equals(otherEmployee.hireDate));
	    }
    }
}


