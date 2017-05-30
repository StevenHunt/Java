/**

Sorting an array: 


*/

public class SelectionSort
{
    /**
     Precondition: numberUsed <= a.length;
                  The first numberUsed indexed variables have values.
     Action: Sorts a so that a[0] <= a[1] <= ... <= a[numberUsed - 1].
    */
    
    
    // Sort a partially filled array from smallest to largest: 
    public static void sort(double[] a, int numberUsed) // array, and int value that keeps track of the elements in array
    {
        int index, indexOfNextSmallest;
        for (index = 0; index < numberUsed - 1; index++)
        {
        		//Place the correct value in a[index]:
            indexOfNextSmallest = indexOfSmallest(index, a, numberUsed);
            interchange(index,indexOfNextSmallest, a);
            
            //a[0] <= a[1] <=...<= a[index] and these are the smallest
            //of the original array elements. The remaining positions
            //contain the rest of the original array elements.
        }
    }

    /**
     Returns the index of the smallest value among
     a[startIndex], a[startIndex+1], ... a[numberUsed - 1]
    */
    
    // Finds the index of the smallest element in the unsorted end of the array, then does an interchange to move this next smallest element down into the sorted part of the array
    private static int indexOfSmallest(int startIndex,
                                              double[] a, int numberUsed)
    {
        double min = a[startIndex];
        int indexOfMin = startIndex;
        int index;
        for (index = startIndex + 1; index < numberUsed; index++)
            if (a[index] < min)
            {
                min = a[index];
                indexOfMin = index;
                //min is smallest of a[startIndex] through a[index]
            }
        return indexOfMin;
    }
    
    /** 
     Precondition: i and j are legal indices for the array a.
     Postcondition: Values of a[i] and a[j] have been interchanged.
    */
    
    // Used to interchange the values of indexed variables.
    private static void interchange(int i, int j, double[] a)
    {
        double temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp; //original value of a[i]
    }
    
    
    public static void main(String[] args)
    {
        double[] b = {7.7, 5.5, 11, 3, 16, 4.4, 20, 14, 13, 42};

        System.out.print("\nArray contents before sorting: ");
        int i;
        for (i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println( );
            
        SelectionSort.sort(b, b.length);
Array contents before sorting: 7.7 5.5 11.0 3.0 16.0 4.4 20.0 14.0 13.0 42.0 
Sorted array values: 3.0 4.4 5.5 7.7 11.0 13.0 14.0 16.0 20.0 42.0 

        System.out.print("Sorted array values: ");
        for (i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
        System.out.println("\n");
    }
    
}

/** ============= OUTPUT =================


Array contents before sorting: 7.7 5.5 11.0 3.0 16.0 4.4 20.0 14.0 13.0 42.0 
Sorted array values: 3.0 4.4 5.5 7.7 11.0 13.0 14.0 16.0 20.0 42.0 



   ====================================== */
   
