package com.ex2.controller;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.AbstractAction;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.ex2.presentation.PanelModele;
import com.exceptions.IllegalValueException;
import com.modele.Modele;

public class ActionSlider implements ChangeListener, Observer{
	private Modele m;
	private PanelModele p;
	
	public ActionSlider(Modele m, PanelModele p){
		this.m = m;
		this.p = p;
	}

	@Override
	public void update(Observable o, Object arg) {
		p.getSlider().setValue(m.getI());
	}

	@Override
	public void stateChanged(ChangeEvent ce) {
		try {
			m.setI(p.getSlider().getValue());
		} catch (IllegalValueException e) {
			e.printStackTrace();
		}
	}

}
