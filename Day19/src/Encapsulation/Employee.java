package Encapsulation;

import Abstractclass.main;

public class Employee {
	
	private Long eId;
	private String eName;
	private double eSalary;
	private String Dep;
	
	public Long eId() {
		return eId;
	}
	public void seteId(long eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	public String getDep() {
		return Dep;
	}
	public void setDep(String dep) {
		Dep = dep;
	}
	public Long geteId() {
		return eId;
	}
public static void main(String[] args) {
		Employee emp = new Employee();
		emp.seteId(10);
		emp.seteName("Akshay");
		emp.seteSalary(10000);
		emp.setDep("Development");
		
		
		System.out.println(emp.geteId());
		System.out.println(emp.geteName());
		System.out.println(emp.geteSalary());
		System.out.println(emp.getDep());
		
	}
	
}
