
// Cloneable has no methods nor constants. 

// Rather its used to say how the method close should be used and defined. 

public class YourCloneableClass implements Cloneable
{
     //...
     
    public Object clone( )
    {
       try
       {
          return super.clone( );//Invocation of clone 
                               //in the base class Object
       }
       catch(CloneNotSupportedException e)
       {//This should not happen.
          return null; //To keep the compiler happy.
       }
    }

     //...
     
}
