/**
   IsA : subclass is a baseclass
   
   - hourlyEmployee is an Employee
   - salaryEmployee is an Employee
   
   * An object of a derived class has a type of the derived class, and a type of the base class it was derived from.
   * A derived class has a type of everyone of its ancestor classes.
   * You can assign an object of a derived class to a variable of any ancestor type, but NOT VISVERSA!
   * You can plug in a derived class object for a parameter of any of its ancestor types
   * You can use a derived class object anyplace you can use an object of any of its ancestor types.

*/

public class IsADemo
{
    public static void main(String[] args)
    {
        SalariedEmployee joe = new SalariedEmployee("Josephine", new Date("January", 1, 2004), 100000);
        
        HourlyEmployee sam = new HourlyEmployee("Sam", new Date("February", 1, 2003), 50.50, 40);

        System.out.println("joe's longer name is " + joe.getName( ));

        System.out.println("showEmployee(joe) invoked:");
        showEmployee(joe);

        System.out.println("showEmployee(sam) invoked:");
        showEmployee(sam);

    }

    public static void showEmployee(Employee employeeObject) // Plugging in derived objects for base type parameters. 
    {
           System.out.println(employeeObject.getName( ));
           System.out.println(employeeObject.getHireDate( ));
    }
}

/** ======= OUTPUT ========

joe's longer name is Josephine
showEmployee(joe) invoked:
Josephine
January 1, 2004
showEmployee(sam) invoked:
Sam
February 1, 2003

   ====================== */
