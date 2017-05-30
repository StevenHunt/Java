// Windows Programming: Extra Credit!

import java.awt.*; 
import javax.swing.*;          // Abstract windowing toolkit. 
import java.awpt.geom.*; 

class MyWindow 
{
public static void main(String[]args)
{
MyFrame f=new myFrame(); // Frame by default has no size, border, or location.   
f.setSize(500,400); // Size of frame.  
f.setLocation(50,100); // Sets location away from corner of screen. 
f.setTitle("My First Frame"); // Sets title. 
f.setVisible(true); // now the frame is visible. 
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Clicking on windows closing (X) allows the window to go away. 
}
}
