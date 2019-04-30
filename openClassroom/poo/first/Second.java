package openClassroom.poo.first;

public class Second {
	private String me;
	private String name;
	public Second(){
		this.me = "||Not Me||";
		this.name = "||Not name||";
	}
	public Second(String me, String name){
		this.me = me;
		this.name = name;
	}
	// getter
	public String getMe(){
		return this.me;
	}
	public String  getName(){
		return this.name;
	}
	// setter
	public void setMe(String me){
		this.me = me;
	}
	public void setName(String name){
		this.name = name;
	}
}