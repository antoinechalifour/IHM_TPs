package com.controller;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.AbstractAction;

import com.exceptions.IllegalValueException;
import com.modele.Modele;

public class ActionButton2 extends AbstractAction implements Observer{
	private Modele m;
	
	public ActionButton2(Modele m) {
		this.m = m;
		putValue(NAME, "Button +");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			m.setI(m.getI()+1);
			System.out.println(m.getI());
		} catch (IllegalValueException e1) {
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof Modele){
			Modele m = (Modele) arg0;
			if(m.getI()<10) setEnabled(true);
			if(m.getI() == 10) setEnabled(false);
		}
	}

}
