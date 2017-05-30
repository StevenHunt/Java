import java.util.*;
public class GameOfNim
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner (System.in);
        Random num = new Random ();
        int numberLeft = num.nextInt(101-10) + 10;
        int computerMode = num.nextInt(1);
        int subtraction = numberLeft;
        boolean turn = num.nextBoolean();

        System.out.println ("The number you start out with is: " + numberLeft);

        if (computerMode == 0)
        {
            System.out.println ("The computer is in smart mode!");
        }
        if (computerMode == 1)
        {
            System.out.println ("The computer is in dumb mode!");
        }

        while (numberLeft > 1)
        {
            if (turn == true)
            {
                System.out.print("Please enter the number you wish to take from the pile (Remember it has to be less than " + numberLeft/2 + "): ");
                subtraction = in.nextInt();
                numberLeft -=subtraction;
                System.out.println ("The number left is " + numberLeft);
                turn = false;
            }
            if (turn ==false)
            {
                System.out.println ("It is the computer's turn...");
                if (computerMode == 0)
                {  
                    numberLeft = smartComputer(numberLeft);
                    System.out.println ("The number left is " + numberLeft);
                }

                if (computerMode == 1)
                {
                    numberLeft -= num.nextInt(numberLeft/2);
                    System.out.println ("The number left is " + numberLeft);
                }
                turn = true;
                return;
            }
        }

        if (numberLeft <= 1)
        {
            if (turn = false)
            {
                System.out.println ("You Win!");
            }  
            else
            {
                System.out.println ("You're a n00b, you lost to your comp");
            }  
        }
    }

    public static int smartComputer (int num)
    {
        int power = 2;        
        while (power < num) 
        { 
            power *=2;
        }
        power /= 2;
        num = power-1;
        return num;
    }
}

/*
steven@Steven:~/Desktop/School/Java/HomeWork 1$ javac GameOfNim.java 
steven@Steven:~/Desktop/School/Java/HomeWork 1$ java GameOfNim 
The number you start out with is: 29
The computer is in dumb mode!
Please enter the number you wish to take from the pile (Remember it has to be less than 14): 10
The number left is 19
It is the computer's turn...
The number left is 6
It is the computer's turn...
The number left is 4
It is the computers turn... 
The number left is 3
You Win!
steven@Steven:~/Desktop/School/Java/HomeWork 1$ 
*/
