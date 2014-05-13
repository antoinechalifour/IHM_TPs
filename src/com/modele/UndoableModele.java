package com.modele;

import java.util.Hashtable;

import javax.swing.undo.StateEdit;
import javax.swing.undo.StateEditable;

import com.exceptions.IllegalValueException;

public class UndoableModele extends Modele implements StateEditable{
	private PileEtat pile;
	
	public UndoableModele() {
		super();
		pile = new PileEtat();
	}

	public UndoableModele(int i) {
		super(i);
		pile = new PileEtat();
	}

	@Override
	public void restoreState(Hashtable<?, ?> arg0) {
		try {
			System.out.println("Depilement etat");
			super.setI((Integer) arg0.get("entier"));
		} catch (IllegalValueException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void storeState(Hashtable<Object, Object> arg0) {
		System.out.println("Empilement etat");
		arg0.put("entier", getI());
	}

	@Override
	public void setI(int i) throws IllegalValueException {
		if(i != getI()){
			StateEdit se = new StateEdit(this);
			super.setI(i);
			se.end();
			pile.add(se);
		}
	}
	
	public PileEtat getPile(){
		return pile;
	}
	
	public boolean getCanRedo(){
		return pile.canRedo();
	}
	
	public boolean getCanUndo(){
		return pile.canUndo();
	}
}
