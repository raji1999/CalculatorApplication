package Presentation;    //Presentation Layer
import java.awt.*;
import javax.swing.*;

import BusinessLogic.Addition;
import BusinessLogic.Subtraction;
import BusinessLogic.Multiplication;
import BusinessLogic.Division;

import java.awt.event.*;
public class MainClass implements ActionListener
{
	JFrame f;
	JButton b1,b2,b3,b4,b5;
	TextField t1,t2,t3;
	JLabel l1,l2,l3,ll;
	public MainClass(){
		f=new JFrame("Calculator App");
		f.getContentPane().setBackground(Color.PINK);
		b1=new JButton("ADD");
		b2=new JButton("SUB");
		b3=new JButton("MUL");
		b4=new JButton("DIV");
		b5=new JButton("CANCEL");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		l1=new JLabel("Enter first number:");
		l2=new JLabel("Enter second number:");
		l3=new JLabel("Result:");
		ll=new JLabel("");
		f.setVisible(true);
		f.setSize(650,700);
		f.add(ll);
		ll.add(l1);
		ll.add(t1);
		ll.add(l2);
		ll.add(t2);
		ll.add(l3);
		ll.add(t3);
		ll.add(b1);
		ll.add(b2);
		ll.add(b3);
		ll.add(b4);
		ll.add(b5);
		l1.setBounds(150 ,70,150,50);
		t1.setBounds(300,70,150,50);
		l2.setBounds(150,150,150,50);
		t2.setBounds(300,150,150,50);
		b1.setBounds(30,300,150,50);
		b2.setBounds(230,300,150,50);
		b3.setBounds(430,300,150,50);
		b4.setBounds(330,370,150,50);
		b5.setBounds(150,370,150,50);
		l3.setBounds(150,450,150,50);
		t3.setBounds(300,450,150,50);
		
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);	
b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		
		int first=Integer.parseInt(t1.getText());
		int second=Integer.parseInt(t2.getText());
		if(ae.getSource().equals(b1)) {
			Addition add1=new Addition();
			String val=String.valueOf(add1.add(first, second));
			t3.setText(val);
			
		}
		else if(ae.getSource().equals(b2)) {
			
			Subtraction add1=new Subtraction();
			String val=String.valueOf(add1.subtract(first, second));
			t3.setText(val);
		}
		else if(ae.getSource().equals(b3)) {
			Multiplication add1=new Multiplication();
			String val=String.valueOf(add1.multi(first, second));
			t3.setText(val);
}
		else if(ae.getSource().equals(b4)) {
			Division add1=new Division();
			String val="";
			int k=add1.div(first,second);
			val=String.valueOf(k);
			t3.setText(val);
}
		else if(ae.getSource().equals(b5)) {
			f.setVisible(false);
		}
		else
			f.setVisible(false);

	}
public static void main(String[] args) {
	new MainClass();
	
}
}