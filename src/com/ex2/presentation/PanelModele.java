package com.ex2.presentation;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class PanelModele extends JPanel{
	private JButton button1;
	private JButton button2;
	private JTextField textfield;
	private JSlider slider;
	
	public PanelModele(){
		button1 = new JButton();
		button2 = new JButton();
		textfield = new JTextField();
		slider = new JSlider();

		button1.setToolTipText("Decrementer");
		button2.setToolTipText("Incrémenter");
		textfield.setColumns(3);
		slider.setMinimum(0);
		slider.setMaximum(10);
		slider.setValue(5);
		
		
		this.add(button1);
		this.add(button2);
		this.add(textfield);
		this.add(slider);
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
	
	public JSlider getSlider(){
		return slider;
	}
}
