package com.ex2.controller;

import com.controller.ActionButton1;
import com.controller.ActionButton2;
import com.ex2.controller.ActionTextField;
import com.ex2.presentation.FrameApplication;
import com.modele.Modele;

public class ControllerGen {
	public ControllerGen(Modele m1, Modele m2){
		/* VUE */
		FrameApplication f = new FrameApplication();
		
		/* CONTROLLERS */
		ActionButton1 ab1p1 = new ActionButton1(m1);
		ActionButton2 ab2p1 = new ActionButton2(m1);
		ActionTextField at1 = new ActionTextField(f.getPanel1(), m1);
		ActionSlider as1 = new ActionSlider(m1, f.getPanel1());
		
		ActionButton1 ab1p2 = new ActionButton1(m2);
		ActionButton2 ab2p2 = new ActionButton2(m2);
		ActionTextField at2 = new ActionTextField(f.getPanel2(), m2);
		ActionSlider as2 = new ActionSlider(m2, f.getPanel2());
		
		ControllerSynchro sync = new ControllerSynchro(m1, m2, f);
		
		/* ASSOCIATION ACTION */
		f.getPanel1().getButton1().setAction(ab1p1);
		f.getPanel1().getButton2().setAction(ab2p1);
		f.getPanel1().getTextField().setAction(at1);
		
		f.getPanel2().getButton1().setAction(ab1p2);
		f.getPanel2().getButton2().setAction(ab2p2);
		f.getPanel2().getTextField().setAction(at2);
		
		f.getMenu().getB1moins().setAction(ab1p1);
		f.getMenu().getB1plus().setAction(ab2p1);
		f.getMenu().getB2moins().setAction(ab1p2);
		f.getMenu().getB2plus().setAction(ab2p2);
		
		f.getPanel1().getSlider().addChangeListener(as1);
		f.getPanel2().getSlider().addChangeListener(as2);
		
		/* AJOUT OBSERVERS */
		m1.addObserver(ab1p1);
		m1.addObserver(ab2p1);
		m1.addObserver(at1);
		m2.addObserver(ab1p2);
		m2.addObserver(ab2p2);
		m2.addObserver(at2);
		m1.addObserver(as1);
		m2.addObserver(as2);
		m1.addObserver(sync);
		m2.addObserver(sync);
	}
	
	static class Test{
		public static void main(String[] agrs){
			Modele m1 = new Modele();
			Modele m2 = new Modele();
			
			new ControllerGen(m1, m2);
		}
	}
}
