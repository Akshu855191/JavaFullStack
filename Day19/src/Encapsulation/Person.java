package Encapsulation;

public class Person {
	
	private Long pId;
	private String pName;
	private int age;
	private String Address;
	private long mobile_no;
	
	public Long getId() {
		return pId;
	}
	public void setid(Long pId) {
		this.pId = pId;
	}
	public String getName() {
		return pName;
	}
	public void setName(String pName) {
		this.pName = pName;
	}
	public int getage() {
		return age;
	}
	public Long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setpId(10);
		p.setpName("Vijay");
		p.setAge(30);
		p.setAddress("XYZ");
		p.setMobile_no(797268);
		
		System.out.println(p.getpId());
		System.out.println(p.getpName());
		System.out.println(p.getAge());
		System.out.println(p.getAddress());
		System.out.println(p.getMobile_no());
	}
  

}
