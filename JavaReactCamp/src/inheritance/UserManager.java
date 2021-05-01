package inheritance;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " added");
	}
	
	public void login(User user) {
		System.out.println("Login OK");
	}
	
	public void logout(User user) {
		System.out.println("Logout OK");
	}
}
