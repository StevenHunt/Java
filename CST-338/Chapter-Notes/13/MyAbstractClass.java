
public abstract class MyAbstractClass implements Ordered
{
    int number;
    char grade;

		// Implemented from order. 
    public boolean precedes(Object other)
    {
        if (other == null)
            return false;
        else if (!(other instanceof HourlyEmployee))
            return false;
        else
        {
            MyAbstractClass otherOfMyAbstractClass =
                                          (MyAbstractClass)other;
            return (this.number < otherOfMyAbstractClass.number);
        }
    }

		// Since follows isn't going to be defined in this class, it must be made abstract since it was implemented from order.
    public abstract boolean follows(Object other); 

}

