package openClassroom.Job;

public class NewJob extends Worker{
	protected String position;

    public NewJob(){
        super();
        this.position = "New Position.";
    }
    public NewJob(String firstName, String lastName, String idNumber, String position){
    	super(firstName, lastName, idNumber);
    	this.position = position;
    }
    // method getter
    public String getPosition(){
    	return this.position;
    }
    // method setter
    public void setPosition(String position){
    	if (position!=null && position.length()>3) {
    		this.position = position;
    	}
    }
}