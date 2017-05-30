
import java.util.StringTokenizer;
import java.util.Scanner;

public class EnhancedStringTokenizer extends StringTokenizer
{
    private String[] a;
    private int count;

    public EnhancedStringTokenizer(String theString )
    {
        super(theString);
        a = new String[countTokens( )];
        count = 0;
    }

    public EnhancedStringTokenizer(String theString, String  delimiters)
    {
        super(theString, delimiters);
        a = new String[countTokens( )];
        count = 0;
    }

    /**
     Returns the same value as the same method in the StringTokenizer class,
     but it also stores data for the method tokensSoFar to use.
    */
    public String nextToken( )
    {
        String token = super.nextToken( );
        a[count] = token;
        count++;
        return token;
    }

    /**
     Returns the same value as the same method in the StringTokenizer class,
     changes the delimiter set in the same way as does the same method in the
     StringTokenizer class, but it also stores data for the method tokensSoFar to use.
    */
    public String nextToken(String delimiters)
    {
        String token = super.nextToken(delimiters);
        a[count] = token;
        count++;
        return token;
    }

    /**
     Returns an array of all tokens produced so far.
     Array returned has length equal to the number of tokens produced so far.
    */
    public String[] tokensSoFar( )
    {
        String[] arrayToReturn = new String[count];
        for (int i = 0; i < count; i++)
            arrayToReturn[i] = a[i];
        return arrayToReturn;
    }

    public Object nextElement( )
	{
	    String token = super.nextToken( );
	    a[count] = token;
	    count++;
	    return (Object)token;
    }

		// Main
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = keyboard.nextLine( );

        EnhancedStringTokenizer wordFactory = 
             new EnhancedStringTokenizer(sentence);

        System.out.println("Your sentence with extra blanks deleted:");
        while (wordFactory.hasMoreTokens( ))
            System.out.print(wordFactory.nextToken( ) + " "); 
        System.out.println( );
        //All tokens have been dispensed.

        System.out.println("Sentence with each word on a separate line:");
        String[] token = wordFactory.tokensSoFar( );
        for (int i = 0; i < token.length; i++)
            System.out.println(token[i]);
		}
}



/* ================== OUTPUT =====================

Enter a sentence : This sentence     may     not be space     properly. 
Your sentence with extra blanks deleted:
This sentence may not be space properly. 
Sentence with each word on a separate line:
This
sentence
may
not
be
space
properly.

   ============================================ */
