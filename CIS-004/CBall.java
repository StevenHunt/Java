import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class CBall {

public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in); // Open Scanner

    Ball bowling = new Ball(0); // Create a new cannonball

    System.out.println("Alright, give us the angle at which to fire: "); // Ask user for initial angle and starting velocity
    bowling.setAngle(keyboard.nextDouble());
    System.out.println("And what is the initial velocity: ");
    bowling.setVel(keyboard.nextDouble());

    for(int i=0; i<bowling.shoot.size(); i++) System.out.println(bowling.shoot);  // Return the points of the cannonball's flight

    keyboard.close();
 }
}

class Ball{
private double xPos, yPos, deltaSec;
private double alpha, v;
private double yVel, xVel;
private static final double gravity = -9.81; 

public Ball(double xPos){
    this.xPos=xPos;
    yPos=0;
}

public Point move(double deltaSec){
    xPos += xVel*deltaSec;
    yPos += yPos*deltaSec;
    return new Point();
}

public void yVel(){
    yVel=v*Math.sin(alpha)*(deltaSec*gravity);
}

public void xVel(){
    xVel=v*Math.cos(alpha);
}

public Point getLocation(double xPos, double yPos){
    return new Point();
}

public void setAngle(double aplha){
    this.alpha=alpha;
}

public void setVel(double v){
    this.v=v;
}

public ArrayList<Point> shoot = new ArrayList<Point>();
{
    while(deltaSec<60){
        move(deltaSec);
        shoot.add(getLocation(xPos, yPos));
        deltaSec++;
    }
}
}
