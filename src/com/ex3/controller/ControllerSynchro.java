package com.ex3.controller;

import java.util.Observable;
import java.util.Observer;

import com.ex3.presentation.FrameApplication;
import com.exceptions.IllegalValueException;
import com.modele.UndoableModele;

public class ControllerSynchro implements Observer{
	private UndoableModele m1;
	private UndoableModele m2;
	private FrameApplication f;
	
	public ControllerSynchro(UndoableModele m1, UndoableModele m2, FrameApplication f){
		this.m1 = m1;
		this.m2 = m2;
		this.f = f;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof UndoableModele){
			UndoableModele tmp = (UndoableModele) arg0;
			if(tmp == m1){
				try {
					m2.setI(10-m1.getI());
				} catch (IllegalValueException e) {
					e.printStackTrace();
				}
			}
			else{
				try {
					m1.setI(10-m2.getI());
				} catch (IllegalValueException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
