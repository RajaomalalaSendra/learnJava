package openClassroom.Job;

public class Worker {
	protected String firstName;
	protected String lastName;
	protected String idNumber;
	public Worker(){
		this.firstName = "Your First Name";
		this.lastName = "Your Last Name";
		this.idNumber = "ID000111";
	}
	public Worker(String firstName, String lastName, String idNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}
	// getter
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public String getIdNumber(){
		return this.idNumber;
	}
	// setter
	public void setFirstName(String firstName){
		if(firstName!=null){
			this.firstName = firstName;
		}
	}
	public void setLastName(String lastName){
		if(lastName!=null){
			this.lastName = lastName;
		}
	}
	public void setIdNumber(String idNumber){
		if(idNumber!=null){
			this.idNumber = idNumber;
		}
	}
}