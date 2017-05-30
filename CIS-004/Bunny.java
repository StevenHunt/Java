/*
Steven Hunt, Java I, WVC, 2014.
Windows Programming Bunny Project 
*/

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bunny extends JPanel {

   public static void main(String[] a) {
      JFrame f = new JFrame();
      f.setSize(400, 400);
      f.add(new Bunny());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
   }

   public void paint(Graphics g) {
      g.drawOval (125, 120, 100, 150); // Body
      
      g.drawOval (100, 245, 50, 50); // Left Foot
      g.drawOval (101, 256, 17, 17); // Left Toe 1
      g.drawOval (105, 274, 17, 17); // Left Toe 2
      g.drawOval (123, 276, 17, 17); // Left Toe 3

      g.drawOval (200, 245, 50, 50); // Right Foot
      g.drawOval (231, 256, 17, 17); // Right Toe 1
      g.drawOval (227, 274, 17, 17); // Right Toe 2
      g.drawOval (210, 276, 17, 17); // Right Toe 3
      
      g.drawOval (145, 60, 60, 60); // Head
      
      g.drawOval (155, 80, 10, 10); // Left Eye
      g.drawOval (184, 80, 10, 10); // Right Eye
      
      g.drawLine (170, 93, 175, 98); // Nose Line 1
      g.drawLine (180, 93, 175, 98); // Nose Line 2
      g.drawLine (170, 93, 180, 93); // Nose Line 3
      g.drawLine (175, 98, 175, 108); // Nose Line Down
      
      g.drawLine (165, 104, 185, 104); // Mouth
      
      g.drawRect (171, 104, 8, 4); // Teeth

      g.drawOval (140, 5, 30, 60); // Left Ear
      g.drawOval (148, 16, 14, 48); // Left Inner Ear
      
      g.drawOval (180, 5, 30, 60); // Right Ear
      g.drawOval (188, 16, 14, 48); // Right Inner Ear

      
      g.drawOval (220, 150, 50, 30); // Right Arm
      g.drawOval (247, 155, 20, 10); // Right Finger 1
      g.drawOval (247, 165, 20, 10); // Right Finger 2
      
      g.drawOval (80, 150, 50, 30); // Left Arm
      g.drawOval (82, 155, 20, 10); // Left Finger 1
      g.drawOval (82, 165, 20, 10); // Left Finger 2
      
   }
}
