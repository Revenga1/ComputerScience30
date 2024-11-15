package apProject;

public class User {
	
	private int points;
	private int qAnswered;
	private String name;
	
	public User(String name, int points, int qAnswered) {
		this.points = points;
		this.qAnswered= qAnswered;
		
	}

	
	//getter
	public String getName() {
		return this.name;
		
	}
	
	public int getQAnswered() {
		return this.qAnswered;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	
	//setter
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public void setQAnswered(int qAnswered) {
		this.qAnswered= qAnswered;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
