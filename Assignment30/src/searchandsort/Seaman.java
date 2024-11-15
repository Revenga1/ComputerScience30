package searchandsort;

public class Seaman {
	
	private String name;
	private boolean endanger;
	private String family;
	
	
	public Seaman(String name, boolean endanger, String family) {
		
		this.name=name;
		this.family=family;
		this.endanger=endanger;		
		
	}
	
	
	//getter
	public String getName() {
		return this.name;
		
	}
	
	public boolean getEndanger() {
		return this.endanger;
		
	}
	
	public String getFamily() {
		return this.family;
		
	}

}
