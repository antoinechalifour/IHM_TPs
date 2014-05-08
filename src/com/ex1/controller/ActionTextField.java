package com.ex1.controller;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.AbstractAction;

import com.ex1.presentation.FrameApplication;
import com.exceptions.IllegalValueException;
import com.modele.Modele;

public class ActionTextField extends AbstractAction implements Observer{
	private Modele m;
	private FrameApplication f;
	
	public ActionTextField(FrameApplication f, Modele m){
		this.m = m;
		this.f = f;
		f.getTextField().setText("" + m.getI());
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			m.setI(Integer.valueOf(f.getTextField().getText()));
		} catch (NumberFormatException e) {
			System.out.println("Erreur de format");
		} catch (IllegalValueException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		f.getTextField().setText("" + m.getI());
	}

}
