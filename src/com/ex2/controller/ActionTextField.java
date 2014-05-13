package com.ex2.controller;

import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.util.Observable;
import java.util.Observer;

import javax.swing.AbstractAction;

import com.controller.Constantes;
import com.ex2.presentation.PanelModele;
import com.exceptions.IllegalValueException;
import com.modele.Modele;

public class ActionTextField extends AbstractAction implements Observer{
	private Modele m;
	private PanelModele p;
	private NumberFormat nf;
	
	public ActionTextField(PanelModele p, Modele m){
		this.m = m;
		this.p = p;
		nf = NumberFormat.getNumberInstance(Constantes.locale);
		p.getTextField().setText(nf.format(m.getI()));
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			m.setI(Integer.valueOf(p.getTextField().getText()));
		} catch (NumberFormatException e) {
			System.out.println("Erreur de format");
		} catch (IllegalValueException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		p.getTextField().setText(nf.format(m.getI()));
	}
}
