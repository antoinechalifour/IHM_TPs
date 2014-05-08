package com.modele;

import java.util.Observable;

import com.controller.SimpleObserver;
import com.exceptions.IllegalValueException;

public class Modele extends Observable{
	private int i;

	public Modele(int i) {
		this.i = i;
	}

	public Modele() {
		this.i = 5;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) throws IllegalValueException{
		if(i<0 || i>10) throw new IllegalValueException("La valeur doit être comprise entre les bornes [0;10] -> given " + i);
		if(this.i != i){
			this.i = i;
			setChanged();
			notifyObservers();
		}
	}
	
	
	@Override
	public String toString() {
		return "Modele [" + getI() + "]";
	}


	/**
	 * Classe de test.
	 * @author Antoine
	 *
	 */
	static class Test{
		public static void main(String[] args){
			SimpleObserver o = new SimpleObserver();
			Modele m = new Modele();
			m.addObserver(o);
			System.out.println("Valeur du modele : " + m.getI());
			
			try {
				m.setI(10);
				System.out.println("Valeur du modele : " + m.getI());
			} catch (IllegalValueException e) {
				System.out.println(e.getMessage());
			}
			try {
				m.setI(-1);
			} catch (IllegalValueException e) {
				System.out.println(e.getMessage());
			}
			try {
				m.setI(15);
			} catch (IllegalValueException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
