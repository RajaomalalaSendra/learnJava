package openClassroom.Job;

public class GetFired extends GetJob{
	private String fired;
    public GetFired(){
    	super();
    	this.fired = "You are fired out of your position as " + super.getPosition();
    }
}