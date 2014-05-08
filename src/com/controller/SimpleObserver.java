package com.controller;

import java.util.Observable;
import java.util.Observer;

public class SimpleObserver implements Observer{

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Observer -> " + arg0.toString());
		
	}

}
