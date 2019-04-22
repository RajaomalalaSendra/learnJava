import java.util.Scanner;

public class ScannerInput {
    Namer namer;
    public ScannerInput(Namer namer){
    	this.namer = namer;
    }
    public static void main(String[] args) {
    	// Declaration of the variables inside of all of these
        System.out.println("Please enter your first and your last name, on separate lines.");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		String lastNameR = scanner.nextLine();
		Namer thatName = new Namer();
		thatName.setName(firstName);
		thatName.setLastName(lastNameR);
		ScannerInput get = new ScannerInput(thatName);
		System.out.print("Hello, ");
		System.out.print(get.namer.getName());
		System.out.print(" ");
		System.out.print(get.namer.getLastName());
		System.out.println("!");	
    }
}
class Namer {
	private String name;
	private String lastName;

	public String getName(){
		return this.name;
	}
	public String getLastName(){
		return this.lastName;
	}
	public void setName(String name){
		if (name!=null && name.length()>2){
			this.name = name;
		} else {
			this.name = "Anonymous";
		}
	}
	public void setLastName(String lastName){
		if(lastName!=null && lastName.length()>3){
			this.lastName = lastName;
		}else{
			this.lastName = "Anonymous";
		}
	}
}