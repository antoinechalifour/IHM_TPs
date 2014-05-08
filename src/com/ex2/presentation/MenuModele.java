package com.ex2.presentation;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuModele extends JMenuBar{
	private JMenu button1;
	private JMenu button2;
	private JMenuItem b1moins;
	private JMenuItem b1plus;
	private JMenuItem b2moins;
	private JMenuItem b2plus;
	
	public MenuModele(){
		button1 = new JMenu("Button 1");
		button2 = new JMenu("Button 2");
		
		b1moins = new JMenuItem("Moins");
		b1plus = new JMenuItem("Plus");
		b2moins = new JMenuItem("Moins");
		b2plus = new JMenuItem("Plus");
		
		button1.add(b1moins);
		button1.add(b1plus);
		button2.add(b2moins);
		button2.add(b2plus);
		
		this.add(button1);
		this.add(button2);
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
	
}
