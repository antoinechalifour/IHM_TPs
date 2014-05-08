package com.ex1.controller;

import com.controller.ActionButton1;
import com.controller.ActionButton2;
import com.ex1.presentation.FrameApplication;
import com.modele.Modele;


public class ControllerGen {
	public ControllerGen(Modele m){
		/* VUES */
		FrameApplication f = new FrameApplication();
		
		/* CONTROLLERS */
		ActionButton1 ab1 = new ActionButton1(m);
		ActionButton2 ab2 = new ActionButton2(m);
		ActionTextField at = new ActionTextField(f, m);
		
		/* ASSOCIATION ACTIONS */
		f.getButton1().setAction(ab1);
		f.getButton2().setAction(ab2);
		f.getTextField().setAction(at);
		
		/* AJOUT DES OBSERVERS */
		m.addObserver(ab2);
		m.addObserver(ab1);
		m.addObserver(at);
	}
	
	static class Test{
		public static void main(String[] args){
			Modele m = new Modele(5);
			new ControllerGen(m);
		}
	}
}
