package inheritance;

public class Instructor {
	String about;
	int score;

	public Instructor(String about, int score) {
		super();
		this.about = about;
		this.score = score;
	}
	
	public String getAbout() {
		return about;
	}
	
	
	public void setAbout(String about) {
		this.about = about;
	}
	
	
	public int getScore() {
		return score;
	}
	
}
