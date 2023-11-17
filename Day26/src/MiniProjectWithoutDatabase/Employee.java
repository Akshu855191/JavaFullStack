package MiniProjectWithoutDatabase;

public class Employee {
	
	private Long eId;
	private String eName;
	private double eSalary;
	private String address;
	private Department eDep;
	public Employee() {
		super();
		
	}
	public Employee(Long eId, String eName, double eSalary, String address, Department eDep) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.address = address;
		this.eDep = eDep;
	}
	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Department geteDep() {
		return eDep;
	}
	public void seteDep(Department eDep) {
		this.eDep = eDep;
	}
	
	

}
