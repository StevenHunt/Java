// Program randomly picks a number between 1 and 100, and promps you to guess. 
// Program tells you if your guess was too high, too low, or that you guessed it. 
// Program tells you how many times it took you to guess the randomly generated number. 

import java.util.Random; 
import java.util.Scanner; 

public class GuessingGame {

 public static void main(String[]args) { 
 
 Random rand = new Random(); 
 int numberToGuess = rand.nextInt(100); 
 int numberOfTries = 0; 
 
 Scanner in = new Scanner(System.in);
 int guess; 
 boolean win = false;
 	
 while (win == false) {

 System.out.println("Print a Number Between 1 and 100 "); 
 guess = in.nextInt(); 
 numberOfTries++;  

 if (guess == numberToGuess) {
  win = true; 
 
 }
 else if (guess < numberToGuess) {
  System.out.println("Your guess was too low, keep guessing!"); 
 }  
 else if (guess > numberToGuess) {
  System.out.println("Your guess was too high, keep guessing!"); 
 }
 else if  (numberOfTries > 1) {
  System.out.println("Your a n00b!"); 
 }
}
 System.out.println("You Win!"); 
 System.out.println("The number was " + numberToGuess); 
 System.out.println("It took you " + numberOfTries + " tries");  
 }
}
 
 
