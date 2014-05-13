package com.modele;

import java.util.Observable;

import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;

public class PileEtat extends Observable{
	private UndoManager undoManager;
	
	public PileEtat(){
		undoManager = new UndoManager();
	}
	
	public void undo(){
		undoManager.undo();
	}
	
	public void redo(){
		undoManager.redo();
	}
	
	public void add(UndoableEdit ue){
		undoManager.addEdit(ue);
	}
	
	public boolean canUndo(){
		return undoManager.canUndo();
	}
	
	public boolean canRedo(){
		return undoManager.canRedo();
	}
}
