package com.day16;

public class Thiskeyword {
	String eName;
	Long eID;
	Double eSalary;
	Thiskeyword(long Id, Double sal, String eName){
		this.eID = Id;
	
		this.eName = eName;
		this.eSalary = sal;
	}
	public static void main(String[] args) {
		Thiskeyword tk = new Thiskeyword(346L, 3.5, "Akshay");
		System.out.println("  " + tk.eName + " " + tk.eID + " " + tk.eSalary);
		
	}

}
