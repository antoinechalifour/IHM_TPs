package com.ex2.controller;

import java.util.Observable;
import java.util.Observer;

import com.ex2.presentation.FrameApplication;
import com.exceptions.IllegalValueException;
import com.modele.Modele;

public class ControllerSynchro implements Observer{
	private Modele m1;
	private Modele m2;
	private FrameApplication f;
	
	public ControllerSynchro(Modele m1, Modele m2, FrameApplication f){
		this.m1 = m1;
		this.m2 = m2;
		this.f = f;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof Modele){
			Modele tmp = (Modele) arg0;
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
