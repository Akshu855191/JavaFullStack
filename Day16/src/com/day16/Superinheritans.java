package com.day16;

public class Superinheritans extends Supercallexample {
	Superinheritans(String s){
		super.eName = s;
		System.out.println(eName);
	}

	public static void main(String[] args) {
		Superinheritans s = new Superinheritans("Akshay");
		
	}

}
