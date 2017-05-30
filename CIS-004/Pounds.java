// Pounds to kilograms, graphical user interface (GUI), windows programming. 

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;  

Class Pounds
{
public static main(String[]Args)
{
MyFrame f=new myFrame(); // make a frame
f.setSize(500,400);  // size in pixels. 
f.setLocation(100,50) // 0,0 x,y over,down
f.setDefualtCloseOperation(JFrame.EXIT_ON_CLOSE); // allows [x] to work. 
f.setVisible(true); // sets window to visible. 
} // end main. 
} // ends class. 

Class MyFrame extends JFrame
{
public MyFrame()
{
MyPanel p=new myPanel(); 
add(p);
}
}

class MyPanel extends JPanel Impliments Action Listener
{
JTextField pounds,kilos; // 
public MyPanel ()
{
JLabel kiloLabel=new JLabel("KiloGrams"); 
JLabel poundsLabel=new JLabel("Pounds"); 
JButton push=new JButton("Convert"); 

pounds=new JTextField(15); // How many visible text characters. 
kilos=new JTextField(15); 

push.addActionListener(this); // This is how you 'wire up' the button. 

add(poundLable); // added but need to impliment flow layout!
add(pounds);
add(kiloLabel);
add(kilos);
add(push);
}

public void actionPerformed(Acount Event Out); 






