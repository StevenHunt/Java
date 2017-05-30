import java.util.*; 

class Midterm 
 {
 public static void main(String [] args) 
 {
 Scanner in=new Scanner(System.in); 
 int score, highest=0,lowest=100, count=0; // highest, lowest, and counter to count how many were taken. Highest is set to 0, because its the lowest possible score value, hoping that everyone will get over a 0 and it will be changed below and the opposite for lowest. Score int isn't initially set to to a number, but it's the first input value in the program.  
 double total=0; 
 
 System.out.print("Enter a score or '-1' to quit: "); 
 score=in.nextInt(); // Reads in our score. 
 while(score!=-1) // While not equal to our sentinal. 
 
 {
 count ++; // Counting: We need to know how many people took the test. Looping technique. The count gets temporarily 'promoted' to a double. 
 total=total+score;  // Accumulating, technique in loops. Score=0 
 if(score>highest)
 highest=score; // When it sees the highest score, it saves it. 

// This above code, lets you enter as many test scores ( students ). 

 if(score<lowest)
 lowest=score;  // If its a new all time low, it saves it as the lowest. 
 
 System.out.print("Another: "); // Creates another in loop. 
 score=in.nextInt(); 
 }
 
 System.out.println("High " + highest); // Prints results of particular program. 
 System.out.println("Low " + lowest); 
 System.out.println("Average " + total/count); 
 }
}

// Statistical program: It reads in scores, and finds the highest, lowest, and average. 

// For loop, only for counting ( Deterministic ) 
// Event loops ( While loops, indeterminate ). This program is an indeterminate loop, 


// -1 is not a score, its our sentinal, which will let us know to stop. 

// We use 2 'if' statements, instead of if/else, because 
