/*
Steven Hunt, Java I, WVC, 2014.
Windows Programming Weight, length, and temperature converter.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.lang.Number;
import java.lang.*;

public class Converter implements ActionListener {

	public final double C_KG2LB= 2.2;		
	public final double C_LB2KG= 0.45;	
	public final double C_M2FT= 3.28;		
	public final double C_FT2M= 0.3;	

    private JFrame converterFrame;
    private JPanel converterPanel;
    private JLabel weight, length, temp, weight1, length1,temp1;
    private JTextField w1,w2,l1,l2,t1,t2;
    private JRadioButton jr[];
    private JButton submit, quit, clear;	
    
	private int checkInput(String inString) {

		StringBuffer tStringBuf;
		int flag=0; 
		tStringBuf=new StringBuffer(inString);
		for(int index=0; index<tStringBuf.length(); index++){
			char ch=tStringBuf.charAt(index);
			if( (ch<'0' || ch>'9') && (ch !='.')){
				flag=1;
				break;
			}
		}
		if(flag==1) return 0;
		else return 1;	
	}
    
	public Converter() {

    	converterFrame = new JFrame("Mass, Length, and Weight Converter");
        converterPanel = new JPanel();
        converterPanel.setLayout(new GridLayout(0, 5, 40, 40));
		
        addWidgets();
		
        converterFrame.getContentPane().add(converterPanel, BorderLayout.CENTER);
		
        converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        converterFrame.setSize(800, 300);
        converterFrame.setVisible(true);
   }
    
   private void addWidgets() {
		
        ButtonGroup convertgroup=new ButtonGroup();
        jr=new JRadioButton[3];

        jr[0]=new JRadioButton("Weight");
	weight = new JLabel("kg    =", SwingConstants.LEFT);
        w1 = new JTextField(15);
        w2 = new JTextField(25);
        weight1 = new JLabel("lbs ", SwingConstants.LEFT);
        convertgroup.add(jr[0]);
		
		
	jr[1]=new JRadioButton("Length");
        length = new JLabel("m    = ", SwingConstants.LEFT);
        l1 = new JTextField(25);
        l2 = new JTextField(25);
        length1 = new JLabel("ft", SwingConstants.LEFT);
        convertgroup.add(jr[1]);
		
        jr[2]=new JRadioButton("Temperature");
        temp = new JLabel("c    =", SwingConstants.LEFT);
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        temp1 = new JLabel("F", SwingConstants.LEFT);
        convertgroup.add(jr[2]);
		
        submit = new JButton("Convert");
        clear = new JButton("Clear");
        quit = new JButton("Quit");
		
        submit.addActionListener(this);
        clear.addActionListener(this);
        quit.addActionListener(this);
		
        converterPanel.add(jr[0]);
        converterPanel.add(w1);
        converterPanel.add(weight);
        converterPanel.add(w2);
        converterPanel.add(weight1);
		
        converterPanel.add(jr[1]);
        converterPanel.add(l1);
        converterPanel.add(length);
        converterPanel.add(l2);
        converterPanel.add(length1);
		
        converterPanel.add(jr[2]);
        converterPanel.add(t1);
        converterPanel.add(temp);
        converterPanel.add(t2);
        converterPanel.add(temp1);
		
        converterPanel.add(submit);
        converterPanel.add(clear);
        converterPanel.add(quit);
		
        weight.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        length.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        temp.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    } 
	
    private void record(String aResult){
		try{
			File dataFile = new File("CSE155.txt");
			if (dataFile.exists()){
				System.out.print("existed");
				FileWriter myF1Writer = new FileWriter(dataFile,true);
				BufferedWriter myB1Writer = new BufferedWriter(myF1Writer);
				myB1Writer.write(aResult + ",");
				myB1Writer.newLine();
				myB1Writer.close();
				myF1Writer.close();
			}
			else{
				System.out.print("create new");
				FileWriter myFWriter = new FileWriter(dataFile);
				BufferedWriter myBWriter = new BufferedWriter(myFWriter);
				myBWriter.write(aResult + ",");
				myBWriter.newLine();
				myBWriter.close();
				myFWriter.close();
			}
		}
		catch(Exception e){
		}
	}
	
	private void weightConvert(){
		if( w1.getText().length()==0 && w2.getText().length()==0){
			JOptionPane.showMessageDialog(converterFrame,
				"no input ! ", "Warning",
				JOptionPane.WARNING_MESSAGE);
			return;
		}
		if( w1.getText().length()!=0 && w2.getText().length()!=0){
			JOptionPane.showMessageDialog(converterFrame,
				"input only one field ", "Warning",
				JOptionPane.WARNING_MESSAGE);
			return;
		}
		if( (w1.getText().length()!=0 && checkInput(w1.getText()) ==0 )|| 
			(w2.getText().length()!=0 && checkInput(w2.getText()) ==0 ) ){
				JOptionPane.showMessageDialog(converterFrame,
				"input is not a number", "Warning",
				JOptionPane.WARNING_MESSAGE);
			return;
		}
		if(w1.getText().length()!=0 ){
			double in = Double.parseDouble(w1.getText());
			double out=in*C_KG2LB;
			JOptionPane.showMessageDialog(converterFrame,
				"your input:\n"+in+" kg\n The result:\n"+out+"lb",
				"echo result", JOptionPane.INFORMATION_MESSAGE);
			record("your input:\n"+in+" kg\n The result:\n"+out+"lb");
		}
		if(w2.getText().length()!=0){
			double in = Double.parseDouble( w2.getText() );
			double out=in*C_LB2KG;
			JOptionPane.showMessageDialog(converterFrame,
				"your input:\n"+in+"lb\n The result:\n"+out+"kg",
				"echo result", JOptionPane.INFORMATION_MESSAGE);  
			record("your input:\n"+in+"lb\n The result:\n"+out+"kg");			
		}
	}
		
	private void lengthConvert(){
		
		if( l1.getText().length()==0 && l2.getText().length()==0){
			JOptionPane.showMessageDialog(converterFrame,
				"no input ! ", "Warning",
				JOptionPane.WARNING_MESSAGE);
			return;
		}
		if( l1.getText().length()!=0 && l2.getText().length()!=0){
			JOptionPane.showMessageDialog(converterFrame,
				"input only one field ", "Warning",
				JOptionPane.WARNING_MESSAGE);
			return;
		}
		if( (l1.getText().length()!=0 && checkInput(l1.getText()) ==0 )|| 
			(l2.getText().length()!=0 && checkInput(l2.getText()) ==0 ) ){
				JOptionPane.showMessageDialog(converterFrame,
				"input is not a number", "Warning",
				JOptionPane.WARNING_MESSAGE);
			return;
		}
		if(l1.getText().length()!=0){
			double in = Double.parseDouble( l1.getText() );
			double out=in*C_M2FT;
			JOptionPane.showMessageDialog(converterFrame,
				"your input:\n"+in+" m\n The result:\n"+out+"ft",
				"echo result", JOptionPane.INFORMATION_MESSAGE);  
			record("your input:\n"+in+" m\n The result:\n"+out+"ft");
		}
		if(l2.getText().length()!=0){
			double in = Double.parseDouble( l2.getText() );
			double out=in*C_FT2M;
			JOptionPane.showMessageDialog(converterFrame,
				"your input:\n"+in+"ft\n The result:\n"+out+"m",
				"echo result", JOptionPane.INFORMATION_MESSAGE);                    
			record("your input:\n"+in+"ft\n The result:\n"+out+"m");
		}	
	}
	
	private void temperatureConvert(){
		if( t1.getText().length()==0 && t2.getText().length()==0){
			JOptionPane.showMessageDialog(converterFrame,
				"no input ! ", "Warning",
				JOptionPane.WARNING_MESSAGE);
			return;
		}		if( t1.getText().length()!=0 && t2.getText().length()!=0){
			JOptionPane.showMessageDialog(converterFrame,
				"input only one field ", "Warning",
				JOptionPane.WARNING_MESSAGE);
			return;
		}
		if( (t1.getText().length()!=0 && checkInput(t1.getText()) ==0 )|| 
			(t2.getText().length()!=0 && checkInput(t2.getText()) ==0 ) ){
				JOptionPane.showMessageDialog(converterFrame,
				"input is not a number", "Warning",
				JOptionPane.WARNING_MESSAGE);
			return;
		}
		if(t1.getText().length()!=0){
			double in = Double.parseDouble( t1.getText() );
			double out=in*9/5+32;
			JOptionPane.showMessageDialog(converterFrame,
				"your input:\n"+in+" c\n The result:\n"+out+"f",
				"echo result", JOptionPane.INFORMATION_MESSAGE);                    
			record("your input:\n"+in+" c\n The result:\n"+out+"f");
		}
		if(t2.getText().length()!=0){
			double in = Double.parseDouble( t2.getText() );
			double out=(in-32)*5/9;
			JOptionPane.showMessageDialog(converterFrame,
				"your input:\n"+in+"f\n The result:\n"+out+"c",
				"echo result", JOptionPane.INFORMATION_MESSAGE);                    
			record("your input:\n"+in+"f\n The result:\n"+out+"c");
		}
	}

        public void actionPerformed(ActionEvent event){
        if (event.getSource() == quit) {
            System.exit(0);
        }
        if (event.getSource() == clear) {
            w1.setText("");
            w2.setText("");
            l1.setText("");
            l2.setText("");
            t1.setText("");
            t2.setText("");
			
        }
        if (event.getSource()== submit) {
			if(!jr[0].isSelected() && !jr[1].isSelected() && !jr[2].isSelected())
					JOptionPane.showMessageDialog(converterFrame,
						"No RadioButton has been Selected ", "Warning",
						JOptionPane.WARNING_MESSAGE);
			if(jr[0].isSelected()){
				weightConvert();
				return;
			}
			if(jr[1].isSelected()){
				lengthConvert();
				return;
			} 
			if(jr[2].isSelected()){
				temperatureConvert();
				return;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		try {
			UIManager.setLookAndFeel(
				UIManager.getCrossPlatformLookAndFeelClassName());
		} catch(Exception e) {}
		Converter myConverter = new Converter();
	}
}
