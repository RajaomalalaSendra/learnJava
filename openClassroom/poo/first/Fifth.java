package openClassroom.poo.first;

public class Fifth{
	private String setter;
	public Fifth(){
		this.setter = "Our setter";
	}
	public Fifth(String setter){
		this.setter = setter;
	}
	// getter of the setter
	public String getSetter(){
		return this.setter;
	}
	// setter of the setter
	public void setSetter(String setter){
		this.setter = setter;
	}
}