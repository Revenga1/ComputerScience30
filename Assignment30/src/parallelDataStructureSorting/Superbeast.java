package parallelDataStructureSorting;

public class Superbeast {
	
	private String name;
	private String team;
	private int points;
	
	public Superbeast(String name, String team, int points) {
		this.name=name;
		this.points=points;
		this.team=team;
	}

	//getter
	
	public String getName() {
		return name;
		
	}
	
	public String getTeam() {
		return team;
		
	}
	
	public int getPoints() {
		return points;
	}
	
	//mutator
	
	public void setPoints(int points) {
		this.points= points;
	}
	
	
}
