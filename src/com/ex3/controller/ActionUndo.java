package com.ex3.controller;

import java.awt.event.ActionEvent;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

import javax.swing.AbstractAction;
import javax.swing.JMenuItem;

import com.controller.Constantes;
import com.modele.UndoableModele;

public class ActionUndo extends AbstractAction implements Observer{
	private UndoableModele m1;
	private JMenuItem p;
	
	public ActionUndo(UndoableModele m1, JMenuItem p){
		this.m1 = m1;
		this.p = p;
		String name = ResourceBundle.getBundle("messages", Constantes.locale).getString(Constantes.undo);
		putValue(NAME, name);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(!m1.getCanUndo()) p.setEnabled(false);
		else{
			if(!p.isEnabled()) p.setEnabled(true);
			m1.getPile().undo();
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("undo update");
	}
}
