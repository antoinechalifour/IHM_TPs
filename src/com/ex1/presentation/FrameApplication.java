package com.ex1.presentation;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameApplication extends JFrame{
	private JButton button1;
	private JButton button2;
	private JTextField textfield;
	private JPanel panel;
	
	public FrameApplication() {
		button1 = new JButton();
		button2 = new JButton();
		textfield = new JTextField();
		panel = new JPanel();
		
		panel.add(button1);
		panel.add(button2);
		panel.add(textfield);
		
		textfield.setColumns(3);
		this.add(panel);
		setVisible(true);
		setSize(200, 200);
	}
	
	
	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}
	
	public JTextField getTextField(){
		return textfield;
	}


	static class Test{
		public static void main(String[] args){
			JFrame f = new FrameApplication();
		}
	}
}
