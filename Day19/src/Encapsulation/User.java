package Encapsulation;

public class User {
	
	private Long user_id;
	private String uName;
	private String password;
	private String conPassword;
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConPassword() {
		return conPassword;
	}
	public void setConPassword(String conPassword) {
		this.conPassword = conPassword;
	}
	
public static void main(String[] args) {
		
		User u = new User();
		u.setUser_id(10);
		u.setuName("Vijay");
		u.setPassword("XYZ");
		u.setConPassword("XYZ");
		
		
		System.out.println(u.getUser_id());
		System.out.println(u.getuName());
		System.out.println(u.getPassword());
		System.out.println(u.getConPassword());
	
	}

}
