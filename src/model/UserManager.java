package model;

import java.util.LinkedList;

public class UserManager {
	
	
	private LinkedList<User> userList;
	
	
	public UserManager() {
		userList = new LinkedList<User>();
		test();
		
	}
	
	public void test() {
		String name = "Eric";
		String lname = "Mok";
		String un = "test";
		String pw = "test";
		addNewUser(name,lname,un,pw);
	}
	
	public void addNewUser(String name, String lastName, String userName, String password) {
		//Creating the user
		User userToAdd = new User(name, lastName, userName, password);
		//Add to the linked list
		userList.add(userToAdd);
		
	}
	public boolean checkUserNameAndPass(String uName, String pass) {
		//TODO
		//Find the user given the username check the password using the method
		//in the object
		boolean overall = false;
		
		for (int i = 0; i<userList.size();i++) {
			User temp = userList.get(i);
			if (temp.getUserName().equals(uName)) {
				if (temp.checkPassword(pass) == true) {
					overall = true;
				}
			}
		}
		return overall;
		
	}
	
}
	
	


