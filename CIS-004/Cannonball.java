import java.util.*; 

public class Cannonball {

public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    Ball bowling = new Ball(0); // Creates a new cannonball

    System.out.println("Aim the cannon at the angle you want: "); // Ask user for initial angle and starting velocity
    bowling.setAngle(keyboard.nextDouble());
    
    System.out.println("Input it's initial velocity: ");
    bowling.setVel(keyboard.nextDouble());


    for(int i=0; i<bowling.shoot.size(); i++) System.out.println(bowling.shoot); // Return the points of the cannonball's flight

   
    keyboard.close();  // Close input
 }
}


