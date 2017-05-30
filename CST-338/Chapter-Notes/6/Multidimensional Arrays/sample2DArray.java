

public class sample2DArray {

	public static void main (String [] args) {
	
		// one-dimensional array of length 30, and each of the 30 indexes is a one-dimensional array of length 100.
		
		char [][] page = new char [30][100]; 
		
		// Fill all the elements with the character 'z'. 
		
		int row, col; 
		
		// length is the number of rows (the first indicies) in a 2D array
		for (row = 0; row < page.length; row++) 
			for (col = 0; col < page[row].length; col++) 
				
				page[row][col] = 'z'; 
			
		System.out.println(page); // Prints [[C@15db9742
		System.out.println(page[1][10]); // Prints z
		
		
		// RAGGED ARRAYS: 2D array where different rows have different numbers of entries
		
		// Normal 2d array: 
		double[][] a = new double[3][5];
		
		/** Same as **: 
		
		double [][] a;
		
		// This creates an array named a, with room for 3 entires (each of which can be an array of doubles at any length). 
		a = new double [3][];
		
		a[0] = new double [5];
		a[1] = new double [5];
		a[2] = new double [5];
		
		*/
		
		double [][] b; 
		
		b = double [3][]; 
		
		b[0] = new double [5];
		b[1] = new double [10];
		b[2] = new double [1];
		
		
	}

}
