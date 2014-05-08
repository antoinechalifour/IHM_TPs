package com.ex2.presentation;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelModele extends JPanel{
	private JButton button1;
	private JButton button2;
	private JTextField textfield;
	
	public PanelModele(){
		button1 = new JButton();
		button2 = new JButton();
		textfield = new JTextField();
		textfield.setColumns(3);
		
		this.add(button1);
		this.add(button2);
		this.add(textfield);
	}
	
	public JButton getButton1(){
		return button1;
	}
	
	public JButton getButton2(){
		return button2;
	}
	
	public JTextField getTextField(){
		return textfield;
	}
}
