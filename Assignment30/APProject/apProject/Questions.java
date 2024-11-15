package apProject;




public class Questions {
	
	 private String topic;
    private String question;
    private String answer;
    private int points; 

    public Questions(String topic, String question, String answer, int points) {
    this.topic = topic;
    this.question = question;
    this.answer = answer;
    this.points = points;
    }

  //getters 
  public String getTopic () {
		return this.topic;
	}
  public String getQuestion () {
		return this.question;
	}
  public String getAnswer () {
		return this.answer;
	}
	public int getPoints () {
		return this.points;
	}
	
	}




