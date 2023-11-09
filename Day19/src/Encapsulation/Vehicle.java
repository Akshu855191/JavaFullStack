package Encapsulation;

public class Vehicle {
	private Long vId;
	private String vName;
	private String vCompany;
	private Long vCarnumber;
	
	
    
	public Long getvId() {
		return vId;
	}
	public void setvId(long vId) {
		this.vId = vId;
	}
   public String getvName() {
		return vName;
	}
    public void setvName(String vName) {
		this.vName = vName;
	}
    public String getvCompany() {
		return vCompany;
	}
    public void setvCompany(String vCompany) {
		this.vCompany = vCompany;
	}
    public Long getvCarnumber() {
		return vCarnumber;
	}
    public void setvCarnumber(long vCarnumber) {
		this.vCarnumber = vCarnumber;
	}
    public static void main(String[] args) {
    	
    	Vehicle v = new Vehicle();
    	v.setvId(10);
    	v.setvName("Bajaj");
    	v.setvCarnumber(987594);
    	v.setvCompany("Honda");
		
	}

}
