package com.controller;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

import javax.swing.AbstractAction;

import com.exceptions.IllegalValueException;
import com.modele.Modele;

public class ActionButton1 extends AbstractAction implements Observer{
	private Modele m;
	
	public ActionButton1(Modele m) {
		this.m = m;
		String name = ResourceBundle.getBundle("messages", Constantes.locale).getString(Constantes.moins);
		putValue(NAME, name);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			m.setI(m.getI()-1);
			System.out.println(m.getI());
		} catch (IllegalValueException e) {
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Modele){
			Modele m = (Modele) o;
			if(m.getI()>0) setEnabled(true);
			if(m.getI() == 0) setEnabled(false);
		}
	}

}
