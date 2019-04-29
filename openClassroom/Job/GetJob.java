package openClassroom.Job;

public class GetJob extends NewJob{
	private String accepted;
	private static int count;
	public GetJob(){
		super();
		this.accepted = "Not yet";
		this.count++;
	}
	public GetJob(String firstName, String lastName, String idNumber, String position, String accepted){
		super(firstName, lastName, idNumber, position);
		this.accepted = accepted;
		this.count++;
	}
	// getter of the accepted
	public String getAccepted(){
		return this.accepted;
	}
	public static int getCount(){
		return count;
	} 
	// setter of the accepted
	public void setAccepted(String accepted){
		if (accepted!=null && accepted.length()>3) {
			this.accepted = accepted;
		}
	}
	public String getDescription(){
		String str = "\tName: " + super.getFirstName() + "\n\tLast Name: " + super.getLastName() + "\n\tID: " + super.getIdNumber() + 
		"\n\tPosition: " + super.getPosition() + "\n\tAccepted: " + this.accepted; 
		return str;
	}
}