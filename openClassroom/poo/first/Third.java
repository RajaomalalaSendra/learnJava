package openClassroom.poo.first;

public class Third extends Fourth{
	private String nationality;
	public Third(){
		super();
		this.nationality = "No nationality";
	}
	public static void main(String[] args) {
		   Third third = new Third();
		   System.out.println("Creation of the third!!!!!");
		   System.out.println(third.getDescription());	
	}
	public String getDescription(){
		String str = super.getSecond() + " ===== " + super.getFifth() + "  ===== " + this.nationality;
		return str;
	}
}