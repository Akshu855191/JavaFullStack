package SetWithoutDuplicate;

import MiniProjectWithoutDatabase.Department;

public class Customer {
	
	private Long cId;
	private String cName;
	private double cSalary;
	private String cAddress;
    private Cdepartment cDep;
    
   public Customer(){
    	super();
    }
    
   

	public Customer(Long cId, String cName, double cSalary, String cAddress, Cdepartment cDep) {
	super();
	this.cId = cId;
	this.cName = cName;
	this.cSalary = cSalary;
	this.cAddress = cAddress;
	this.cDep = cDep;
}



	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public double getcSalary() {
		return cSalary;
	}

	public void setcSalary(double cSalary) {
		this.cSalary = cSalary;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public Cdepartment getcDep() {
		return cDep;
	}

	public void setcDep(Cdepartment cDep) {
		this.cDep = cDep;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cSalary=" + cSalary + ", cAddress=" + cAddress
				+ ", Cdepartment=" + cDep + "]";
	}
	
    
  

}
