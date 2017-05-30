/**

Multidimensional Arrays: Array with more than one index (an array of arrays. 

Declaration: Base_Type [][]Variable_Name = new Base_Type [Length_l][Length_n] ;
	
	- Exmaples: 
		- char [][] a = new char [5][10]; 
		- int [][][] b = new int [10][20][30];  
		
		Basic: 
		- char [][] a = new char [5][10]; 
			* Has two indicies: 
					- first index : 0 - 4
					- second index : 0 - 9
					
		- a[row][col]
		- a[5][10]
		- Each a[row] holds its own array a[col] 
		
			a[0][0], a[0][1], a[0][2], a[0][3], a[0][4], a[0][5], a[0][6], a[0][7], a[0][8], a[0][9],
			a[1][0], a[1][1], a[1][2], a[1][3], a[1][4], a[1][5], a[1][6], a[1][7], a[1][8], a[1][9],
			a[2][0], a[2][1], a[2][2], a[2][3], a[2][4], a[2][5], a[2][6], a[2][7], a[2][8], a[2][9],
			a[3][0], a[3][1], a[3][2], a[3][3], a[3][4], a[3][5], a[3][6], a[3][7], a[3][8], a[3][9],
			
			
	================================================
			
	GRADEBOOk: student[0],[1],[2],and[3]
			
			Q1	Q2	Q3	Q4 . . studentAverage [0],[1],[2],and[3].
	S1	99	74	84	94					90 
	S2	0		0		0		0						0
	S3	70	69	80	85					75
	S4	100	100	100	99					100
	.
	.
	.	
		  70	63	79	80		
			quizAverge[0],[1],[2],and[3].		
			
			
*/


import java.util.Scanner;

public class GradeBook
{

    private int numberOfStudents; // Same as studentAverage.length.
    private int numberOfQuizzes; // Same as quizeAverage.length.

		// records the grade of each student on each quiz.
    private int[][] grade; //numberOfStudents rows and numberOfQuizzes columns.
    
    // record the average quiz score for each of the students
    private double[] studentAverage;
    
    // record the average score for each quiz
    private double[] quizAverage;

		// CONSTRUCTORS ====================== Creates the gradebook object, fills the other two arrays. 
    public GradeBook(int[][] a)
    {
        if (a.length == 0 || a[0].length == 0)
        {
            System.out.println("Empty grade records. Aborting.");
            System.exit(0);
        }

        numberOfStudents = a.length;
        numberOfQuizzes = a[0].length;
        fillGrade(a);
        fillStudentAverage( );
        fillQuizAverage( );
    }

    public GradeBook(GradeBook book)
    {
        numberOfStudents = book.numberOfStudents;
        numberOfQuizzes = book.numberOfQuizzes;
        fillGrade(book.grade);
        fillStudentAverage( );
        fillQuizAverage( );
    }
 
    public GradeBook( )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        numberOfStudents = keyboard.nextInt( );

        System.out.print("Enter number of quizzes: ");
        numberOfQuizzes = keyboard.nextInt( );

        grade = new int[numberOfStudents][numberOfQuizzes];

        for (int studentNumber = 1; 
                     studentNumber <= numberOfStudents; studentNumber++)
            for (int quizNumber = 1; 
                            quizNumber <= numberOfQuizzes; quizNumber++)
            {
                System.out.println("Enter score for student number "
                                             + studentNumber);
                System.out.println("on quiz number " + quizNumber);
                grade[studentNumber - 1][quizNumber - 1] =
                                                 keyboard.nextInt( );
            }

        fillStudentAverage( );
        fillQuizAverage( );
    }

    private void fillGrade(int[][] a)
    {
        grade = new int[numberOfStudents][numberOfQuizzes];

        for (int studentNumber = 1; 
                        studentNumber <= numberOfStudents; studentNumber++)
        {
            for (int quizNumber = 1; 
                         quizNumber <= numberOfQuizzes; quizNumber++)
                grade[studentNumber][quizNumber] = 
                                        a[studentNumber][quizNumber];
        }
    }

    /**
      Fills the array studentAverage using the data from the array grade.
    */
    private void fillStudentAverage( )
    {
        studentAverage = new double[numberOfStudents];

        for (int studentNumber = 1; 
                        studentNumber <= numberOfStudents; studentNumber++)
        {//Process one studentNumber:
            double sum = 0;
            for (int quizNumber = 1; 
                         quizNumber <= numberOfQuizzes; quizNumber++)
                sum = sum + grade[studentNumber - 1][quizNumber - 1];
            //sum contains the sum of the quiz scores for student number studentNumber.
            studentAverage[studentNumber - 1] = sum/numberOfQuizzes;
            //Average for student studentNumber is studentAverage[studentNumber - 1]
        }
    }

    /**
      Fills the array quizAverage using the data from the array grade.
    */
    private void fillQuizAverage( )
    {
        quizAverage = new double[numberOfQuizzes];

        for (int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++)
        {//Process one quiz (for all students):
            double sum = 0;
            for (int studentNumber = 1; 
                          studentNumber <= numberOfStudents; studentNumber++)
                sum = sum + grade[studentNumber - 1][quizNumber - 1];
            //sum contains the sum of all student scores on quiz number quizNumber.
            quizAverage[quizNumber - 1] = sum/numberOfStudents;
            //Average for quiz quizNumber is the value of quizAverage[quizNumber - 1]
        }
    }

    public void display( )
    {
        for (int studentNumber = 1; 
                    studentNumber <= numberOfStudents; studentNumber++)

        {//Display for one studentNumber:
            System.out.print("Student " + studentNumber + " Quizzes: ");
            for (int quizNumber = 1; 
                             quizNumber <= numberOfQuizzes; quizNumber++)
              System.out.print(grade[studentNumber - 1][quizNumber - 1] + " ");
            System.out.println(" Ave = " + studentAverage[studentNumber - 1] );
        }

        System.out.println("Quiz averages: ");
        for (int quizNumber = 1; quizNumber <= numberOfQuizzes; quizNumber++)
            System.out.print("Quiz " + quizNumber 
                            + " Ave = " + quizAverage[quizNumber - 1] + " ");
        System.out.println( );
    }
    
     public static void main(String[] args) 
     {
         GradeBook book = new GradeBook( );
         book.display( );
     }
}
