package inheritance;

public class InstructorManager extends UserManager{
	
	@Override
	public void login(User user) {
		System.out.println("Hi," + user.getFirstName() + "login successfully!");
	}
	
	@Override
	public void logout(User user) {
		System.out.println(user.getFirstName() + "logout successfully!");
	}
}
