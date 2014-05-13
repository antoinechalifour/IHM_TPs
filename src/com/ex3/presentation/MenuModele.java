package com.ex3.presentation;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuModele extends JMenuBar{
	private JMenu button1;
	private JMenu button2;
	private JMenuItem b1moins;
	private JMenuItem b1plus;
	private JMenuItem b1undo;
	private JMenuItem b1redo;
	private JMenuItem b2moins;
	private JMenuItem b2plus;
	private JMenuItem b2undo;
	private JMenuItem b2redo;
	
	public MenuModele(){
		button1 = new JMenu("Button 1");
		button2 = new JMenu("Button 2");
		
		b1moins = new JMenuItem("Moins");
		b1plus = new JMenuItem("Plus");
		b2moins = new JMenuItem("Moins");
		b2plus = new JMenuItem("Plus");
		
		b1undo = new JMenuItem("Undo");
		b1redo = new JMenuItem("Redo");
		b2undo = new JMenuItem("Undo");
		b2redo = new JMenuItem("Redo");
		
		button1.add(b1moins);
		button1.add(b1plus);
		button1.add(b1undo);
		button1.add(b1redo);
		
		button2.add(b2moins);
		button2.add(b2plus);
		button2.add(b2undo);
		button2.add(b2redo);
		
		this.add(button1);
		this.add(button2);
	}
	
	public JMenu getMenu1(){
		return button1;
	}
	
	public JMenu getMenu2(){
		return button2;
	}

	public JMenuItem getB1moins() {
		return b1moins;
	}

	public JMenuItem getB1plus() {
		return b1plus;
	}

	public JMenuItem getB2moins() {
		return b2moins;
	}

	public JMenuItem getB2plus() {
		return b2plus;
	}
	
	public JMenuItem getB1Undo(){
		return b1undo;
	}
	
	public JMenuItem getB1Redo(){
		return b1redo;
	}
	
	public JMenuItem getB2Undo(){
		return b2undo;
	}
	
	public JMenuItem getB2Redo(){
		return b2redo;
	}
	
}
