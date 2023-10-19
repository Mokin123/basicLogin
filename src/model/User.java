package model;

public class User {
	
	private String name;
	private String lastName;
	private String userName;
	private String password;
	
	public User(String name, String lastName, String userName, String password) {
		
		this.name = name;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	
	public boolean checkPassword(String passToCheck) {
		boolean check = false;
		if(password.equals(passToCheck)) {
			check = true;
		}
		return check;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
