package openClassroom.interfacer;

public class M implements A, E, I{
	private int a;
	private String b;
	private int c;

	public M(){
		this.a = 0;
		this.b = "none";
		this.c = 0;
	}
	public M(int a, String b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// getter from the implementation of the A E and I
	public void B(){
		System.out.println("This is the void of B.");
	}
	public String C(){
		return "This is the string getter from the interface A for. " + this.b;
	}
	public int D(){
		return this.c + this.a;
	}
	// the getter of the interface E
	public void F(){
		System.out.println("This is the void for the interface of E");
	}
	public String G(){
		return "the interface for creating the string for: " + this.b + "|||";
	}
	public int H(){
		return this.c - this.a;
	}
	// the getter for the interface M
	public void J(){
		System.out.println("the interface void of I////");
	}
	public String K(){
		return "Oh that is very interestin from your part " + this.b + " to add in this interface.";
	}
	public  int L(){
		return this.c * this.a;
	}
}