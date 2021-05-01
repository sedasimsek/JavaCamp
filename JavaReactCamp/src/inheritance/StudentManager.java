package inheritance;

public class StudentManager extends UserManager{

	@Override
	public void add(User user) {
		System.out.println("Student" + user.getFirstName() + " added." );
	}
	
	@Override
	public void login(User user) {
		System.out.println("Hi," + user.getFirstName() + "login successfully!");
	}
	
	@Override
	public void logout(User user) {
		System.out.println(user.getFirstName() + "logout successfully!");
	}
}
