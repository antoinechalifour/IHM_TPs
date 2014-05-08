package com.ex2.presentation;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameApplication extends JFrame{
	private MenuModele menu;
	private PanelModele panel1;
	private PanelModele panel2;
	private JPanel cont;
	
	public FrameApplication(){
		panel1 = new PanelModele();
		panel2 = new PanelModele();
		menu = new MenuModele();
		cont = new JPanel();
		cont.setLayout(new BoxLayout(cont, BoxLayout.X_AXIS));
		
		cont.add(panel1);
		cont.add(panel2);
		this.add(cont);
		setJMenuBar(menu);
		setVisible(true);
		setSize(500, 200);
	}
	
	public PanelModele getPanel1(){
		return panel1;
	}
	
	public PanelModele getPanel2(){
		return panel2;
	}
	
	public MenuModele getMenu(){
		return menu;
	}
}
